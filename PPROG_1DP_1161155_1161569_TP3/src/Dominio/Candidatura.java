package Dominio;

import java.io.Serializable;

public class Candidatura implements Serializable {

    private String dadosCandidatura;
    private Utilizador utilizador;
    private static final String DADOS_POR_OMISSAO = "Sem dados";

    /**
     *
     */
    public Candidatura(Utilizador utilizador) {
        this.dadosCandidatura = DADOS_POR_OMISSAO;
        this.utilizador = utilizador;

    }

    /**
     * @return the dadosCandidatura
     */
    public String getDadosCandidatura() {
        return dadosCandidatura;
    }

    /**
     * @param dadosCandidatura the dadosCandidatura to set
     */
    public void setDadosCandidatura(String dadosCandidatura) {
        this.dadosCandidatura = dadosCandidatura;
    }

    public String toString() {
        return String.format("Dados da candidatura: %s", dadosCandidatura);

    }

    /**
     * @return the utilizador
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

}
