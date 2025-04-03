package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="vehiculo")
public class vehiculos {
    @Id
    private Integer cod_vehiculo;
    private String color_vehiculo;
    private Date año_vehiculo;

    @ManyToOne
    @JoinColumn(name = "cod_combus")
    private combustions combustions;

    @ManyToOne
    @JoinColumn(name = "cod_modelo")
    private modelos modelos;

    @ManyToOne
    @JoinColumn(name = "cod_marca")
    private marcas marcas;

    public Integer getCod_vehiculo() {
        return cod_vehiculo;
    }

    public void setCod_vehiculo(Integer cod_vehiculo) {
        this.cod_vehiculo = cod_vehiculo;
    }

    public String getColor_vehiculo() {
        return color_vehiculo;
    }

    public void setColor_vehiculo(String color_vehiculo) {
        this.color_vehiculo = color_vehiculo;
    }

    public Date getAño_vehiculo() {
        return año_vehiculo;
    }

    public void setAño_vehiculo(Date año_vehiculo) {
        this.año_vehiculo = año_vehiculo;
    }

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
}
