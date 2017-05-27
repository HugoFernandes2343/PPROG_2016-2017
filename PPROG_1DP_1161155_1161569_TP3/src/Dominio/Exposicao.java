package Dominio;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugo
 */
public class Exposicao extends Evento implements Serializable {

    private String tipo;
    private static final String TIPO_DE_EVENTO = "Exposicao";

    public Exposicao(String titulo, String descricao, String local, String dataInicio, String dataFim, String dataLimiteCandidaturas) {
        super(titulo, descricao, local, dataInicio, dataFim, dataLimiteCandidaturas);
        tipo = TIPO_DE_EVENTO;
    }

    public String toString() {
        return super.toString() + String.format("Tipo de evento: %s%n", tipo);
    }
}
