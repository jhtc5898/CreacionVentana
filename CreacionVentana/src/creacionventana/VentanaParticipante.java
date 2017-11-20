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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaParticipante extends JInternalFrame
{ 
    //Uso del comboBox
    private JComboBox ComboBox;
    //
    private JPanel panel;
    private JButton Btn;
    private List<JTextField> txtList;
    private List<JLabel> etiList;
//Agregacion de una Tabla
    private Object [][] datos;// Objeto que contiene los datos de la tablla
    private Object [] Encabezado;// Objeto que contiene los nombres de cada columna
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane Scroll;
    //Necesario un atributo con Gestion Dato 
    private GestionDato gd;
    public VentanaParticipante(GestionDato gd) 
    {
    super("Participante",true,true,true,true) ;// Los true son el boton de cerrar pestania    
    this.setSize(400,500);
    this.gd=gd;
    this.IniciaComponete();
    this.setVisible(true);
    }
    public void IniciaComponete()
    {
       panel = new JPanel(new BorderLayout()); 
       ///
       txtList = new ArrayList<JTextField>();
       txtList.add(new JTextField());
       txtList.add(new JTextField());
       txtList.add(new JTextField());
       txtList.add(new JTextField());
       //
       etiList = new ArrayList<JLabel>();
       etiList.add(new JLabel("Nombre"));
       etiList.add(new JLabel("Apellido"));
       etiList.add(new JLabel("Cedula"));
       etiList.add(new JLabel("Fecha Nacimiento "));
       
       Btn = new JButton("Guardar");
       this.Btn.addActionListener(new EventoVentanaParticipante(this,this.gd));
       
      

       
       LayoutManager disSec = new GridLayout(4,2);
       LayoutManager disLimpiar = new FlowLayout();
       
       JPanel panNorte = new JPanel(disLimpiar);
       JPanel panelIngreso = new JPanel(disSec);
       
        //Creacion del combo box
       this.ComboBox= new JComboBox(this.CargarCombo());
       panelIngreso.add(this.ComboBox);
       
       
       for(int i = 0 ;i <this.etiList.size();i++)
           {
               panelIngreso.add(this.etiList.get(i));
               panelIngreso.add(this.txtList.get(i));
           }
       // Generar la Tabla con los datos ingresados
       this.Encabezado=new Object [4];//Vector del los encabezados
       this.Encabezado[0] = "Nombre";
       this.Encabezado[1]="Apellido";
       this.Encabezado[2]= "Cedula";
       this.Encabezado[3]="Fecha Nacimiento";
       //Enviar la dimension del objeo con la cantidad de datos que se ingresan de persona)
       this.datos=cargarDatosTabla(this.gd.getParticipantesList().size(),4);
       //
       this.modeloTabla= new DefaultTableModel(this.datos,this.Encabezado);
       this.tabla=new JTable(this.modeloTabla);
       this.Scroll=new JScrollPane(this.tabla);
      panNorte.add(panelIngreso,BorderLayout.CENTER);
        panNorte.add(this.Btn,BorderLayout.SOUTH);
         panel.add(this.Scroll,BorderLayout.CENTER);
       
       panel.add(panNorte,BorderLayout.NORTH);
       this.add(panel);
    }
    
    public Object[][] cargarDatosTabla(int f,int c)
    {
        Object [] [] retorno = new Object[f][c];
        int i = 0;
        for (Participante p:this.gd.getParticipantesList())
             {
                 retorno[i][0]=p.getNombre();
                 retorno[i][1]=p.getApellido();
                 retorno[i][2]=p.getCedula();
                 retorno[i][3]=p.getFNa();
                 
                 i++;
                 
             }
        return retorno;
    }
    
    public String [] CargarCombo()
    {
        //Dimensionamos el tamanio combobox
        String[] retorno = new String[this.gd.getParticipantesList().size()];
        int i =0;
        for(Participante p:this.gd.getParticipantesList())
            {
              retorno[i]=p.getNombre()+"-"+p.getCedula();
              i++;
            }
        return retorno;
    }

    public JComboBox getComboBox() {
        return ComboBox;
    }

    public void setComboBox(JComboBox ComboBox) {
        this.ComboBox = ComboBox;
    }

    
    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getBtn() {
        return Btn;
    }

    public void setBtn(JButton Btn) {
        this.Btn = Btn;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return Encabezado;
    }

    public void setEncabezado(Object[] Encabezado) {
        this.Encabezado = Encabezado;
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
        return Scroll;
    }

    public void setScroll(JScrollPane Scroll) {
        this.Scroll = Scroll;
    }

    public GestionDato getGd() {
        return gd;
    }

    public void setGd(GestionDato gd) {
        this.gd = gd;
    }
    
    
}
