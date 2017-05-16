package Dominio;


import Dominio.Utilizador;


public class FAE {

    private Utilizador utilizador;
    private int competencia;

    /**
     *
     * @param Utilizador
     */
    public void defenirFAE(Utilizador utilizador, int competencia) {
       this.utilizador=utilizador;
       this.competencia=competencia;
    }
}
