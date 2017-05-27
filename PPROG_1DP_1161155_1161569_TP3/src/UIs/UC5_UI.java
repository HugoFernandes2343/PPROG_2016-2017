package UIs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Dominio.CentroDeEventos;
import Dominio.Utilizador;
import Controllers.UC5_Controller;
import Dominio.Evento;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hugod
 */
public class UC5_UI {

    private Utilizador utilizador;
    private UC5_Controller controller;
    private CentroDeEventos centroDeEventos;
    private static Scanner in = new Scanner(System.in);

    public UC5_UI(Utilizador utilizador, CentroDeEventos centroDeEventos) {
        this.centroDeEventos = centroDeEventos;
        this.utilizador = utilizador;
        this.controller = new UC5_Controller(this.utilizador, this.centroDeEventos);
    }

    public void run() {
        if (!validarUtilizador()) {
            ArrayList<Evento> eventos = controller.mostrarListaEventosAtivos(utilizador);
            if (eventos.size() > 0) {
                mostrarEventos(eventos);
                escolherEvento(eventos);
                pedirEDefenirDadosCandidatura();
                pedirConfirmacao();
                System.out.println("Operacao concluida com sucesso");
            } else {
                System.out.println("Não tem eventos com candidaturas por submeter.");
            }
        } else {
            System.out.println("O staff do centro de eventos nao tem autorizacao para aceder.");
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

    private void pedirEDefenirDadosCandidatura() {
        System.out.println("Introduza os dados da candidatura");
        String dadosCandidatura = in.nextLine();
        in.nextLine();
        controller.defenirCandidatura(dadosCandidatura);
    }

    private void pedirConfirmacao() {
        System.out.println(controller.getCandidatura().toString());
        String confirmacao;
        do {
            System.out.println("Confirmar candidatura. Digite s(sim) ou n(nao).");
            confirmacao = in.nextLine();
            in.nextLine();
            if (confirmacao.equals("s")) {
                controller.guardarCandidatura();
            }
        } while (!confirmacao.equals("s") && !confirmacao.equals("n"));
    }

    private boolean validarUtilizador() {
        return controller.validaRepresentante();
    }

}
