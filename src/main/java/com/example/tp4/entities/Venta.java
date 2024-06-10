package com.example.tp4.entities;


import java.util.Date;

public class Venta {

    private Integer id;
    private Date fecha;

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Venta() {
    }

    public Venta(Date fecha) {
        this.fecha = fecha;
    }

    public Venta(Integer id) {
        this.id = id;
    }
}

