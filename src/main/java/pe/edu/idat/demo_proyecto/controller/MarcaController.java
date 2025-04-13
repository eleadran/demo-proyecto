package pe.edu.idat.demo_proyecto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Marcas;
import pe.edu.idat.demo_proyecto.service.MarcasService;

@Controller
@RequestMapping("/marcas")
public class MarcaController {

    private static final Logger logger = LoggerFactory.getLogger(MarcaController.class);
    private final MarcasService marcaService;

    public MarcaController(MarcasService marcaService) {
        this.marcaService = marcaService;
    }

    @GetMapping
    public String index(Model model) {
        logger.info("Listando todas las marcas");
        model.addAttribute("marcas", marcaService.obtenerMarcas());
        return "marcas/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        logger.info("Preparando formulario de creación de marca");
        model.addAttribute("marca", new Marcas());
        return "marcas/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        logger.info("Cargando marca con ID " + id + " para edición");
        Marcas marca = marcaService.obtenerMarcaPorId(id);
        if (marca == null) {
            throw new RuntimeException("No se encontró la marca con ID " + id);
        }
        model.addAttribute("marca", marca);
        return "marcas/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("marca") Marcas marca) {
        logger.info("Guardando marca: " + marca);
        marcaService.guardarMarca(marca);
        return "redirect:/marcas";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        logger.info("Eliminando marca con ID " + id);
        if (!marcaService.existeMarca(id)) {
            throw new RuntimeException("No se puede eliminar: la marca con ID " + id + " no existe.");
        }
        marcaService.eliminarMarca(id);
        return "redirect:/marcas";
    }
}