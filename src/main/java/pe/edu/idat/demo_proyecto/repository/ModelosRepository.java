package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_proyecto.model.Modelos;
public interface ModelosRepository extends JpaRepository<Modelos, Integer> {
}
