package Dominio;

import Algoritmos.AlgoritmoPorDistribuicaoEquatitativaDeFAE;
import Algoritmos.AlgoritmoPorNumeroDeFAE;
import Algoritmos.AlgoritmoPorQualidadeDeFAE;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class RegistoDeAlgoritmos implements Serializable {

    private ArrayList<Object> algoritmosDeAtribuicao;

    /**
     * construtor do registo de algoritmos
     */
    public RegistoDeAlgoritmos() {
        this.algoritmosDeAtribuicao = new ArrayList();
        carregarAlgoritmosDeAtribuicao();
    }

    private void carregarAlgoritmosDeAtribuicao() {
        algoritmosDeAtribuicao.add(new AlgoritmoPorNumeroDeFAE());
        algoritmosDeAtribuicao.add(new AlgoritmoPorDistribuicaoEquatitativaDeFAE());
        algoritmosDeAtribuicao.add(new AlgoritmoPorQualidadeDeFAE());
    }

    /**
     * devolve algoritmos
     *
     * @return algoritmos de atribuicao
     */
    public ArrayList<Object> getAlgoritmosDeAtribuicao() {
        return algoritmosDeAtribuicao;
    }
}
