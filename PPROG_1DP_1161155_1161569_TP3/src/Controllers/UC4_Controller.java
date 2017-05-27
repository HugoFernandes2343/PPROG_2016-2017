package Controllers;

import Dominio.Atribuicao;
import Dominio.Avaliacao;
import Dominio.Candidatura;
import Dominio.CentroDeEventos;
import Dominio.Evento;
import Dominio.FAE;
import java.util.ArrayList;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class UC4_Controller {

    private FAE FAE;
    private CentroDeEventos centroDeEventos;
    private ArrayList<Atribuicao> atribuicoesFAE = new ArrayList();
    private Avaliacao avaliacao;
    private Evento evento;
    private Candidatura candidatura;
    private Atribuicao atribuicao;

    /**
     * construtor do controller
     *
     * @param FAE FAE que esta a usar o programa
     * @param centroDeEventos centro de eventos da app
     */
    public UC4_Controller(FAE FAE, CentroDeEventos centroDeEventos) {
        this.FAE = FAE;
        this.centroDeEventos = centroDeEventos;
    }

    /**
     * mostra a lista de eventos do FAE
     * @return lista de eventos do FAE
     */
    public ArrayList<Evento> mostrarListaEventosDoFAE() {
        ArrayList<Evento> listaEventosDoFAE = centroDeEventos.getRegistoEventos().mostrarListaEventosDoFAE(FAE);
        return listaEventosDoFAE;

    }

    /**
     *
     * @param evento
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    /**
     *
     * @return lista de atribuicoes do FAE por avaliar
     */
    public ArrayList<Candidatura> mostrarListaCandidaturasPorAvaliarDoFAE() {
        this.atribuicoesFAE = evento.getCandidaturasPorAvaliarDoFAE(FAE);
        ArrayList<Candidatura> candidaturas = new ArrayList();
        for (int i = 0; i < atribuicoesFAE.size(); i++) {
            candidaturas.add(atribuicoesFAE.get(i).getCandidatura());
        }
        return candidaturas;
    }

    /**
     * Defenir candidatura a ser utilizadaa 
     * @param candidatura candidatura para ser defenir
     */
    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    /**
     * Apresenta os dados de uma candidatura para o FAE a poder avaliar
     * @return devolve dados para mostrar
     */
    public String mostrarDadosCandidatura() {
        String dados;
        dados = candidatura.getDadosCandidatura();
        return dados;
    }

    /**
     * Cria uma avaliacao com o veredicto e justificacao que o FAE introduziu
     * @param veredicto decisao que o FAE introduz sobre a candidatura
     * @param justificacao texto a justificar o veredicto
     */
    public void defenirAvaliacao(boolean veredicto, String justificacao) {
        for (int i = 0; i < atribuicoesFAE.size(); i++) {
            if (atribuicoesFAE.get(i).getCandidatura().equals(candidatura)) {
                this.avaliacao = new Avaliacao();
                avaliacao.setVeredicto(veredicto);
                avaliacao.setJustificacao(justificacao);
            }
        }

    }

    /**
     * Devolve a avaliacao
     * @return avaliacao que foi criada
     */
    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    /**
     * Tira a atribuicao para a qual foi criada a avalicao da lista de
     * atribuicoes que nao foram ainda avaliadas
     */
    public void removeCandidaturaDaListaCandidaturasPorAvaliarDoFAE() {
        atribuicoesFAE.remove(atribuicao);
    }

    /**
     * Guarda permanentemente a avaliacao criada
     */
    public void guardarAvaliacao() {
        centroDeEventos.registarAvaliacao(evento, atribuicao, avaliacao);
    }
}
