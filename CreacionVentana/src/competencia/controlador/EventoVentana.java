/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.controlador;

import competencia.vista.Ventana;
import competencia.vista.VentanaCiudad;
import competencia.vista.VentanaCompetencia;
import competencia.vista.VentanaPersona;
import competencia.vista.VentanaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jose
 */
public class EventoVentana implements ActionListener {

    private Ventana ventana;

    public EventoVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.ventana.getMenuList().get(0))) {
            VentanaPersona vP = new VentanaPersona(this.ventana.getGestionDato());
            vP.setVisible(true);
            this.ventana.getEscritorio().add(vP);
        }

        if (e.getSource().equals(this.ventana.getMenuList().get(1))) {
            VentanaCiudad vC = new VentanaCiudad(this.ventana.getGestionDato());
            vC.setVisible(true);
            this.ventana.getEscritorio().add(vC);

        }

        if (e.getSource().equals(this.ventana.getMenuList().get(2))) {
            VentanaCompetencia vCom = new VentanaCompetencia(this.ventana.getGestionDato());
            vCom.setVisible(true);
            this.ventana.getEscritorio().add(vCom);
        }
        
        if (e.getSource().equals(this.ventana.getMenuList().get(3))) {
            VentanaRegistro vR = new VentanaRegistro(this.ventana.getGestionDato());
            vR.setVisible(true);
            this.ventana.getEscritorio().add(vR);
        }

    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

}
