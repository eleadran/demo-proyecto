package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Modelos;
public interface ModelosRepository extends JpaRepository<Modelos, Integer> {

    @Query(value = """
            UPDATE modelo SET diseño_modelo= :diseño_modelo,
            tecnologia_modelo = :tecnologia_modelo,
            seguridad_modelo = :seguridad_modelo,
            interior_modelo = :interior_modelo,
            precio =:precio
            WHERE cod_modelo = :cod_modelo
            """, nativeQuery = true)
    void actualizarProductoParcial(
            @Param("diseño_modelo") String diseño_modelo,
            @Param("tecnologia_modelo") String tecnologia_modelo,
            @Param("seguridad_modelo") String seguridad_modelo,
            @Param("interior_modelo") String interior_modelo,
            @Param("precio") Double precio,
            @Param("cod_modelo") Integer cod_modelo);
}
