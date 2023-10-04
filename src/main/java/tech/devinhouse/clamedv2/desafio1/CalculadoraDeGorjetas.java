package tech.devinhouse.clamedv2.desafio1;

public class CalculadoraDeGorjetas {
    private double valorDaConta;
    private double percentualDeGorjeta;

    public CalculadoraDeGorjetas(double valorDaConta, double percentualDeGorjeta) {
        this.valorDaConta = valorDaConta;
        this.percentualDeGorjeta = percentualDeGorjeta;
    }

    public double calcularGorjeta() {
        return valorDaConta * (percentualDeGorjeta / 100);
    }
}
