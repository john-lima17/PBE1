package com.senai.cadastrocliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastrocliente.entities.Livro;
import com.senai.cadastrocliente.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired 
	private LivroRepository livroRepository; 
	public Livro salvarLivro(Livro livro) {
		return livroRepository.save(livro); 
		} 
	
	public List<Livro> listarTodos() { 
		return livroRepository.findAll(); 
		} 
	
	public Optional<Livro> buscarPorId(Long id) {
		return livroRepository.findById(id); 
		}
	
	public void deletar(Long id) {
		livroRepository.deleteById(id); 
		}
	}
