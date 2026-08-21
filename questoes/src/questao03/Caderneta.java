import questao03.entities.Aluno;
import java.util.Scanner;

public static void main(String [] args){


    Scanner entrada = new Scanner(System.in);

    System.out.println("======================================");
    System.out.println("          ALUNOS ESCOLA DEV");
    System.out.println("======================================");
    System.out.println("Nome: ");
    String nome = entrada.nextLine();
    System.out.println("Idade: ");
    int idade = entrada.nextInt();
    System.out.println("Turma: ");
    int turma = entrada.nextInt();

    Aluno novoAluno = new Aluno(nome, idade, turma);

    System.out.println("Notas do aluno: ");
    System.out.println("Primeira nota: ");
    double primeiraNota = entrada.nextDouble();
    System.out.println("Segunda nota: ");
    double segundaNota = entrada.nextDouble();
    System.out.println("Terceira nota: ");
    double terceiraNota = entrada.nextDouble();

    novoAluno.cadastrarNotas(primeiraNota, segundaNota, terceiraNota);
    novoAluno.mostrarInfosDoAluno();

}
