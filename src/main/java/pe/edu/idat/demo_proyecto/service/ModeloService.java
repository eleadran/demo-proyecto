package pe.edu.idat.demo_proyecto.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_proyecto.model.Modelo;
import pe.edu.idat.demo_proyecto.repository.ModeloRepository;

import java.util.List;

@Service
public class ModeloService {

    private final ModeloRepository modeloRepository;
    private static final Logger logger = LoggerFactory.getLogger(ModeloService.class);

    public ModeloService(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    public List<Modelo> obtenerModelos() {
        List<Modelo> modelos = modeloRepository.findAll();
        if (modelos == null || modelos.isEmpty()) {
            logger.warn("No se encontraron modelos en la base de datos.");
        }
        return modelos;
    }

    public Modelo obtenerModeloPorId(int id) {
        logger.info("Buscando modelo con ID " + id);
        return modeloRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("El modelo con ID " + id + " no existe."));
    }

    public void guardarModelo(Modelo modelo) {
        if (modelo.getDisenoModelo() == null || modelo.getDisenoModelo().trim().isEmpty()) {
            throw new IllegalArgumentException("El diseño del modelo no puede estar vacío.");
        }
        logger.info("Guardando modelo: " + modelo);
        modeloRepository.save(modelo);
    }

    public void eliminarModelo(int id) {
        if (!modeloRepository.existsById(id)) {
            throw new RuntimeException("El modelo con ID " + id + " no existe.");
        }
        modeloRepository.deleteById(id);
        logger.info("Modelo con ID " + id + " eliminado correctamente.");
    }
}