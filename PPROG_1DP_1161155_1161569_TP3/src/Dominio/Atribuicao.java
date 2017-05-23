package Dominio;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugo
 */
public class Atribuicao implements Serializable{

    private FAE FAE;
    private Candidatura candidatura;
    private Avaliacao avaliacao;

    /**
     *
     * @param FAE
     * @param candidatura
     */
    public Atribuicao(FAE FAE, Candidatura candidatura) {
        this.FAE = FAE;
        this.candidatura = candidatura;
        this.avaliacao = null;
    }

    /**
     *
     * @param Veredicto
     * @param justificacao
     */
    public void defenirAvaliaçao(String Veredicto, String justificacao) {
        // TODO - implement Atribuição.defenirAvaliaçao
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param avaliacoes
     */
    public void guardarAvaliacoes(Avaliacao[] avaliacoes) {
        // TODO - implement Atribuição.guardarAvaliacoes
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param Avaliacao
     */
    public boolean validaAvaliacao(Avaliacao Avaliacao) {
        // TODO - implement Atribuição.validaAvaliacao
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param Avaliacao
     */
    public Avaliacao criarAvaliacao() {
        Avaliacao A = new Avaliacao();
        return A;
    }

    /**
     *
     * @return
     */
    public boolean existeAvaliacao() {
        boolean existe = true;
        if (avaliacao == null) {
            existe = false;
        }
        return existe;
    }

    /**
     *
     * @return
     */
    public FAE getFAE() {
        return FAE;
    }

    /**
     *
     * @return
     */
    public Candidatura getCandidatura() {
        return candidatura;
    }

    /**
     *
     * @return
     */
    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    /**
     *
     * @param avaliacao
     */
    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
}