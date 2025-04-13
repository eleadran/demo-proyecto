package pe.edu.idat.demo_proyecto.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Vehiculo;
import pe.edu.idat.demo_proyecto.repository.VehiculosRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class VehiculosService {

    private final VehiculosRepository vehiculoRepository;
    private static final Logger logger = LoggerFactory.getLogger(VehiculosService.class);

    public VehiculosService(VehiculosRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public List<Vehiculo> obtenerVehiculos() {
        logger.info("Obteniendo todos los vehículos desde la base de datos");
        return vehiculoRepository.findAll();
    }

    public Vehiculo obtenerVehiculoPorId(int id) {
        logger.info("Buscando vehículo con ID " + id);
        return vehiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el vehículo con ID " + id));
    }

    public void guardarVehiculo(Vehiculo vehiculo) {
        logger.info("Guardando vehículo: " + vehiculo);
        vehiculoRepository.save(vehiculo);
    }

    public void eliminarVehiculo(int id) {
        if (!vehiculoRepository.existsById(id)) {
            throw new RuntimeException("El vehículo con ID " + id + " no existe.");
        }
        logger.info("Eliminando vehículo con ID " + id);
        vehiculoRepository.deleteById(id);
    }

    public void actualizarVehiculoParcial(String color, Integer anio, Integer codCombus, Integer codMarca,
                                          String disenoModelo, BigDecimal precio, Integer id) {
        logger.info("Actualizando parcialmente vehículo con ID " + id);
        vehiculoRepository.actualizarVehiculoParcial(color, anio, codCombus, codMarca, disenoModelo, precio, id);
    }
}