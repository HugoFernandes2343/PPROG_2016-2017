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
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class AlgoritmoPorNumeroDeFAE implements Algoritmo {

    private static Scanner in = new Scanner(System.in);

    public AlgoritmoPorNumeroDeFAE() {
    }

    @Override
    public ArrayList<Atribuicao> run(ArrayList<FAE> listaFAE, ArrayList<Candidatura> listaCandidaturas) {
        int nFAE, nCandidaturas, nAvaliadores, contFAE = 0, contCandidatura = 0;
        ArrayList<Atribuicao> atribuicoes = new ArrayList();
        nFAE = listaFAE.size();
        nCandidaturas = listaCandidaturas.size();
        System.out.println("Este evento tem " + nFAE + " FAEs. Numero de FAE por candidatura?");
        nAvaliadores = in.nextInt();
        for (int i = 0; i < nCandidaturas; i++) {
            for (int j = 0; j < nAvaliadores; j++) {
                if (contFAE >= nFAE) {
                    contFAE = 0;
                }
                Atribuicao atribuicao = new Atribuicao(listaFAE.get(contFAE), listaCandidaturas.get(contCandidatura));
                atribuicoes.add(atribuicao);
                contFAE++;
            }
        }
        return atribuicoes;
    }

}
