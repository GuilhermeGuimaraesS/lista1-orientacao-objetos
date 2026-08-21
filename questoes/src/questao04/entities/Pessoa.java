package questao04.entities;
import java.text.DecimalFormat;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String formacaoAcademica;
    private Endereco endereco;

    public Pessoa(String nome, int idade, double altura, double peso, String formacaoAcademica, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.formacaoAcademica = formacaoAcademica;
        this.endereco = endereco;
    }

    private String getNome(){
        return nome;
    }

    private int getIdade(){
        return idade;
    }

    private double getAltura(){
        return altura;
    }

    private double getPeso(){
        return peso;
    }

    private String getFormacaoAcademica(){
        return formacaoAcademica;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void mostrarInformacoes(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("==================================================");
        System.out.println("Nome: " + this.getNome() +
                        "\nIdade: " + this.getIdade() +
                        "\nAltura: " + df.format(this.getAltura()) +
                        "\nPeso: " + df.format(this.getPeso()) +
                        "\nFormação acadêmica: " + this.getFormacaoAcademica()
        );
        System.out.println("--------------------------------------------------");
        System.out.println("ENDEREÇO");
        this.endereco.mostarEndereco();
        System.out.println("==================================================");
    }



}
