package Dominio;

import java.util.ArrayList;

public class ListOrganizadores {

    private ArrayList<Organizador> organizadores;

    public ListOrganizadores(ArrayList<Organizador> organizadores) {
        this.organizadores = organizadores;
    }

    /**
     *
     * @param organizador
     * @return
     */
    public boolean validarOrganizador(Organizador organizador) {
        boolean cond = false;
        for (int i = 0; i < organizadores.size(); i++) {
            Organizador organizadorDoEvento = organizadores.get(i);
            if (organizadorDoEvento.equals(organizador)) {
                cond = true;
                return cond;
            }
        }
        return cond;
    }

    /**
     *
     * @param organizadoresARegistar
     */
    public void registarOrganizador(ArrayList<Organizador> organizadoresARegistar) {
        // TODO - implement ListOrganizadores.registarOrganizador
        throw new UnsupportedOperationException();
    }

}
