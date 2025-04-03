package pe.edu.idat.demo_proyecto.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="cliente")
public class clientes {
    @Id
    private Integer codcliente;
    private String nombrecliente;
    private String apellidocliente;
    private String trabajocliente;
    private Integer telefonocliente;
    private String direccioncliente;

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getApellidocliente() {
        return apellidocliente;
    }

    public void setApellidocliente(String apellidocliente) {
        this.apellidocliente = apellidocliente;
    }

    public String getTrabajo_cliente() {
        return trabajocliente;
    }

    public void setTrabajocliente(String trabajo_cliente) {
        this.trabajocliente = trabajo_cliente;
    }

    public Integer getTelefonocliente() {
        return telefonocliente;
    }

    public void setTelefonocliente(Integer telefonocliente) {
        this.telefonocliente = telefonocliente;
    }

    public String getDireccioncliente() {
        return direccioncliente;
    }

    public void setDireccioncliente(String direccioncliente) {
        this.direccioncliente = direccioncliente;
    }
}

