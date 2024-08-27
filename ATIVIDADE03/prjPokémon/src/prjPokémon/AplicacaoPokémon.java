package prjPokémon;

import prjZoologico.ClasseAnimal;
import prjZoologico.SubClasseCarnivoros;

public class AplicacaoPokémon {

	public static void main(String[] args) {
	    ClassePokémon eeve = new ClassePokémon();
	    eeve.atributoNome = "Eeve";
	    eeve.atributoTipo = "Lutador";
	    eeve.atributoNivel = "1";
	    eeve.atributoHP= 70;
	    
	    
	    ClassePokémon mew = new ClassePokémon("Mew","mistico","1", 60);
	    
	    ClassePokémon celebi = new ClassePokémon("Celebi","natureza","1", 70);
	    
	    ClassePokémon charmander = new ClassePokémon("Charmander","fogo","1", 70);
	    
	    ClassePokémon pikachum = new ClassePokémon("pikachum","raio","1", 70);
	}

	    
	    eeve.exibirInfo();
	    eeve.metodoevoluir();
	    
	    elefante.exibirInfo();
	    
	    elefante.metodoComer();
	    
	    elefante.exibirInfo();
	    
	    girafa.exibirInfo();
	    

	}

}
