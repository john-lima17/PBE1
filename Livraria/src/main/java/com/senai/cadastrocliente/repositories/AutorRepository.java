package com.senai.cadastrocliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cadastrocliente.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

}