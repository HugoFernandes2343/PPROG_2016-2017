package Dominio;



import java.util.ArrayList;



public class CentroDeEventos {

	private RegistoUtilizadores registoUtilizadores;
	private RegistoDeEventos registoDeEventos;
	private ListGestorDeEventros listGestorDeEventos;


	/**
	 * 
	 * @param nomeUtilizador
	 */
	public static Utilizador procurarUtilizador(String nomeOuEmail) {
		// TODO - implement CentroDeEventos.procurarUtilizador
		throw new UnsupportedOperationException();
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
		return this.registoDeEventos;
	}

	public RegistoUtilizadores getRegistoUtilizadores() {
		return this.registoUtilizadores;
	}

	public ListAtribuicoes getListAtribuicoes() {
		// TODO - implement CentroDeEventos.getListAtribuicoes
		throw new UnsupportedOperationException();
	}

}