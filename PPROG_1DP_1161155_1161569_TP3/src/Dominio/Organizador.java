package Dominio;

import java.io.Serializable;

public class Organizador implements Serializable {

    private Utilizador utilizador;

    public Organizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Organizador outroOrganizador = (Organizador) outroObjeto;
        return this.utilizador.equals(outroOrganizador.getUtilizador());
    }

    /**
     * @return the utilizador
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }
}
