package pe.edu.idat.demo_proyecto.model;


import jakarta.persistence.*;

@Entity
@Table (name="cliente")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String trabajo_cliente;
    private Integer telefono_cliente;
    private String direccion_cliente;

    public Integer getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(Integer cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getTrabajo_cliente() {
        return trabajo_cliente;
    }

    public void setTrabajo_cliente(String trabajo_cliente) {
        this.trabajo_cliente = trabajo_cliente;
    }

    public Integer getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(Integer telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }
}

