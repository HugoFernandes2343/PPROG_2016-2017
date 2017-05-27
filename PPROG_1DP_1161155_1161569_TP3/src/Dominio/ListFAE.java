package Dominio;

import java.io.Serializable;
import java.util.*;

public class ListFAE implements Serializable {

    private ArrayList<FAE> LISTA_FAE;

    /**
     *
     * @return
     */
    public ArrayList<FAE> getListaDeFAE() {
        return LISTA_FAE;
    }

    public boolean validaFAE(FAE FAE) {
        boolean existe = false;
        for (int i = 0; i < LISTA_FAE.size(); i++) {
            FAE FAEdoEvento = LISTA_FAE.get(i);
            if (FAEdoEvento.getUtilizador().equals(FAE.getUtilizador())) {
                existe = true;
                return existe;
            }
        }
        return existe;
    }

    public void setListaFAE(ArrayList<FAE> FAEsARegistar) {
        this.LISTA_FAE = FAEsARegistar;
    }

}
