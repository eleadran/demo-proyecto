package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "combustion")
public class Combustions { // Nombre ajustado a singular

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_combus")
    private Integer id; // Nombre simplificado

    @Column(name = "tipoCombu_combus")
    private String tipoCombustion; // Nombre más claro

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