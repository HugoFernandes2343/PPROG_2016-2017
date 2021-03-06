package UIs;

import Controllers.UC3_Controller;
import Dominio.Atribuicao;
import Dominio.CentroDeEventos;
import Dominio.Evento;
import Dominio.Organizador;
import Dominio.Utilizador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hugo Carvalho; Hugo Fernandes
 */
public class UC3_UI {

    private Organizador organizador;
    private UC3_Controller controller;
    private CentroDeEventos centroDeEventos;
    private static Scanner in = new Scanner(System.in);

    /**
     * construtor da UI do UC3
     *
     * @param utilizador utilizador que esta a usar a app
     * @param centroDeEventos centro de eventos da app
     */
    public UC3_UI(Utilizador utilizador, CentroDeEventos centroDeEventos) {
        this.centroDeEventos = centroDeEventos;
        this.organizador = new Organizador(utilizador);
        this.controller = new UC3_Controller(this.organizador, this.centroDeEventos);
    }

    /**
     * metodo run desta UI
     */
    public void run() {
        ArrayList<Evento> eventos = controller.procurarEventosPorAtribuirCandidaturasDoOrganizador();
        if (eventos.size() > 0) {
            mostrarEventos(eventos);
            escolherEvento(eventos);
            procurarAlgoritmos();
            escolherAlgoritmo();
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

    private void procurarAlgoritmos() {
        controller.DefinirAlgoritmos();
    }

    private void escolherAlgoritmo() {
        int op;
        ArrayList<Atribuicao> listaAtribuicoesTemporarias = new ArrayList();
        do {
            op = menuAlgoritmos();
            switch (op) {
                case 1:
                    listaAtribuicoesTemporarias = controller.executarAlgoritmoPorNumeroDeFAE();
                    mostrarAtribuicoes(listaAtribuicoesTemporarias);
                    if (confirmarAtribuicoes()) {
                        op = gravarAtribuicoes();
                    }
                    break;
                case 2:
                    listaAtribuicoesTemporarias = controller.executarAlgoritmoPorDistribuicaoEquatitativaDeFAE();
                    mostrarAtribuicoes(listaAtribuicoesTemporarias);
                    if (confirmarAtribuicoes()) {
                        op = gravarAtribuicoes();
                    }
                    break;
                case 3:
                    listaAtribuicoesTemporarias = controller.executarAlgoritmoPorQualidadeDeFAE();
                    mostrarAtribuicoes(listaAtribuicoesTemporarias);
                    if (confirmarAtribuicoes()) {
                        op = gravarAtribuicoes();
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (op != 0);
    }

    private int menuAlgoritmos() {
        String texto = "\nMENU: Executar..."
                + "\n  ...atribuicao por numero de FAE.               1"
                + "\n  ...atribuicao por carga equatitativa de FAE.   2"
                + "\n  ...atribuicao por qualidade de FAE.            3"
                + "\n  Terminar                                       0"
                + "\n  Qual a sua opcao?";
        System.out.printf("%n%s%n", texto);
        int op = in.nextInt();
        in.nextLine();
        return op;
    }

    private boolean confirmarAtribuicoes() {
        String op;
        do {
            System.out.println("Confirmar atribuicao. Digite s(sim) ou n(nao).");
            op = in.nextLine();
            in.nextLine();
            if (op.equals("s")) {
                return true;
            }

        } while (!op.equals("s") && !op.equals("n"));
        return false;
    }

    private void mostrarAtribuicoes(ArrayList<Atribuicao> atribuicoes) {
        int j = 0;
        for (int i = 0; i < atribuicoes.size(); i++) {
            System.out.println(atribuicoes.get(i).toString());
        }
    }

    private int gravarAtribuicoes() {
        controller.registarAtribuicao();
        return 0;

    }

}
