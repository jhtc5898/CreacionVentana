/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionventana;

import Controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author johne
 */
public class VentanaRegistro extends JInternalFrame
{

    private GestionDato gd;
    private List<JPanel> ListPanel;
    private JPanel panel;
    private JPanel panel2;
    private JLabel Label;
    private JLabel Label2;
    private JLabel Label3;
    FlowLayout flowLayout1 = new FlowLayout();
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;

    

    public VentanaRegistro(GestionDato gd)
    {
        super("Ventana Registro",true,true,true,true);
        this.setSize(800, 300);
        this.gd = gd;
        this.IniciaComponente();
        this.setVisible(true);
    }
    public void IniciaComponente()
        {
               LayoutManager disSec = new GridLayout(2,2);
               JPanel panel=new JPanel(disSec);
               
               ListPanel=new ArrayList<JPanel>();
               ListPanel.add(new JPanel(disSec));
               //Label=new JLabel("1");
               ListPanel.add(new JPanel ());
               //this.ListPanel.get(0).setBackground(Color.red);
               this.add(this);
               panel.add(this.ListPanel.get(0));
               
          /*JPanel panel=new JPanel(disSec);
            Label=new JLabel("1");
            Label.setBackground(Color.blue);
            Label2=new JLabel("2");
            Label3=new JLabel("3");
            panel.add(Label);
            panel.add(Label2);
            panel.add(Label3);*/
            
            
            panel2=new JPanel();
      
            
            this.add(panel,BorderLayout.CENTER);
            this.add(panel2,BorderLayout.SOUTH);
            
            
        }
            
    
   
    
}
