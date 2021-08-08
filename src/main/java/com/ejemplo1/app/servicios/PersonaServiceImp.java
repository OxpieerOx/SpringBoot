package com.ejemplo1.app.servicios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo1.app.dao.PersonaDAO;
import com.ejemplo1.app.entidades.Persona;

@Service
public class PersonaServiceImp implements PersonaService{
	
	@Autowired
	PersonaDAO personadao;
	

	@Override
	public List<Persona> listarpersonas() {
		
		List<Persona> listarpersonas;
		listarpersonas = personadao.findAll();
		return listarpersonas;
	}

	@Override
	public Persona retornarpersona(int idpersona) {
		
		Persona retornarpersona;
		retornarpersona = personadao.getById(idpersona);
		return retornarpersona;
	}

	@Override
	public Persona guardarPersona(Persona persona) {
		Persona guardarpersona;
		guardarpersona = personadao.save(persona);
		return guardarpersona;
		
	}

	@Override
	public Persona editarPersona(Persona persona) {
		Persona editarpersona;
		editarpersona= personadao.save(persona);
		return editarpersona;
	}
	
	@Override
	public int validarIDPersona(int id) {
		int idpersona;
		idpersona = personadao.validarIdPersona(id);
		return idpersona;
	}
	
	

}
