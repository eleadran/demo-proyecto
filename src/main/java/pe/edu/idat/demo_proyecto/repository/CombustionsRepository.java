package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Combustions;

public interface CombustionsRepository extends JpaRepository<Combustions, Integer> {

    @Query(value = """
            UPDATE combustion SET tipoCombu_combus = :tipoCombustion
            WHERE cod_combus = :id
            """, nativeQuery = true)
    void actualizarTipoCombustion(
            @Param("tipoCombustion") String tipoCombustion,
            @Param("id") Integer id);

    @Query(value = """
            SELECT CASE WHEN COUNT(*) > 0 THEN true ELSE false END
            FROM combustion WHERE cod_combus = :id
            """, nativeQuery = true)
    boolean existeCombustion(@Param("id") Integer id);
}