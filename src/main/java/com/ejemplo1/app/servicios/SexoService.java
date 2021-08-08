package com.ejemplo1.app.servicios;

import java.util.List;

import com.ejemplo1.app.entidades.Sexo;



public interface SexoService {
	
	public List<Sexo> ListarSexos();
	public Sexo retornarsexo(int idsexo);
}
