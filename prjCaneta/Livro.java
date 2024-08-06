public class Livro {

public static void main(String[] args) {
		
		String nomeLivro01, nomeAutor;
		boolean alugado;
		
		public Livro(String livro, String autor) {
		      this.nomeAutor = livro;
		      this.nomeAutor = autor;
		      this.alugar = false;
		}
	    void status() {
	    	System.out.println("1. " + "this.nomeLivro + ":" + (this.alugado ? "Alugado":"Disponivel"));
	    	
	    }
	    
	    void alugar() {
	    	alugado = true;
	    }
	    
	    void devolver() {
	    	alugado = false;
	    }
	}