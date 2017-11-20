/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Participante;
import creacionventana.VentanaParticipante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventoVentanaParticipante implements ActionListener
{
    private VentanaParticipante vP;
    private GestionDato gd;

    public EventoVentanaParticipante(VentanaParticipante vP, GestionDato gd) {
        this.vP = vP;
        this.gd = gd;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource().equals(this.vP.getBtn()))
            {
                String nombre=this.vP.getTxtList().get(0).getText();
                String apellido=this.vP.getTxtList().get(1).getText();
                String cedula=this.vP.getTxtList().get(2).getText();
                String feNac=this.vP.getTxtList().get(3).getText();
                Participante p = new Participante(nombre,apellido,cedula,feNac);
                gd.addParticipante(p);
                System.err.println("Persona Guardada");
                
            }
        //Crear un objeto tipo tabla que contiene los datos del participante y el tama;o de las columnas
        Object[][] datosParticipante=this.vP.cargarDatosTabla(this.vP.getGd().getParticipantesList().size(), 4);
        //poner los datos
       this.vP.setDatos(datosParticipante);
        //poner el contenido de datos y de encabezado
        this.vP.getModeloTabla().setDataVector(this.vP.getDatos(),this.vP.getEncabezado());
        
    }

    public VentanaParticipante getvP() {
        return vP;
    }

    public void setvP(VentanaParticipante vP) {
        this.vP = vP;
    }

    public GestionDato getGd() {
        return gd;
    }

    public void setGd(GestionDato gd) {
        this.gd = gd;
    }
    
}
