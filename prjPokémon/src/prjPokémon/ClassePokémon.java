package prjPokémon;

public class ClassePokémon {
	//Atributos
		String atributoNome;
		String atributoTipo;
		String atributoNivel;
		int atributoHP;
		
		//Construtores
		
		public ClassePokémon() {
			
		}
		
		public ClassePokémon(String parametroNome, String parametroTipo, int parametroHP) {
		    this.atributoNome = parametroNome;
		    this.atributoTipo = parametroTipo;
		    this.atributoHP = parametroHP;
		    
		}
		
		//Metodos
		 public void metodoEvolucao() {
			 if (this.atributoNivel >= 2 ) {
				 System.out.println(this.atributoNome + "este pokémon está evoluido para o nivel 2");
					 
		 }
		 else {
		 this.atributoNivel += 2;
		 }
		 }
		 
		 public void metodoAtacar() {
			 if (this.atributoHP <= 20) {
				 System.out.println(this.atributoNome + ", perdeu -20 de vida");
			 }
			 else {
			 this.atributoHP -= 20;
		     } 
	      }
		 public void exibirInfo() {
			 System.out.println("Nome " + this.atributoNome);
			 System.out.println("HP " + this.atributoNivel);
		 }
		 }
