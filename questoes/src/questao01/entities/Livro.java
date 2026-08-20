package questao01.entities;

public class Livro {

    private String titulo;
    private String autor;
    private int totalDePaginas;

    public Livro(String titulo, String autor, int totalDePaginas) {

        this.titulo = titulo;
        this.autor = autor;
        this.totalDePaginas = totalDePaginas;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void mostrarInformacoesDoLivro() {
        System.out.println("-----------------------------------");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Paginas: " + this.getTotalDePaginas());
        System.out.println("-----------------------------------");
    }
}