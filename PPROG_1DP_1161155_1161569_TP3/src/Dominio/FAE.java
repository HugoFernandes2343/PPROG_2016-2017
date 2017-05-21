package Dominio;

import Dominio.Utilizador;

public class FAE {

    private Utilizador utilizador;
    private int competencia;

    public FAE(Utilizador utilizador, int competencia) {
        this.utilizador = utilizador;
        this.competencia = competencia;
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
