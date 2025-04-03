package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="modelo")

public class modelos {
    @Id
    private Integer codmodelo;
    private String diseniomodelo;
    private String tecnologiamodelo;
    private String seeguridadmodelo;
    private String interiormodelo;
    private Double precio;

    public Integer getCodmodelo() {
        return codmodelo;
    }

    public void setCodmodelo(Integer codmodelo) {
        this.codmodelo = codmodelo;
    }

    public String getDiseniomodelo() {
        return diseniomodelo;
    }

    public void setDiseniomodelo(String diseniomodelo) {
        this.diseniomodelo = diseniomodelo;
    }

    public String getTecnologiamodelo() {
        return tecnologiamodelo;
    }

    public void setTecnologiamodelo(String tecnologiamodelo) {
        this.tecnologiamodelo = tecnologiamodelo;
    }

    public String getSeeguridadmodelo() {
        return seeguridadmodelo;
    }

    public void setSeeguridadmodelo(String seeguridadmodelo) {
        this.seeguridadmodelo = seeguridadmodelo;
    }

    public String getInteriormodelo() {
        return interiormodelo;
    }

    public void setInteriormodelo(String interiormodelo) {
        this.interiormodelo = interiormodelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
