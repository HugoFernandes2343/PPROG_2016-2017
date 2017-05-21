package Dominio;

public class Candidatura {

    private String nomeCandidatura = "";
    private String dadosCandidatura;
    private static String DADOS_POR_OMISSAO = "Sem dados";

    /**
     *
     */
    public Candidatura() {
        this.dadosCandidatura = DADOS_POR_OMISSAO;

    }

    /**
     * @return the dadosCandidatura
     */
    public String getDadosCandidatura() {
        return dadosCandidatura;
    }

    /**
     *
     * @param nomeCandidatura
     */
    public void setNomeCandidatura(String nomeCandidatura) {
        this.nomeCandidatura = nomeCandidatura;
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
     *
     * @return
     */
    public String getNomeCandidatura() {
        return nomeCandidatura;
    }

}
