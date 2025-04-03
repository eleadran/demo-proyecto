package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="vehiculo")
public class vehiculos {
    @Id
    private Integer codvehiculo;
    private String colorvehiculo;
    private Date añovehiculo;

    @ManyToOne
    @JoinColumn(name = "codcombus")
    private combustions combustions;

    @ManyToOne
    @JoinColumn(name = "codmodelo")
    private modelos modelos;

    @ManyToOne
    @JoinColumn(name = "codmarca")
    private marcas marcas;

    public combustions getCombustions() {
        return combustions;
    }

    public void setCombustions(combustions combustions) {
        this.combustions = combustions;
    }

    public modelos getModelos() {
        return modelos;
    }

    public void setModelos(modelos modelos) {
        this.modelos = modelos;
    }

    public marcas getMarcas() {
        return marcas;
    }

    public void setMarcas(marcas marcas) {
        this.marcas = marcas;
    }

    public Integer getCodvehiculo() {
        return codvehiculo;
    }

    public void setCodvehiculo(Integer codvehiculo) {
        this.codvehiculo = codvehiculo;
    }

    public String getColorvehiculo() {
        return colorvehiculo;
    }

    public void setColorvehiculo(String colorvehiculo) {
        this.colorvehiculo = colorvehiculo;
    }

    public Date getAñovehiculo() {
        return añovehiculo;
    }

    public void setAñovehiculo(Date añovehiculo) {
        this.añovehiculo = añovehiculo;
    }
}
