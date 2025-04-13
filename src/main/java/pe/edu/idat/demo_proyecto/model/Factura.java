package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_factura")
    private Integer id;

    @Column(name = "fecha_factura", nullable = false)
    private LocalDate fechaFactura;

    @Column(name = "importe_venta", nullable = false)
    private Double importeVenta;  // Ajustado a Double

    @ManyToOne
    @JoinColumn(name = "cod_cliente", nullable = false)
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "cod_vendedor", nullable = false)
    private Vendedores vendedor;

    @ManyToOne
    @JoinColumn(name = "cod_vehiculo", nullable = false)
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "cod_concesionaria", nullable = false)
    private Concesionarias concesionaria;

    // Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Double getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(Double importeVenta) {
        this.importeVenta = importeVenta;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vendedores getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedores vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Concesionarias getConcesionaria() {
        return concesionaria;
    }

    public void setConcesionaria(Concesionarias concesionaria) {
        this.concesionaria = concesionaria;
    }
}
