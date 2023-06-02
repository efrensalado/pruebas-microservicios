package com.efrensalado.plazoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrensalado.plazoservice.entity.Plazo;

public interface PlazoRepository extends JpaRepository<Plazo, Integer> {
}
