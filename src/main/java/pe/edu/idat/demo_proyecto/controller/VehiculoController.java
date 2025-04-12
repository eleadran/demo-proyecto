package pe.edu.idat.demo_proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Vehiculo;
import pe.edu.idat.demo_proyecto.service.CombustionsService;
import pe.edu.idat.demo_proyecto.service.MarcasService;
import pe.edu.idat.demo_proyecto.service.ModelosService;
import pe.edu.idat.demo_proyecto.service.VehiculosService;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/vehiculos")
public class VehiculoController {

    private final VehiculosService vehiculoService;
    private final CombustionsService combustionService;
    private final MarcasService marcaService;
    private final ModelosService modeloService;

    public VehiculoController(VehiculosService vehiculoService, CombustionsService combustionService,
                              MarcasService marcaService, ModelosService modeloService) {
        this.vehiculoService = vehiculoService;
        this.combustionService = combustionService;
        this.marcaService = marcaService;
        this.modeloService = modeloService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("vehiculos", vehiculoService.obtenerVehiculos());
        return "vehiculos/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("vehiculo", new Vehiculo());
        model.addAttribute("combustiones", combustionService.obtenerCombustions());
        model.addAttribute("marcas", marcaService.obtenerMarcas());
        model.addAttribute("modelos", modeloService.obtenerModelos());
        return "vehiculos/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("vehiculo", vehiculoService.obtenerVehiculoPorId(id));
        model.addAttribute("combustiones", combustionService.obtenerCombustions());
        model.addAttribute("marcas", marcaService.obtenerMarcas());
        model.addAttribute("modelos", modeloService.obtenerModelos());
        return "vehiculos/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("vehiculo") Vehiculo vehiculo) {
        vehiculoService.guardarVehiculo(vehiculo);
        return "redirect:/vehiculos";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        vehiculoService.eliminarVehiculo(id);
        return "redirect:/vehiculos";
    }
}