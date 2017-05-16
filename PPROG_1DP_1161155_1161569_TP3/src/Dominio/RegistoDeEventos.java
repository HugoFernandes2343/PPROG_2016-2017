package Dominio;

import java.util.ArrayList;



public class RegistoDeEventos {

    private ArrayList<Evento> evento;

    /**
     *
     * @param evento
     */
    public void ValidarEvento(Evento evento) {
        // TODO - implement RegistoDeEventos.criarEvento
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param evento
     */
    public void addEvento(Evento evento) {
        this.evento.add(evento);
    }

    /**
     *
     * @param nomeOrganizador
     */
    public Evento[] procurarEventosDoOrganizador(Organizador nomeOrganizador) {
        // TODO - implement RegistoDeEventos.procurarEventos
        throw new UnsupportedOperationException();
    }

    public Evento[] procurarEventosDentroDaDataDeSubmissao() {
        // TODO - implement RegistoDeEventos.procurarEventosComFAEDentroDaDataDeSubmissao
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param FAE
     */
    public Evento[] mostrarListaEventosDoFAE(FAE FAE) {
        // TODO - implement RegistoDeEventos.mostrarListaEventosDoFAEComCandidaturasProntasParaAvaliar
        throw new UnsupportedOperationException();
    }

}
