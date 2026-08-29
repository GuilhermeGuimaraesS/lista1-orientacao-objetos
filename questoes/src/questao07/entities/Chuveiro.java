package questao07.entities;

import java.util.Scanner;

public class Chuveiro {

    private String marca;
    private String modelo;
    private int potencia;
    private int tensaoDeOperacao;
    private static int modosDeTemperatura = 3;
    private int nivelDeTemperatura;

    public Chuveiro(String marca, String modelo, int potencia, int tensaoDeOperacao){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.tensaoDeOperacao = tensaoDeOperacao;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getPotencia(){
        return potencia;
    }

    public int getTensaoDeOperacao(){
        return tensaoDeOperacao;
    }

    public int getModosDeTemperatura(){
        return modosDeTemperatura;
    }

    public int getNivelDeTemperatura(){
        return nivelDeTemperatura;
    }

    public void setNivelDeTemperatura(int nivelDeTemperatura) {
        this.nivelDeTemperatura = nivelDeTemperatura;
    }

    public void ligar(){
        System.out.println("Chuveiro ligado!");
    }

    public void desligar(){
        System.out.println("Chuveiro desligado!");
    }

    public void mudarNivelDeTemperatura(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha a temperatura da água: ");
        System.out.println("1 - Frio " +
                        "\n2 - Morno" +
                        "\n3 - Quente"
        );
        int temperatura = entrada.nextInt();
        setNivelDeTemperatura(temperatura);

    }

    public void mostrarInfosChuveiro(){
        System.out.println("===============================================");
        System.out.println("Marca: " + marca +
                        "\nModelo: " + modelo +
                        "\nPotência: " + potencia +"W" +
                        "\nTensão de Operação: " + tensaoDeOperacao +"v" +
                        "\nModos de temperatura: " + modosDeTemperatura +
                        "\nNível de temperatura atual: " + nivelDeTemperatura
        );
        System.out.println("===============================================");

    }


}
