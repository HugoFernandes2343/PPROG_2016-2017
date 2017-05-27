package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class ListAtribuicoes implements Serializable {

    private ArrayList<Atribuicao> ATRIBUICAO;

    /**
     * construtor da lista de atribuicoes
     */
    public ListAtribuicoes() {
        this.ATRIBUICAO = new ArrayList();
    }

    /**
     * Devolve a lista de atribuicoes
     *
     * @return lista de atribuicoes
     */
    public ArrayList<Atribuicao> getAtribuicoes() {
        return this.ATRIBUICAO;
    }

    public boolean validarAtribuicao(Atribuicao atribuicao) {
        // TODO - implement ListAtribuições.validarAtribuicao
        throw new UnsupportedOperationException();
    }

    /**
     * guarda permanentemente as atribuicoes
     *
     * @param atribuicoes Lista de atribuicoes
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
     * Devolve ass candidaturas por avaliar do FAE
     *
     * @param FAE utilizador do programa
     * @return lista de atribuicoes do FAE
     */
    public ArrayList<Atribuicao> getCandidaturasPorAvaliarDoFAE(FAE FAE) {
        ArrayList<Atribuicao> atribuicoes = new ArrayList();
        boolean avaliada = false;

        for (int i = 0; i < ATRIBUICAO.size(); i++) {
            avaliada = ATRIBUICAO.get(i).existeAvaliacao();
            if (avaliada == false) {
                atribuicoes.add(ATRIBUICAO.get(i));
            }
        }

        for (int i = atribuicoes.size() - 1; i >= 0; i--) {
            if (!FAE.equals(atribuicoes.get(i).getFAE())) {
                atribuicoes.remove(i);

            }
        }

        return atribuicoes;
    }

}
