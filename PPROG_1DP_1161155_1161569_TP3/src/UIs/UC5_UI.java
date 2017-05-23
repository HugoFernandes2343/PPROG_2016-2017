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
        ArrayList<Evento> eventos = controller.mostrarListaEventosAtivos();
        if (eventos.size() > 0) {
            mostrarEventos(eventos);
            escolherEvento(eventos);
            pedirEDefenirDadosCandidatura();
            pedirConfirmacao();
            System.out.println("Operacao concluida com sucesso");
        } else {
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

    private void pedirEDefenirDadosCandidatura() {
        System.out.println("Introduza os dados da candidatura");
        String dadosCandidatura = in.nextLine();
        controller.defenirCandidatura(dadosCandidatura);
    }

    private void pedirConfirmacao() {
        System.out.println(controller.getCandidatura().toString());
        System.out.println("Confirma? (Sim ou Nao)");
        String confirmacao = in.nextLine();
        if (confirmacao.equalsIgnoreCase("Sim")) {
            controller.guardarCandidatura();
        } else {
            controller.eleminarCandidaturaCriada();
        }
    }

}
