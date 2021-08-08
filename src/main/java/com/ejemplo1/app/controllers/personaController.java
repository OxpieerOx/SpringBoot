package com.ejemplo1.app.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo1.app.entidades.Persona;
import com.ejemplo1.app.servicios.PersonaService;

@RestController
@RequestMapping("/api/persona") 
public class personaController {

	@Autowired
	PersonaService personaservice;
	
	
	@GetMapping("listar")
	public ResponseEntity<List<Persona>> ListarPersonar(){
		
		List<Persona> listarpersonas;
		listarpersonas=personaservice.listarpersonas();
		return ResponseEntity.ok(listarpersonas);
	}
	
	@GetMapping("buscar/{idPersona}")
	public ResponseEntity<Persona> BuscarPersona(@PathVariable(value="idPersona")int idPersona){
		Persona persona;
		persona= personaservice.retornarpersona(idPersona);
		return ResponseEntity.ok(persona);
	}
	
	@PostMapping("insertar") 
	    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) throws Exception{
	       		Persona insertarpersona ;
	       		insertarpersona = personaservice.guardarPersona(persona);
	       		if(insertarpersona==null) {
	       				throw new Exception("No se ha podido guardar");			
	       		}
	       		
	       		return ResponseEntity.ok(insertarpersona);
				}
	
	@PutMapping("editar")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona) throws Exception{
   		Persona editarpersona ;
   		int idpersona=persona.getIdPersona();
   		
   		if(personaservice.validarIDPersona(idpersona)<=0) {
   			throw new Exception("El Usuario no existe");
   		}
   		
   		else {
   			editarpersona = personaservice.editarPersona(persona);
   	   		
   	   		if(editarpersona==null) {
   	   				throw new Exception("No se ha podido guardar");			
   	   		}
   	   		
   	   		return ResponseEntity.ok(editarpersona);
   	   		
   			}
   		
		}
}
