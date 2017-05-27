package Algoritmos;

import Dominio.Atribuicao;
import Dominio.Candidatura;
import Dominio.FAE;
import java.util.ArrayList;

/**
 *
 * @author Hugo Carvalho; Hugo Fernandes
 */
public interface Algoritmo {

    public ArrayList<Atribuicao> run(ArrayList<FAE> listaFAE, ArrayList<Candidatura> listaCandidaturas);

}
