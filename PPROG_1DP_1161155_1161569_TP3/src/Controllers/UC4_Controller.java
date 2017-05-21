package Controllers;

import Dominio.Utilizador;
import Dominio.Atribuicao;
import Dominio.Avaliacao;
import Dominio.Candidatura;
import Dominio.CentroDeEventos;
import Dominio.Evento;
import Dominio.FAE;
import Dominio.ListFAE;
import Dominio.RegistoDeEventos;
import java.util.ArrayList;

public class UC4_Controller {

    private String nomeCandidatura;
    private FAE FAE;
    private CentroDeEventos centroDeEventos;
    private ArrayList<Atribuicao> atribuicoesFAE = new ArrayList();
    private Avaliacao avaliacao;
    private Evento evento;
    private Candidatura candidatura;
    private Atribuicao atribuicao;
    private static String DECISAO;
    private static String JUSTIFICACAO;

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
     *
     * @param FAE FAE que esta a usar o programa
     * @param centrosDeEventos centro de eventos da app
     * @return lista de eventos do FAE
     */
    public ArrayList<Evento> mostrarListaEventosDoFAE() {
        ArrayList<Evento> listaEventosDoFAE = centroDeEventos.getRegistoEventos().mostrarListaEventosDoFAE(FAE);
        return listaEventosDoFAE;

    }

    /**
     *
     * @param evento evento em que o FAE quer aprovar ou negar candidaturas
     * @return lista de atribuicoes do FAE por avaliar
     */
    public ArrayList<Atribuicao> MostrarListaCandidaturasPorAvaliarDoFAE(Evento evento) {
        this.evento = evento;
        atribuicoesFAE = evento.getCandidaturasPorAvaliarDoFAE(FAE);
        return atribuicoesFAE;
    }

    /**
     * Apresenta os dados de uma candidatura para o FAE a poder avaliar
     *
     * @param nomeCandidatura nome introduzido pelo FAE depois de ver a lista de
     * candidatiras que ainda nao avaliou
     */
    public String mostrarDadosCandidatura(String nomeCandidatura) {
        String dados = "";
        this.nomeCandidatura = nomeCandidatura;
        for (int i = 0; i < atribuicoesFAE.size(); i++) {
            if (atribuicoesFAE.get(i).getCandidatura().getNomeCandidatura().equals(nomeCandidatura)) {
                atribuicao = atribuicoesFAE.get(i);
                candidatura = atribuicoesFAE.get(i).getCandidatura();
                dados = candidatura.getDadosCandidatura();
            }
        }
        return dados;
    }

    /**
     * Cria uma avaliacao com o veredicto e justificacao que o FAE introduziu
     *
     * @param veredicto decisao que o FAE introduz sobre a candidatura
     * @param justificacao texto a justificar o veredicto
     */
    public void defenirAvaliaçao(boolean veredicto, String justificacao) {
        for (int i = 0; i < atribuicoesFAE.size(); i++) {
            if (atribuicoesFAE.get(i).getCandidatura().equals(candidatura)) {
                this.avaliacao = atribuicoesFAE.get(i).getAvaliacao();
                avaliacao.setVeredicto(veredicto);
                avaliacao.setJustificacao(justificacao);
            }
        }

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
     *
     * @param avaliacao avaliacao criada ateriormente
     */
    public void guardarAvaliacoes(Avaliacao avaliacao) {
        atribuicao.setAvaliacao(avaliacao);
    }

}
