package tech.devinhouse.clamedv2.exercicios.ex03;

public class TestaContador {
    public static void main(String[] args) {
        String frase = "Uma frase de exemplo";
        int numeroDePalavras = Contador.contarPalavras(frase);
        System.out.println("Número de palavras na frase: " + numeroDePalavras);
    }
}
