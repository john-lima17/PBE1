package com.senai.cadastrocliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cadastrocliente.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
