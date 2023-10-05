package tech.devinhouse.clamedv2.aula03.praticabanco;

public class Cliente {
    private String nome;
    private int idade;
    private String profissao;

    public Cliente(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public String obterNomeEmMaiusculo() {
        return nome.toUpperCase();
    }

    public String obterDadosFormatados() {
        return String.format("Nome: %s\nIdade: %d\nProfissão: %s", nome, idade, profissao);
    }

    @Override
    public String toString() {
        return obterDadosFormatados();
    }
}


