package Dominio;

import Dominio.Utilizador;
import java.io.Serializable;

public class GestorDeEventos implements Serializable {

    private Utilizador utilizador;

    /**
     *
     * @param utilizador
     */
    public GestorDeEventos(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        GestorDeEventos outroGestor = (GestorDeEventos) outroObjeto;
        return this.utilizador.equals(outroGestor.getUtilizador());
    }

    /**
     * @return the utilizador
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

}
