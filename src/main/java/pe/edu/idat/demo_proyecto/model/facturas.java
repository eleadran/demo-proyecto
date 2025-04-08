package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table (name="factura")
public class facturas {
    @EmbeddedId
    private cods id;

    private Date fecha_factura;
    private Double importe_venta;

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public Double getImporte_venta() {
        return importe_venta;
    }

    public void setImporte_venta(Double importe_venta) {
        this.importe_venta = importe_venta;
    }

    public cods getId() {
        return id;
    }

    public void setId(cods id) {
        this.id = id;
    }
}
