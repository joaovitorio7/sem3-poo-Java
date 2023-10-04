package tech.devinhouse.clamedv2.pratica1;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private Integer idade;
    private String profissao;
    private boolean doadorDeOrgaos;
    private Float peso;

    public String obterNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public int obterIdadeEmMeses(){
        return idade * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isDoadorDeOrgaos() {
        return doadorDeOrgaos;
    }

    public void setDoadorDeOrgaos(boolean doadorDeOrgaos) {
        this.doadorDeOrgaos = doadorDeOrgaos;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
}
