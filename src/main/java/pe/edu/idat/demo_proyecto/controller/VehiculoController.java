package pe.edu.idat.demo_proyecto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Combustions;
import pe.edu.idat.demo_proyecto.model.Marcas;
import pe.edu.idat.demo_proyecto.model.Vehiculo;
import pe.edu.idat.demo_proyecto.service.CombustionsService;
import pe.edu.idat.demo_proyecto.service.MarcasService;
import pe.edu.idat.demo_proyecto.service.VehiculosService;

import java.util.List;

@Controller
@RequestMapping("/vehiculos")
public class VehiculoController {

    private static final Logger logger = LoggerFactory.getLogger(VehiculoController.class);
    private final VehiculosService vehiculoService;
    private final CombustionsService combustionService;
    private final MarcasService marcaService;

    public VehiculoController(VehiculosService vehiculoService, CombustionsService combustionService,
                              MarcasService marcaService) {
        this.vehiculoService = vehiculoService;
        this.combustionService = combustionService;
        this.marcaService = marcaService;
    }

    @GetMapping
    public String index(Model model) {
        logger.info("Listando todos los vehículos disponibles.");
        model.addAttribute("vehiculos", vehiculoService.obtenerVehiculos());
        return "vehiculos/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        logger.info("Preparando formulario para la creación de un nuevo vehículo.");
        model.addAttribute("vehiculo", new Vehiculo());
        cargarListasParaFormulario(model);
        return "vehiculos/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        logger.info("Cargando datos del vehículo con ID " + id + " para edición.");
        Vehiculo vehiculo = vehiculoService.obtenerVehiculoPorId(id);
        if (vehiculo == null) {
            throw new RuntimeException("No se encontró el vehículo con ID " + id);
        }
        model.addAttribute("vehiculo", vehiculo);
        cargarListasParaFormulario(model);
        return "vehiculos/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("vehiculo") Vehiculo vehiculo) {
        logger.info("Guardando vehículo con información: " + vehiculo);
        vehiculoService.guardarVehiculo(vehiculo);
        return "redirect:/vehiculos";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        logger.info("Eliminando vehículo con ID " + id);
        vehiculoService.eliminarVehiculo(id);
        logger.info("Vehículo con ID " + id + " eliminado correctamente.");
        return "redirect:/vehiculos";
    }

    private void cargarListasParaFormulario(Model model) {
        List<Combustions> combustiones = combustionService.obtenerCombustions();
        model.addAttribute("combustiones", combustiones);

        List<Marcas> marcas = marcaService.obtenerMarcas();
        model.addAttribute("marcas", marcas);
    }
}