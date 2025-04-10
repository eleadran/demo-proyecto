package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Proveedores;
public interface ProveedoresRepository extends JpaRepository<Proveedores, Integer> {

    @Query(value = """
            UPDATE products SET nombre_proveedor= :nombre_proveedor,
            telefono_proveedor = :telefono_proveedor,
            stock_proveedor =:stock_proveedor,
            direccion_proveedor =:direccion_proveedor
            WHERE cod_proveedor = :cod_proveedor
            """, nativeQuery = true)
    void actualizarProductoParcial(
            @Param("nombre_proveedor") String nombre_proveedor,
            @Param("telefono_proveedor") Integer telefono_proveedor,
            @Param("stock_proveedor") Integer stock_proveedor,
            @Param("direccion_proveedor") String direccion_proveedor,
            @Param("cod_proveedor") Integer cod_proveedor);
}
