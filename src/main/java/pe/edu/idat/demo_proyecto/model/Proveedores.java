package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
@Entity
@Table(name="proveedor")
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_Proveedor") // Asegúrate de que coincide con el nombre en la tabla
    private Integer codProveedor;


    @Column(name = "nombre_proveedor", nullable = false)
    private String nombreProveedor;

    @Column(name = "telefono_proveedor")
    private Integer telefonoProveedor;

    @Column(name = "stock_proveedor")
    private Integer stockProveedor;

    @Column(name = "direccion_proveedor", nullable = false)
    private String direccionProveedor;

    // Getters y Setters
    public Integer getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Integer codProveedor) {
        this.codProveedor = codProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Integer getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(Integer telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public Integer getStockProveedor() {
        return stockProveedor;
    }

    public void setStockProveedor(Integer stockProveedor) {
        this.stockProveedor = stockProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

}
