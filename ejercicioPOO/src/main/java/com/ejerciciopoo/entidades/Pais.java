package com.ejerciciopoo.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pais 
{
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	@OneToMany(mappedBy ="pais")
	private List<Cliente> pais = new ArrayList<Pais>();
	
	
	
	
	

	public Pais(int id, String nombre, String apellido1, String apellido2) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public Pais() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public List<Cliente> getPais() {
		return pais;
	}

	public void setPais(List<Cliente> pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
	}


	
	
	
	
	
	
	

}
