package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Marcas;
import pe.edu.idat.demo_proyecto.repository.MarcasRepository;

import java.util.List;

@Service
public class MarcasService {

    private final MarcasRepository marcasRepository;
    public MarcasService(MarcasRepository marcasRepository) {
        this.marcasRepository = marcasRepository;
    }

    public List<Marcas> obtenerMarcas (){

        return marcasRepository.findAll();

    }

    public Marcas obtenerMarcasXid (int id){
        return marcasRepository.findById(id).orElse(null);

    }


    public void guardarMarcas(Marcas marcas){
        marcasRepository.save(marcas);
    }

    public void eliminarMarcas(int id) {
        marcasRepository.deleteById(id);
    }
}
