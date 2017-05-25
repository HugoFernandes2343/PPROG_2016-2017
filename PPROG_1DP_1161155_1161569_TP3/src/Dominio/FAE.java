package Dominio;

import Dominio.Utilizador;
import java.io.Serializable;

public class FAE implements Serializable {

    private Utilizador utilizador;
    private int competencia;
    private static final int COMPETENCIA_POR_OMISSAO = 5;

    public FAE(Utilizador utilizador, int competencia) {
        this.utilizador = utilizador;
        this.competencia = competencia;
    }

    public FAE(Utilizador utilizador) {
        this.utilizador = utilizador;
        this.competencia = COMPETENCIA_POR_OMISSAO;
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

    /**
     * @return the utilizador
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        FAE outroFAE = (FAE) outroObjeto;
        return this.utilizador.equals(outroFAE.getUtilizador());
    }
    public String toString(){
    return utilizador.toString()+String.format("%nQualidade do FAE: %d%n", competencia);
    }
}
