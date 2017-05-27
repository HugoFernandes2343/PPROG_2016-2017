package Dominio;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class ListFAE implements Serializable {

    private ArrayList<FAE> LISTA_FAE;

    /**
     * devolve a lista de FAE
     *
     * @return lista de FAE
     */
    public ArrayList<FAE> getListaDeFAE() {
        return LISTA_FAE;
    }

    /**
     * valida o objecto
     *
     * @param FAE objecto a validar
     * @return boolean que confirma se é valido ou nao o objecto FAE
     */
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

    /**
     * Define lista de FAE
     *
     * @param FAEsARegistar arraylist a defenir como lista de fae
     */
    public void setListaFAE(ArrayList<FAE> FAEsARegistar) {
        this.LISTA_FAE = FAEsARegistar;
    }

}
