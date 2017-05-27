package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class ListOrganizadores implements Serializable {

    private ArrayList<Organizador> organizadores;

    /**
     * construtor da lista de organizadores
     */
    public ListOrganizadores() {
        this.organizadores = new ArrayList();
    }

    /**
     * valida organizador
     *
     * @param organizador objecto a validar
     * @return boolean que confiram ou rejeita a validade do objecto
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
     * defenir lista de organizadores
     *
     * @param organizadoresARegistar array a defenir como lista de organizadores
     */
    public void setOrganizadores(ArrayList<Organizador> organizadoresARegistar) {
        this.organizadores = organizadoresARegistar;
    }

}
