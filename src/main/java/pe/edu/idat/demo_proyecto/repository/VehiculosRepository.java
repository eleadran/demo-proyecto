package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Vehiculo;

import java.math.BigDecimal;

public interface VehiculosRepository extends JpaRepository<Vehiculo, Integer> {

    @Query(value = """
        UPDATE vehiculo SET
            color_vehiculo = :color,
            anio_vehiculo = :anio,
            cod_combus = :codCombus,
            cod_marca = :codMarca,
            diseno_modelo = :disenoModelo,
            precio = :precio
        WHERE cod_vehiculo = :id
        """, nativeQuery = true)
    void actualizarVehiculoParcial(
            @Param("color") String color,
            @Param("anio") Integer anio,
            @Param("codCombus") Integer codCombus,
            @Param("codMarca") Integer codMarca,
            @Param("disenoModelo") String disenoModelo,
            @Param("precio") BigDecimal precio,
            @Param("id") Integer id
    );
}