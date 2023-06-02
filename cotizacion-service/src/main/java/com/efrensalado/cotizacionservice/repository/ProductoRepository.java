package com.efrensalado.cotizacionservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrensalado.cotizacionservice.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    public List<Producto> findByNombreOrderBySKU(String nombre);
}
