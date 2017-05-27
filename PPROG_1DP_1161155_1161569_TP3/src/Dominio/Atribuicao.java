package Dominio;

import java.io.Serializable;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class Atribuicao implements Serializable {

    private FAE FAE;
    private Candidatura candidatura;
    private Avaliacao avaliacao;

    /**
     * Construtor da atribuicao
     *
     * @param FAE da atribuicao
     * @param candidatura Candidatura da atribuicao
     */
    public Atribuicao(FAE FAE, Candidatura candidatura) {
        this.FAE = FAE;
        this.candidatura = candidatura;
        this.avaliacao = null;
    }

    /**
     * criar avaliacao para a atribuicao
     */
    public Avaliacao criarAvaliacao() {
        Avaliacao A = new Avaliacao();
        return A;
    }

    /**
     * verifica se ha avaliacao
     *
     * @return boolean que diz se existe
     */
    public boolean existeAvaliacao() {

        if (avaliacao == null) {
            return false;
        }
        return true;
    }

    /**
     * Devolve FAE da atribuicao
     * @return FAE da atribuicao
     */
    public FAE getFAE() {
        return FAE;
    }

    /**
     * Devolve candidatua da atribuicao
     * @return candidatura da atribuicao
     */
    public Candidatura getCandidatura() {
        return candidatura;
    }

    /**
     * Devolve avaliacao da atribuicao
     * @return avaliacao da candidatura
     */
    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    /**
     * Define avalaicao da atribuicao
     * @param avaliacao avaiacao a defenir
     */
    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    /**
     * @return dados da atribuicao em forma de string
     */
    @Override
    public String toString() {
        return FAE.toString() + candidatura.toString() + String.format("%n");
    }
}
