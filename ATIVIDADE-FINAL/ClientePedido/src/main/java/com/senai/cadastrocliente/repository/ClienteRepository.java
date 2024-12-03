package com.senai.cadastrocliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cadastrocliente.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, String> { 
	
}
