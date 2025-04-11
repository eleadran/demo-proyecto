package pe.edu.idat.demo_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Concesionarias;
import pe.edu.idat.demo_proyecto.service.ConcesionariasService;
import pe.edu.idat.demo_proyecto.service.ProveedoresService;

@Controller
@RequestMapping("/concesionarias")
public class ConcesionariasController {

    private final ConcesionariasService concesionariasService;
    private final ProveedoresService proveedoresService;

    // Constructor para inyectar ambos servicios
    public ConcesionariasController(ConcesionariasService concesionariasService, ProveedoresService proveedoresService) {
        this.concesionariasService = concesionariasService;
        this.proveedoresService = proveedoresService;
    }

    // Método para listar todas las concesionarias
    @GetMapping
    public String index(Model model) {
        model.addAttribute("concesionarias", concesionariasService.obtenerConcesionarias());
        return "concesionarias/index";
    }

    // Método para mostrar el formulario de creación con la lista de proveedores
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("concesionaria", new Concesionarias());
        model.addAttribute("proveedores", proveedoresService.obtenerProveedores()); // Llamada al servicio de proveedores
        return "concesionarias/create";
    }

    // Método para mostrar el formulario de edición con la lista de proveedores
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("concesionaria", concesionariasService.obtenerConcesionariaPorId(id));
        model.addAttribute("proveedores", proveedoresService.obtenerProveedores()); // Llamada al servicio de proveedores
        return "concesionarias/edit";
    }

    // Método para guardar o actualizar una concesionaria
    @PostMapping("/save")
    public String save(@ModelAttribute("concesionaria") Concesionarias concesionaria) {
        concesionariasService.guardarConcesionaria(concesionaria);
        return "redirect:/concesionarias";
    }

    // Método para eliminar una concesionaria
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        concesionariasService.eliminarConcesionaria(id);
        return "redirect:/concesionarias";
    }
}