package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class ListOrganizadores implements Serializable{

    private ArrayList<Organizador> organizadores;

    public ListOrganizadores() {
        this.organizadores = new ArrayList();
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
    public void setOrganizadores(ArrayList<Organizador> organizadoresARegistar) {
        this.organizadores = organizadoresARegistar;
    }

}
