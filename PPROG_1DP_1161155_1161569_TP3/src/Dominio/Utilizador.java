package Dominio;

import java.io.Serializable;

public class Utilizador implements Serializable {

    private String nome;
    private String username;
    private String email;
    private String password;
    private static final String DADOS_POR_OMISSAO = "Sem dados";

    public Utilizador(String nome, String username, String email, String password) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Utilizador() {
        this.nome = DADOS_POR_OMISSAO;
        this.username = DADOS_POR_OMISSAO;
        this.email = DADOS_POR_OMISSAO;
        this.password = DADOS_POR_OMISSAO;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

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

    public String toString() {
        return String.format("Nome: %s%nEmail: %s%n", nome, email);
    }
}
