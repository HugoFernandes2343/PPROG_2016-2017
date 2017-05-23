package Dominio;

import java.io.Serializable;



public class Utilizador implements Serializable{

	private String nome;
	private String username;
	private String email;
	private String password;


        public Utilizador(String nome,String username,String email,String password){
        this.nome=nome;
        this.username=username;
        this.email=email;
        this.password=password;
        }
}