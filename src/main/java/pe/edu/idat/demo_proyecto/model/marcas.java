package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "marca")
public class marcas {
    @Id
    private  Integer codmarca;
    private String nombremarca;
    private Integer stockmarca;

    public Integer getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(Integer codmarca) {
        this.codmarca = codmarca;
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(String nombremarca) {
        this.nombremarca = nombremarca;
    }

    public Integer getStockmarca() {
        return stockmarca;
    }

    public void setStockmarca(Integer stockmarca) {
        this.stockmarca = stockmarca;
    }
}
