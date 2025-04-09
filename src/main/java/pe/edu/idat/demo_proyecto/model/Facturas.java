package pe.edu.idat.demo_proyecto.model;
import jakarta.persistence.*;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table (name="factura")
public class Facturas {
    @EmbeddedId
    private Cods id;

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

    public Cods getId() {
        return id;
    }

    public void setId(Cods id) {
        this.id = id;
    }
}
