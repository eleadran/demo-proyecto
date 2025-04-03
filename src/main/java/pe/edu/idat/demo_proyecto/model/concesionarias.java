package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

@Entity
@Table (name = "concesionaria")
public class concesionarias {
    @Id
    private Integer codconcesionaria;
    private String nombreconcesionaria;
    private Integer cantidadtrabajaconcesionaria;
    private String direccionconcesionaria;

    @ManyToOne
    @JoinColumn(name = "codproveedor")
    private proveedores proveedores;

    public Integer getCodconcesionaria() {
        return codconcesionaria;
    }

    public void setCodconcesionaria(Integer codconcesionaria) {
        this.codconcesionaria = codconcesionaria;
    }

    public String getNombreconcesionaria() {
        return nombreconcesionaria;
    }

    public void setNombreconcesionaria(String nombreconcesionaria) {
        this.nombreconcesionaria = nombreconcesionaria;
    }

    public Integer getCantidadtrabajaconcesionaria() {
        return cantidadtrabajaconcesionaria;
    }

    public void setCantidadtrabajaconcesionaria(Integer cantidadtrabajaconcesionaria) {
        this.cantidadtrabajaconcesionaria = cantidadtrabajaconcesionaria;
    }

    public String getDireccionconcesionaria() {
        return direccionconcesionaria;
    }

    public void setDireccionconcesionaria(String direccionconcesionaria) {
        this.direccionconcesionaria = direccionconcesionaria;
    }
}
