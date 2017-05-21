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
    private static ListCandidaturas LISTA_CANDIDATURAS;
    private static ListAtribuicoes LISTA_ATRIBUICOES;
    private static ListFAE LISTA_FAE;
    private static ListOrganizadores LISTA_ORGANIZADORES;

    public Evento() {
        this.titulo = DADOS_POR_DEFENIR;
        this.descricao = DADOS_POR_DEFENIR;
        this.local = DADOS_POR_DEFENIR;
        this.dataFim = DADOS_POR_DEFENIR;
        this.dataInicio = DADOS_POR_DEFENIR;
        this.dataLimiteCandidaturas = DADOS_POR_DEFENIR;
    }

    /**
     *
     * @param titulo titulo do evento
     * @param descricao descricao do evento
     * @param local local onde se vai realizar o evento
     * @param dataInicio data do inico do evento
     * @param dataFim data de fim do evento
     * @param dataLimiteCandidaturas data limite para a criacao de candidaturas
     *
     */
    public void defenirEvento(String titulo, String descricao, String local, String dataInicio, String dataFim, String dataLimiteCandidaturas) {
        setTitulo(titulo);
        setDescricao(descricao);
        setLocal(local);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setDataLimiteCandidaturas(dataLimiteCandidaturas);
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
     * @param FAE FAE que esta a utilizar
     * @return devolve uma lista de atribuicoes para o FAE
     */
    public ArrayList<Atribuicao> getCandidaturasPorAvaliarDoFAE(FAE FAE) {
        ArrayList<Atribuicao> atribuicao = LISTA_ATRIBUICOES.getCandidaturasPorAvaliarDoFAE(FAE);
        return atribuicao;
    }

    public boolean existemCandidaturasPorAtribuir() {
        // TODO - implement Evento.existemCandidaturasPorAtribuir
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param organizador
     */
    public boolean verificarOrganizador(Organizador organizador) {
        // TODO - implement Evento.verificarSeOrganizadorPertence
        throw new UnsupportedOperationException();
    }

    /**
     * Devolve a lista de atribuicoes do evento
     *
     * @return devolve a lista de atribuicoes do evento
     */
    public ListAtribuicoes getAtribuicoes() {
        return LISTA_ATRIBUICOES;
    }

    /**
     * Devolve a descricao do evento
     * @return descricao do evento
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Devolve a data de inicio do evento
     * @return data de Inicio do evento
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Devolve a data de fim do evento
     * @return data de fim do evento
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     *  Devolve a data de limite de submissao de candidatruas
     * @return data Limite Candidaturas do evento
     */
    public String getDataLimiteCandidaturas() {
        return dataLimiteCandidaturas;
    }

    /**
     * Devolve a lista de FAE do evento
     * @return lista de FAE do evento
     */
    public ListFAE getListFAE() {
        return LISTA_FAE;
    }

    /**
     * Devolve a lista de organizadores do evento
     *
     * @return lista de organizadores do evento
     */
    public ListOrganizadores getListOrganizadores() {
        return LISTA_ORGANIZADORES;
    }

    /**
     * Devolve a lista de atribuicoes do evento
     *
     * @return lista de atribuicoes do evento
     */
    public ListAtribuicoes getListAtribuicoes() {
        return LISTA_ATRIBUICOES;
    }

    /**
     * Devolve o titulo de um evento
     *
     * @return titulo do evento
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o titulo de um evento
     *
     * @param titulo titulo a colocar no evento
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Define a descricao de um evento
     *
     * @param descricao descricao a colocar no evento
     */
    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Define a data de inicio de um evento
     *
     * @param dataInicio data de inicio a colocar no evento
     */
    private void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Define a data de fim de um evento
     *
     * @param dataFim data de fim a colocar no evento
     */
    private void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Define o local de um evento
     *
     * @param nomeLocal local a colocar no evento
     */
    private void setLocal(String local) {
        this.local = local;
    }

    /**
     * Define um limite para a submissao de candidaturas para um dado evento
     *
     * @param dataLimiteCandidaturas data de limite de submissao de candidaturas
     * a defenir num evento
     */
    private void setDataLimiteCandidaturas(String dataLimiteCandidaturas) {
        this.dataLimiteCandidaturas = dataLimiteCandidaturas;
    }

    public boolean verifcarFAE(FAE FAE) {
        // TODO - implement Evento.verifcarFAEEData
        throw new UnsupportedOperationException();
    }

    public ListCandidaturas getListCandidaturas() {
        return LISTA_CANDIDATURAS;
    }

    public boolean validaFAENaoOrganizador() {
        // TODO - implement Evento.validaFAENaoOrganizador
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return
     */
    public boolean validaDataFimSubmissoes() {
        // TODO - implement Evento.validaDataFimSubmissoes
        throw new UnsupportedOperationException();
    }

}
