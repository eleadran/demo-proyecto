package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_proyecto.model.vendedores;

public interface VendedoresRespository extends JpaRepository<vendedores, Integer> {

}
