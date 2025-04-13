package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "combustion")
public class Combustions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_combus") // Mapeo para la columna ID
    private Integer id;

    @Column(name = "tipoCombu_combus") // Mapeo para la columna del tipo de combustión
    private String tipoCombustion;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoCombustion() {
        return tipoCombustion;
    }

    public void setTipoCombustion(String tipoCombustion) {
        this.tipoCombustion = tipoCombustion;
    }
}
