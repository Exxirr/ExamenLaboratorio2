package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AreaEntity;

@Repository
public interface AreaRepositorio extends JpaRepository<AreaEntity, Integer>{
	
	

}
