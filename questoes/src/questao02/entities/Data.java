package questao02.entities;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private int getDia(){
        return dia;
    }

    private int getMes(){
        return mes;
    }

    private int getAno(){
        return ano;
    }

    public void mostrarData(){

        System.out.println("---------------------------");
        System.out.println("DATA DE HOJE");
        System.out.println("---------------------------");
        System.out.printf("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

}
