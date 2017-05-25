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
public class Atribuicao implements Serializable {

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

        if (avaliacao == null) {
            return false;
        }
        return true;
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
    public String toString(){
    return FAE.toString()+candidatura.toString();
    }
}
