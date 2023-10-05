package tech.devinhouse.clamedv2.exercicios.ex03;

public class TestaContador {
    public static void main(String[] args) {
        String frase = "Beba mais amanhã haverá mais alegria - BRAHMA";
        int numeroDePalavras = Contador.contarPalavras(frase);
        System.out.println("Número de palavras na frase: " + numeroDePalavras);
    }
}
