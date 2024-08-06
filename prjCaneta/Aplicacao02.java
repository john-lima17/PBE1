package prjCaneta;

import java.util.Scanner;

public class Aplicacao02 {

	public static void main(String[] args) {
		Livro livro01 = new Livro("Alice doas Pais","Julio Trigueiro");
		Livro livro02 = new Livro("Quarto de despejo","Pedro Francosco");
		
		System.out.println("Livro disponiveis");
		System.out.println("1. ");
		livro01.status();
		System.out.println("2. ");
		livro02.alugar();
		
        System.out.println("Qual livro deseja alugar?");
        int escolha = sc.nextInt();
        
	}

}
