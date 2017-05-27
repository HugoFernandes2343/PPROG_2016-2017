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

/**
 *
 * @author Hugo Carvalho; Hugo Fernandes
 */
public class UC3_Controller {

    private Organizador organizador;
    private CentroDeEventos centroDeEventos;
    private Evento evento;
    private ArrayList<Object> algoritmos;
    private ArrayList<Atribuicao> atribuicoesTemporarias;

    /**
     * Construtor do controller da funcionalidade do UC3
     * @param organizador organizador que esta a utilizar a app
     * @param centroDeEventos centro de eventos da app
     */
    public UC3_Controller(Organizador organizador, CentroDeEventos centroDeEventos) {
        this.organizador = organizador;
        this.centroDeEventos = centroDeEventos;

    }

    /**
     * procura os eventos do organizador sem atribuicoes todas feitas
     * @return eventos que faltam fazer atribuicoes
     */
    public ArrayList<Evento> procurarEventosPorAtribuirCandidaturasDoOrganizador() {
        RegistoDeEventos registo = centroDeEventos.getRegistoEventos();
        ArrayList<Evento> eventosDoOrganizadorValidados = registo.procurarEventosPosSubmissaoDoOrganizador(organizador);
        return eventosDoOrganizadorValidados;
    }

    /**
     * define o evento escolhido
     * @param evento evento a defenir como evento 
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    /**
     * Obtem os algoritmos
     */
    public void DefinirAlgoritmos() {
        algoritmos = centroDeEventos.procurarAlgoritmosDeAtribuicao();
    }

    /**
     * define as atribuicoes temporariamente
     * @param atribuicoesTemporarias
     */
    public void setListaTemporariaDeAtribuicoes(ArrayList<Atribuicao> atribuicoesTemporarias) {
        this.atribuicoesTemporarias = atribuicoesTemporarias;

    }

    /**
     * guardar permanentemente as atribuicoes
     */
    public void registarAtribuicao() {
        centroDeEventos.registarAtribuicao(evento, atribuicoesTemporarias);

    }

    /**
     * Corre o algoritmo e apresenta os resultados
     * @return resultados do algoritmo
     */
    public ArrayList<Atribuicao> executarAlgoritmoPorDistribuicaoEquatitativaDeFAE() {
        for (int i = 0; i < algoritmos.size(); i++) {
            if (algoritmos.get(i) instanceof AlgoritmoPorDistribuicaoEquatitativaDeFAE) {
                AlgoritmoPorDistribuicaoEquatitativaDeFAE algoritmo = (AlgoritmoPorDistribuicaoEquatitativaDeFAE) algoritmos.get(i);
                atribuicoesTemporarias = algoritmo.run(evento.getListFAE(), evento.getListCandidaturas().getListaDeCandidaturas());
            }
        }

        return atribuicoesTemporarias;
    }

    /**
     * Corre o algoritmo e apresenta os resultados
     * @return resultados do algoritmo
     */
    public ArrayList<Atribuicao> executarAlgoritmoPorNumeroDeFAE() {
        for (int i = 0; i < algoritmos.size(); i++) {
            if (algoritmos.get(i) instanceof AlgoritmoPorNumeroDeFAE) {
                AlgoritmoPorNumeroDeFAE algoritmo = (AlgoritmoPorNumeroDeFAE) algoritmos.get(i);
                atribuicoesTemporarias = algoritmo.run(evento.getListFAE(), evento.getListCandidaturas().getListaDeCandidaturas());
            }
        }

        return atribuicoesTemporarias;
    }

    /**
     * Corre o algoritmo e apresenta os resultados
     * @return resultados do algoritmo
     */
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
