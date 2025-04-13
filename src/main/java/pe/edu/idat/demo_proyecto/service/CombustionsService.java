package pe.edu.idat.demo_proyecto.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Combustions;
import pe.edu.idat.demo_proyecto.repository.CombustionsRepository;

import java.util.List;

@Service
public class CombustionsService {

    private final CombustionsRepository combustionsRepository;
    private static final Logger logger = LoggerFactory.getLogger(CombustionsService.class);

    public CombustionsService(CombustionsRepository combustionsRepository) {
        this.combustionsRepository = combustionsRepository;
    }

    public List<Combustions> obtenerCombustions() {
        logger.info("Obteniendo todas las combustiones");
        return combustionsRepository.findAll();
    }

    public Combustions obtenerPorId(int id) {
        logger.info("Buscando combustión con ID " + id);
        return combustionsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró la combustión con ID " + id));
    }

    public void guardarCombustion(Combustions combustion) {
        logger.info("Guardando combustión: " + combustion);
        combustionsRepository.save(combustion);
    }

    public void eliminarCombustion(int id) {
        if (!combustionsRepository.existsById(id)) {
            throw new RuntimeException("El registro con ID " + id + " no existe.");
        }
        logger.info("Eliminando combustión con ID " + id);
        combustionsRepository.deleteById(id);
    }
}