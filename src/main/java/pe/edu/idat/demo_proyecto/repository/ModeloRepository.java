package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Modelo;
import java.math.BigDecimal;
import java.util.List;

public interface ModeloRepository extends JpaRepository<Modelo, Integer> {

    // Actualizar modelo parcialmente
    @Query(value = """
        UPDATE modelo SET diseno_modelo = :disenoModelo,
        tecnologia_modelo = :tecnologiaModelo,
        seguridad_modelo = :seguridadModelo,
        interior_modelo = :interiorModelo,
        precio = :precio
        WHERE cod_modelo = :id
        """, nativeQuery = true)
    int actualizarModeloParcial(
            @Param("disenoModelo") String disenoModelo,
            @Param("tecnologiaModelo") String tecnologiaModelo,
            @Param("seguridadModelo") String seguridadModelo,
            @Param("interiorModelo") String interiorModelo,
            @Param("precio") BigDecimal precio,
            @Param("id") Integer id);

    // Método adicional para buscar modelos por precio
    List<Modelo> findByPrecioGreaterThan(BigDecimal precio);
}