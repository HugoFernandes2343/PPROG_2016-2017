package Dominio;

import java.util.ArrayList;

<<<<<<< HEAD
public class RegistoDeEventos {

	private Collection<Evento> evento;
        
	/**
	 * 
	 * @param tipoEvento
	 */
	public void criarEvento(String tipoEvento) {
		// TODO - implement RegistoDeEventos.criarEvento
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param evento
	 */
	public void registarEventos(Evento evento) {
		// TODO - implement RegistoDeEventos.registarEventos
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param evento
	 */
	public void validarEvento(Evento evento) {
		// TODO - implement RegistoDeEventos.validarEvento
		throw new UnsupportedOperationException();
	}
=======
>>>>>>> origin/master


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
