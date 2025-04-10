package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Concesionarias;
import pe.edu.idat.demo_proyecto.repository.ConcesionariasRepository;

import java.util.List;

@Service
public class ConcesionariasService {

    private final ConcesionariasRepository concesionariasRepository;
    public ConcesionariasService(ConcesionariasRepository concesionariasRepository) {
        this.concesionariasRepository = concesionariasRepository;
    }

    public List<Concesionarias> obtenerConcesionaria (){

        return concesionariasRepository.findAll();

    }

    public Concesionarias obtenerConcesionariaXid (int id){
        return concesionariasRepository.findById(id).orElse(null);

    }


    public void guardarConcesionaria(Concesionarias concesionarias){
        concesionariasRepository.save(concesionarias);
    }

    public void eliminarConcesionaria(int id) {
        concesionariasRepository.deleteById(id);
    }
}
