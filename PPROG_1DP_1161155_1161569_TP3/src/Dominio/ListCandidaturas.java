package Dominio;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.*;


public class ListCandidaturas implements Serializable{

    private ArrayList<Candidatura> candidaturas;

    public Candidatura criarCandidatura() {
        // TODO - implement ListCandidaturas.criarCandidatura
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return
     */
    public ArrayList<Candidatura> getListaDeCandidaturas() {
        return candidaturas;
    }

    /**
     * guarda permanentemente a candidatura
     * @param candidatura candidatura feita pelo utilizadorF
     */
    public void guardarCandidatura(Candidatura candidatura) {
        candidaturas.add(candidatura);
    }

    public void validarCandidatura() {
        // TODO - implement ListCandidaturas.validarCandidatura
        throw new UnsupportedOperationException();
    }

    public void registarCandidatura() {
        // TODO - implement ListCandidaturas.registarCandidatura
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param nomeCandidatura
     * @return 
     */
    public ArrayList<Candidatura> getCandidatura(String nomeCandidatura) {
        return candidaturas;
    }
}
