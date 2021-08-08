package com.ejemplo1.app.servicios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo1.app.dao.SexoDAO;
import com.ejemplo1.app.entidades.Sexo;



@Service
public class SexoServiceImp implements SexoService{

	@Autowired
	SexoDAO sexodao;
	
	@Override
	public List<Sexo> ListarSexos() {

		List<Sexo> listarsexos;
		listarsexos = sexodao.findAll();
		return listarsexos;
	}

	@Override
	public Sexo retornarsexo(int idsexo) {
		Sexo retornarsexo;
		retornarsexo = sexodao.getById(idsexo);
		return retornarsexo;
	}

}
