package com.efrensalado.cotizacionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrensalado.cotizacionservice.entity.Cotizacion;

public interface CotizacionRepository extends JpaRepository<Cotizacion, Integer> {
}
