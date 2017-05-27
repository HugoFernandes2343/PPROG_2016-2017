package Dominio;

import java.io.Serializable;

/**
 *
 * @author Hugo Fernandes; Hugo Carvalho
 */
public class Utilizador implements Serializable {

    private String nome;
    private String username;
    private String email;
    private String password;
    private static final String DADOS_POR_OMISSAO = "Sem dados";

    /**
     * construtor completo do utilizador
     *
     * @param nome nome do utilizador
     * @param username username do utilizador
     * @param email email do utilizador
     * @param password password do utilizador
     */
    public Utilizador(String nome, String username, String email, String password) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    /**
     * construtor vazio do utilizadot
     */
    public Utilizador() {
        this.nome = DADOS_POR_OMISSAO;
        this.username = DADOS_POR_OMISSAO;
        this.email = DADOS_POR_OMISSAO;
        this.password = DADOS_POR_OMISSAO;
    }

    /**
     * devolve username
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * devolve email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * devolve password
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * compara dois utilizadores e verifica se sao iguais
     *
     * @param outroObjeto segundo utilizador a comparar
     * @return boolean a confirmar ou negar que sao iguais
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Utilizador outroUtilizador = (Utilizador) outroObjeto;
        return this.username.equalsIgnoreCase(outroUtilizador.getUsername());
    }

    /**
     * devolve os dados do utilizador em formato string
     *
     * @return string dos dados
     */
    @Override
    public String toString() {
        return String.format("Nome: %s%nEmail: %s%n", nome, email);
    }
}
