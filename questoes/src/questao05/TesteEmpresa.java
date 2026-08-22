import questao05.entities.Empresa;
import questao05.entities.Endereco;

import java.util.Scanner;

public static void main(String [] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("==================================================");
    System.out.println("Nome da empresa: ");
    String nomeDaEmpresa = entrada.nextLine();
    System.out.println("CNPJ: ");
    String CNPJ = entrada.nextLine();
    System.out.println("Setor de atuação: ");
    String setorDeAtuacao = entrada.nextLine();
    System.out.println("Número de filiais: ");
    int totalDeFiliais = entrada.nextInt();


    System.out.println("Digite o endereço da empresa(sede): ");
    System.out.println("País: ");
    entrada.nextLine();
    String pais = entrada.nextLine();
    System.out.println("Estado: ");
    String estado = entrada.nextLine();
    System.out.println("Cidade: ");
    String cidade = entrada.nextLine();
    System.out.println("Rua: ");
    String rua = entrada.nextLine();
    System.out.println("Bairro: ");
    String bairro = entrada.nextLine();
    System.out.println("Numero: ");
    String numero = entrada.nextLine();
    System.out.println("Complemento: ");
    String complemento = entrada.nextLine();

    Endereco enderecoDaSede = new Endereco(pais, estado, cidade, rua, bairro, numero, complemento);
    Empresa novaEmpresa = new Empresa(nomeDaEmpresa, CNPJ, setorDeAtuacao, enderecoDaSede, totalDeFiliais);

    novaEmpresa.mostrarInfosDaEmpresa();
    System.out.println("==================================================");

}
