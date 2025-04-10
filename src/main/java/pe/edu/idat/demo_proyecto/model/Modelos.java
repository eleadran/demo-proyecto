package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table (name= "modelo")

public class Modelos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_modelo;

    @Column(name = "diseño_modelo")
    private String diseno_modelo;
    private String tecnologia_modelo;
    private String seguridad_modelo;
    private String interior_modelo;
    private Double precio;

    public String getDiseno_modelo() {
        return diseno_modelo;
    }

    public void setDiseno_modelo(String diseno_modelo) {
        this.diseno_modelo = diseno_modelo;
    }

    public String getSeguridad_modelo() {
        return seguridad_modelo;
    }

    public void setSeguridad_modelo(String seguridad_modelo) {
        this.seguridad_modelo = seguridad_modelo;
    }

    public Integer getCod_modelo() {
        return cod_modelo;
    }

    public void setCod_modelo(Integer cod_modelo) {
        this.cod_modelo = cod_modelo;
    }

    public String getTecnologia_modelo() {
        return tecnologia_modelo;
    }

    public void setTecnologia_modelo(String tecnologia_modelo) {
        this.tecnologia_modelo = tecnologia_modelo;
    }

    public String getInterior_modelo() {
        return interior_modelo;
    }

    public void setInterior_modelo(String interior_modelo) {
        this.interior_modelo = interior_modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
