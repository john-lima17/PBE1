package prjAplicando;

public class CadastroLivro{
	  // Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponível;

    // Construtor
    public void Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponível = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponível() {
        return disponível;
    }

    public void setDisponível(boolean disponível) {
        this.disponível = disponível;
    }

    public void emprestar() {
        if (disponível) {
            disponível = false;
            System.out.println("O livro '" + titulo + "' foi emprestado com sucesso.");
        } else {
            System.out.println("O livro '" + titulo + "' não está disponível no momento.");
        }
    }

    public void devolver() {
        if (!disponível) {
            disponível = true;
            System.out.println("O livro '" + titulo + "' foi devolvido com sucesso.");
        } else {
            System.out.println("O livro '" + titulo + "' já está disponível.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Disponível: " + (disponível ? "Sim" : "Não"));
    }
}
