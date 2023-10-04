package tech.devinhouse.clamedv2.desafio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da conta: ");
        double valorDaConta = scanner.nextDouble();

        System.out.print("Digite o percentual de gorjeta desejado (por exemplo, 15 para 15%): ");
        double percentualDeGorjeta = scanner.nextDouble();

        CalculadoraDeGorjetas calculadora = new CalculadoraDeGorjetas(valorDaConta, percentualDeGorjeta);

        double valorDaGorjeta = calculadora.calcularGorjeta();
        double valorTotal = valorDaConta + valorDaGorjeta;

        System.out.println("Valor da gorjeta: R$" + valorDaGorjeta);
        System.out.println("Valor total a ser pago: R$" + valorTotal);
    }
}
