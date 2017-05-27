package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class Congresso extends Evento implements Serializable {

    private String tipo;
    private ArrayList<Workshop> listaWorkshops;
    private static final String TIPO_DE_EVENTO = "Congresso";

    /**
     * construtor do congresso
     *
     * @param titulo titulo do congresso
     * @param descricao desricao do congresso
     * @param local local do congresso
     * @param dataInicio data do inicio do congresso
     * @param dataFim data fim do congresso
     * @param dataLimiteCandidaturas data de limite para candidaturas
     */
    public Congresso(String titulo, String descricao, String local, String dataInicio, String dataFim, String dataLimiteCandidaturas) {
        super(titulo, descricao, local, dataInicio, dataFim, dataLimiteCandidaturas);
        tipo = TIPO_DE_EVENTO;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Tipo de evento: %s%n", tipo);
    }
}
