package com.senai.cadastroproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroproduto.entities.Produto;
import com.senai.cadastroproduto.repositories.ProdutoRepository; 

@Service 
public class ProdutoService {
	
	@Autowired 
	private ProdutoRepository repository; 
	public List<Produto> findAll() { 
		return repository.findAll(); 
		
	}
	
	public Produto save(Produto produto) { 
		return repository.save(produto); 
		
	}
}
