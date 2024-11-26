package com.senai.cadastrocliente.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;

	@Column(nullable = false)
	private Date dtPedido;

	@Column(nullable = false, length = 100)
	private String fmPagamento;

	// Construtores
	public Pedido() {

	}

	public Pedido(Long idPedido, Date dtPedido, String fmPagamento) {
		this.idPedido = idPedido;
		this.dtPedido = dtPedido;
		this.fmPagamento = fmPagamento;

		// Getters e Setters }

	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Date getDtPedido() {
		return dtPedido;
	}

	public void setDtPedido(Date dtPedido) {
		this.dtPedido = dtPedido;
	}

	public String getFmPagamento() {
		return fmPagamento;
	}

	public void setFmPagamento(String fmPagamento) {
		this.fmPagamento = fmPagamento;
	}

}
