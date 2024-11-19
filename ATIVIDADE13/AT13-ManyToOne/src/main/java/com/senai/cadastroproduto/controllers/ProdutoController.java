package com.senai.cadastroproduto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.cadastroproduto.entities.Produto;
import com.senai.cadastroproduto.services.ProdutoService;

@RestController 
@RequestMapping("/produtos") 
public class ProdutoController {
	@Autowired 
	private ProdutoService service;
	
	@GetMapping 
	public List<Produto> findAll() {
		return service.findAll(); 
	
	}
	
	@PostMapping 
	public Produto save(@RequestBody Produto produto) {
		return service.save(produto);
		
	}
}