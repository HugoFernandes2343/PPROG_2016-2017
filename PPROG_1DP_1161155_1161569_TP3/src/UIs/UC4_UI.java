/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIs;

import Dominio.Utilizador;
import Controllers.UC4_Controller;
/**
 *
 * @author hugod
 */
public class UC4_UI {
    public void criarController(Utilizador utilizador){
 
        Controllers.UC4_Controller controller = new UC4_Controller(utilizador);
    }
}
