package com.senai.cadastrocliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.cadastrocliente.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

	Livro findByCpf(String cpf);
}