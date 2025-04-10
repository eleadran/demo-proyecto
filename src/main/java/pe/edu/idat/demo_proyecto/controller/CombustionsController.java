package pe.edu.idat.demo_proyecto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Combustions;
import pe.edu.idat.demo_proyecto.service.CombustionsService;

@Controller
@RequestMapping("/combustions")
public class CombustionsController {

    private  final CombustionsService combustionsService;

    public CombustionsController(CombustionsService combustionsService) {
        this.combustionsService = combustionsService;
    }
    @GetMapping
    public String index(Model model){
        model.addAttribute("combustibles",
                combustionsService.obtenerCombustions());
        return "combustions/index";
    }
    @GetMapping ("/create")
    public String create (Model model){
        model.addAttribute("combustibles",
                new Combustions());
        return "combustions/create";
    }

    @GetMapping ("/edit/{id}")
    public String edit(Model model, @PathVariable int id){

        model.addAttribute("combustibles",
                combustionsService.obtenerCombustionsXid(id));
        return "combustions/edit";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("combustibles")
                       Combustions combustions){

        combustionsService.guardarCombustions(combustions);
        return "redirect:/combustions";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        combustionsService.eliminarCombustions(id);
        return "redirect:/combustions";
    }


}
