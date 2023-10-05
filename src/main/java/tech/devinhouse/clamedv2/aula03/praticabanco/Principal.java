package tech.devinhouse.clamedv2.aula03.praticabanco;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("John Snow", 25, "vigilante");
        LocalDateTime dataDeCriacao = LocalDateTime.of(2022, 7, 30, 10, 0);
        ContaBancaria conta = new ContaBancaria("Banco Bamerindus", "123", "987X", 1000.00f, cliente, dataDeCriacao);

        System.out.println("Nome do Cliente em Maiúsculo: " + cliente.obterNomeEmMaiusculo());
        System.out.println("Dados do Cliente:\n" + cliente);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        float valorDoSaque = scanner.nextFloat();
        conta.sacar(valorDoSaque);

        System.out.println("\nDados da Conta Bancária:\n" + conta);
    }
}
