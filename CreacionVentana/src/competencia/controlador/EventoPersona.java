/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.controlador;


import competencia.vista.VentanaPersona;
import competencia.modelo.Persona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoPersona implements ActionListener
{

    private VentanaPersona ventanaPersona;

    public EventoPersona(VentanaPersona VentanaPersona) {
        this.ventanaPersona = VentanaPersona;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String n=this.ventanaPersona.getTxtList().get(0).getText();
        String a=this.ventanaPersona.getTxtList().get(1).getText();
        String c=this.ventanaPersona.getTxtList().get(2).getText();
        String f=this.ventanaPersona.getTxtList().get(3).getText();
        Persona persona = new Persona(n,a,c,f);
        this.ventanaPersona.getGestionDato().addPersona(persona);
        this.ventanaPersona.getTxtList().get(0).setText("");
        this.ventanaPersona.getTxtList().get(1).setText("");
        this.ventanaPersona.getTxtList().get(2).setText("");
        this.ventanaPersona.getTxtList().get(3).setText("");
        Object [][] datoPersona=this.ventanaPersona.cargaDatosTabla(this.ventanaPersona.getGestionDato().getPersonaList().size(),4);
        this.ventanaPersona.setDatos(datoPersona);
        this.ventanaPersona.getModeloTabla().setDataVector(this.ventanaPersona.getDatos(), this.ventanaPersona.getEncabezado());
     
    }
    
    public VentanaPersona getVentanaPersona() {
        return ventanaPersona;
    }

    public void setVentanaPersona(VentanaPersona VentanaPersona) {
        this.ventanaPersona = VentanaPersona;
    }   
   
}
