package com.ejerciciopoo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente {

	
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	
	@OneToOne
	private Pais pais;
	
	
	
	
	public Cliente() {
		super();
	}


	public Cliente(int id, String nombre, String apellido1, String apellido2) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
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


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ "]";
	}
	
	
	
}
