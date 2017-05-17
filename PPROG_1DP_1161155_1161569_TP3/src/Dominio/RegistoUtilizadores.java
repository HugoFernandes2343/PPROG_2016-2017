package Dominio;

import java.util.ArrayList;

public class RegistoUtilizadores {

    private ArrayList<Utilizador> listUtilizadores;

    /**
     *
     * @param nomeUtulizador
     */
    public Utilizador procurarUtilizador(Utilizador utilizador) {
        // TODO - implement RegistoUtilizadores.procurarUtilizador
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param utilizadorNaoConfirmado
     */
    public boolean validarUtilizador(Utilizador utilizador) {
        // TODO - implement RegistoUtilizadores.validarUtilizador
        throw new UnsupportedOperationException();
    }

    public void addUtilizador(Utilizador utilizador) {
        this.listUtilizadores.add(utilizador);
    }

    public ArrayList<Utilizador> getListUtilizadores() {
        return listUtilizadores;
    }

}
