package Dominio;

import Dominio.Utilizador;
import java.io.Serializable;
import java.util.ArrayList;

public class ListGestorDeEventos implements Serializable {

    private ArrayList<GestorDeEventos> listaDeGestores;

    public ListGestorDeEventos() {
        this.listaDeGestores = new ArrayList();
    }

    public boolean validarGestorDeEventos(GestorDeEventos gestor) {
        for (int i = 0; i < listaDeGestores.size(); i++) {
            GestorDeEventos gde = listaDeGestores.get(i);
            if (gde.equals(gestor)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param listaDeGestores the listaDeGestores to set
     */
    public void setListaDeGestores(ArrayList<GestorDeEventos> listaDeGestores) {
        this.listaDeGestores = listaDeGestores;
    }

}
