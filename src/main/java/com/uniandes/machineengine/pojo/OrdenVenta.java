package com.uniandes.motoremparejamiento.pojo;

public class OrdenVenta extends AOrden {

    public OrdenVenta(){
        setTipo(ETipo.Venta);
    }

    private Enum<EEstado> estado;

    public Enum<EEstado> getEstado() {
        return estado;
    }

    public void setEstado(Enum<EEstado> estado) {
        this.estado = estado;
    }
}
