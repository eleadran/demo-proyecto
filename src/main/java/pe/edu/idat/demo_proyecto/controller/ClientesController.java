package pe.edu.idat.demo_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Clientes;
import pe.edu.idat.demo_proyecto.service.ClientesService;


@Controller
@RequestMapping("/clientes")
public class ClientesController {

    private  final ClientesService clientesService;

    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }
    @GetMapping
    public String index(Model model){
        model.addAttribute("clientes",
        clientesService.obtenerClientes());
        return "clientes/index";
    }
    @GetMapping ("/create")
    public String create (Model model){
        model.addAttribute("cliente",
                new Clientes());
        return "clientes/create";
    }

    @GetMapping ("/edit/{id}")
    public String edit(Model model, @PathVariable int id){

        model.addAttribute("cliente",
                clientesService.obtenerClientesXid(id));
        return "clientes/edit";
    }
    @PostMapping ("/save")
    public String save(@ModelAttribute("clientes")
                       Clientes clientes){

        clientesService.guardarClientes(clientes);
        return "redirect:/clientes";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        clientesService.eliminarCliente(id);
        return "redirect:/clientes";
    }

}

