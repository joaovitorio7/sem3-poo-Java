package tech.devinhouse.clamedv2.aula04.listadetarefas.cli;

import tech.devinhouse.clamedv2.aula04.listadetarefas.model.ConversorOperacao;
import tech.devinhouse.clamedv2.aula04.listadetarefas.model.Operacao;

import java.util.Scanner;

/**
 * Classe responsável pela interação com usuário
 */
public class TarefaCli {
    public void exibirMenu(){
        System.out.println("** Lista de tarefas **");
        System.out.println();
        System.out.println("-----Menu-----");
        System.out.println();
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Excluir tarefa");
        System.out.println("3 - Consultar tarefas");
        System.out.println("4 - COnsultar tarefas por id");
        System.out.println("5 - Marcar tarefas como concluída");
        System.out.println("6 - Exportar para arquivo");
        System.out.println("0 - Sair");
        System.out.println();
    }

    public Operacao obterOperacao() {
        System.out.println("Informe a operacao desejada: ");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        Operacao operacao = ConversorOperacao.converter(op);
        return operacao;
    }

    public void finalizar(){
        System.out.println();
        System.out.println("Programa encerrado!");
    }
}
