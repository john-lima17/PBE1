package com.senai.cadastroproduto.repositories; 

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.cadastroproduto.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> { }
