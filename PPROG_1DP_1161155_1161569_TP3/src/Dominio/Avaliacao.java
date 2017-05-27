package Dominio;

import java.io.Serializable;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class Avaliacao implements Serializable {

    private boolean veredicto;
    private String justificacao;
    private static boolean JUSTIFICACAO_POR_OMISSAO = false;
    private static String VEREDICTO_POR_OMISSAO = "Nao justificada";

    /**
     * Construror da avaliacao
     */
    public Avaliacao() {
        this.veredicto = JUSTIFICACAO_POR_OMISSAO;
        this.justificacao = VEREDICTO_POR_OMISSAO;
    }

    /**
     * @return o veredicto
     */
    public boolean getVeredicto() {
        return veredicto;
    }

    /**
     * @param veredicto a defenir
     */
    public void setVeredicto(boolean veredicto) {
        this.veredicto = veredicto;
    }

    /**
     * @return the justificacao
     */
    public String getJustificacao() {
        return justificacao;
    }

    /**
     * @param justificacao the justificacao to set
     */
    public void setJustificacao(String justificacao) {
        this.justificacao = justificacao;
    }

    /**
     * @return string com dados para mostrar
     */
    @Override
    public String toString() {
        if (veredicto = true) {
            String resposta = "Aprovada";
            return String.format("Veredicto: %s", resposta) +String.format(" Justificação: %s", justificacao);
        } else {
            String resposta = "Rejeitada";
            return String.format("Veredicto: %s", resposta)+String.format(" Justificação: %s", justificacao);
        }
    }
}
