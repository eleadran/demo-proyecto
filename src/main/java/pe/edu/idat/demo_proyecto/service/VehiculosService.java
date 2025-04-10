package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Vehiculos;
import pe.edu.idat.demo_proyecto.repository.VehiculosRepository;

import java.util.List;
@Service
public class VehiculosService {

    private final VehiculosRepository vehiculosRepository;
    public VehiculosService(VehiculosRepository vehiculosRepository) {
        this.vehiculosRepository = vehiculosRepository;
    }

    public List<Vehiculos> obtenerVehiculos (){

        return vehiculosRepository.findAll();

    }

    public Vehiculos obtenerVehiculosXid (int id){
        return vehiculosRepository.findById(id).orElse(null);

    }


    public void guardarVehiculos(Vehiculos vehiculos){
        vehiculosRepository.save(vehiculos);
    }

    public void eliminarVehiculos(int id) {
        vehiculosRepository.deleteById(id);
    }
}
