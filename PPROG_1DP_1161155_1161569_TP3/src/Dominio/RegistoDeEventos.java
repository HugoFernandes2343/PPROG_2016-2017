package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class RegistoDeEventos implements Serializable {

    private ArrayList<Evento> LISTA_EVENTOS;

    /**
     * construtor do registo de eventos
     */
    public RegistoDeEventos() {
        this.LISTA_EVENTOS = new ArrayList();
    }

    /**
     * Devolve lista de eventos
     *
     * @return lista de eventos
     */
    public ArrayList<Evento> getListaEventos() {
        return LISTA_EVENTOS;
    }

    /**
     * procurar eventos do organizador
     *
     * @param organizador utilizador da app
     * @return lista de eventos do organizador
     */
    public ArrayList<Evento> procurarEventosPosSubmissaoDoOrganizador(Organizador organizador) {
        ArrayList<Evento> eventosDoOrganizador = new ArrayList();
        for (int i = 0; i < LISTA_EVENTOS.size(); i++) {
            Evento evento = LISTA_EVENTOS.get(i);
            if (evento.verificarOrganizador(organizador) && evento.validaDataFimSubmissoes() && evento.existemCandidaturasPorAtribuir()) {
                eventosDoOrganizador.add(evento);
            }
        }
        return eventosDoOrganizador;
    }

    /**
     * Adiciona um novo evento ao registo
     *
     * @param evento avento a adicionar
     */
    public void addEvento(Evento evento) {
        LISTA_EVENTOS.add(evento);
    }

    /**
     * Mostra todos os eventos em que o FAE que esta a usar o programa é FAE
     *
     * @param FAE FAE que esta a utilizar o programa
     * @return Lista de eventos em qual o utilizador é FAE
     */
    public ArrayList<Evento> mostrarListaEventosDoFAE(FAE FAE) {
        ArrayList<Evento> listaEventosDoFAE = new ArrayList();
        ArrayList<FAE> listaFAE = new ArrayList();
        for (int i = 0; i < LISTA_EVENTOS.size(); i++) {
            listaFAE = LISTA_EVENTOS.get(i).getListFAE();
            for (int j = 0; j < listaFAE.size(); j++) {
                if (listaFAE.get(j).equals(FAE)) {
                    listaEventosDoFAE.add(LISTA_EVENTOS.get(i));
                }
            }
        }
        return listaEventosDoFAE;
    }

    /**
     * Guarda permanentemente a atribuicao num evento
     *
     * @param evento evento da atribuicao
     * @param atribuicao objecto a guardar
     */
    public void registarAtribuicaoDeEvento(Evento evento, ArrayList<Atribuicao> atribuicao) {
        for (int i = 0; i < LISTA_EVENTOS.size(); i++) {
            Evento eventoRegistado = LISTA_EVENTOS.get(i);
            if (eventoRegistado.equals(evento)) {
                LISTA_EVENTOS.get(i).setListAtribuicoes(atribuicao);
            }
        }
    }

    /**
     * Valida se o utilizador nao é FAE e organizador ao mesmo tempo
     *
     * @param utilizador
     * @return boolean que valida ou nao que nao é ambos
     */
    public boolean verificarOrganizadorOuFAE(Utilizador utilizador) {
        FAE FAE = new FAE(utilizador);
        Organizador org = new Organizador(utilizador);
        for (int i = 0; i < LISTA_EVENTOS.size(); i++) {
            Evento e1 = (Evento) LISTA_EVENTOS.get(i);
            if (e1.verifcarFAE(FAE) || e1.verificarOrganizador(org)) {
                return true;
            }
        }
        return false;
    }

    /**
     * guardar permantentemetne avaliacao
     *
     * @param evento evento da atribuicao
     * @param atribuicao atribuicao da avaliacao
     * @param avaliacao objeto a ser gravado
     */
    public void registarAvaliacao(Evento evento, Atribuicao atribuicao, Avaliacao avaliacao) {
        for (int i = 0; i < LISTA_EVENTOS.size(); i++) {
            Evento eventoRegistado = LISTA_EVENTOS.get(i);
            if (eventoRegistado.equals(evento)) {
                ArrayList<Atribuicao> listaAtribuicoes = eventoRegistado.getListAtribuicoes().getAtribuicoes();
                for (int j = 0; j < listaAtribuicoes.size(); j++) {
                    Atribuicao atribuicaoRegistada = listaAtribuicoes.get(j);
                    if (atribuicaoRegistada.equals(atribuicao)) {
                        listaAtribuicoes.get(j).setAvaliacao(avaliacao);
                    }
                }
            }
        }
    }

    /**
     * guardar permanentemente candidatura
     *
     * @param evento evento da candidatura
     * @param candidatura objecto a guardar
     */
    public void registarCandidatura(Evento evento, Candidatura candidatura) {
        for (int i = 0; i < LISTA_EVENTOS.size(); i++) {
            Evento eventoRegistado = LISTA_EVENTOS.get(i);
            if (eventoRegistado.equals(evento)) {
                LISTA_EVENTOS.get(i).registaCandidatura(candidatura);
            }
        }
    }
}
