package Algoritmos;

import Dominio.Atribuicao;
import Dominio.Candidatura;
import Dominio.FAE;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hugo Carvalho; Hugo Fernandes
 */
public class AlgoritmoPorNumeroDeFAE implements Algoritmo {

    private static Scanner in = new Scanner(System.in);

    /**
     * Construtor de um objecto do tipo algoritmo por numero de FAE
     */
    public AlgoritmoPorNumeroDeFAE() {
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
        do {
            System.out.println("Este evento tem " + nFAE + " FAEs. Numero de FAE por candidatura?");
            nAvaliadores = in.nextInt();
            in.nextLine();
            if (nAvaliadores > nFAE || nAvaliadores <= 0) {
                System.out.println("Numero de FAEs em excesso ou numero nulo.");
            }
        } while (nAvaliadores > nFAE || nAvaliadores <= 0);
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
