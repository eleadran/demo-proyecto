package pe.edu.idat.demo_proyecto.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Clientes;
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {


    public interface clientesRepository
            extends JpaRepository<Clientes, Integer> {

        @Query(value = """
            UPDATE cliente SET nombre_cliente= :nombre_cliente,
            apellido_cliente = :apellido_cliente,
            trabajo_cliente = :trabajo_cliente,
            telefono_cliente = :telefono_cliente,
            direccion_cliente =:direccion_cliente
            WHERE cod_cliente = :cod_cliente
            """, nativeQuery = true)
        void actualizarProductoParcial(
                @Param("nombre_cliente") String nombre_cliente,
                @Param("apellido_cliente") String apellido_cliente,
                @Param("trabajo_cliente") String trabajo_cliente,
                @Param("telefono_cliente") Integer telefono_cliente,
                @Param("direccion_cliente") String direccion_cliente,
                @Param("cod_cliente") Integer cod_cliente);


    }
}
