package questao04;

import questao04.entities.Endereco;
import questao04.entities.Pessoa;

import java.util.Scanner;

public class TestePessoa {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Idade: ");
        int idade = entrada.nextInt();
        System.out.println("Altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Formação Acadêmica: ");
        entrada.nextLine();
        String formacaoAcademica = entrada.nextLine();
        System.out.println("--------------------------------------------");
        System.out.println("Digite o seu endereço: ");
        System.out.println("Rua: ");
        String rua = entrada.nextLine();
        System.out.println("Bairro: ");
        String bairro = entrada.nextLine();
        System.out.println("Numero: ");
        String numero = entrada.nextLine();
        System.out.println("Tipo de moradia (casa, apartamento, etc): ");
        String tipoDeMoradia = entrada.nextLine();
        System.out.println("Complemento: ");
        String complemento = entrada.nextLine();

        Endereco endereco = new Endereco(rua, bairro, numero, tipoDeMoradia, complemento);

        Pessoa pessoa = new Pessoa(nome, idade, altura, peso, formacaoAcademica, endereco);
        pessoa.mostrarInformacoes();

    }

}
