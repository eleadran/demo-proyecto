package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table (name = "combustion")
public class Combustions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer cod_combus;

    @Column(name = "tipoCombu_combus")
    public String tipoCombu_combus;

    public String getTipoCombu_combus() {
        return tipoCombu_combus;
    }

    public void setTipoCombu_combus(String tipoCombu_combus) {
        this.tipoCombu_combus = tipoCombu_combus;
    }

    public Integer getCod_combus() {
        return cod_combus;
    }

    public void setCod_combus(Integer cod_combus) {
        this.cod_combus = cod_combus;
    }

}
