package com.ejemplo1.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ejemplo1.app.entidades.Sexo;


@Repository
public interface SexoDAO extends JpaRepository<Sexo,Integer>{
	
}
