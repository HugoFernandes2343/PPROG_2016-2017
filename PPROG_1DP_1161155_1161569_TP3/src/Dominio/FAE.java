package Dominio;


import Dominio.Utilizador;


public class FAE {

    private Utilizador utilizador;
    private int competencia;

    public FAE(Utilizador utilizador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param Utilizador
     */
    public void defenirFAE(Utilizador utilizador, int competencia) {
       this.utilizador=utilizador;
       this.competencia=competencia;
    }
}
