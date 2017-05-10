package Dominio;


import Dominio.FAE;
import Dominio.ListCandidaturas;
import Dominio.ListFAE;
import Dominio.ListOrganizadores;
import Dominio.Local;
import java.util.ArrayList;

public class Evento {

	private Local local;
	private String titulo;
	private String descriçao;
	private String dataInicio;
	private String dataFim;
	private String dataLimiteCandidaturas;
	private ListCandidaturas listCandidaturas;
	private ListAtribuicoes listAtribuicoes;
	private ListFAE listFAE;
	private ListOrganizadores listOrganizadores;

	public void novoOrganizador() {
		// TODO - implement Evento.novoOrganizador
		throw new UnsupportedOperationException();
	}

	public void novoFAE() {
		// TODO - implement Evento.novoFAE
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param FAE
	 */
	public Candidatura[] mostrarListaCandidaturasPorAvaliarDoFAEValidas(FAE FAE) {
		// TODO - implement Evento.mostrarListaCandidaturasPorAvaliarDoFAEValidas
		throw new UnsupportedOperationException();
	}

	public boolean existemCandidaturasPorAtribuir() {
		// TODO - implement Evento.existemCandidaturasPorAtribuir
		throw new UnsupportedOperationException();
	}

	public ArrayList<Atribuicao> gerarAtribuicoes() {
		// TODO - implement Evento.gerarAtribuicoes
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nomeOrganizador
	 */
	public boolean verificarSeOrganizadorPertence(String nomeOrganizador) {
		// TODO - implement Evento.verificarSeOrganizadorPertence
		throw new UnsupportedOperationException();
	}

	public void adicionarAoArrayDeEventosAMostrar() {
		// TODO - implement Evento.adicionarAoArrayDeEventosAMostrar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param descricão
	 */
	public void setDescrição(String descricão) {
		// TODO - implement Evento.setDescrição
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dataInicio
	 */
	public String setDataInicio(String dataInicio) {
		// TODO - implement Evento.setDataInicio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dataFim
	 */
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	/**
	 * 
	 * @param nomeLocal
	 */
	public void setNomeLocal(String nomeLocal) {
		// TODO - implement Evento.setNomeLocal
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dataLimiteSubmissaoCandidaturas
	 */
	public String setDataLimiteSubmissaoCandidaturas(String dataLimiteSubmissaoCandidaturas) {
		// TODO - implement Evento.setDataLimiteSubmissaoCandidaturas
		throw new UnsupportedOperationException();
	}

	public boolean verifcarFAEEData() {
		// TODO - implement Evento.verifcarFAEEData
		throw new UnsupportedOperationException();
	}

	public boolean validarDataFimAtribuicoes() {
		// TODO - implement Evento.validarDataFimAtribuicoes
		throw new UnsupportedOperationException();
	}

	public boolean validarDataAvaliacoes() {
		// TODO - implement Evento.validarDataAvaliacoes
		throw new UnsupportedOperationException();
	}

	public boolean validarCandidaturasPorAvaliar() {
		// TODO - implement Evento.validarCandidaturasPorAvaliar
		throw new UnsupportedOperationException();
	}

	public ListCandidaturas getListCandidaturas() {
		return this.listCandidaturas;
	}

	public boolean validaFAENaoOrganizador() {
		// TODO - implement Evento.validaFAENaoOrganizador
		throw new UnsupportedOperationException();
	}

	public ListFAE getListFAE() {
		return this.listFAE;
	}

	public ListOrganizadores getListOrganizadores() {
		return this.listOrganizadores;
	}

	public boolean validaDataFimSubmissoes() {
		// TODO - implement Evento.validaDataFimSubmissoes
		throw new UnsupportedOperationException();
	}

	public ListAtribuicoes getListAtribuicoes() {
		return this.listAtribuicoes;
	}

}