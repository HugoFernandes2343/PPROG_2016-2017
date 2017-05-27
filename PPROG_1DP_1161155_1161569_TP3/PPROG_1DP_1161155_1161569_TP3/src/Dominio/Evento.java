package Dominio;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Hugo FErnandes; Hugo Carvalho
 */
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

    /**
     * adiciona organizadores á lista de organizadores
     *
     * @param organizadores arraylist de organizadores para adicionar
     */
    public void addOrganizadores(ArrayList<Organizador> organizadores) {
        LISTA_ORGANIZADORES.setOrganizadores(organizadores);
    }

    /**
     * adiciona FAE a lista de FAE
     *
     * @param FAEsARegistar arraylist de FAE a adicionar
     */
    public void addFAEs(ArrayList<FAE> FAEsARegistar) {
        LISTA_FAE.setListaFAE(FAEsARegistar);
    }

    /**
     * Verifica se todas as candidaturas ja foram atribuidas
     *
     * @return boolean a confirmar ou negar que ha candidaturas por atribuir
     */
    public boolean existemCandidaturasPorAtribuir() {
        boolean cond = false;
        ArrayList<Atribuicao> atribuicoes = LISTA_ATRIBUICOES.getAtribuicoes();
        ArrayList<Candidatura> candidaturas = LISTA_CANDIDATURAS.getListaDeCandidaturas();
        if (atribuicoes.size() <= 0 && candidaturas.size() > 0) {
            cond = true;
            return cond;
        }
        return cond;
    }

    /**
     * Devolve lista de atribuicoes
     *
     * @return lista de atribuicoes
     */
    public ArrayList<Atribuicao> getListaAtribuicoes() {
        return LISTA_ATRIBUICOES.getAtribuicoes();
    }

    /**
     * verifica o organizador
     *
     * @param organizador objecto a ser validado
     * @return boolean que confirma ou nao a validade do organizador
     */
    public boolean verificarOrganizador(Organizador organizador) {
        return LISTA_ORGANIZADORES.validarOrganizador(organizador);
    }

    /**
     * verifica o FAE
     *
     * @param FAE objecto a ser validado
     * @return boolean que confirma ou nao a validade do FAE
     */
    public boolean verifcarFAE(FAE FAE) {
        return LISTA_FAE.validaFAE(FAE);
    }

    /**
     * Davolve a lista de candidaturas por avaliar do FAE
     *
     * @param FAE FAE que esta a utilizar
     * @return devolve uma lista de atribuicoes para o FAE
     */
    public ArrayList<Atribuicao> getCandidaturasPorAvaliarDoFAE(FAE FAE) {
        ArrayList<Atribuicao> atribuicao = LISTA_ATRIBUICOES.getCandidaturasPorAvaliarDoFAE(FAE);
        return atribuicao;
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

    /**
     * devolve a lista de candidaturas do evento
     *
     * @return lista de candidaturas do evento
     */
    public ListCandidaturas getListCandidaturas() {
        return LISTA_CANDIDATURAS;
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
     * diz se a data de submissao ja passou
     *
     * @return boolean que diz se a data de submissao ja passou
     */
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

    /**
     * Defenir atribuicoes
     *
     * @param atribuicoes a defenir como a lista de atribuicoes
     */
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

    /**
     * guarda permanentemente a candidatura
     *
     * @param candidatura objecto a guardar
     */
    public void registaCandidatura(Candidatura candidatura) {
        LISTA_CANDIDATURAS.addCandidatura(candidatura);
    }

    /**
     * Verifica se ja ha candidaturas
     *
     * @param utilizador representante que esta a tentar fazer um a candidatura
     * nova
     * @return boolean que confirma se ainda nao ou ja fez alguma candidatura
     */
    public boolean aindaNaoFezCandidatura(Utilizador utilizador) {
        return LISTA_CANDIDATURAS.validarExistenciaDeCandidatura(utilizador);
    }

    /**
     * Devolve os dados do centor de eventos em forma de string
     *
     * @return string para dar output
     */
    @Override
    public String toString() {
        return String.format("Titulo: %s%nDescricao: %s%nLocal: %s%nData de Inicio: %s%n Data de Fim: %s%nData limite de submissao de candidaturas: %s%n", titulo, descricao, local, dataInicio, dataFim, dataLimiteCandidaturas);
    }
}
