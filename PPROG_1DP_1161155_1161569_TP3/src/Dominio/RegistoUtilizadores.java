package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class RegistoUtilizadores implements Serializable{

    private ArrayList<Utilizador> listUtilizadores;

    public RegistoUtilizadores() {
        this.listUtilizadores=new ArrayList();
    }

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

    public void setListUtilizadores(ArrayList<Utilizador> userList) {
        this.listUtilizadores = userList;
    }

}
