package com.uniandes.machineengine.pojo;

import java.util.UUID;

public abstract class AOrden {
    private UUID idOrden;
    private Usuario idUsuario;
    private Enum<ETipo> tipo;
    private Integer cantidad;
    private double precio;


    public UUID getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(UUID idOrden) {
        this.idOrden = idOrden;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Enum<ETipo> getTipo() {
        return tipo;
    }

    protected void setTipo(Enum<ETipo> tipo) {
        this.tipo = tipo;
    }


    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
