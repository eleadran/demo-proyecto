package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Modelos;
import pe.edu.idat.demo_proyecto.repository.ModelosRepository;

import java.util.List;

@Service
public class ModelosService {

    private final ModelosRepository modelosRepository;
    public ModelosService(ModelosRepository modelosRepository) {
        this.modelosRepository = modelosRepository;
    }

    public List<Modelos> obtenerModelos (){

        return modelosRepository.findAll();

    }

    public Modelos obtenerModelosXid (int id){
        return modelosRepository.findById(id).orElse(null);

    }


    public void guardarFacturas(Modelos modelos){
        modelosRepository.save(modelos);
    }

    public void eliminarModelos(int id) {
        modelosRepository.deleteById(id);
    }
}
