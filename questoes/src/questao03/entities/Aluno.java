package questao03.entities;
import java.text.DecimalFormat;

public class Aluno {

    private String nome;
    private int idade;
    private int turma;
    private double primeiraNota;
    private double segundaNota;
    private double terceiraNota;

    public Aluno(String nome, int idade, int turma){
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
    }

    private void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    private void setSegundaNota(double segundaNota){
        this.segundaNota = segundaNota;
    }

    private void setTerceiraNota(double terceiraNota){
        this.terceiraNota = terceiraNota;
    }

    public void cadastrarNotas(double primeiraNota, double segundaNota, double terceiraNota){
        setPrimeiraNota(primeiraNota);
        setSegundaNota(segundaNota);
        setTerceiraNota(terceiraNota);
    }

    private double mediaDoAluno(){
        return (this.primeiraNota + this.segundaNota + this.terceiraNota)/3;
    }

    private String situacaoDoAluno(){
        if (mediaDoAluno() > 6) {
            return "APROVADO!";
        }
        else {
            return "REPROVADO!";
        }
    }

    public void mostrarInfosDoAluno(){
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("======================================");
        System.out.println("Nome: " + this.nome +
                        "\nIdade: " + this.idade +
                        "\nTurma: " + this.turma
        );
        System.out.println("======================================");
        System.out.println("1ª Nota: " + df.format(this.primeiraNota) +
                        "\n2ª Nota: " + df.format(this.segundaNota) +
                        "\n3ª Nota: " + df.format(this.terceiraNota)
        );
        System.out.println("--------------------------------------");
        System.out.println("Média final: " + df.format(mediaDoAluno()));
        System.out.println("Situação do aluno: " + situacaoDoAluno());
        System.out.println("======================================");
    }


}
