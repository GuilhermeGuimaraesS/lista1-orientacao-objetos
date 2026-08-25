package questao06.entities;

public class ConversorDeMoeda {
    private static double cotacaoDolar = 5.1562;
    private static double cotacaoEuro = 6.0132;
    private static double cotacaoLibraEsterlina = 7.0323;


    public static double realParaDolar(double reais){
        return reais / cotacaoDolar;
    }

    public static double dolarParaReal(double dolares){
        return dolares * cotacaoDolar;
    }
    public static double realParaEuro(double reais){
        return reais / cotacaoEuro;
    }

    public static double euroParaReal(double euros){
        return euros * cotacaoEuro;
    }

    public static double realParaLibraEsterlina(double reais){
        return reais / cotacaoLibraEsterlina;
    }

    public static double libraEsterlinaParaReal(double librasEsterlinas){
        return librasEsterlinas * cotacaoLibraEsterlina;
    }


}
