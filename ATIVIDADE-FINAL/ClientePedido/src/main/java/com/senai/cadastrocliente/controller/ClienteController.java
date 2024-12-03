package com.senai.cadastrocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.cadastrocliente.Cliente;
import com.senai.cadastrocliente.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes") 
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public Cliente criarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
		}
	@GetMapping public List<Cliente> listarClientes() { 
		return clienteRepository.findAll(); }
	}