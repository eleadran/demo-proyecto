package pe.edu.idat.demo_proyecto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Modelo;
import pe.edu.idat.demo_proyecto.service.ModeloService;

@Controller
@RequestMapping("/modelos")
public class ModeloController {

    private static final Logger logger = LoggerFactory.getLogger(ModeloController.class);
    private final ModeloService modeloService;

    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @GetMapping
    public String index(Model model) {
        logger.info("Listando todos los modelos");
        model.addAttribute("modelos", modeloService.obtenerModelos());
        return "modelos/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        logger.info("Preparando formulario de creación de modelo");
        model.addAttribute("modelo", new Modelo());
        return "modelos/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        logger.info("Cargando modelo con ID " + id + " para edición");
        Modelo modelo = modeloService.obtenerModeloPorId(id);
        model.addAttribute("modelo", modelo);
        return "modelos/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("modelo") Modelo modelo) {
        modeloService.guardarModelo(modelo);
        return "redirect:/modelos";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        modeloService.eliminarModelo(id);
        return "redirect:/modelos";
    }
}