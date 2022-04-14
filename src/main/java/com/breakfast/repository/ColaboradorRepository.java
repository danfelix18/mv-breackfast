package com.breakfast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.breakfast.entity.Colaborador;

@Repository
public interface ColaboradorRepository extends JpaRepository< Colaborador, Long>{

	
}
