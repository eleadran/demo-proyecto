package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_proyecto.model.modelos;
public interface ModelosRepository extends JpaRepository<modelos, Integer> {
}
