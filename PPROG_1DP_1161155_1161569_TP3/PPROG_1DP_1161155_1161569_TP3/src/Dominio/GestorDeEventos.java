package Dominio;

import Dominio.Utilizador;
import java.io.Serializable;

/**
 *
 * @author hugod
 */
public class GestorDeEventos implements Serializable {

    private Utilizador utilizador;

    /**
     *
     * @param utilizador
     */
    public GestorDeEventos(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * verifica se dois gestor de eventos sao iguas
     *
     * @param outroObjeto segund gestor que se ira comparar com o que invoca o
     * metodo
     * @return devolve um boolean que confirma ou nega se dois gestores sao
     * iguais
     */
    @Override
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
     * Devolve o utilizador
     *
     * @return utilizador a devolver
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

}
