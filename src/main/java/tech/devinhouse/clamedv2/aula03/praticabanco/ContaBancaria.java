package tech.devinhouse.clamedv2.aula03.praticabanco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
    private String nomeDoBanco;
    private String agencia;
    private String conta;
    private float saldo;
    private Cliente cliente;
    private LocalDateTime dataDeCriacaoDaConta;

    public ContaBancaria(String nomeDoBanco, String agencia, String conta, float saldo, Cliente cliente, LocalDateTime dataDeCriacaoDaConta) {
        this.nomeDoBanco = nomeDoBanco;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.dataDeCriacaoDaConta = dataDeCriacaoDaConta;
    }

    public ContaBancaria() {

    }

    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado! Saldo atual = " + saldo);
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = dataDeCriacaoDaConta.format(formatter);
        return String.format("Nome do Banco: %s\nAgência: %s\nConta: %s\nSaldo: R$ %.2f\nCliente:\n%s\nData de Criação da Conta: %s", nomeDoBanco, agencia, conta, saldo, cliente, dataFormatada);
    }

    public void setDataCriacao(LocalDateTime of) {
    }

    public void setCliente(Cliente cliente) {
    }

    public void setSaldo(int i) {
    }

    public void setConta(int i) {
    }

    public void setAgencia(int i) {
    }

    public void setNomeBanco(String bamerindus) {
    }

    public String getSaldo() {
        return null;
    }
}