package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table (name="factura")
public class facturas {
    @Id
    private Integer codfactura;
    private Date fechafactura;
    @EmbeddedId
    private cods id;

    public cods getId() {
        return id;
    }

    public void setId(cods id) {
        this.id = id;
    }

    public Integer getCodfactura() {
        return codfactura;
    }

    public void setCodfactura(Integer codfactura) {
        this.codfactura = codfactura;
    }

    public Date getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(Date fechafactura) {
        this.fechafactura = fechafactura;
    }
}
