package com.example.tp4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Venta {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private Date fecha;
  private Double montoTotal;

  public void setId(Integer id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public Venta() {}

  public Venta(Integer id, Date fecha, Double montoTotal) {
    this.id = id;
    this.fecha = fecha;
    this.montoTotal = montoTotal;
  }

  public Venta(Date fecha) {
    this.fecha = fecha;
  }

  public Venta(Double montoTotal) {
    this.montoTotal = montoTotal;
  }

  public Double getMontoTotal() {
    return montoTotal;
  }

  public Venta(Integer id) {
    this.id = id;
  }
}
