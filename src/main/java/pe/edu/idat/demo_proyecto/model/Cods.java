package pe.edu.idat.demo_proyecto.model;


import jakarta.persistence.Embeddable;

import java.io.Serializable;


@Embeddable
public class Cods implements Serializable {
    private Integer cod_factura;
    private Integer cod_cliente;
    private Integer cod_vendedor;
    private Integer cod_vehiculo;
    private Integer cod_concesionaria;

    public Integer getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(Integer cod_factura) {
        this.cod_factura = cod_factura;
    }

    public Integer getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(Integer cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public Integer getCod_vendedor() {
        return cod_vendedor;
    }

    public void setCod_vendedor(Integer cod_vendedor) {
        this.cod_vendedor = cod_vendedor;
    }

    public Integer getCod_vehiculo() {
        return cod_vehiculo;
    }

    public void setCod_vehiculo(Integer cod_vehiculo) {
        this.cod_vehiculo = cod_vehiculo;
    }

    public Integer getCod_concesionaria() {
        return cod_concesionaria;
    }

    public void setCod_concesionaria(Integer cod_concesionaria) {
        this.cod_concesionaria = cod_concesionaria;
    }
}
