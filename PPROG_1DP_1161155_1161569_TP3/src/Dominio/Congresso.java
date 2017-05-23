package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Congresso extends Evento implements Serializable {

    private String tipo;
    private ArrayList<Workshop> listaWorkshops;
    private static final String TIPO_DE_EVENTO = "Congresso";

    public Congresso(String titulo, String descricao, String local, String dataInicio, String dataFim, String dataLimiteCandidaturas) {
        super(titulo, descricao, local, dataInicio, dataFim, dataLimiteCandidaturas);
        tipo = TIPO_DE_EVENTO;
    }

    public String toString() {
        return super.toString() + String.format("Tipo de evento: %s%n", tipo);
    }
}
