package com.senai.cadastrocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.cadastrocliente.Pedido;
import com.senai.cadastrocliente.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController { 
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@PostMapping
	public Pedido criarPedido(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido); 
	}
	@GetMapping 
	public List<Pedido> listarPedidos() {
		return pedidoRepository.findAll();
		}
	}
