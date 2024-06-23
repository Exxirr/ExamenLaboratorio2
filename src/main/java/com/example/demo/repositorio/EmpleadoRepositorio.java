package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmpleadoEntity;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<EmpleadoEntity, String> {
	
	
}
