package prjNovo;

public class Conta {

   //Atributos
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    
  //Construtor
  	public Conta() {
  	}
 

  	public Conta (int numeroConta, String nomeTitular, double saldoConta) {
  	    this.numeroConta = numeroConta;
  	    this.nomeTitular = nomeTitular;
  	    this.saldo = saldoConta;
  	    }
  	
  	public Conta (int numeroConta, String nomeTitular) {
  		this.numeroConta = numeroConta;
  	    this.nomeTitular = nomeTitular;
  	     this.saldo =0;
  	    }
	
	//getters ans Setters 

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}   
	
    
}
