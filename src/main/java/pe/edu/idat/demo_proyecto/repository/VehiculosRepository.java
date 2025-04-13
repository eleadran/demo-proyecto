package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Vehiculo;

public interface VehiculosRepository extends JpaRepository<Vehiculo, Integer> {

    @Query(value = """
        UPDATE vehiculo SET
            color_vehiculo = :color,
            año_vehiculo = :anio,
            cod_combus = :codCombus,
            cod_marca = :codMarca,
            cod_modelo = :codModelo
        WHERE cod_vehiculo = :id
        """, nativeQuery = true)
    void actualizarVehiculoParcial(
            @Param("color") String color,
            @Param("anio") java.sql.Date anio,
            @Param("codCombus") Integer codCombus,
            @Param("codMarca") Integer codMarca,
            @Param("codModelo") Integer codModelo,
            @Param("id") Integer id
    );
}