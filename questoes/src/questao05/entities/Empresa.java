package questao05.entities;

public class Empresa {
    private String nomeDaEmpresa;
    private String CNPJ;
    private String setorDeAtuacao;
    private Endereco enderecoDaSede;
    private int totalDeFiliais;

    public Empresa(String nomeDaEmpresa, String CNPJ, String setorDeAtuacao, Endereco enderecoDaSede, int totalDeFiliais){
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.CNPJ = CNPJ;
        this.setorDeAtuacao = setorDeAtuacao;
        this.enderecoDaSede = enderecoDaSede;
        this.totalDeFiliais = totalDeFiliais;
    }

    public void mostrarInfosDaEmpresa(){
        System.out.println("--------------------------------------------------");
        System.out.println("Nome da empresa: " + this.nomeDaEmpresa +
                        "\nCNPJ: " + this.CNPJ +
                        "\nSetor de atuação: " + this.setorDeAtuacao +
                        "\nTotal de filiais: " + this.totalDeFiliais
        );
        this.enderecoDaSede.mostarEndereco();

    }


}
