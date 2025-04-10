package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Combustions;
import pe.edu.idat.demo_proyecto.repository.CombustionsRepository;

import java.util.List;

@Service
public class CombustionsService {

    private final CombustionsRepository combustionsRepository;
    public CombustionsService(CombustionsRepository combustionsRepository) {
        this.combustionsRepository = combustionsRepository;
    }

    public List<Combustions> obtenerCombustions (){

        return combustionsRepository.findAll();

    }

    public Combustions obtenerCombustionsXid (int id){
        return combustionsRepository.findById(id).orElse(null);

    }


    public void guardarCombustions(Combustions combustions){
        combustionsRepository.save(combustions);
    }

    public void eliminarCombustions(int id) {
        combustionsRepository.deleteById(id);
    }
}
