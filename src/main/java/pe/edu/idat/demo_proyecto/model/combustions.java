package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "combustion")
public class combustions {
    @Id
    private Integer codcombus;
    private String tipocombucombus;

    public Integer getCodcombus() {
        return codcombus;
    }

    public void setCodcombus(Integer codcombus) {
        this.codcombus = codcombus;
    }

    public String getTipocombucombus() {
        return tipocombucombus;
    }

    public void setTipocombucombus(String tipocombucombus) {
        this.tipocombucombus = tipocombucombus;
    }
}
