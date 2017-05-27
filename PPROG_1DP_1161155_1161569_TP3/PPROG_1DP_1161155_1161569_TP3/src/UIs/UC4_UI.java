package UIs;

import Dominio.CentroDeEventos;
import Dominio.Utilizador;
import Controllers.UC4_Controller;
import Dominio.Candidatura;
import Dominio.Evento;
import Dominio.FAE;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class UC4_UI {

    private FAE FAE;
    private UC4_Controller controller;
    private CentroDeEventos centroDeEventos;
    private static Scanner in = new Scanner(System.in);

    /**
     * construtor da UI do UC4
     *
     * @param utilizador utilizador que esta a usar a app
     * @param centroDeEventos centro de eventos da app
     */
    public UC4_UI(Utilizador utilizador, CentroDeEventos centroDeEventos) {
        this.centroDeEventos = centroDeEventos;
        this.FAE = new FAE(utilizador);
        this.controller = new UC4_Controller(this.FAE, this.centroDeEventos);
    }

    /**
     * metodo run da funcionalidade do UC4
     */
    public void run() {
        ArrayList<Evento> eventos = controller.mostrarListaEventosDoFAE();
        if (eventos.size() > 0) {
            mostrarEventos(eventos);
            escolherEvento(eventos);
            ArrayList<Candidatura> candidaturas = controller.mostrarListaCandidaturasPorAvaliarDoFAE();
            if (candidaturas.size() > 0) {
                mostrarCandidaturas(candidaturas);
                escolherCandidatura(candidaturas);
                mostrarDadosCandidatura();
                avaliarCandidatura();
                pedirConfirmacao();
                System.out.println("A operacao foi realizada com sucesso");
            }
        } else {
            System.out.println("Não tem eventos com candidaturas por atribuir.");
        }
    }

    private void mostrarEventos(ArrayList<Evento> eventos) {
        int j = 0;
        for (int i = 0; i < eventos.size(); i++) {
            System.out.println("--" + (j + 1) + "--");
            System.out.println(eventos.get(i).toString());
            j++;
        }
    }

    private void escolherEvento(ArrayList<Evento> eventos) {
        System.out.println("Escolha um evento");
        int i = in.nextInt();
        in.nextLine();
        Evento eventoEscolhido = eventos.get(i - 1);
        controller.setEvento(eventoEscolhido);
    }

    private void mostrarCandidaturas(ArrayList<Candidatura> candidaturas) {
        int j = 0;
        for (int i = 0; i < candidaturas.size(); i++) {
            System.out.println("--" + (j + 1) + "--");
            System.out.println(candidaturas.get(i).toString());
            j++;
        }
    }

    private void escolherCandidatura(ArrayList<Candidatura> candidaturas) {
        System.out.println("Escolha uma candidatura");
        int i = in.nextInt();
        in.nextLine();
        Candidatura candidaturaEscolhida = candidaturas.get(i - 1);
        controller.setCandidatura(candidaturaEscolhida);
    }

    private void mostrarDadosCandidatura() {
        String dados = controller.mostrarDadosCandidatura();
        System.out.println(dados);
    }

    private void avaliarCandidatura() {

        boolean aprovacao = false;
        String resposta;
        do {
            System.out.println("Regeita ou aceita candidatura. Digite s(sim) ou n(nao).");
            resposta = in.nextLine();
            in.nextLine();
            if (resposta.equals("s")) {
                aprovacao = true;
            }
        } while (!resposta.equals("s") && !resposta.equals("n"));
        System.out.println("Justifique a sua decisao com um pequeno texto.");
        String justificacao = in.nextLine();
        in.nextLine();
        controller.defenirAvaliacao(aprovacao, justificacao);
    }

    private void pedirConfirmacao() {
        System.out.println(controller.getAvaliacao().toString());
        String confirmacao;
        do {
            System.out.println("Confirmar atribuicao. Digite s(sim) ou n(nao).");
            confirmacao = in.nextLine();
            in.nextLine();
            if (confirmacao.equals("s")) {
                controller.guardarAvaliacao();
            }
        } while (!confirmacao.equals("s") && !confirmacao.equals("n"));
    }
}
