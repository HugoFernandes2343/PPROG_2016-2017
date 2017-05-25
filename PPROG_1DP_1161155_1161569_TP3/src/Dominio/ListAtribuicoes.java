package Dominio;

import java.io.Serializable;
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
public class ListAtribuicoes implements Serializable {

    private ArrayList<Atribuicao> ATRIBUICAO;

    public ListAtribuicoes() {
        this.ATRIBUICAO = new ArrayList();
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

    /**
     *
     * @param FAE utilizador do programa
     * @return lisata de atribuicoes do FAE
     */
    public ArrayList<Atribuicao> getCandidaturasPorAvaliarDoFAE(FAE FAE) {
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

        return atribuicoes;
    }

}
