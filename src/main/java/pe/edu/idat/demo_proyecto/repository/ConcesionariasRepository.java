package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Concesionarias;
public interface ConcesionariasRepository extends JpaRepository<Concesionarias, Integer> {
    @Query(value = """
        UPDATE concesionaria SET 
            nombre_concesionaria = :nombre_concesionaria,
            cantidad_trabaja_concesionaria = :cantidad_trabaja_concesionaria,
            direccion_concesionaria = :direccion_concesionaria,
            cod_proveedor = :cod_proveedor
        WHERE cod_concesionaria = :cod_concesionaria
        """, nativeQuery = true)
    void actualizarConcesionariaParcial(
            @Param("nombre_concesionaria") String nombreConcesionaria,
            @Param("cantidad_trabaja_concesionaria") Integer cantidadTrabajaConcesionaria,
            @Param("direccion_concesionaria") String direccionConcesionaria,
            @Param("cod_proveedor") Integer codProveedor,
            @Param("cod_concesionaria") Integer codConcesionaria
    );

}
