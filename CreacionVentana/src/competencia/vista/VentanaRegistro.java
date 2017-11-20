/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.vista;

import competencia.controlador.EventoRegistro;
import competencia.controlador.GestionDato;
import competencia.modelo.Competencia;
import competencia.modelo.Inscripcion;
import competencia.modelo.Persona;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;

/**
 *
 * @author Jose
 */
public class VentanaRegistro extends JInternalFrame {
    
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
    private JComboBox BoxPersona;
    private JComboBox BoxCompetencia;
       
    
    public VentanaRegistro(GestionDato gestionDato) {
        super("Registrar Registro",true,true,true,true);
        this.gestionDato = gestionDato;
        this.iniciaComponentes();
        this.setSize(700, 500);        
        
    }
    
    public void iniciaComponentes()
    {
        
        
        this.etiList= new ArrayList<JLabel>();
        this.txtList= new ArrayList<JTextField>();
        this.etiList.add(new JLabel("Persona"));
        this.etiList.add(new JLabel("Competencia"));
         
        JPanel panel = new JPanel(new FlowLayout());
        
        panel.add(this.etiList.get(0));
        this.BoxPersona=new JComboBox(this.CargarCombo());
        panel.add(this.BoxPersona);
        
        panel.add(this.etiList.get(1));
        this.BoxCompetencia=new JComboBox(this.CargarCombo2());
        panel.add(this.BoxCompetencia);
        
        this.encabezado= new Object[2];               
        this.encabezado[0]="Persona";
        this.encabezado[1]="Competencia";
        
        this.datos=cargaDatosTabla(this.gestionDato.getInscripcionList().size(),2);
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);        
        this.tabla= new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        this.boton=new JButton("Guardar");
        this.boton.addActionListener(new EventoRegistro(this));
        
        panel.add(this.boton);
        panel.add(this.scroll);
       
        
        
        this.add(panel);
        
        
    }
    
    public String[]CargarCombo()
    {
        String[] retorno = new String [this.gestionDato.getPersonaList().size()];
        int i=0;
        
        for(Persona p:this.gestionDato.getPersonaList())
        {
            retorno[i]= p.getNombre()+"-"+p.getApellido()+"-"+p.getCedula()+"-"+p.getFechaNacimiento();
            i++;
        }
        
        return retorno;
        
    }
    
    public String[]CargarCombo2()
    {
        String[] retorno = new String [this.gestionDato.getCompetenciaList().size()];
        int i=0;
        
        for(Competencia c:this.gestionDato.getCompetenciaList())
        {
            retorno[i]= c.getNombre()+"-"+c.getFecha()+"-"+c.getCiudad();
            i++;
        }
        
        return retorno;
        
    }
    
    public Object[][] cargaDatosTabla(int h, int w)
    {
        Object[][] retorno= new Object[h][w];
        int i=0;
        for(Inscripcion in:this.gestionDato.getInscripcionList())
        {
            retorno[i][0]=in.getPersona();
            retorno[i][1]=in.getCompetencia();
           
            
            i++;
        }        
        return retorno;
    }

    public JComboBox getBoxPersona() {
        return BoxPersona;
    }

    public void setBoxPersona(JComboBox BoxPersona) {
        this.BoxPersona = BoxPersona;
    }

    public JComboBox getBoxCompetencia() {
        return BoxCompetencia;
    }

    public void setBoxCompetencia(JComboBox BoxCompetencia) {
        this.BoxCompetencia = BoxCompetencia;
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
