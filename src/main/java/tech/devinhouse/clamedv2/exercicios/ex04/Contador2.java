package tech.devinhouse.clamedv2.exercicios.ex04;

public class Contador2 {
    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public int contarPalavras() {
        if (frase == null || frase.isEmpty()) {
            return 0;
        }

        String[] palavras = frase.split("\\s+");

        return palavras.length;
    }
}
