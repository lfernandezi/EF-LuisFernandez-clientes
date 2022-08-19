package com.idat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idcliente;
	private String nombrecliente;
	private String apellidocliente;
	private int nrocelular;
	private String direccion;
	
	public Cliente(int idcliente, String nombrecliente, String apellidocliente, int nrocelular, String direccion) {
		super();
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.apellidocliente = apellidocliente;
		this.nrocelular = nrocelular;
		this.direccion = direccion;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getApellidocliente() {
		return apellidocliente;
	}

	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}

	public int getNrocelular() {
		return nrocelular;
	}

	public void setNrocelular(int nrocelular) {
		this.nrocelular = nrocelular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
