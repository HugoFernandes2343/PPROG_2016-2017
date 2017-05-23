package Dominio;

import java.util.ArrayList;

public class ListCandidaturas {

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
     */
    public ArrayList<Candidatura> getCandidatura(String nomeCandidatura) {
        return candidaturas;
    }
}
