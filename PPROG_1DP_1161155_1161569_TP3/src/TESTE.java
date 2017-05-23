
import Controllers.*;
import Dominio.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugo
 */
public class TESTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        FicheiroCentroEventos ficheiroCentroEventos
                = new FicheiroCentroEventos();

        CentroDeEventos centroEventos = ficheiroCentroEventos.ler();
        if (centroEventos == null) { //Caso não seja encontrado o ficheiro ou este ainda não exista
            System.out.println("Objeto CentroEventos nulo");
        }
        ficheiroCentroEventos.guardar(centroEventos);
    }

}
