package Controllers;

import Algoritmos.AlgoritmoPorDistribuicaoEquatitativaDeFAE;
import Algoritmos.AlgoritmoPorNumeroDeFAE;
import Algoritmos.AlgoritmoPorQualidadeDeFAE;
import Dominio.Atribuicao;
import Dominio.CentroDeEventos;
import Dominio.Evento;
import Dominio.Organizador;
import Dominio.RegistoDeEventos;
import java.util.ArrayList;

public class UC3_Controller {

    private Organizador organizador;
    private CentroDeEventos centroDeEventos;
    private Evento evento;
    private ArrayList<Object> algoritmos;
    private ArrayList<Atribuicao> atribuicoesTemporarias;

    public UC3_Controller(Organizador organizador, CentroDeEventos centroDeEventos) {
        this.organizador = organizador;
        this.centroDeEventos = centroDeEventos;

    }

    public ArrayList<Evento> procurarEventosPorAtribuirCandidaturasDoOrganizador() {
        RegistoDeEventos registo = centroDeEventos.getRegistoEventos();
        ArrayList<Evento> eventosDoOrganizadorValidados = registo.procurarEventosPosSubmissaoDoOrganizador(organizador);
        return eventosDoOrganizadorValidados;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void DefinirAlgoritmos() {
        algoritmos = centroDeEventos.procurarAlgoritmosDeAtribuicao();
    }

    public void setListaTemporariaDeAtribuicoes(ArrayList<Atribuicao> atribuicoesTemporarias) {
        this.atribuicoesTemporarias = atribuicoesTemporarias;

    }

    public void registarAtribuicao() {
        centroDeEventos.registarAtribuicao(evento, atribuicoesTemporarias);

    }

    public ArrayList<Atribuicao> executarAlgoritmoPorDistribuicaoEquatitativaDeFAE() {
        for (int i = 0; i < algoritmos.size(); i++) {
            if (algoritmos.get(i) instanceof AlgoritmoPorDistribuicaoEquatitativaDeFAE) {
                AlgoritmoPorDistribuicaoEquatitativaDeFAE algoritmo = (AlgoritmoPorDistribuicaoEquatitativaDeFAE) algoritmos.get(i);
                atribuicoesTemporarias = algoritmo.run(evento.getListFAE(), evento.getListCandidaturas().getListaDeCandidaturas());
            }
        }

        return atribuicoesTemporarias;
    }

    public ArrayList<Atribuicao> executarAlgoritmoPorNumeroDeFAE() {
        for (int i = 0; i < algoritmos.size(); i++) {
            if (algoritmos.get(i) instanceof AlgoritmoPorNumeroDeFAE) {
                AlgoritmoPorNumeroDeFAE algoritmo = (AlgoritmoPorNumeroDeFAE) algoritmos.get(i);
                atribuicoesTemporarias = algoritmo.run(evento.getListFAE(), evento.getListCandidaturas().getListaDeCandidaturas());
            }
        }

        return atribuicoesTemporarias;
    }

    public ArrayList<Atribuicao> executarAlgoritmoPorQualidadeDeFAE() {
        for (int i = 0; i < algoritmos.size(); i++) {
            if (algoritmos.get(i) instanceof AlgoritmoPorQualidadeDeFAE) {
                AlgoritmoPorQualidadeDeFAE algoritmo = (AlgoritmoPorQualidadeDeFAE) algoritmos.get(i);
                atribuicoesTemporarias = algoritmo.run(evento.getListFAE(), evento.getListCandidaturas().getListaDeCandidaturas());
            }
        }

        return atribuicoesTemporarias;
    }
}
