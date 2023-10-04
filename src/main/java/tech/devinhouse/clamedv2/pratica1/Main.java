package tech.devinhouse.clamedv2.pratica1;

public class Main {
    public static void main(String[] args) {

        var pessoa = new Pessoa();

        pessoa.setNome("Tiago");
        pessoa.setSobrenome("Ribeiro");
        pessoa.setIdade(22);

        var nomeCompleto = pessoa.obterNomeCompleto();
        var idadeEmMeses = pessoa.obterIdadeEmMeses();

        System.out.println(nomeCompleto);
        System.out.println(idadeEmMeses + " meses");
    }
}
