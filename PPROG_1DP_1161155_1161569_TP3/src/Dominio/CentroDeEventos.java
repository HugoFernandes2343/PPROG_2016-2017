package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class CentroDeEventos implements Serializable {

    private RegistoUtilizadores REGISTO_UTILIZADORES;
    private RegistoDeEventos REGISTO_DE_EVENTOS;
    private ListGestorDeEventos LIST_GESTOR_DE_EVENTOS;
    private static RegistoDeAlgoritmos REGISTO_DE_ALGORITMOS;

    public CentroDeEventos() {
        this.REGISTO_UTILIZADORES = new RegistoUtilizadores();
        this.LIST_GESTOR_DE_EVENTOS = new ListGestorDeEventos();
        this.REGISTO_DE_EVENTOS = new RegistoDeEventos();
        this.REGISTO_DE_ALGORITMOS = new RegistoDeAlgoritmos();
    }

    /**
     *
     * @param nomeOuEmail
     */
    public Utilizador procurarUtilizador(String usernameOuEmail, String password) {
        return REGISTO_UTILIZADORES.procurarUtilizador(usernameOuEmail, password);
    }

    public ArrayList<Object> procurarAlgoritmosDeAtribuicao() {
        return REGISTO_DE_ALGORITMOS.getAlgoritmosDeAtribuicao();
    }

    public void registarEvento(Evento evento) {
        REGISTO_DE_EVENTOS.addEvento(evento);
    }

    /**
     * Devolve o registo de eventos
     *
     * @return registo de eventos
     */
    public RegistoDeEventos getRegistoEventos() {
        return REGISTO_DE_EVENTOS;
    }

    public boolean verificarRepresentante(Utilizador utilizador) {
        GestorDeEventos gestor = new GestorDeEventos(utilizador);
        if (LIST_GESTOR_DE_EVENTOS.validarGestorDeEventos(gestor)) {
            return true;
        }
        if (REGISTO_DE_EVENTOS.verificarOrganizadorOuFAE(utilizador)) {
            return true;
        }
        return false;
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

    public void registarAtribuicao(Evento evento, ArrayList<Atribuicao> atribuicao) {

        REGISTO_DE_EVENTOS.registarAtribuicaoDeEvento(evento, atribuicao);
    }

    public void registarAvaliacao(Evento evento, Atribuicao atribuicao, Avaliacao avaliacao) {

        REGISTO_DE_EVENTOS.registarAvaliacao(evento, atribuicao, avaliacao);

    }

    public void registarCandidatura(Evento evento, Candidatura candidatura) {
        REGISTO_DE_EVENTOS.registarCandidatura(evento, candidatura);
    }
}
