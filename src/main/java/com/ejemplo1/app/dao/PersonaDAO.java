package com.ejemplo1.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo1.app.entidades.Persona;


@Repository
public interface PersonaDAO extends JpaRepository<Persona,Integer>{
	
	@Transactional(readOnly = true)
    @Query(nativeQuery = true,value ="SELECT COUNT(*) FROM personas WHERE  id=:idpersona")
    public int validarIdPersona(@Param("idpersona")int idPersona);
	
}

/*
@Transactional
@Query(nativeQuery = true,value ="SELECT c.id_colaborador, c.tipo_usuario , c.id_usuario FROM colaborador c INNER JOIN detalle det ON (c.id_colaborador = det.id_detalle) WHERE det.id_proyecto = :idProyecto and c.id_usuario = :idUsuario ")
public Colaborador buscarColaboradorPorProyectoYDetalle(@Param("idProyecto")int idProyecto,@Param("idUsuario")int idUsuario);*/