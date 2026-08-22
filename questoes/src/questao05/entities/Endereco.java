package questao05.entities;

import java.text.DecimalFormat;

public class Endereco {

    private String pais;
    private String estado;
    private String cidade;
    private String rua;
    private String bairro;
    private String numero;
    private String complemento;

    public Endereco(String cidade, String estado, String pais,String rua, String bairro, String numero, String complemento){
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getPais(){
        return pais;
    }

    public String getEstado(){
        return estado;
    }

    public String getCidade(){
        return cidade;
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

    public String getComplemento(){
        return complemento;
    }

    public void mostarEndereco(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("--------------------------------------------------");
        System.out.println("Cidade: " + this.getCidade() +
                "\nEstado: " + this.getEstado() +
                "\nPais: " + this.getPais() +
                "\nRua: " + this.getRua() +
                "\nBairro: " + this.getBairro() +
                "\nNumero: " + this.getNumero() +
                "\nComplemento: " + this.getComplemento()
        );
    }

}
