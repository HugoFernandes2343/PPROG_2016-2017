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

}
