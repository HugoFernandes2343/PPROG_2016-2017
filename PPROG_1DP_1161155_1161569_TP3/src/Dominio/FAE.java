package Dominio;

import Dominio.Utilizador;
import java.io.Serializable;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class FAE implements Serializable {

    private Utilizador utilizador;
    private int competencia;
    private static final int COMPETENCIA_POR_OMISSAO = 5;

    /**
     * Construtor do FAE completo
     *
     * @param utilizador utilizador que será este FAE
     * @param competencia objecto classificativo dda capacidade deste FAE
     */
    public FAE(Utilizador utilizador, int competencia) {
        this.utilizador = utilizador;
        this.competencia = competencia;
    }

    /**
     * Construtor incompleto do FAE
     *
     * @param utilizador utilizador que será este FAE
     */
    public FAE(Utilizador utilizador) {
        this.utilizador = utilizador;
        this.competencia = COMPETENCIA_POR_OMISSAO;
    }

    /**
     * Devolve a competencia
     *
     * @return Competencia do FAE
     */
    public int getCompetencia() {
        return competencia;
    }

    /**
     * Define a competencia
     *
     * @param competencia a dar ao FAE
     */
    public void setCompetencia(int competencia) {
        this.competencia = competencia;
    }

    /**
     * Devolve o utilizador
     *
     * @return the utilizador a defenir
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

    /**
     * verifica se dois FAE sao iguais
     *
     * @param outroObjeto segundo FAE a comparar com o FAE que invoca o metodo
     * @return Boolean que confirma ou nega se os FAE sao iguais
     */
    @Override
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

    /**
     * Devolve os dados do FAE em formato string
     *
     * @return stirng com os dados
     */
    @Override
    public String toString() {
        return utilizador.toString() + String.format("Qualidade do FAE: %d%n", competencia);
    }
}
