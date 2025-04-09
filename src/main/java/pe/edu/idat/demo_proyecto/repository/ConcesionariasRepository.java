package pe.edu.idat.demo_proyecto.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_proyecto.model.Concesionarias;

public interface ConcesionariasRepository extends JpaRepository<Concesionarias, Integer> {
}
