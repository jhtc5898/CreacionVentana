/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionventana;

import Controlador.GestionDato;
import Modelo.Participante;
import Modelo.Registro;
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
        
          List<Participante> personaList= new ArrayList();
        List<Registro> registroList=new ArrayList();
        GestionDato gd = new GestionDato(personaList,registroList);
        VentanaPrincipal VP = new VentanaPrincipal("Registro",800,500,gd);
        
    }
    
}
