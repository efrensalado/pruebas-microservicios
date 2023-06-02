package com.efrensalado.productoservice.repository;

import com.efrensalado.productoservice.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
