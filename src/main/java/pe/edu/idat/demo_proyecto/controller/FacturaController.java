package pe.edu.idat.demo_proyecto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_proyecto.model.Factura;
import pe.edu.idat.demo_proyecto.model.Clientes;
import pe.edu.idat.demo_proyecto.model.Vendedores;
import pe.edu.idat.demo_proyecto.model.Vehiculo;
import pe.edu.idat.demo_proyecto.model.Concesionarias;
import pe.edu.idat.demo_proyecto.service.FacturaService;
import pe.edu.idat.demo_proyecto.service.ClientesService;
import pe.edu.idat.demo_proyecto.service.VendedoresService;
import pe.edu.idat.demo_proyecto.service.VehiculosService;
import pe.edu.idat.demo_proyecto.service.ConcesionariasService;

import java.util.List;

@Controller
@RequestMapping("/facturas")
public class FacturaController {

    private static final Logger logger = LoggerFactory.getLogger(FacturaController.class);
    private final FacturaService facturaService;
    private final ClientesService clienteService;
    private final VendedoresService vendedorService;
    private final VehiculosService vehiculoService;
    private final ConcesionariasService concesionariaService;

    public FacturaController(FacturaService facturaService, ClientesService clienteService,
                             VendedoresService vendedorService, VehiculosService vehiculoService,
                             ConcesionariasService concesionariaService) {
        this.facturaService = facturaService;
        this.clienteService = clienteService;
        this.vendedorService = vendedorService;
        this.vehiculoService = vehiculoService;
        this.concesionariaService = concesionariaService;
    }

    @GetMapping
    public String index(Model model) {
        logger.info("Listando todas las facturas disponibles.");
        model.addAttribute("facturas", facturaService.obtenerFacturas());
        return "facturas/index"; // Confirmar existencia del archivo index.html
    }

    @GetMapping("/create")
    public String create(Model model) {
        logger.info("Preparando formulario para crear una nueva factura.");
        model.addAttribute("factura", new Factura());
        cargarListasParaFormulario(model); // Método para cargar datos necesarios
        return "facturas/create"; // Confirmar existencia del archivo create.html
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("factura") Factura factura) {
        logger.info("Guardando nueva factura: " + factura);
        facturaService.guardarFactura(factura);
        return "redirect:/facturas";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        logger.info("Eliminando factura con ID " + id);
        facturaService.eliminarFactura(id);
        return "redirect:/facturas";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        Factura factura = facturaService.obtenerFacturaPorId(id);
        model.addAttribute("factura", factura);
        cargarListasParaFormulario(model); // Método para cargar listas necesarias
        return "facturas/edit"; // Confirmar existencia de este archivo
    }

    private void cargarListasParaFormulario(Model model) {
        // Cargar listas para los dropdowns en el formulario
        List<Clientes> clientes = clienteService.obtenerClientes();
        if (clientes == null || clientes.isEmpty()) {
            logger.warn("La lista de clientes está vacía o es nula.");
        }
        model.addAttribute("clientes", clientes);

        List<Vendedores> vendedores = vendedorService.obtenerVendedores();
        if (vendedores == null || vendedores.isEmpty()) {
            logger.warn("La lista de vendedores está vacía o es nula.");
        }
        model.addAttribute("vendedores", vendedores);

        List<Vehiculo> vehiculos = vehiculoService.obtenerVehiculos();
        if (vehiculos == null || vehiculos.isEmpty()) {
            logger.warn("La lista de vehículos está vacía o es nula.");
        }
        model.addAttribute("vehiculos", vehiculos);

        List<Concesionarias> concesionarias = concesionariaService.obtenerConcesionarias();
        if (concesionarias == null || concesionarias.isEmpty()) {
            logger.warn("La lista de concesionarias está vacía o es nula.");
        }
        model.addAttribute("concesionarias", concesionarias);
    }
}