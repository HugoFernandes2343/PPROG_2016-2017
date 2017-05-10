/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Hugo
 */
public class LOGIN extends JFrame {
    
    public LOGIN(){
    super("LOGIN");
    setLayout(new BorderLayout());
    setMaximumSize(new Dimension(350,250));
    setMinimumSize(new Dimension(300,200));
    //pack();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    criarComponentes();
    setVisible(true);
    
    
    
    }

    private void criarComponentes() {
        JLabel label1=new JLabel("Bem Vindo. Introduza as suas credenciais");
        add(label1, BorderLayout.NORTH);
        JPanel credenciais=new JPanel(new GridLayout(2,1));
        JPanel credenciais1=new JPanel();
        JPanel credenciais2=new JPanel();
        JLabel user=new JLabel("Nome da conta ou email:");
        JTextField userTextField=new JTextField();
        userTextField.setPreferredSize(new Dimension(125,25));
        JLabel password=new JLabel("Password:");
        JPasswordField passwordTextField=new JPasswordField ();
        passwordTextField.setPreferredSize(new Dimension(125,25));
        credenciais1.add(user);
        credenciais1.add(userTextField);
        credenciais2.add(password);
        credenciais2.add(passwordTextField);
        credenciais.add(credenciais1);
        credenciais.add(credenciais2);
        add(credenciais, BorderLayout.CENTER);
       
    }
}
