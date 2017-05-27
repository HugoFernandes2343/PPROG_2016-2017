package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class RegistoDeEventos implements Serializable {

    private ArrayList<Evento> LISTA_EVENTOS;

    public RegistoDeEventos() {
        this.LISTA_EVENTOS = new ArrayList();
    }

    public ArrayList<Evento> getListaEventos() {
        return LISTA_EVENTOS;
    }

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

    public void registarAtribuicaoDeEvento(Evento evento, ArrayList<Atribuicao> atribuicao) {
        for (int i = 0; i < LISTA_EVENTOS.size(); i++) {
            Evento eventoRegistado = LISTA_EVENTOS.get(i);
            if (eventoRegistado.equals(evento)) {
                LISTA_EVENTOS.get(i).setListAtribuicoes(atribuicao);
            }
        }
    }

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

    public void registarCandidatura(Evento evento, Candidatura candidatura) {
        for (int i = 0; i < LISTA_EVENTOS.size(); i++) {
            Evento eventoRegistado = LISTA_EVENTOS.get(i);
            if (eventoRegistado.equals(evento)) {
                LISTA_EVENTOS.get(i).registaCandidatura(candidatura);
            }
        }
    }
}
