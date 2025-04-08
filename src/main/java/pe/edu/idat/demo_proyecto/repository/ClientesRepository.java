package pe.edu.idat.demo_proyecto.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_proyecto.model.clientes;
public interface ClientesRepository extends JpaRepository<clientes, Integer> {
}
