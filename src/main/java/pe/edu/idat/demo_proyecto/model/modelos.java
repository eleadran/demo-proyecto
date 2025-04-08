package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="modelo")

public class modelos {
    @Id
    private Integer cod_modelo;
    private String diseño_modelo;
    private String tecnologia_modelo;
    private String seeguridad_modelo;
    private String interior_modelo;
    private Double precio;

    public Integer getCod_modelo() {
        return cod_modelo;
    }

    public void setCod_modelo(Integer cod_modelo) {
        this.cod_modelo = cod_modelo;
    }

    public String getDiseño_modelo() {
        return diseño_modelo;
    }

    public void setDiseño_modelo(String diseño_modelo) {
        this.diseño_modelo = diseño_modelo;
    }

    public String getTecnologia_modelo() {
        return tecnologia_modelo;
    }

    public void setTecnologia_modelo(String tecnologia_modelo) {
        this.tecnologia_modelo = tecnologia_modelo;
    }

    public String getSeeguridad_modelo() {
        return seeguridad_modelo;
    }

    public void setSeeguridad_modelo(String seeguridad_modelo) {
        this.seeguridad_modelo = seeguridad_modelo;
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
