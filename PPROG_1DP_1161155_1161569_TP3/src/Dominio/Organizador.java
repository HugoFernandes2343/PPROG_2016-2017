package Dominio;

import java.io.Serializable;

public class Organizador implements Serializable{

    private Utilizador utilizador;

    public Organizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

}
