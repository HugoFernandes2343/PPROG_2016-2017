package Dominio;

import java.io.Serializable;

/**
 *
 * @author Hugo Fernandes;Hugo Carvalho
 */
public class Candidatura implements Serializable {

    private String dadosCandidatura;
    private Utilizador utilizador;
    private static final String DADOS_POR_OMISSAO = "Sem dados";

    /**
     * Construtor de candiddaturas
     * @param utilizador representante da empresa
     */
    public Candidatura(Utilizador utilizador) {
        this.dadosCandidatura = DADOS_POR_OMISSAO;
        this.utilizador = utilizador;

    }

    /**
     * @return os dados Candidatura
     */
    public String getDadosCandidatura() {
        return dadosCandidatura;
    }

    /**
     * @param dadosCandidatura a defenir
     */
    public void setDadosCandidatura(String dadosCandidatura) {
        this.dadosCandidatura = dadosCandidatura;
    }

    /**
     * Transformar os dados numa stringg e devolver
     * @return string
     */
    @Override
    public String toString() {
        return String.format("Dados da candidatura: %s", dadosCandidatura);

    }

    /**
     * @return utilizador que fez a candidatura
     */
    public Utilizador getUtilizador() {
        return utilizador;
    }

}
