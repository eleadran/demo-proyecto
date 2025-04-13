package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_vehiculo")
    private Integer id;

    @Column(name = "color_vehiculo", nullable = false)
    private String color;

    @Column(name = "anio_vehiculo", nullable = false)
    private Integer anio; // Cambiado de Date a Integer

    @Column(name = "diseno_modelo") // Migrado desde modelo
    private String disenoModelo;

    @Column(name = "precio") // Migrado desde modelo
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "cod_combus", nullable = false)
    private Combustions combustion;

    @ManyToOne
    @JoinColumn(name = "cod_marca", nullable = false)
    private Marcas marca;

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

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getDisenoModelo() {
        return disenoModelo;
    }

    public void setDisenoModelo(String disenoModelo) {
        this.disenoModelo = disenoModelo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
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

    @Override
    public String toString() {
        return "Vehiculo{id=" + id + ", color='" + color + "', anio=" + anio +
                ", disenoModelo='" + disenoModelo + "', precio=" + precio +
                ", combustion=" + combustion + ", marca=" + marca + "}";
    }
}