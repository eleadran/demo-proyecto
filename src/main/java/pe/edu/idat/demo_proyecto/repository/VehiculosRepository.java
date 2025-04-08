package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_proyecto.model.vehiculos;
public interface VehiculosRepository extends JpaRepository<vehiculos, Integer> {
}
