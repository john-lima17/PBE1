package com.senai.cadastroproduto.entities; 

import jakarta.persistence.*; 
import java.util.List; 

@Entity 
public class Categoria { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idCategoria; 
	private String nome; 
	
	@OneToMany(mappedBy = "categoria") 
	private List<Produto> produtos;
	
	// Getters e setters }

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	} 
	
}
