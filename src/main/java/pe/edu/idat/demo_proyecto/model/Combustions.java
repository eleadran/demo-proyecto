package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "combustion")
public class Combustions {
    @Id
    private Integer cod_combus;
    private String tipocombu_combus;

    public Integer getCod_combus() {
        return cod_combus;
    }

    public void setCod_combus(Integer cod_combus) {
        this.cod_combus = cod_combus;
    }

    public String getTipocombu_combus() {
        return tipocombu_combus;
    }

    public void setTipocombu_combus(String tipocombu_combus) {
        this.tipocombu_combus = tipocombu_combus;
    }
}
