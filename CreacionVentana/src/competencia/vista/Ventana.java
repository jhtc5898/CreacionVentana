/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.vista;


import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import competencia.controlador.EventoVentana;
import competencia.controlador.GestionDato;

/**
 *
 * @author Jose
 */


public class Ventana extends JFrame{

    private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private ArrayList<JMenuItem> menuList;
    private GestionDato gestionDato;

    public Ventana(GestionDato gestionDato) {
        this.setTitle("Jornadas Deportivas");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(3);
        this.iniciaComponentes();        
        this.gestionDato = gestionDato;
    }

    
    public void iniciaComponentes()
    {
        this.escritorio= new JDesktopPane();
        this.barraMenu= new JMenuBar();
        this.menuList= new ArrayList<JMenuItem>();
        this.menuList.add(new JMenuItem("Persona"));
        this.menuList.add(new JMenuItem("Ciudad"));
        this.menuList.add(new JMenuItem("Competencia"));
        this.menuList.add(new JMenuItem("Registro"));
        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(barraMenu);
        this.barraMenu.add(this.menuList.get(0));
        this.barraMenu.add(this.menuList.get(1));
        this.barraMenu.add(this.menuList.get(2));
        this.barraMenu.add(this.menuList.get(3));
       
        
        
        this.menuList.get(0).addActionListener(new EventoVentana(this));
        this.menuList.get(1).addActionListener(new EventoVentana(this));
        this.menuList.get(2).addActionListener(new EventoVentana(this));
        this.menuList.get(3).addActionListener(new EventoVentana(this));
        
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public ArrayList<JMenuItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<JMenuItem> menuList) {
        this.menuList = menuList;
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

}