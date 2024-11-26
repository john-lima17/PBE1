package com.senai.cadastrocliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.cadastrocliente.entities.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{

	Editora findByCpf(String cpf);
}
