package com.senai.cadastrocliente;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pedido { 
	
	@Id
	private String id;
	private String data; 
	private Double valor; 
	private String status;
	
	// Getters e Setters
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}	
