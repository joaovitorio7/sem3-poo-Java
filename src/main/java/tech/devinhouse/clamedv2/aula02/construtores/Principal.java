package tech.devinhouse.clamedv2.aula02.construtores;

public class Principal {
    public static void main(String[] args) {
        var john = new Pessoa("john", 3125847441L, 30);
        System.out.println(john);

        var sansa = new Pessoa();
        sansa.setNome("sansa stark");
        System.out.println(sansa);

        var arya = new Pessoa("Arya");
        System.out.println(arya);
    }
}
