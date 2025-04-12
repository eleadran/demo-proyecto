package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Vehiculo;
import pe.edu.idat.demo_proyecto.repository.VehiculosRepository;

import java.sql.Date;
import java.util.List;

@Service
public class VehiculosService {

    private final VehiculosRepository vehiculoRepository;

    public VehiculosService(VehiculosRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public List<Vehiculo> obtenerVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo obtenerVehiculoPorId(int id) {
        return vehiculoRepository.findById(id).orElse(null);
    }

    public void guardarVehiculo(Vehiculo vehiculo) {
        vehiculoRepository.save(vehiculo);
    }

    public void eliminarVehiculo(int id) {
        vehiculoRepository.deleteById(id);
    }

    public void actualizarVehiculoParcial(String colorVehiculo, Date añoVehiculo, Integer codCombus, Integer codMarca, Integer codModelo, Integer codVehiculo) {
        vehiculoRepository.actualizarVehiculoParcial(colorVehiculo, añoVehiculo, codCombus, codMarca, codModelo, codVehiculo);
    }
}