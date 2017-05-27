package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class RegistoUtilizadores implements Serializable {

    private ArrayList<Utilizador> listUtilizadores;

    /**
     * construtor do registo de utilizadores
     */
    public RegistoUtilizadores() {
        this.listUtilizadores = new ArrayList();
    }

    /**
     * procurar utilizador
     *
     * @param usernameOuEmail username ou email inserido no login
     * @param password pass inserida no login
     * @return utilizador se existir senao null
     */
    public Utilizador procurarUtilizador(String usernameOuEmail, String password) {
        for (int i = 0; i < listUtilizadores.size(); i++) {
            Utilizador utilizador = listUtilizadores.get(i);
            if (utilizador.getPassword().equals(password) && (utilizador.getEmail().equalsIgnoreCase(usernameOuEmail) || utilizador.getUsername().equalsIgnoreCase(usernameOuEmail))) {
                return utilizador;
            }
        }
        return null;
    }

    public boolean validarUtilizador(Utilizador utilizador) {
        // TODO - implement RegistoUtilizadores.validarUtilizador
        throw new UnsupportedOperationException();
    }

    /**
     * adiciona utilizador a lista de utilizadores
     *
     * @param utilizador utilizador a adicionar
     */
    public void addUtilizador(Utilizador utilizador) {
        this.listUtilizadores.add(utilizador);
    }

    /**
     * devolve a lista de utilizadores
     *
     * @return lista de utilizadores
     */
    public ArrayList<Utilizador> getListUtilizadores() {
        return listUtilizadores;
    }

    /**
     * Define a lista de utilizadores
     *
     * @param userList lista a defenir como lista de utilizadores
     */
    public void setListUtilizadores(ArrayList<Utilizador> userList) {
        this.listUtilizadores = userList;
    }

}
