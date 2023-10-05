package tech.devinhouse.clamedv2.exercicios.ex03;

public class Contador {
   public static int contarPalavras(String frase) {
        String[] palavras = frase.split("\\s+");

       return palavras.length;
    }
}

