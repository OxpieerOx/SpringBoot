package com.ejemplo1.app.servicios;

import java.util.List;

import com.ejemplo1.app.entidades.Persona;

public interface PersonaService {
		
	public List<Persona> listarpersonas();
	public Persona retornarpersona(int idpersona);
	public Persona guardarPersona(Persona persona);
	public Persona editarPersona(Persona persona);
	public int validarIDPersona(int id);
}
