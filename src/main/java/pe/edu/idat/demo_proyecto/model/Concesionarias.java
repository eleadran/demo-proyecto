package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

@Entity
@Table (name = "concesionaria")
public class Concesionarias {
    @Id
    private Integer cod_concesionaria;
    private String nombre_concesionaria;
    private Integer cantidad_trabaja_concesionaria;
    private String direccion_concesionaria;

    @ManyToOne
    @JoinColumn(name = "cod_proveedor")
    private Proveedores proveedores;

    public Integer getCod_concesionaria() {
        return cod_concesionaria;
    }

    public void setCod_concesionaria(Integer cod_concesionaria) {
        this.cod_concesionaria = cod_concesionaria;
    }

    public String getNombre_concesionaria() {
        return nombre_concesionaria;
    }

    public void setNombre_concesionaria(String nombre_concesionaria) {
        this.nombre_concesionaria = nombre_concesionaria;
    }

    public Integer getCantidad_trabaja_concesionaria() {
        return cantidad_trabaja_concesionaria;
    }

    public void setCantidad_trabaja_concesionaria(Integer cantidad_trabaja_concesionaria) {
        this.cantidad_trabaja_concesionaria = cantidad_trabaja_concesionaria;
    }

    public String getDireccion_concesionaria() {
        return direccion_concesionaria;
    }

    public void setDireccion_concesionaria(String direccion_concesionaria) {
        this.direccion_concesionaria = direccion_concesionaria;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
}
