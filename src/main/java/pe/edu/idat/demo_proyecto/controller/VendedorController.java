package pe.edu.idat.demo_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Clientes;
import pe.edu.idat.demo_proyecto.model.Vendedores;
import pe.edu.idat.demo_proyecto.service.ClientesService;
import pe.edu.idat.demo_proyecto.service.VendedoresService;

@Controller
@RequestMapping("/vendedores")
public class VendedorController {

    private  final VendedoresService vendedoresService;

    public VendedorController(VendedoresService vendedoresService) {
        this.vendedoresService = vendedoresService;
    }
    @GetMapping
    public String index(Model model){
        model.addAttribute("vendedores",
                vendedoresService.obtenerVendedores());
        return "vendedores/index";
    }
    @GetMapping ("/create")
    public String create (Model model){
        model.addAttribute("vendedor",
                new Vendedores());
        return "vendedores/create";
    }

    @GetMapping ("/edit/{id}")
    public String edit(Model model, @PathVariable int id){

        model.addAttribute("vendedor",
                vendedoresService.obtenerVendedoresXid(id));
        return "vendedores/edit";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("vendedor")
                       Vendedores vendedores){

        vendedoresService.guardarVendedores(vendedores);
        return "redirect:/vendedores";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        vendedoresService.eliminarVendedores(id);
        return "redirect:/vendedores";
    }


}
