package pe.edu.idat.demo_proyecto.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_proyecto.model.marcas;
public interface MarcasRepository  extends JpaRepository<marcas, Integer> {
}
