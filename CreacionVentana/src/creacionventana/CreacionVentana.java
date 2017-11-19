/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionventana;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author johne
 */
public class CreacionVentana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        JFrame miVentana = new JFrame( "Mi Ventana" );
        
        JPanel Panel = new JPanel();
        
        Panel.setBackground(Color.GREEN);
        
        JLabel lb1 = new JLabel("Hola Mundo");
        Panel.add(lb1);
        
        
        JTextField Te1 =new JTextField(20);
        Panel.add(Te1);
        
        Dimension dim = new Dimension(800,800);
        miVentana.setSize(dim);
   
       
        
        JButton B1 = new JButton("Inicio");
        B1.setSize(50, 50);
        Panel.add(B1);
        
        JButton B2 = new JButton("Hola");
        B2.setSize(100,100);
        Panel.add(B2) ;
        
        
        
        miVentana.add(Panel);
        miVentana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
        
    }
    
}
