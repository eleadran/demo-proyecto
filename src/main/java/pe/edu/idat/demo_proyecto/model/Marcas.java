package pe.edu.idat.demo_proyecto.model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "marca")
public class Marcas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer cod_marca;
    private String nombre_marca;
    private Integer stock_marca;

    public Integer getCod_marca() {
        return cod_marca;
    }

    public void setCod_marca(Integer cod_marca) {
        this.cod_marca = cod_marca;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public Integer getStock_marca() {
        return stock_marca;
    }

    public void setStock_marca(Integer stock_marca) {
        this.stock_marca = stock_marca;
    }
}
