package pe.edu.idat.demo_proyecto.model;


import jakarta.persistence.Embeddable;

import java.io.Serializable;


@Embeddable
public class cods implements Serializable {
    private Integer codcliente;
    private Integer codvendedor;
    private Integer codvehiculo;
    private Integer codconcesionaria;

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public Integer getCodvendedor() {
        return codvendedor;
    }

    public void setCodvendedor(Integer codvendedor) {
        this.codvendedor = codvendedor;
    }

    public Integer getCodvehiculo() {
        return codvehiculo;
    }

    public void setCodvehiculo(Integer codvehiculo) {
        this.codvehiculo = codvehiculo;
    }

    public Integer getCodconcesionaria() {
        return codconcesionaria;
    }

    public void setCodconcesionaria(Integer codconcesionaria) {
        this.codconcesionaria = codconcesionaria;
    }
}
