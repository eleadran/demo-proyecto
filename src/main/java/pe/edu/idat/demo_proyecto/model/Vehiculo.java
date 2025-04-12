package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_vehiculo")
    private Integer codVehiculo;

    @Column(name = "color_vehiculo")
    private String colorVehiculo;

    @Column(name = "año_vehiculo")
    private Date añoVehiculo;

    @ManyToOne
    @JoinColumn(name = "cod_combus", nullable = false) // Relación obligatoria
    private Combustions combustion;

    @ManyToOne
    @JoinColumn(name = "cod_marca", nullable = false) // Relación obligatoria
    private Marcas marca;

    @ManyToOne
    @JoinColumn(name = "cod_modelo", nullable = false) // Relación obligatoria
    private Modelos modelo;

    // Getters y Setters
    public Integer getCodVehiculo() {
        return codVehiculo;
    }

    public void setCodVehiculo(Integer codVehiculo) {
        this.codVehiculo = codVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public Date getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(Date añoVehiculo) {
        this.añoVehiculo = añoVehiculo;
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

    public Modelos getModelo() {
        return modelo;
    }

    public void setModelo(Modelos modelo) {
        this.modelo = modelo;
    }
}