package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_proyecto.model.Vehiculos;
public interface VehiculosRepository extends JpaRepository<Vehiculos, Integer> {
}
