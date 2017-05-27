package Dominio;

import java.io.Serializable;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class Organizador implements Serializable {

    private Utilizador utilizador;

    /**
     * construtor do organizador
     *
     * @param utilizador utilizador que será este organizador
     */
    public Organizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * verifica se dois organizadores sao iguais
     *
     * @param outroObjeto segundo aorganizador que vai ser comparado com o que
     * invoca este metodo
     * @return boolean cque confima ou nega se sao iguais os dois objectos
     */
    @Override
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
     * Devolve utilizador
     *
     * @return utilizador deste objecto
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }
}
