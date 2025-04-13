package pe.edu.idat.demo_proyecto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Combustions;
import pe.edu.idat.demo_proyecto.service.CombustionsService;

@Controller
@RequestMapping("/combustions")
public class CombustionsController {

    private static final Logger logger = LoggerFactory.getLogger(CombustionsController.class);
    private final CombustionsService combustionsService;

    public CombustionsController(CombustionsService combustionsService) {
        this.combustionsService = combustionsService;
    }

    @GetMapping
    public String index(Model model) {
        logger.info("Listando todas las combustiones");
        model.addAttribute("combustiones", combustionsService.obtenerCombustions());
        return "combustions/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        logger.info("Preparando formulario de creación");
        model.addAttribute("combustion", new Combustions());
        return "combustions/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        logger.info("Cargando combustión con ID " + id + " para edición");
        Combustions combustion = combustionsService.obtenerCombustionsXid(id);
        if (combustion == null) {
            throw new RuntimeException("No se encontró la combustión con ID " + id);
        }
        model.addAttribute("combustion", combustion);
        return "combustions/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("combustion") Combustions combustion) {
        logger.info("Guardando combustión: " + combustion);
        combustionsService.guardarCombustions(combustion);
        return "redirect:/combustions";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        logger.info("Eliminando combustión con ID " + id);
        combustionsService.eliminarCombustions(id);
        return "redirect:/combustions";
    }
}
