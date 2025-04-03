package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedor")
public class proveedores {
    @Id
    private Integer codproveedor;
    private String nombreproveedor;
    private Integer telefonoproveedor;
    private Integer stockproveedor;
    private String direccionproveedor;

    public Integer getCodproveedor() {
        return codproveedor;
    }

    public void setCodproveedor(Integer codproveedor) {
        this.codproveedor = codproveedor;
    }

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }

    public Integer getTelefonoproveedor() {
        return telefonoproveedor;
    }

    public void setTelefonoproveedor(Integer telefonoproveedor) {
        this.telefonoproveedor = telefonoproveedor;
    }

    public Integer getStockproveedor() {
        return stockproveedor;
    }

    public void setStockproveedor(Integer stockproveedor) {
        this.stockproveedor = stockproveedor;
    }

    public String getDireccionproveedor() {
        return direccionproveedor;
    }

    public void setDireccionproveedor(String direccionproveedor) {
        this.direccionproveedor = direccionproveedor;
    }
}
