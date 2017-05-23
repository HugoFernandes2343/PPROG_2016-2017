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
        }
    }

    /**
     *
     * @param eventos
     */
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
}
