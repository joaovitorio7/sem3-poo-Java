package tech.devinhouse.clamedv2.exercicios.ex04;

public class TesteContador2 {
    public static void main(String[] args) {
        String fraseExemplo = "Beba mais amanhã haverá mais alegria - BRAHMA";

        Contador2 contador = new Contador2(fraseExemplo);

        int numeroDePalavras = contador.contarPalavras();

        System.out.println("Número de palavras na frase: " + numeroDePalavras);
    }
}

