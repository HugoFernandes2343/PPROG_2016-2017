package Dominio;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class ListCandidaturas implements Serializable {

    private ArrayList<Candidatura> candidaturas;

    /**
     * construtor da lista de candiddatruras
     */
    public ListCandidaturas() {
        candidaturas = new ArrayList();

    }

    /**
     * criar candidatura nova
     *
     * @param utilizador utilizador que esta a correr a app
     * @return objecto criado
     */
    public Candidatura criarCandidatura(Utilizador utilizador) {
        Candidatura candidatura = new Candidatura(utilizador);
        return candidatura;
    }

    /**
     * Devolve lista de candidaturas
     *
     * @return lista de candidaturas a devolver
     */
    public ArrayList<Candidatura> getListaDeCandidaturas() {
        return candidaturas;
    }

    /**
     * guarda permanentemente a candidatura
     *
     * @param candidatura candidatura feita pelo utilizadorF
     */
    public void guardarCandidatura(Candidatura candidatura) {
        candidaturas.add(candidatura);
    }

    /**
     * valida a existencia de candidatura feita por esse utilizador
     *
     * @param utilizador representante
     * @return boolean que confirama ou nega a existencia de uma candidatura
     * feita por esse representante
     */
    public boolean validarExistenciaDeCandidatura(Utilizador utilizador) {
        for (int i = 0; i < candidaturas.size(); i++) {
            Candidatura candidatura = candidaturas.get(i);
            if (candidatura.getUtilizador().equals(utilizador)) {
                return true;
            }
        }
        return false;
    }

    /**
     * adiciona uma candidatura
     *
     * @param candidatura candidatura a adicionar
     */
    public void addCandidatura(Candidatura candidatura) {
        candidaturas.add(candidatura);
    }

    /**
     * devolve candidatura
     *
     * @param nomeCandidatura nome da candidatura procurar
     * @return array list de candidaturas
     */
    public ArrayList<Candidatura> getCandidatura(String nomeCandidatura) {
        return candidaturas;
    }
}
