package com.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.model.Cliente;
import com.idat.service.ClienteService;

@RestController
@RequestMapping("/v1/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService cliserv;
	
	@GetMapping("listar")
	public @ResponseBody List<Cliente> listar(){
		return cliserv.listar();
		
	}
	
	@PostMapping("guardar")
	public @ResponseBody void guadar (Cliente cliente) {
		cliserv.guardar(cliente);
	}
}
