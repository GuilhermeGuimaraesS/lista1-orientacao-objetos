import questao07.entities.Chuveiro;

import java.util.Scanner;

public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite as informações do chuveiro: ");
    System.out.println("Marca: ");
    String marca = entrada.nextLine();
    System.out.println("Modelo: ");
    String modelo = entrada.nextLine();
    System.out.println("Potência: ");
    int potencia = entrada.nextInt();
    System.out.println("Tensao (110v ou 220v): ");
    int tensao = entrada.nextInt();
    System.out.println("===============================================");

    Chuveiro chuveiro = new Chuveiro(marca, modelo, potencia, tensao);

    chuveiro.mostrarInfosChuveiro();
    chuveiro.mudarNivelDeTemperatura();
    chuveiro.mostrarInfosChuveiro();
}


