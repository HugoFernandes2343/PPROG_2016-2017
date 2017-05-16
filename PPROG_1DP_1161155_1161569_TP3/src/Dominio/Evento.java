package Dominio;

import java.util.ArrayList;

public class Evento {

    private String local;
    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String dataLimiteCandidaturas;
    private static String DADOS_POR_DEFENIR = "nao definido";
    private ListCandidaturas listCandidaturas;
    private ListAtribuicoes listAtribuicoes;
    private ListFAE listFAE;
    private ListOrganizadores listOrganizadores;

    public Evento() {
        this.titulo = DADOS_POR_DEFENIR;
        this.descricao = DADOS_POR_DEFENIR;
        this.local = DADOS_POR_DEFENIR;
        this.dataFim = DADOS_POR_DEFENIR;
        this.dataInicio = DADOS_POR_DEFENIR;
    }

    public void addOrganizador() {
        // TODO - implement Evento.novoOrganizador
        throw new UnsupportedOperationException();
    }

    public void addFAE() {
        // TODO - implement Evento.novoFAE
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param FAE
     */
    public Candidatura[] mostrarListaCandidaturasPorAvaliarDoFAE(FAE FAE) {
        // TODO - implement Evento.mostrarListaCandidaturasPorAvaliarDoFAEValidas
        throw new UnsupportedOperationException();
    }

    public boolean existemCandidaturasPorAtribuir() {
        // TODO - implement Evento.existemCandidaturasPorAtribuir
        throw new UnsupportedOperationException();
    }

    public ArrayList<Atribuicao> getAtribuicoes() {
        return null;
    }

    /**
     *
     * @param nomeOrganizador
     */
    public boolean verificarOrganizador(Organizador organizador) {
        // TODO - implement Evento.verificarSeOrganizadorPertence
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     * @param dataInicio
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
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
    public void setLocal(String local) {
        // TODO - implement Evento.setNomeLocal
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param dataLimiteCandidaturas
     */
    public void setDataLimiteSubmissaoCandidaturas(String dataLimiteCandidaturas) {
        this.setDataLimiteCandidaturas(dataLimiteCandidaturas);
        
    }

    public boolean verifcarFAE(FAE FAE) {
        // TODO - implement Evento.verifcarFAEEData
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

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @return the dataFim
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * @return the dataLimiteCandidaturas
     */
    public String getDataLimiteCandidaturas() {
        return dataLimiteCandidaturas;
    }

    /**
     * @param dataLimiteCandidaturas the dataLimiteCandidaturas to set
     */
    public void setDataLimiteCandidaturas(String dataLimiteCandidaturas) {
        this.dataLimiteCandidaturas = dataLimiteCandidaturas;
    }

}
