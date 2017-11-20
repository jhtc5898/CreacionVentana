
package Modelo;

import Controlador.GestionDato;
import creacionventana.VentanaParticipante;
import creacionventana.VentanaPrincipal;
import creacionventana.VentanaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoVentanaPrincipal implements ActionListener
{
private VentanaPrincipal ventanaPrincipal;   
private GestionDato gd;

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(0)))//Accion a realizar cuando el menuList en la posicion 0 sea activado 
       {
           //Accion a realizar cuando el boton sea pulsado 
           System.err.println("Ventana Inscripcion");
           VentanaParticipante Vp = new VentanaParticipante(this.gd);
           Vp.setVisible(true);
           this.ventanaPrincipal.getEscritorio().add(Vp);
       }
        if(e.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(3)))//Accion a realizar cuando el menuList en la posicion 0 sea activado 
       {
            System.err.println("Ventana Registro");
            VentanaRegistro Vr = new VentanaRegistro(this.gd);
            Vr.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(Vr);
            
       }
    }

    public EventoVentanaPrincipal(VentanaPrincipal ventanaPrincipal, GestionDato gd) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.gd = gd;
    }

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public GestionDato getGd() {
        return gd;
    }

    public void setGd(GestionDato gd) {
        this.gd = gd;
    }
    
}
