package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_vehiculo")
    private Integer id;

    @Column(name = "color_vehiculo", nullable = false)
    private String color;

    @Column(name = "año_vehiculo", nullable = false)
    private Date anio;

    @ManyToOne
    @JoinColumn(name = "cod_combus", nullable = false)
    private Combustions combustion;

    @ManyToOne
    @JoinColumn(name = "cod_marca", nullable = false)
    private Marcas marca;

    @ManyToOne
    @JoinColumn(name = "cod_modelo", nullable = false)
    private Modelo modelo;


    // Getters y Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public Combustions getCombustion() {
        return combustion;
    }

    public void setCombustion(Combustions combustion) {
        this.combustion = combustion;
    }

    public Marcas getMarca() {
        return marca;
    }

    public void setMarca(Marcas marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{id=" + id + ", color='" + color + "', anio=" + anio +
                ", combustion=" + combustion + ", marca=" + marca + ", modelo=" + modelo + "}";
    }
}