package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class CentroDeEventos implements Serializable {

    private RegistoUtilizadores REGISTO_UTILIZADORES;
    private RegistoDeEventos REGISTO_DE_EVENTOS;
    private ListGestorDeEventos LIST_GESTOR_DE_EVENTOS;
    private static RegistoDeAlgoritmos REGISTO_DE_ALGORITMOS;

    public CentroDeEventos() {
    this.REGISTO_UTILIZADORES=new RegistoUtilizadores();  
    this.LIST_GESTOR_DE_EVENTOS=new ListGestorDeEventos();
    this.REGISTO_DE_EVENTOS=new RegistoDeEventos();
    this.REGISTO_DE_ALGORITMOS=new RegistoDeAlgoritmos();
    }

    /**
     *
     * @param nomeOuEmail
     */
    public static Utilizador procurarUtilizador(String nomeOuEmail) {
        // TODO - implement CentroDeEventos.procurarUtilizador
        throw new UnsupportedOperationException();
    }

    public ArrayList<Object> procurarAlgoritmosDeAtribuicao() {
        return REGISTO_DE_ALGORITMOS.getAlgoritmosDeAtribuicao();
    }

    public static Evento[] procurarEventosDentroDaDataDeSubmissao() {
        // TODO - implement CentroDeEventos.procurarEventosComFAEDentroDaDataDeSubmissao
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param nomeOrganizador
     */
    public ArrayList<Evento> listarEventosDoOrganizador(Organizador organizador) {
        // TODO - implement CentroDeEventos.listarEventosDoOrganizadorValidosComCandidaturasPorAtribuir
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param FAE
     */
    public Evento[] listarEventosDoFAE(FAE FAE) {
        // TODO - implement CentroDeEventos.mostrarListaEventosDoFAEComCandidaturasProntasParaAvaliar
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param evento
     */
    public void adicionarNaLista(Evento evento) {
        // TODO - implement CentroDeEventos.adicionarNaLista
        throw new UnsupportedOperationException();
    }

    /**
     * Devolve o registo de eventos
     *
     * @return registo de eventos
     */
    public RegistoDeEventos getRegistoEventos() {
        return REGISTO_DE_EVENTOS;
    }

    /**
     * Devolve o registo de utilizadores
     *
     * @return registo de utilizadores
     */
    public ArrayList<Utilizador> getRegistoUtilizadores() {
        return REGISTO_UTILIZADORES.getListUtilizadores();
    }

    public void setRegistoUtilizadores(ArrayList<Utilizador> userList) {
        REGISTO_UTILIZADORES.setListUtilizadores(userList);
    }

    public void setListGestorDeEventos(ArrayList<GestorDeEventos> listaGestores) {
        LIST_GESTOR_DE_EVENTOS.setListaDeGestores(listaGestores);
    }

    public ListAtribuicoes getListAtribuicoes() {
        // TODO - implement CentroDeEventos.getListAtribuicoes
        throw new UnsupportedOperationException();
    }

    public void registarAtribuicao(Evento evento, ArrayList<Atribuicao> atribuicao) {

        REGISTO_DE_EVENTOS.registarAtribuicaoDeEvento(evento, atribuicao);

    }

}
