package tech.devinhouse.clamedv2.aula04.listadetarefas;

import tech.devinhouse.clamedv2.aula04.listadetarefas.cli.TarefaCli;
import tech.devinhouse.clamedv2.aula04.listadetarefas.model.Operacao;

import static tech.devinhouse.clamedv2.aula04.listadetarefas.model.Operacao.SAIR;

/**
 * Classe que representa a aplicação de
 * Lista de Tarefas
 */
public class AppListaDeTarefas {

    private TarefaCli cli = new TarefaCli();

    public void executar() {

        Operacao operacao;
        do {
            cli.exibirMenu();
            operacao = cli.obterOperacao();
        } while (operacao != SAIR);

        cli.finalizar();
    }
}


