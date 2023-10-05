package tech.devinhouse.clamedv2.exercicios.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Concurso> concursos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("resultados_megasena.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 8) {
                    Integer numero = Integer.parseInt(values[0]);
                    LocalDate data = LocalDate.parse(values[1]);
                    int[] sorteados = new int[6];
                    for (int i = 2; i < values.length; i++) {
                        sorteados[i - 2] = Integer.parseInt(values[i]);
                    }
                    Concurso concurso = new Concurso(numero, data, sorteados);
                    concursos.add(concurso);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        for (Concurso concurso : concursos) {
            System.out.println(concurso);
        }
    }
}