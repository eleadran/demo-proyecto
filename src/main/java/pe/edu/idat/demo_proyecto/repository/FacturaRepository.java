package pe.edu.idat.demo_proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_proyecto.model.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    @Query(value = """
        UPDATE factura SET
            fecha_factura = :fecha_factura,
            importe_venta = :importe_venta,
            cod_cliente = :cod_cliente,
            cod_vendedor = :cod_vendedor,
            cod_vehiculo = :cod_vehiculo,
            cod_concesionaria = :cod_concesionaria
        WHERE cod_factura = :cod_factura
        """, nativeQuery = true)
    void actualizarFacturaParcial(
            @Param("fecha_factura") String fechaFactura,
            @Param("importe_venta") Double importeVenta,
            @Param("cod_cliente") Integer codCliente,
            @Param("cod_vendedor") Integer codVendedor,
            @Param("cod_vehiculo") Integer codVehiculo,
            @Param("cod_concesionaria") Integer codConcesionaria,
            @Param("cod_factura") Integer codFactura
    );
}