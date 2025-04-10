package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Vendedores;

public interface VendedoresRespository extends JpaRepository<Vendedores, Integer> {

    @Query(value = """
            UPDATE products SET nombre_vendedor= :nombre_vendedor,
            apellido_vendedor = :apellido_vendedor,
            sueldo_vendedor = :sueldo_vendedor,
            ventas_vendedor =:ventas_vendedor
            WHERE cod_vendedor = :cod_vendedor
            """, nativeQuery = true)
    void actualizarProductoParcial(
            @Param("nombre_vendedor") String nombre_vendedor,
            @Param("apellido_vendedor") String apellido_vendedor,
            @Param("sueldo_vendedor") Double sueldo_vendedor,
            @Param("ventas_vendedor") Integer ventas_vendedor,
            @Param("cod_vendedor") Integer cod_vendedor);

}
