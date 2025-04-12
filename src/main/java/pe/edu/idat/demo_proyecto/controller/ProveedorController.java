package pe.edu.idat.demo_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Proveedores;
import pe.edu.idat.demo_proyecto.service.ProveedoresService;

@Controller
@RequestMapping("/proveedores")
public class ProveedorController {

    private final ProveedoresService proveedoresService;

    public ProveedorController(ProveedoresService proveedoresService) {
        this.proveedoresService = proveedoresService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("proveedores", proveedoresService.obtenerProveedores());
        return "proveedores/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("proveedor", new Proveedores());
        return "proveedores/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        model.addAttribute("proveedor", proveedoresService.obtenerProveedoresXid(id));
        return "proveedores/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("proveedor") Proveedores proveedores) {
        proveedoresService.guardarProveedores(proveedores);
        return "redirect:/proveedores";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        proveedoresService.eliminarProveedores(id);
        return "redirect:/proveedores";
    }
}