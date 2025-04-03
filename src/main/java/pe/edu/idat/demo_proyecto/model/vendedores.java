package pe.edu.idat.demo_proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vendedor")
public class vendedores {
    @Id
    private Integer codvendedor;
    private String nombrevendedor;
    private String apellidovendedor;
    private Double sueldovendedor;
    private Integer ventasvendedor;

    public Integer getCodvendedor() {
        return codvendedor;
    }

    public void setCodvendedor(Integer codvendedor) {
        this.codvendedor = codvendedor;
    }

    public String getNombrevendedor() {
        return nombrevendedor;
    }

    public void setNombrevendedor(String nombrevendedor) {
        this.nombrevendedor = nombrevendedor;
    }

    public String getApellidovendedor() {
        return apellidovendedor;
    }

    public void setApellidovendedor(String apellidovendedor) {
        this.apellidovendedor = apellidovendedor;
    }

    public Double getSueldovendedor() {
        return sueldovendedor;
    }

    public void setSueldovendedor(Double sueldovendedor) {
        this.sueldovendedor = sueldovendedor;
    }

    public Integer getVentasvendedor() {
        return ventasvendedor;
    }

    public void setVentasvendedor(Integer ventasvendedor) {
        this.ventasvendedor = ventasvendedor;
    }
}
