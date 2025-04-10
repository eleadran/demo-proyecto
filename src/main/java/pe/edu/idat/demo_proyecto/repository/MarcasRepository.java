package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Marcas;
public interface MarcasRepository  extends JpaRepository<Marcas, Integer> {

    @Query(value = """
            UPDATE products SET nombre_marca= :nombre_marca,
            stock_marca =:stock_marca
            WHERE cod_marca = :cod_marca
            """, nativeQuery = true)
    void actualizarProductoParcial(
            @Param("nombre_marca") String nombre_marca,
            @Param("stock_marca") Integer stock_marca,
            @Param("cod_marca") Integer cod_marca);

}
