/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Dominio.Atribuicao;
import Dominio.Candidatura;
import Dominio.FAE;
import java.util.ArrayList;

/**
 *
 * @author Hugo
 */
public class AlgoritmoPorDistribuicaoEquatitativaDeFAE implements Algoritmo {

    public AlgoritmoPorDistribuicaoEquatitativaDeFAE() {
    }

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
