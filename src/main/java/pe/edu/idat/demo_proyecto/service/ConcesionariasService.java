package pe.edu.idat.demo_proyecto.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Concesionarias;
import pe.edu.idat.demo_proyecto.repository.ConcesionariasRepository;

import java.util.List;

@Service
public class ConcesionariasService {

    private final ConcesionariasRepository concesionariaRepository;

    public ConcesionariasService(ConcesionariasRepository concesionariaRepository) {
        this.concesionariaRepository = concesionariaRepository;
    }

    // Método para obtener todas las concesionarias
    public List<Concesionarias> obtenerConcesionarias() {
        return concesionariaRepository.findAll();
    }

    // Método para obtener una concesionaria por su ID
    public Concesionarias obtenerConcesionariaPorId(int id) {
        return concesionariaRepository.findById(id).orElse(null);
    }

    // Método para guardar una nueva concesionaria o actualizar una existente
    public void guardarConcesionaria(Concesionarias concesionaria) {
        concesionariaRepository.save(concesionaria);
    }

    // Método para eliminar una concesionaria por su ID
    public void eliminarConcesionaria(int id) {
        concesionariaRepository.deleteById(id);
    }
}