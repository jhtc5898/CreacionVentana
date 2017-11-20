/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.vista;

import competencia.controlador.EventoPersona;
import competencia.controlador.GestionDato;
import competencia.modelo.Persona;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jose
 */
public class VentanaPersona extends JInternalFrame{
    
    private GestionDato gestionDato;
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private JPanel panel;
       
    
    public VentanaPersona(GestionDato gestionDato) {
        super("Registrar Persona",true,true,true,true);
        this.gestionDato = gestionDato;
        this.iniciaComponentes();
        this.setSize(700, 500);        
        
    }
    
    public void iniciaComponentes()
    {
        
        
        this.etiList= new ArrayList<JLabel>();
        this.txtList= new ArrayList<JTextField>();
        this.etiList.add(new JLabel("Nombre"));
        this.etiList.add(new JLabel("Apellido"));
        this.etiList.add(new JLabel("Cédula"));
        this.etiList.add(new JLabel("Fecha de Nacimiento"));
        this.txtList.add(new JTextField(5));
        this.txtList.add(new JTextField(5));
        this.txtList.add(new JTextField(5));
        this.txtList.add(new JTextField(5)); 
         
        JPanel panel = new JPanel(new FlowLayout());
        
        panel.add(this.etiList.get(0));
        panel.add(this.txtList.get(0));
        
        panel.add(this.etiList.get(1));
        panel.add(this.txtList.get(1));
        
        panel.add(this.etiList.get(2));
        panel.add(this.txtList.get(2));
        
        panel.add(this.etiList.get(3));
        panel.add(this.txtList.get(3));
        
        
        
        this.encabezado= new Object[4];               
        this.encabezado[0]="Nombre";
        this.encabezado[1]="Apellido";
        this.encabezado[2]="Cedula";
        this.encabezado[3]="Fecha de Nacimiento";
        
        
        this.datos=cargaDatosTabla(this.gestionDato.getPersonaList().size(),4);
        
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);        
        this.tabla= new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        this.boton=new JButton("Guardar");
        this.boton.addActionListener(new EventoPersona(this));
        
        panel.add(this.boton);
        panel.add(this.scroll);
        
        
        this.add(panel);
        
        
    }
    
    public Object[][] cargaDatosTabla(int h, int w)
    {
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(Persona p:this.gestionDato.getPersonaList())
        {
            retorno[i][0]=p.getNombre();
            retorno[i][1]=p.getApellido();
            retorno[i][2]=p.getCedula();
            retorno[i][3]=p.getFechaNacimiento();
            i++;
        }        
        return retorno;
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    
    
}
    
