package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "marca")
public class Marcas { // Ajustado a singular

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_marca")
    private Integer id;

    @Column(name = "nombre_marca", nullable = false)
    private String nombreMarca;

    @Column(name = "stock_marca")
    private Integer stock;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Marca{id=" + id + ", nombreMarca='" + nombreMarca + "', stock=" + stock + "}";
    }
}
