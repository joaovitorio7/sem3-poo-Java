package tech.devinhouse.clamedv2.aula02.construtores;

public class Pessoa {
    private String nome;
    private Long cpf;
    private Integer idade;

    public Pessoa(){
    }

     public Pessoa(String nome, Long cpf, Integer idade){
     }

     public Pessoa(String nome){
        this.nome = nome;
     }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
