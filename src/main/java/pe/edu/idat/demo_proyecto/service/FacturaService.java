package pe.edu.idat.demo_proyecto.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Factura;
import pe.edu.idat.demo_proyecto.repository.FacturaRepository;

import java.util.List;

@Service
public class FacturaService {

    private final FacturaRepository facturaRepository;
    private static final Logger logger = LoggerFactory.getLogger(FacturaService.class);

    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    // Obtener todas las facturas
    public List<Factura> obtenerFacturas() {
        logger.info("Obteniendo todas las facturas desde la base de datos.");
        return facturaRepository.findAll();
    }

    // Obtener factura por ID
    public Factura obtenerFacturaPorId(int id) {
        logger.info("Buscando factura con ID " + id);
        return facturaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró la factura con ID " + id));
    }

    // Guardar una nueva factura
    public void guardarFactura(Factura factura) {
        logger.info("Guardando factura: " + factura);
        facturaRepository.save(factura);
    }

    // Eliminar una factura
    public void eliminarFactura(int id) {
        if (!facturaRepository.existsById(id)) {
            throw new RuntimeException("La factura con ID " + id + " no existe.");
        }
        logger.info("Eliminando factura con ID " + id);
        facturaRepository.deleteById(id);
    }

    // Actualizar una factura de manera parcial
    public void actualizarFacturaParcial(String fechaFactura, Double importeVenta, Integer codCliente,
                                         Integer codVendedor, Integer codVehiculo, Integer codConcesionaria,
                                         Integer id) {
        logger.info("Actualizando parcialmente factura con ID " + id);
        facturaRepository.actualizarFacturaParcial(fechaFactura, importeVenta, codCliente,
                codVendedor, codVehiculo, codConcesionaria, id);
    }
}