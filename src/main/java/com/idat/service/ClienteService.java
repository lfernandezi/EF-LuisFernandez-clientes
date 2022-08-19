package com.idat.service;

import java.util.List;

import com.idat.model.Cliente;

public interface ClienteService {
	
	public List<Cliente> listar();
	
	public void guardar(Cliente cliemte);

}
