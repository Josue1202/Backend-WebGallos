package com.josue.Backend_WebGallos.repository;

import com.josue.Backend_WebGallos.model.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TorneoRepository extends JpaRepository<Torneo, Integer> {}