package pe.edu.idat.demo_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Marcas;
import pe.edu.idat.demo_proyecto.service.MarcasService;

@Controller
@RequestMapping("/marcas")
public class MarcaController {

    private  final MarcasService marcasService;

    public MarcaController(MarcasService marcasService) {
        this.marcasService = marcasService;
    }
    @GetMapping
    public String index(Model model){
        model.addAttribute("marcas",
                marcasService.obtenerMarcas());
        return "marcas/index";
    }
    @GetMapping ("/create")
    public String create (Model model){
        model.addAttribute("marca",
                new Marcas());
        return "marcas/create";
    }

    @GetMapping ("/edit/{id}")
    public String edit(Model model, @PathVariable int id){

        model.addAttribute("marca",
                marcasService.obtenerMarcasXid(id));
        return "marcas/edit";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("marca")
                       Marcas marcas){

        marcasService.guardarMarcas(marcas);
        return "redirect:/marcas";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        marcasService.eliminarMarcas(id);
        return "redirect:/marcas";
    }
}
