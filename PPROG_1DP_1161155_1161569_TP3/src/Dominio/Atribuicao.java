package Dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugo
 */
public class Atribuicao {

    private FAE FAE;
    private Candidatura candidatura;
    private Avaliacao avaliacao;

    

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
    public void addAvaliacao(Avaliacao Avaliacao) {
        // TODO - implement Atribuição.addAvaliacao
        throw new UnsupportedOperationException();
    }

    public boolean existeAvaliacao() {
       boolean existe = true;
       if(avaliacao == null){
           existe = false;
       }
       return existe;
    }

    public FAE getFAE() {
       return FAE;
    }

    public Candidatura getCandidatura() {
        return candidatura;
    }
}
