package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Proveedores;
import pe.edu.idat.demo_proyecto.repository.ProveedoresRepository;

import java.util.List;

@Service
public class ProveedoresService {

    private final ProveedoresRepository proveedoresRepository;
    public ProveedoresService(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository ;
    }

    public List<Proveedores> obtenerProveedores (){

        return proveedoresRepository.findAll();

    }

    public Proveedores obtenerProveedoresXid (int id){
        return proveedoresRepository.findById(id).orElse(null);

    }


    public void guardarProveedores(Proveedores proveedores){
        proveedoresRepository.save(proveedores);
    }

    public void eliminarProveedores(int id) {
        proveedoresRepository.deleteById(id);
    }
}
