package com.example.tp4.entities;

public class EstadoVenta {
    private Integer id;
    private String nombre;

    public EstadoVenta(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {}
    public EstadoVenta() {
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoVenta(String nombre) {
        this.nombre = nombre;
    }
}
