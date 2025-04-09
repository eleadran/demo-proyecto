package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name="vehiculo")
public class Vehiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_vehiculo;
    private String color_vehiculo;
    private Date año_vehiculo;

    @ManyToOne
    @JoinColumn(name = "cod_combus")
    private Combustions combustions;

    @ManyToOne
    @JoinColumn(name = "cod_modelo")
    private Modelos modelos;

    @ManyToOne
    @JoinColumn(name = "cod_marca")
    private Marcas marcas;

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

    public Combustions getCombustions() {
        return combustions;
    }

    public void setCombustions(Combustions combustions) {
        this.combustions = combustions;
    }

    public Modelos getModelos() {
        return modelos;
    }

    public void setModelos(Modelos modelos) {
        this.modelos = modelos;
    }

    public Marcas getMarcas() {
        return marcas;
    }

    public void setMarcas(Marcas marcas) {
        this.marcas = marcas;
    }
}
