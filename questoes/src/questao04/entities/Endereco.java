package questao04.entities;

import java.text.DecimalFormat;

public class Endereco {

    private String rua;
    private String bairro;
    private String numero;
    private String tipoDeMoradia;
    private String complemento;

    public Endereco(String rua, String bairro, String numero, String tipoDeMoradia, String complemento){
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.tipoDeMoradia = tipoDeMoradia;
        this.complemento = complemento;
    }

    public String getRua(){
        return rua;
    }

    public String getBairro(){
        return bairro;
    }

    public String getNumero(){
        return numero;
    }

    public String getTipoDeMoradia(){
        return tipoDeMoradia;
    }

    public String getComplemento(){
        return complemento;
    }

    public void mostarEndereco(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("==================================================");
        System.out.println("Rua: " + this.getRua() +
                "\nBairro: " + this.getBairro() +
                "\nNumero: " + this.getNumero() +
                "\nTipo de moradia: " + this.getTipoDeMoradia() +
                "\nComplemento: " + this.getComplemento()
        );
    }

}
