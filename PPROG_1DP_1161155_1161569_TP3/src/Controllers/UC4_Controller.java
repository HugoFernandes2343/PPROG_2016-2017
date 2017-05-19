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

    private FAE FAE;
    private CentroDeEventos centroDeEventos;

    private static Evento EVENTO;
    private static Candidatura CANDIDATURA;
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
     * @param evento
     * @return 
     */
    public ArrayList<Candidatura> MostrarListaCandidaturasPorAvaliarDoFAE(Evento evento) {
        EVENTO = evento;
        ArrayList<Candidatura> candidaturas = EVENTO.getCandidaturasPorAvaliarDoFAE(FAE);
        return candidaturas;
    }

    /**
     *
     * @param nomeCandidatura
     */
    public Candidatura mostrarCandidatura(String nomeCandidatura) {
        // TODO - implement UC5_Controller.mostrarCandidatura
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param veredicto
     * @param justificacao
     */
    public void defenirAvaliaçao(String veredicto, String justificacao) {
        // TODO - implement UC5_Controller.defenirAvaliaçao
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param candidatura
     */
    public void removeCandidaturaDaListaCandidaturasPorAvaliarDoFAE(Candidatura candidatura) {
        // TODO - implement UC5_Controller.removeCandidaturaDaListaCandidaturasPorAvaliarDoFAE
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param avaliacoes
     */
    public void guardarAvaliacoes(Avaliacao[] avaliacoes) {
        // TODO - implement UC5_Controller.guardarAvaliacoes
        throw new UnsupportedOperationException();
    }

  

    public void mostrarListaEventos() {

    }

}
