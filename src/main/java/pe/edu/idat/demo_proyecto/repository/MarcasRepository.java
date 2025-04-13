package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Marcas;

public interface MarcasRepository extends JpaRepository<Marcas, Integer> {

    @Query(value = """
            UPDATE marca SET nombre_marca = :nombreMarca,
            stock_marca = :stock
            WHERE cod_marca = :id
            """, nativeQuery = true)
    void actualizarMarcaParcial(
            @Param("nombreMarca") String nombreMarca,
            @Param("stock") Integer stock,
            @Param("id") Integer id);

    @Query(value = """
            SELECT COUNT(*) FROM marca WHERE cod_marca = :id
            """, nativeQuery = true)
    boolean existeMarca(@Param("id") Integer id);
}
