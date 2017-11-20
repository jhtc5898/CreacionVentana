/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionventana;


import competencia.controlador.GestionDato;
import competencia.modelo.Ciudad;
import competencia.modelo.Competencia;
import competencia.modelo.Inscripcion;
import competencia.modelo.Persona;
import competencia.vista.Ventana;
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
        
         
        List<Persona> p = new ArrayList<Persona>();
        List<Ciudad> c = new ArrayList<Ciudad>();
        List<Competencia> com = new ArrayList<Competencia>();
        List<Inscripcion> i = new ArrayList<Inscripcion>();
        
        GestionDato gD = new GestionDato(p,c,com,i);
        Ventana v = new Ventana(gD);
        v.setVisible(true);
        
    }
    
}
