import questao01.entities.Livro;
import java.util.Scanner;

public static void main(String [] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o titulo do livro: ");
    String titulo = entrada.nextLine();
    System.out.println("Digite o autor do livro: ");
    String autor = entrada.nextLine();
    System.out.println("Digite o total de páginas do livro: ");
    int totalDePaginas = entrada.nextInt();

    Livro novoLivro = new Livro(titulo, autor, totalDePaginas);

    novoLivro.mostrarInformacoesDoLivro();

}