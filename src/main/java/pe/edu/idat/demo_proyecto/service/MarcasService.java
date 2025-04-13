package pe.edu.idat.demo_proyecto.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Marcas;
import pe.edu.idat.demo_proyecto.repository.MarcasRepository;

import java.util.List;

@Service
public class MarcasService {

    private final MarcasRepository marcaRepository;
    private static final Logger logger = LoggerFactory.getLogger(MarcasService.class);

    public MarcasService(MarcasRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public List<Marcas> obtenerMarcas() {
        logger.info("Obteniendo todas las marcas");
        return marcaRepository.findAll();
    }

    public Marcas obtenerMarcaPorId(int id) {
        logger.info("Buscando marca con ID " + id);
        return marcaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró la marca con ID " + id));
    }

    public void guardarMarca(Marcas marca) {
        logger.info("Guardando marca: " + marca);
        marcaRepository.save(marca);
    }

    public void eliminarMarca(int id) {
        if (!marcaRepository.existsById(id)) {
            throw new RuntimeException("El registro con ID " + id + " no existe.");
        }
        logger.info("Eliminando marca con ID " + id);
        marcaRepository.deleteById(id);
    }

    public boolean existeMarca(int id) {
        return marcaRepository.existsById(id);
    }
}
