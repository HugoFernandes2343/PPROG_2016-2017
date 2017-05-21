/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Algoritmos.AlgoritmoPorDistribuicaoEquatitativaDeFAE;
import Algoritmos.AlgoritmoPorNumeroDeFAE;
import Algoritmos.AlgoritmoPorQualidadeDeFAE;
import java.util.ArrayList;

/**
 *
 * @author Hugo
 */
public class RegistoDeAlgoritmos {

    private ArrayList<Object> algoritmosDeAtribuicao;

    public RegistoDeAlgoritmos() {
        carregarAlgoritmosDeAtribuicao();
    }

    private void carregarAlgoritmosDeAtribuicao() {
        algoritmosDeAtribuicao.add(new AlgoritmoPorNumeroDeFAE());
        algoritmosDeAtribuicao.add(new AlgoritmoPorDistribuicaoEquatitativaDeFAE());
        algoritmosDeAtribuicao.add(new AlgoritmoPorQualidadeDeFAE());
    }
    
    public ArrayList<Object> getAlgoritmosDeAtribuicao(){
    return algoritmosDeAtribuicao;
    }
}
