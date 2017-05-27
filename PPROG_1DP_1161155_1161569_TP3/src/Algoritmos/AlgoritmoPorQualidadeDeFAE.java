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
public class AlgoritmoPorQualidadeDeFAE implements Algoritmo {

    private Scanner in = new Scanner(System.in);

    /**
     *Construtor de um objecto do tipo algoritmo por qualidade de FAE
     */
    public AlgoritmoPorQualidadeDeFAE() {
    }

    /**
     *
     * @param listaFAE lista de FAE do evento pela qual serao distribuidas as candidadturas
     * @param listaCandidaturas lista de candidaturas a distribuir 
     * @return atribuicoes feitas de acordo com este algoritmo
     */
    @Override
    public ArrayList<Atribuicao> run(ArrayList<FAE> listaFAE, ArrayList<Candidatura> listaCandidaturas) {
        int nFAE, nCandidaturas, contFAE = 0;
        ArrayList<Atribuicao> atribuicoes = new ArrayList();
        ArrayList<FAE> avaliadores = new ArrayList();
        do {
            avaliadores = procurarFAERecomendados(listaFAE);
            if (avaliadores.size() > 0) {
                nFAE = avaliadores.size();
                nCandidaturas = listaCandidaturas.size();
                for (int i = 0; i < nCandidaturas; i++) {
                    if (contFAE >= nFAE) {
                        contFAE = 0;
                    }
                    Atribuicao atribuicao = new Atribuicao(avaliadores.get(contFAE), listaCandidaturas.get(i));
                    atribuicoes.add(atribuicao);
                    contFAE++;
                }
            } else {
                System.out.println("Nao tem FAE com esse grau de qualidade.");
            }
        } while (avaliadores.size() <= 0);
        return atribuicoes;
    }

    private ArrayList<FAE> procurarFAERecomendados(ArrayList<FAE> listaFAE) {
        ArrayList<FAE> FAEqualificados = new ArrayList();
        int competencia = grauDeQualificacaoDeFAE();
        int competenciaFAE;
        int nFAETotais = listaFAE.size();
        for (int j = 0; j < nFAETotais; j++) {
            FAE FAE = listaFAE.get(j);
            competenciaFAE = FAE.getCompetencia();
            if (competenciaFAE == competencia) {
                FAEqualificados.add(FAE);
            }
        }
        return FAEqualificados;
    }

    private int grauDeQualificacaoDeFAE() {
        int op;
        do {
            op = menuGrauDeQualificacaoDeFAE();
        } while (op > 5 && op < 1);
        return op;
    }

    private int menuGrauDeQualificacaoDeFAE() {
        String texto = "\nMENU: "
                + "\n    Estagiario             1"
                + "\n    Aprendiz               2"
                + "\n    Efetivo                3"
                + "\n    Mestre                 4"
                + "\n    Altamente Qualificado  5"
                + "\n  Qual a sua opcao?";
        System.out.printf("%n%s%n", texto);
        int op = in.nextInt();
        in.nextLine();
        return op;
    }
}
