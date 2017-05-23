package Dominio;

import Dominio.Utilizador;
import java.io.Serializable;
import java.util.ArrayList;

public class ListGestorDeEventos implements Serializable{

    private ArrayList<GestorDeEventos> listaDeGestores;

    public ListGestorDeEventos() {
        this.listaDeGestores = new ArrayList();
    }

    /**
     * @param listaDeGestores the listaDeGestores to set
     */
    public void setListaDeGestores(ArrayList<GestorDeEventos> listaDeGestores) {
        this.listaDeGestores = listaDeGestores;
    }

}
