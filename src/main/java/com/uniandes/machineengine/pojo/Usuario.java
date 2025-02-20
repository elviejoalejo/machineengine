package com.uniandes.motoremparejamiento.pojo;

import java.util.UUID;

public class Usuario {
    private UUID idUsuario;
    private String nombre;
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
