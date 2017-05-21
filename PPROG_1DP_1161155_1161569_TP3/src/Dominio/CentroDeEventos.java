package Dominio;

import java.util.ArrayList;

public class CentroDeEventos {

    private static RegistoUtilizadores REGISTO_UTILIZADORES = new RegistoUtilizadores();
    private static RegistoDeEventos REGISTO_DE_EVENTOS = new RegistoDeEventos();
    private static ListGestorDeEventos LIST_GESTOR_DE_EVENTOS = new ListGestorDeEventos();
    private static RegistoDeAlgoritmos REGISTO_DE_ALGORITMOS = new RegistoDeAlgoritmos();

    public CentroDeEventos() {

    }

    /**
     *
     * @param nomeUtilizador
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

    public RegistoDeEventos getRegistoEventos() {
        return CentroDeEventos.REGISTO_DE_EVENTOS;
    }

    public RegistoUtilizadores getRegistoUtilizadores() {
        return CentroDeEventos.REGISTO_UTILIZADORES;
    }

    public ListAtribuicoes getListAtribuicoes() {
        // TODO - implement CentroDeEventos.getListAtribuicoes
        throw new UnsupportedOperationException();
    }

    public void registarAtribuicao(Evento evento, ArrayList<Atribuicao> atribuicao) {

        REGISTO_DE_EVENTOS.registarAtribuicaoDeEvento(evento, atribuicao);

    }

}
