package pe.edu.idat.demo_proyecto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
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

import java.text.SimpleDateFormat;
import java.util.Date;
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
        return "facturas/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        logger.info("Preparando formulario para la creación de una nueva factura.");
        model.addAttribute("factura", new Factura());
        cargarListasParaFormulario(model);
        return "facturas/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        Factura factura = facturaService.obtenerFacturaPorId(id);
        if (factura == null) {
            throw new RuntimeException("No se encontró la factura con ID " + id);
        }
        model.addAttribute("factura", factura); // Cargar el objeto completo
        cargarListasParaFormulario(model);
        return "facturas/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("factura") Factura factura) {
        if (factura.getCliente() == null || factura.getVendedor() == null ||
                factura.getVehiculo() == null || factura.getConcesionaria() == null) {
            throw new IllegalArgumentException("El cliente, vendedor, vehículo y concesionaria son obligatorios.");
        }
        logger.info("Guardando factura con información: " + factura);
        facturaService.guardarFactura(factura);
        return "redirect:/facturas";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        logger.info("Eliminando factura con ID " + id);
        facturaService.eliminarFactura(id);
        logger.info("Factura con ID " + id + " eliminada correctamente.");
        return "redirect:/facturas";
    }

    private void cargarListasParaFormulario(Model model) {
        // Carga de Clientes
        List<Clientes> clientes = clienteService.obtenerClientes();
        if (clientes == null || clientes.isEmpty()) {
            logger.warn("La lista de clientes está vacía o es nula.");
        }
        model.addAttribute("clientes", clientes);

        // Carga de Vendedores
        List<Vendedores> vendedores = vendedorService.obtenerVendedores();
        if (vendedores == null || vendedores.isEmpty()) {
            logger.warn("La lista de vendedores está vacía o es nula.");
        }
        model.addAttribute("vendedores", vendedores);

        // Carga de Vehículos
        List<Vehiculo> vehiculos = vehiculoService.obtenerVehiculos();
        if (vehiculos == null || vehiculos.isEmpty()) {
            logger.warn("La lista de vehículos está vacía o es nula.");
        }
        model.addAttribute("vehiculos", vehiculos);

        // Carga de Concesionarias
        List<Concesionarias> concesionarias = concesionariaService.obtenerConcesionarias();
        if (concesionarias == null || concesionarias.isEmpty()) {
            logger.warn("La lista de concesionarias está vacía o es nula.");
        }
        model.addAttribute("concesionarias", concesionarias);
    }
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


}