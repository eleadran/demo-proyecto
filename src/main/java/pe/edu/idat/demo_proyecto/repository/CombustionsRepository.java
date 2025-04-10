package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Combustions;

public interface CombustionsRepository extends JpaRepository<Combustions, Integer> {

    @Query(value = """
            UPDATE combustion SET tipoCombu_combus =:tipoCombu_combus
            WHERE cod_combus = :cod_combus
            """, nativeQuery = true)
    void actualizarProductoParcial(
            @Param("tipoCombu_combus") String tipoCombu_combus,
            @Param("cod_combus") Integer cod_combus);
}
