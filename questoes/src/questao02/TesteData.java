import questao02.entities.Data;
import java.util.Scanner;

public static void main(String [] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("Dia: ");
    int dia = entrada.nextInt();
    System.out.println("Mes: ");
    int mes = entrada.nextInt();
    System.out.println("Ano: ");
    int ano = entrada.nextInt();

    Data dataDeHoje = new Data(dia, mes, ano);

    dataDeHoje.mostrarData();

}