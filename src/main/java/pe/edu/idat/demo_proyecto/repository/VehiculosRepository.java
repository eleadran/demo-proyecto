package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Vehiculo;

public interface VehiculosRepository extends JpaRepository<Vehiculo, Integer> {
    @Query(value = """
        UPDATE vehiculo SET 
            color_vehiculo = :color_vehiculo,
            año_vehiculo = :año_vehiculo,
            cod_combus = :cod_combus,
            cod_marca = :cod_marca,
            cod_modelo = :cod_modelo
        WHERE cod_vehiculo = :cod_vehiculo
        """, nativeQuery = true)
    void actualizarVehiculoParcial(
            @Param("color_vehiculo") String colorVehiculo,
            @Param("año_vehiculo") java.sql.Date añoVehiculo,
            @Param("cod_combus") Integer codCombus,
            @Param("cod_marca") Integer codMarca,
            @Param("cod_modelo") Integer codModelo,
            @Param("cod_vehiculo") Integer codVehiculo
    );
}