package prjAplicando;

public class CadastroFuncionario{

    // Atributos
    private String nome;
    private double salarioBruto;
    private double imposto;

    // Construtor
    public void Funcionário(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    // Método para calcular o salário líquido
    public double calcularSalarioLiquido() {
        return salarioBruto - (salarioBruto * imposto / 100);
    }

    // Método para aumentar o salário
    public void aumentarSalario(double percentual) {
        salarioBruto += salarioBruto * percentual / 100;
    }

    // Método para exibir as informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Imposto: " + imposto + "%");
        System.out.println("Salário Líquido: R$ " + calcularSalarioLiquido());
    }
}