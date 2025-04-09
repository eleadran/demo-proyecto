package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="vendedor")
public class Vendedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_vendedor;
    private String nombre_vendedor;
    private String apellido_vendedor;
    private Double sueldo_vendedor;
    private Integer ventas_vendedor;

    public Integer getCod_vendedor() {
        return cod_vendedor;
    }

    public void setCod_vendedor(Integer cod_vendedor) {
        this.cod_vendedor = cod_vendedor;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public String getApellido_vendedor() {
        return apellido_vendedor;
    }

    public void setApellido_vendedor(String apellido_vendedor) {
        this.apellido_vendedor = apellido_vendedor;
    }

    public Double getSueldo_vendedor() {
        return sueldo_vendedor;
    }

    public void setSueldo_vendedor(Double sueldo_vendedor) {
        this.sueldo_vendedor = sueldo_vendedor;
    }

    public Integer getVentas_vendedor() {
        return ventas_vendedor;
    }

    public void setVentas_vendedor(Integer ventas_vendedor) {
        this.ventas_vendedor = ventas_vendedor;
    }
}
