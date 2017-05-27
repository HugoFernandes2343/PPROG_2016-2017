package Dominio;

import java.io.Serializable;


/**
 *
 * @author Hugo Carvalho; Hugo Fernandes
 */
public class Exposicao extends Evento implements Serializable {

    private String tipo;
    private static final String TIPO_DE_EVENTO = "Exposicao";

    /**
     * Construtor da exposicao
     * @param titulo titulo da exposicao
     * @param descricao descricao da exposicao
     * @param local local da exposicao
     * @param dataInicio data de inicio da exposicao
     * @param dataFim data de fim da exposicao
     * @param dataLimiteCandidaturas data de fim da capacidade de fazer candidaturas
     */
    public Exposicao(String titulo, String descricao, String local, String dataInicio, String dataFim, String dataLimiteCandidaturas) {
        super(titulo, descricao, local, dataInicio, dataFim, dataLimiteCandidaturas);
        tipo = TIPO_DE_EVENTO;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Tipo de evento: %s%n", tipo);
    }
}
