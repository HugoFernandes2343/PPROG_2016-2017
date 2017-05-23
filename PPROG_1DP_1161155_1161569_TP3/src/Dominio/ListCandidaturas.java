package Dominio;

import java.io.Serializable;
import java.util.*;

public class ListCandidaturas implements Serializable{

    private ArrayList<Candidatura> candidatura;

    public Candidatura criarCandidatura() {
        // TODO - implement ListCandidaturas.criarCandidatura
        throw new UnsupportedOperationException();
    }

    public ArrayList<Candidatura> getListaDeCandidaturas() {
        return candidatura;
    }

    /**
     *
     * @param candidatura
     */
    public void guardarCandidatura(Candidatura candidatura) {
        // TODO - implement ListCandidaturas.guardarCandidatura
        throw new UnsupportedOperationException();
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
     */
    public ArrayList<Candidatura> getCandidatura(String nomeCandidatura) {
        return candidatura;
    }
}
