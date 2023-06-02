package com.efrensalado.cotizacionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrensalado.cotizacionservice.entity.Plazo;

public interface PlazoRepository extends JpaRepository<Plazo, Integer> {
}
