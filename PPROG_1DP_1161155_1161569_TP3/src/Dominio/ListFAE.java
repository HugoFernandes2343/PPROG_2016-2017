package Dominio;

import java.util.*;

public class ListFAE {

    private static ArrayList<FAE> LISTA_FAE;

    public void novoFAE() {
        // TODO - implement ListFAE.novoFAE
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param FAE utilizador do programa
     * @return boolean que diz se existe FAE
     */
    public boolean validaFAE(FAE FAE) {
        boolean existe = false;
        for (int i = 0; i < LISTA_FAE.size(); i++) {
            if(!LISTA_FAE.get(i).equals(FAE)){
            existe = true;
            }
        }
        return existe;
    }

    public void registaFAE() {
        // TODO - implement ListFAE.registaFAE
        throw new UnsupportedOperationException();
    }

    public void registarFAE() {
        // TODO - implement ListFAE.registarFAE
        throw new UnsupportedOperationException();
    }

}
