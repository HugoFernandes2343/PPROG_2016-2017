package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class ListGestorDeEventos implements Serializable {

    private ArrayList<GestorDeEventos> listaDeGestores;

    /**
     * construtor da lista de gestores de eventos
     */
    public ListGestorDeEventos() {
        this.listaDeGestores = new ArrayList();
    }

    /**
     * valida gestor de eventos
     *
     * @param gestor objecto a validar
     * @return boolean que confirma ou rejeita a validade do objecto
     */
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
     * Defenir lista de gestores
     *
     * @param listaDeGestores lista a defenir
     */
    public void setListaDeGestores(ArrayList<GestorDeEventos> listaDeGestores) {
        this.listaDeGestores = listaDeGestores;
    }

}
