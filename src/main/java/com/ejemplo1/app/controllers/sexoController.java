package com.ejemplo1.app.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ejemplo1.app.entidades.Sexo;

import com.ejemplo1.app.servicios.SexoService;

@RestController
@RequestMapping("/api/sexo") 
public class sexoController {

	@Autowired
	SexoService sexoservice ;
	
	
	@GetMapping("Listar")
	public ResponseEntity<List<Sexo>> ListarSexos(){
		
		List<Sexo> listarsexos;
		listarsexos=sexoservice.ListarSexos();
		return ResponseEntity.ok(listarsexos);
	}
	
	@GetMapping("buscar/{idSexo}")
	public ResponseEntity<Sexo> BuscarPersona(@PathVariable(value="idSexo")int id){
		Sexo sexo;
		sexo= sexoservice.retornarsexo(id);
		return ResponseEntity.ok(sexo);
				
	}
	
	
}