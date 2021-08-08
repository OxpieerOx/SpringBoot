package com.ejemplo1.app.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="SEXO")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Sexo {
	
	@Id 
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSexo;
	
	@Column(name="descripcion")
	private String Descripcion;

	public Sexo(){
			
	}
	
	public int getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(int idSexo) {
		this.idSexo = idSexo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
	
	
	
	
}
