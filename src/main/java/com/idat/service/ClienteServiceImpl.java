package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.Cliente;
import com.idat.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	ClienteRepository clirepo;

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return clirepo.findAll();
	}

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		clirepo.save(cliente);
	}

}
