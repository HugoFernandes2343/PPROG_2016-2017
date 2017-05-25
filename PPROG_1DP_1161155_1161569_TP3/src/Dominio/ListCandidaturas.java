package Dominio;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.*;

public class ListCandidaturas implements Serializable {
    
    private ArrayList<Candidatura> candidaturas;
    
    public ListCandidaturas() {
        candidaturas = new ArrayList();
        
    }
    
    public Candidatura criarCandidatura(Utilizador utilizador) {
        Candidatura candidatura = new Candidatura(utilizador);
        return candidatura;
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
     *
     * @param candidatura candidatura feita pelo utilizadorF
     */
    public void guardarCandidatura(Candidatura candidatura) {
        candidaturas.add(candidatura);
    }
    
    public boolean validarExistenciaDeCandidatura(Utilizador utilizador) {
        for (int i = 0; i < candidaturas.size(); i++) {
            Candidatura candidatura = candidaturas.get(i);
            if (candidatura.getUtilizador().equals(utilizador)) {
                return true;
            }
        }
        return false;
    }
    
    public void addCandidatura(Candidatura candidatura) {
        candidaturas.add(candidatura);
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
