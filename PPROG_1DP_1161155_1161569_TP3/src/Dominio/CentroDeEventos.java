package Dominio;


import Dominio.Congresso;
import Dominio.Evento;
import Dominio.FAE;
import Dominio.ListGestorDeEventros;
import Dominio.Organizador;
import Dominio.RegistoDeEventos;
import Dominio.RegistoUtilizadores;
import Dominio.Utilizador;
import java.util.ArrayList;



public class CentroDeEventos {

	private RegistoUtilizadores registoUtilizadores;
	private RegistoDeEventos registoDeEventos;
	private ListGestorDeEventros listGestorDeEventos;

	/**
	 * 
	 * @param nomeUtilizador
	 */
	public Utilizador procurarUtilizador(int nomeUtilizador) {
		// TODO - implement CentroDeEventos.procurarUtilizador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nomeUtilizador
	 */
	public static Utilizador procurarUtilizador(String nomeUtilizador) {
		// TODO - implement CentroDeEventos.procurarUtilizador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tipoEvento
	 */
	public void criarEvento(String tipoEvento) {
		// TODO - implement CentroDeEventos.criarEvento
		throw new UnsupportedOperationException();
	}

	public static Evento[] procurarEventosComFAEDentroDaDataDeSubmissao() {
		// TODO - implement CentroDeEventos.procurarEventosComFAEDentroDaDataDeSubmissao
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nomeOrganizador
	 */
	public ArrayList<Evento> listarEventosDoOrganizadorValidosComCandidaturasPorAtribuir(String nomeOrganizador) {
		// TODO - implement CentroDeEventos.listarEventosDoOrganizadorValidosComCandidaturasPorAtribuir
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param FAE
	 */
	public Evento[] mostrarListaEventosDoFAEComCandidaturasProntasParaAvaliar(FAE FAE) {
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
	 * 
	 * @param organizador
	 */
	public ArrayList<Congresso> mostrarCongressosDoOrganizador(Organizador organizador) {
		// TODO - implement CentroDeEventos.mostrarCongressosDoOrganizador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pertence
	 */
	public void guardarComoCongressoDoUtilizador(boolean pertence) {
		// TODO - implement CentroDeEventos.guardarComoCongressoDoUtilizador
		throw new UnsupportedOperationException();
	}

	public RegistoDeEventos getRegistoEventos() {
		// TODO - implement CentroDeEventos.getRegistoEventos
		throw new UnsupportedOperationException();
	}

	public RegistoUtilizadores getRegistoUtilizadores() {
		return this.registoUtilizadores;
	}

	public ListAtribuicoes getListAtribuicoes() {
		// TODO - implement CentroDeEventos.getListAtribuicoes
		throw new UnsupportedOperationException();
	}

	

	public ListGestorDeEventros getListGestorDeEventos() {
		return this.listGestorDeEventos;
	}
}