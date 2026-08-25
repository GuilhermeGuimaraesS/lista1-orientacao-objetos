import questao06.entities.ConversorDeMoeda;
import java.util.Scanner;
import java.text.DecimalFormat;


public static void main(String [] args){

    Scanner entrada = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("===================================");
    System.out.println("CONVERSOR DE MOEDA");
    System.out.println("===================================");
    System.out.println("Escolha uma opção de conversão: ");
    System.out.println("1 - Real -> Dolar " +
                        "\n2 - Dolar -> Real " +
                        "\n3 - Real -> Euro " +
                        "\n4 - Euro -> Real " +
                        "\n5 - Real -> Libra Estrelina" +
                        "\n6 - Libra Estrelina -> Real "
    );
    System.out.println("-----------------------------------");
    int escolha = entrada.nextInt();
    double valor = 0;
    if (escolha >= 1 && escolha <= 6){
        System.out.println("Digite o valor à ser convertido: ");
        valor = entrada.nextDouble();
    }

    switch (escolha){
        case 1:
            System.out.println("US$" + df.format(ConversorDeMoeda.realParaDolar(valor)));
            break;
        case 2:
            System.out.println("R$" + df.format(ConversorDeMoeda.dolarParaReal(valor)));
            break;
        case 3:
            System.out.println("€" + df.format(ConversorDeMoeda.realParaEuro(valor)));
            break;
        case 4:
            System.out.println("R$" + df.format(ConversorDeMoeda.euroParaReal(valor)));
            break;
        case 5:
            System.out.println("£" + df.format(ConversorDeMoeda.realParaLibraEsterlina(valor)));
            break;
        case 6:
            System.out.println("R$" + df.format(ConversorDeMoeda.libraEsterlinaParaReal(valor)));
            break;
        default:
            System.out.println("Opção Inválida!!!");
    }





}
