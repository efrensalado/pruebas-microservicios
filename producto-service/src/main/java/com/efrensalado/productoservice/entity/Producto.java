package com.efrensalado.productoservice.entity;

import lombok.Data;

import javax.persistence.*;

@Data()
@Entity
@Table(name="Product")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SKU;
    private String Nombre;
    private String Descripcion;
    private Double Precio;
}
