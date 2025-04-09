package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedor")
public class Proveedores {
    @Id
    private Integer cod_proveedor;
    private String nombre_proveedor;
    private Integer telefono_proveedor;
    private Integer stock_proveedor;
    private String direccion_proveedor;

    public Integer getCod_proveedor() {
        return cod_proveedor;
    }

    public void setCod_proveedor(Integer cod_proveedor) {
        this.cod_proveedor = cod_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public Integer getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(Integer telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }

    public Integer getStock_proveedor() {
        return stock_proveedor;
    }

    public void setStock_proveedor(Integer stock_proveedor) {
        this.stock_proveedor = stock_proveedor;
    }

    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }
}
