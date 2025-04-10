package pe.edu.idat.demo_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Modelos;
import pe.edu.idat.demo_proyecto.service.ModelosService;

@Controller
@RequestMapping("/modelos")
public class ModelosController {

    private  final ModelosService modelosService;

    public ModelosController(ModelosService modelosService) {
        this.modelosService = modelosService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("modelos",
                modelosService.obtenerModelos());
        return "modelos/index";
    }
    @GetMapping ("/create")
    public String create (Model model){
        model.addAttribute("modelo",
                new Modelos());
        return "modelos/create";
    }

    @GetMapping ("/edit/{id}")
    public String edit(Model model, @PathVariable int id){

        model.addAttribute("modelo",
                modelosService.obtenerModelosXid(id));
        return "modelos/edit";
    }
    @PostMapping ("/save")
    public  String save(@ModelAttribute("modelos")
                        Modelos modelos){
        modelosService.guardarModelos(modelos);
        return "redirect:/modelos";

    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        modelosService.eleminarModelos(id);
        return "redirect:/modelos";
    }
}
