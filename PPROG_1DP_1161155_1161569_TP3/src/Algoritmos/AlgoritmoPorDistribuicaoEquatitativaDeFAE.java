package Algoritmos;

import Dominio.Atribuicao;
import Dominio.Candidatura;
import Dominio.FAE;
import java.util.ArrayList;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class AlgoritmoPorDistribuicaoEquatitativaDeFAE implements Algoritmo {

    /**
     * Construtor de objectos do tipo algoritmo por distrubuicao equatitativa de FAE
     */
    public AlgoritmoPorDistribuicaoEquatitativaDeFAE() {
    }

    /**
     *
     * @param listaFAE lista de FAE do evento pela qual serao distribuidas as candidadturas
     * @param listaCandidaturas lista de candidaturas a distribuir 
     * @return atribuicoes feitas de acordo com este algoritmo
     */
    @Override
    public ArrayList<Atribuicao> run(ArrayList<FAE> listaFAE, ArrayList<Candidatura> listaCandidaturas) {
        int nFAE, nCandidaturas, nAvaliadores, contFAE = 0, contCandidatura = 0;
        ArrayList<Atribuicao> atribuicoes = new ArrayList();
        nFAE = listaFAE.size();
        nCandidaturas = listaCandidaturas.size();
        nAvaliadores = nFAE/ nCandidaturas ;
        for (int i = 0; i < nCandidaturas; i++) {
            for (int j = 0; j < nAvaliadores; j++) {
                if (contFAE >= nFAE) {
                    contFAE = 0;
                }
                Atribuicao atribuicao = new Atribuicao(listaFAE.get(contFAE), listaCandidaturas.get(i));
                atribuicoes.add(atribuicao);
                contFAE++;
            }
        }
        return atribuicoes;
    }

}
