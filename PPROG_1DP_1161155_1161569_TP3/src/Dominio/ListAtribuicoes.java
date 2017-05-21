package Dominio;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugo
 */
public class ListAtribuicoes {

    private ArrayList<Atribuicao> ATRIBUICAO;

    public void criarAtribuicao() {
        // TODO - implement ListAtribuições.criarAtribuicao
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param atribuiçoes
     */
    public void guardarAtribuicoes(Atribuicao[] atribuiçoes) {
        // TODO - implement ListAtribuições.guardarAtribuicoes
        throw new UnsupportedOperationException();
    }

    public ArrayList<Atribuicao> getAtribuicoes() {
        return this.ATRIBUICAO;
    }

    /**
     *
     * @param atribuicao
     */
    public boolean validarAtribuicao(Atribuicao atribuicao) {
        // TODO - implement ListAtribuições.validarAtribuicao
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param atribuicao
     */
    public void guardarAtribuicao(ArrayList<Atribuicao> atribuicoes) {
        this.ATRIBUICAO = atribuicoes;
    }

    public Candidatura[] mostrarListaCandidaturasPorAvaliarDoFAE() {
        // TODO - implement ListAtribuições.mostrarListaCandidaturasPorAvaliarDoFAE
        throw new UnsupportedOperationException();
    }

    public void adicionarAoArray() {
        // TODO - implement ListAtribuições.adicionarAoArray
        throw new UnsupportedOperationException();
    }

    public ArrayList<Candidatura> getCandidaturasPorAvaliarDoFAE(FAE FAE) {
        ArrayList<Candidatura> candidaturas = new ArrayList();
        ArrayList<Atribuicao> atribuicoes = new ArrayList();
        boolean avaliada = false;
        for (int i = 0; i < ATRIBUICAO.size(); i++) {
            avaliada = ATRIBUICAO.get(i).existeAvaliacao();
            if (avaliada = false) {
                atribuicoes.add(ATRIBUICAO.get(i));
            }
        }
        for (int i = 0; i < atribuicoes.size(); i++) {
            if (!FAE.equals(atribuicoes.get(i).getFAE())) {
                atribuicoes.remove(i);
            }
        }
        for (int i = 0; i < atribuicoes.size(); i++) {
            candidaturas.add(atribuicoes.get(i).getCandidatura());
        }
        return candidaturas;
    }

}
