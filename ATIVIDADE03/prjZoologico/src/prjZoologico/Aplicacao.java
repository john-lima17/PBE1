package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
	    ClasseAnimal elefante = new ClasseAnimal();
	    elefante.atributoNome = "Dumbo";
	    elefante.atributoRaca = "Africana";
	    elefante.atributoSexo = "Mascolino";
	    elefante.atributoPeso = 170;
	    
	    
	    ClasseAnimal girafa = new ClasseAnimal("Fifi","Russa","Femea", 90);
	    
	    SubClasseCarnivoros Leão = new SubClasseCarnivoros();
	    Leão.atributoNome = "Simba";
	    Leão.atributoRaca = "Africano";
	    Leão.atributoSexo = "Macho";
	    Leão.atributoPeso = 195 ;
	    
	    Leão.exibirInfo();
	    Leão.metodoCacar();
	    
	    elefante.exibirInfo();
	    
	    elefante.metodoComer();
	    
	    elefante.exibirInfo();
	    
	    girafa.exibirInfo();
	    
	}

}
