package Dominio;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Evento implements Serializable {

    private String local;
    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String dataLimiteCandidaturas;
    private ListCandidaturas LISTA_CANDIDATURAS;
    private ListAtribuicoes LISTA_ATRIBUICOES;
    private ListFAE LISTA_FAE;
    private ListOrganizadores LISTA_ORGANIZADORES;
    private static final String DADOS_POR_DEFENIR = "nao definido";

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
    public Evento(String titulo, String descricao, String local, String dataInicio, String dataFim, String dataLimiteCandidaturas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
        this.dataLimiteCandidaturas = dataLimiteCandidaturas;
        this.LISTA_ATRIBUICOES = new ListAtribuicoes();
        this.LISTA_CANDIDATURAS = new ListCandidaturas();
        this.LISTA_FAE = new ListFAE();
        this.LISTA_ORGANIZADORES = new ListOrganizadores();
    }

    public void addOrganizadores(ArrayList<Organizador> organizadores) {
        LISTA_ORGANIZADORES.setOrganizadores(organizadores);
    }

    public void addFAEs(ArrayList<FAE> FAEsARegistar) {
        LISTA_FAE.setListaFAE(FAEsARegistar);
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
        boolean cond = false;
        ArrayList<Atribuicao> atribuicoes = LISTA_ATRIBUICOES.getAtribuicoes();
        if (atribuicoes.size() > 0) {
            cond = true;
            return cond;
        }
        return cond;
    }

    /**
     *
     * @param organizador
     */
    public ArrayList<Atribuicao> getListaAtribuicoes() {
        return LISTA_ATRIBUICOES.getAtribuicoes();
    }

    /**
     *
     * @param organizador
     * @return >>>>>>> a8676aec20ba9fb323bc2e2b75bbbdaed56424d9
     */
    public boolean verificarOrganizador(Organizador organizador) {
        return LISTA_ORGANIZADORES.validarOrganizador(organizador);
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
     *
     * @return descricao do evento
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Devolve a data de inicio do evento
     *
     * @return data de Inicio do evento
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Devolve a data de fim do evento
     *
     * @return data de fim do evento
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * Devolve a data de limite de submissao de candidatruas
     *
     * @return data Limite Candidaturas do evento
     */
    public String getDataLimiteCandidaturas() {
        return dataLimiteCandidaturas;
    }

    /**
     * Devolve a lista de FAE do evento
     *
     * @return lista de FAE do evento
     */
    public ArrayList<FAE> getListFAE() {
        return LISTA_FAE.getListaDeFAE();
    }

    public boolean verifcarFAE(FAE FAE) {
        // TODO - implement Evento.verifcarFAEEData
        throw new UnsupportedOperationException();
    }

    public ArrayList<Candidatura> getListCandidaturas() {
        return LISTA_CANDIDATURAS.getListaDeCandidaturas();
    }

    public boolean validaFAENaoOrganizador() {
        // TODO - implement Evento.validaFAENaoOrganizador
        throw new UnsupportedOperationException();
    }

    /**
     * Devolve a lista de organizadores do evento
     *
     * @return lista de organizadores do evento
     */
    public ListOrganizadores getListOrganizadores() {
        return LISTA_ORGANIZADORES;
    }

    public boolean validaDataFimSubmissoes() {
        boolean cond = false;
        Date dataAtual = new Date();
        Date dataLimiteSubissao = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            dataLimiteSubissao = format.parse(dataLimiteCandidaturas);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        if (dataLimiteSubissao.before(dataAtual)) {
            cond = true;
            return cond;
        }

        return cond;

    }

    /**
     * Devolve a lista de atribuicoes do evento
     *
     * @return lista de atribuicoes do evento
     */
    public ListAtribuicoes getListAtribuicoes() {

        return LISTA_ATRIBUICOES;

    }

    public void setListAtribuicoes(ArrayList<Atribuicao> atribuicoes) {
        LISTA_ATRIBUICOES.guardarAtribuicao(atribuicoes);
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

    public boolean verificarFAE(FAE FAE) {
        // TODO - implement Evento.verifcarFAEEData
        throw new UnsupportedOperationException();
    }
}
