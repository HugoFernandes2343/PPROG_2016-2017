/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author hugod
 */
public class UC4_UI {

    private FAE FAE;
    private UC4_Controller controller;
    private CentroDeEventos centroDeEventos;
    private static Scanner in = new Scanner(System.in);

    /**
     *
     * @param utilizador
     * @param centroDeEventos
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
            mostrarCandidaturas(candidaturas);
            escolherCandidatura(candidaturas);
            mostrarDadosCandidatura();
            avaliarCandidatura();
            pedirConfirmacao();
            System.out.println("A operacao foi realizada com sucesso");
        }else{
            System.out.println("Não tem eventos com candidaturas por atribuir.");
        }
    }

    private void mostrarEventos(ArrayList<Evento> eventos) {
        for (int i = 0; i < eventos.size(); i++) {
            int j = 0;
            System.out.println("--" + (j + 1) + "--");
            eventos.get(i).toString();
            j++;
        }
    }

    private void escolherEvento(ArrayList<Evento> eventos) {
        System.out.println("Escolha um evento");
        int i = in.nextInt();
        Evento eventoEscolhido = eventos.get(i - 1);
        controller.setEvento(eventoEscolhido);
    }

    private void mostrarCandidaturas(ArrayList<Candidatura> candidaturas) {
        for (int i = 0; i < candidaturas.size(); i++) {
            int j = 0;
            System.out.println("--" + (j + 1) + "--");
            candidaturas.get(i).toString();
            j++;
        }
    }

    private void escolherCandidatura(ArrayList<Candidatura> candidaturas) {
        System.out.println("Escolha uma candidatura");
        int i = in.nextInt();
        Candidatura candidaturaEscolhida = candidaturas.get(i - 1);
        controller.setCandidatura(candidaturaEscolhida);
    }

    private void mostrarDadosCandidatura() {
        String dados = controller.mostrarDadosCandidatura();
        System.out.println(dados);
    }

    private void avaliarCandidatura() {
        System.out.println("Aceita ou Rejeita a candidatura?");
        boolean aprovacao;
        String veredicto = in.nextLine();
        if (veredicto.equalsIgnoreCase("Aceito")) {
            aprovacao = true;
        } else {
            aprovacao = false;
        }
        System.out.println("Justifique a sua decisao com um pequeno texto.");
        String justificacao = in.nextLine();
        controller.defenirAvaliaçao(aprovacao, justificacao);
    }

    private void pedirConfirmacao() {
        System.out.println(controller.getAvaliacao().toString());
        System.out.println("Confirma? (Sim ou Nao)");
        String confirmacao = in.nextLine();
        if (confirmacao.equalsIgnoreCase("Sim")) {
            controller.guardarAvaliacao();
        }else{
            controller.eleminarAvaliacaoCriada();
        }
    }
}
