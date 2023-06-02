package com.efrensalado.cotizacionservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.Id;

@Data()
@Entity
@Table(name="Product")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SKU;
    private String nombre;
    private String Descripcion;
    private Double Precio;
}