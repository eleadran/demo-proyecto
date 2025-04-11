package pe.edu.idat.demo_proyecto.model;
import jakarta.persistence.*;

@Entity
@Table (name = "concesionaria")
public class Concesionarias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_concesionaria")
    private Integer codConcesionaria;

    @Column(name = "nombre_concesionaria")
    private String nombreConcesionaria;

    @Column(name = "cantidad_trabaja_concesionaria")
    private Integer cantidadTrabajaConcesionaria;

    @Column(name = "direccion_concesionaria")
    private String direccionConcesionaria;

    @ManyToOne
    @JoinColumn(name = "cod_proveedor", nullable = false) // Relación obligatoria
    private Proveedores proveedores;


    // Getters y Setters
    public Integer getCodConcesionaria() {
        return codConcesionaria;
    }

    public void setCodConcesionaria(Integer codConcesionaria) {
        this.codConcesionaria = codConcesionaria;
    }

    public String getNombreConcesionaria() {
        return nombreConcesionaria;
    }

    public void setNombreConcesionaria(String nombreConcesionaria) {
        this.nombreConcesionaria = nombreConcesionaria;
    }

    public Integer getCantidadTrabajaConcesionaria() {
        return cantidadTrabajaConcesionaria;
    }

    public void setCantidadTrabajaConcesionaria(Integer cantidadTrabajaConcesionaria) {
        this.cantidadTrabajaConcesionaria = cantidadTrabajaConcesionaria;
    }

    public String getDireccionConcesionaria() {
        return direccionConcesionaria;
    }

    public void setDireccionConcesionaria(String direccionConcesionaria) {
        this.direccionConcesionaria = direccionConcesionaria;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }


}
