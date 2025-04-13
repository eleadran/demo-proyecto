package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "modelo")
public class Modelo {  // Cambio a singular

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_modelo")
    private Integer id;

    @Column(name = "diseno_modelo", nullable = false)  // Cambio de nombre para evitar la ñ
    private String disenoModelo;

    @Column(name = "tecnologia_modelo")
    private String tecnologiaModelo;

    @Column(name = "seguridad_modelo")
    private String seguridadModelo;

    @Column(name = "interior_modelo")
    private String interiorModelo;

    @Column(name = "precio", nullable = false)
    private BigDecimal precio;

    // Constructor vacío
    public Modelo() {}

    // Constructor con parámetros
    public Modelo(Integer id, String disenoModelo, String tecnologiaModelo, String seguridadModelo, String interiorModelo, BigDecimal precio) {
        this.id = id;
        this.disenoModelo = disenoModelo;
        this.tecnologiaModelo = tecnologiaModelo;
        this.seguridadModelo = seguridadModelo;
        this.interiorModelo = interiorModelo;
        this.precio = precio;
    }

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDisenoModelo() { return disenoModelo; }
    public void setDisenoModelo(String disenoModelo) { this.disenoModelo = disenoModelo; }

    public String getTecnologiaModelo() { return tecnologiaModelo; }
    public void setTecnologiaModelo(String tecnologiaModelo) { this.tecnologiaModelo = tecnologiaModelo; }

    public String getSeguridadModelo() { return seguridadModelo; }
    public void setSeguridadModelo(String seguridadModelo) { this.seguridadModelo = seguridadModelo; }

    public String getInteriorModelo() { return interiorModelo; }
    public void setInteriorModelo(String interiorModelo) { this.interiorModelo = interiorModelo; }

    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Modelo{id=" + id + ", disenoModelo='" + disenoModelo + "', tecnologiaModelo='" + tecnologiaModelo +
                "', seguridadModelo='" + seguridadModelo + "', interiorModelo='" + interiorModelo +
                "', precio=" + precio + "}";
    }
}