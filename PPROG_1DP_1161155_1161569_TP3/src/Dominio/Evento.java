package Dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    public ArrayList<Candidatura> getCandidaturasPorAvaliarDoFAE(FAE FAE) {
        ArrayList<Candidatura> candidaturas = LISTA_ATRIBUICOES.getCandidaturasPorAvaliarDoFAE(FAE);
        return candidaturas;
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

    public ArrayList<Atribuicao> getListaAtribuicoes() {
        return LISTA_ATRIBUICOES.getAtribuicoes();
    }

    /**
     *
     * @param organizador
     * @return
     */
    public boolean verificarOrganizador(Organizador organizador) {
        return LISTA_ORGANIZADORES.validarOrganizador(organizador);
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

    public ArrayList<Candidatura> getListCandidaturas() {
        return LISTA_CANDIDATURAS.getListaDeCandidaturas();
    }

    public boolean validaFAENaoOrganizador() {
        // TODO - implement Evento.validaFAENaoOrganizador
        throw new UnsupportedOperationException();
    }

    public ArrayList<FAE> getListFAE() {
        return LISTA_FAE.getListaDeFAE();
    }

    public ListOrganizadores getListOrganizadores() {
        return this.LISTA_ORGANIZADORES;
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

    public ListAtribuicoes getListAtribuicoes() {
        return this.LISTA_ATRIBUICOES;
    }

    public void setListAtribuicoes(ArrayList<Atribuicao> atribuicoes) {
        LISTA_ATRIBUICOES.guardarAtribuicao(atribuicoes);
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
