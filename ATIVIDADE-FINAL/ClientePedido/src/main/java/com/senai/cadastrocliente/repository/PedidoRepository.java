package com.senai.cadastrocliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cadastrocliente.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, String> { }