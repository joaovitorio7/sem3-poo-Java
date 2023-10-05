package tech.devinhouse.clamedv2.exercicios.ex05;

import java.time.LocalDate;
import java.util.Arrays;

public class Concurso {
    private Integer numero;
    private LocalDate data;
    private int[] sorteados;

    public Concurso(Integer numero, LocalDate data, int[] sorteados) {
        this.numero = numero;
        this.data = data;
        this.sorteados = sorteados;
    }

    public Integer getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public int[] getSorteados() {
        return sorteados;
    }

    @Override
    public String toString() {
        return "Concurso [numero=" + numero + ", data=" + data + ", sorteados=" + Arrays.toString(sorteados) + "]";
    }
}