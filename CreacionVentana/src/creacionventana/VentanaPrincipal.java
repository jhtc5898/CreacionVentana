/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionventana;

import Controlador.EventoVentanaParticipante;
import Controlador.GestionDato;
import Modelo.EventoVentanaPrincipal;
import Modelo.Participante;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends JFrame 
{
    //Creacion de un barra de Menu en la ventana Principal
    private JDesktopPane escritorio;//Especificamos que esta sera la ventana principal de las JInternalFrame
    private JPanel Panel;
    private JMenuBar Menu;
    private java.util.List<JMenu> menuList;
    private java.util.List<JMenuItem> menuItemList;
    private GestionDato gd1;
    
    //
    
    //Uso del comboBox
    private JComboBox ComboBox;
    //
    private JPanel panel;
    private JButton Btn;
    private java.util.List<JTextField> txtList;
    private java.util.List<JLabel> etiList;
//Agregacion de una Tabla
    private Object [][] datos;// Objeto que contiene los datos de la tablla
    private Object [] Encabezado;// Objeto que contiene los nombres de cada columna
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane Scroll;
    //Necesario un atributo con Gestion Dato 
    private GestionDato gd;

    VentanaPrincipal(String registro, int i, int i0,GestionDato gd) {
      super(registro);
      this.setSize(i, i0);
      this.setDefaultCloseOperation(3);
      this.gd1=gd;
      this.IniciaComponentes();
      this.setVisible(true);
      
    }
    
    
    public void IniciaComponentes ()
    {
        //Linea de codigo para la agregacion de la barra de menu
        this.escritorio=new JDesktopPane();//llamamos a nuestro etributo
        this.Menu=new JMenuBar();//llamamos a nuestro menubar
        this.menuList=new ArrayList<JMenu>();// llamado al array
        this.menuList.add(new JMenu("Persona"));// ingreso de datos en el array
        this.menuItemList=new ArrayList<JMenuItem>();//llamado al Arra
        this.menuItemList.add(new JMenuItem ("Participante"));//ingreso de datos al array
        this.menuItemList.add(new JMenuItem("Ciudad"));
        this.menuItemList.add(new JMenuItem("Competencia"));
        this.menuItemList.add(new JMenuItem("Inscripcion"));
//Linea de agregacion  para la barra de Menu
        this.setContentPane(this.escritorio);// Creacion del contenedor
        this.setJMenuBar(Menu);//Creacion de la barra de menu
        this.Menu.add(this.menuList.get(0));// Agregacion del Menu
//Linea de codigo para agregacion del item a la barra de menu
        this.menuList.get(0).add(this.menuItemList.get(0));
        this.menuList.get(0).add(this.menuItemList.get(1));
        this.menuList.get(0).add(this.menuItemList.get(2));
        this.menuList.get(0).add(this.menuItemList.get(3));
        
        // Codigo para que cada item realize una accion 
        this.menuItemList.get(0).addActionListener(new EventoVentanaPrincipal(this,this.gd1) ); 
        this.menuItemList.get(3).addActionListener(new EventoVentanaPrincipal(this,this.gd1) ); 
        //
        
        //
        
        
    }
    
     
    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JPanel getPanel() {
        return Panel;
    }

    public void setPanel(JPanel Panel) {
        this.Panel = Panel;
    }

    public JMenuBar getMenu() {
        return Menu;
    }

    public void setMenu(JMenuBar Menu) {
        this.Menu = Menu;
    }

    public java.util.List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(java.util.List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public java.util.List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(java.util.List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public GestionDato getGd() {
        return gd1;
    }

    public void setGd(GestionDato gd) {
        this.gd1 = gd;
    }


}

  