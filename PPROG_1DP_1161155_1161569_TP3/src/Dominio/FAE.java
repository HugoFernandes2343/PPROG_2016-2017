package Dominio;

import Dominio.Utilizador;
import java.io.Serializable;

public class FAE implements Serializable {

    private Utilizador utilizador;
    private int competencia;

    public FAE(Utilizador utilizador, int competencia) {
        this.utilizador = utilizador;
        this.competencia = competencia;
    }

    public FAE(Utilizador utilizador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the competencia
     */
    public int getCompetencia() {
        return competencia;
    }

    /**
     * @param competencia the competencia to set
     */
    public void setCompetencia(int competencia) {
        this.competencia = competencia;
    }

}
