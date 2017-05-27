package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class CentroDeEventos implements Serializable {

    private RegistoUtilizadores REGISTO_UTILIZADORES;
    private RegistoDeEventos REGISTO_DE_EVENTOS;
    private ListGestorDeEventos LIST_GESTOR_DE_EVENTOS;
    private static RegistoDeAlgoritmos REGISTO_DE_ALGORITMOS;

    /**
     * Construtor de centro de eventos
     */
    public CentroDeEventos() {
        this.REGISTO_UTILIZADORES = new RegistoUtilizadores();
        this.LIST_GESTOR_DE_EVENTOS = new ListGestorDeEventos();
        this.REGISTO_DE_EVENTOS = new RegistoDeEventos();
        this.REGISTO_DE_ALGORITMOS = new RegistoDeAlgoritmos();
    }

    /**
     * @param usernameOuEmail user name ou email de quem tenta fazer login
     * @param password password de que tenta fazer login
     * @return utilizadro
     */
    public Utilizador procurarUtilizador(String usernameOuEmail, String password) {
        return REGISTO_UTILIZADORES.procurarUtilizador(usernameOuEmail, password);
    }

    /**
     * procurar algoritmos
     *
     * @return lista de algoritmos
     */
    public ArrayList<Object> procurarAlgoritmosDeAtribuicao() {
        return REGISTO_DE_ALGORITMOS.getAlgoritmosDeAtribuicao();
    }

    /**
     * Guarda permanentemente o evento
     *
     * @param evento
     */
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

    /**
     * @param utilizador utilizador que fez login
     * @return boolean que diz se o representante é valido
     */
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

    /**
     * Definie resisto de utilizadores
     *
     * @param userList lista de utilizadores a ser guardada
     */
    public void setRegistoUtilizadores(ArrayList<Utilizador> userList) {
        REGISTO_UTILIZADORES.setListUtilizadores(userList);
    }

    /**
     * Defenir registo de gestores
     *
     * @param listaGestores lista de gestores a ser guardada
     */
    public void setListGestorDeEventos(ArrayList<GestorDeEventos> listaGestores) {
        LIST_GESTOR_DE_EVENTOS.setListaDeGestores(listaGestores);
    }

    /**
     * guarda permanentemente a atribuicao
     *
     * @param evento evento a que a atribuicao pertence
     * @param atribuicao objecto a guardar
     */
    public void registarAtribuicao(Evento evento, ArrayList<Atribuicao> atribuicao) {

        REGISTO_DE_EVENTOS.registarAtribuicaoDeEvento(evento, atribuicao);
    }

    /**
     * Guardar permanentemente a avaliacao
     *
     * @param evento evento a que a atriubicao pertence
     * @param atribuicao atribuicao a que a avaliacao pertence
     * @param avaliacao objecto a guardar
     */
    public void registarAvaliacao(Evento evento, Atribuicao atribuicao, Avaliacao avaliacao) {

        REGISTO_DE_EVENTOS.registarAvaliacao(evento, atribuicao, avaliacao);

    }

    /**
     * Guardar permanentemente a candidatura
     *
     * @param evento evento a que a candidatura pertence
     * @param candidatura objecto a guardar
     */
    public void registarCandidatura(Evento evento, Candidatura candidatura) {
        REGISTO_DE_EVENTOS.registarCandidatura(evento, candidatura);
    }
}
