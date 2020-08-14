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
	private String nopais;

	
	@OneToMany(mappedBy ="pais")
	private List<Cliente> pais = new ArrayList<Cliente>();


	public Pais() {
		super();
	}


	public Pais(int id, String nopais) {
		super();
		this.id = id;
		this.nopais = nopais;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNopais() {
		return nopais;
	}


	public void setNopais(String nopais) {
		this.nopais = nopais;
	}


	public List<Cliente> getPais() {
		return pais;
	}


	public void setPais(List<Cliente> pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
		return "Pais [id=" + id + ", nopais=" + nopais + "]";
	}

	
	

}
