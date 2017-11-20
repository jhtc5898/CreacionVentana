/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.controlador;

import competencia.modelo.Ciudad;
import competencia.vista.VentanaCiudad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jose
 */
    
public class EventoCiudad implements ActionListener
{

    private VentanaCiudad ventanaCiudad;

    public EventoCiudad(VentanaCiudad VentanaCiudad) {
        this.ventanaCiudad = VentanaCiudad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String n=this.ventanaCiudad.getTxtList().get(0).getText();
        String p=this.ventanaCiudad.getTxtList().get(1).getText();
        
        Ciudad ciudad = new Ciudad(n,p);
        this.ventanaCiudad.getGestionDato().addCiudad(ciudad);
        this.ventanaCiudad.getTxtList().get(0).setText("");
        this.ventanaCiudad.getTxtList().get(1).setText("");
        
        Object [][] datoCiudad=this.ventanaCiudad.cargaDatosTabla(this.ventanaCiudad.getGestionDato().getCiudadList().size(),2);
        this.ventanaCiudad.setDatos(datoCiudad);
        this.ventanaCiudad.getModeloTabla().setDataVector(this.ventanaCiudad.getDatos(), this.ventanaCiudad.getEncabezado());
     
    }

    public VentanaCiudad getVentanaCiudad() {
        return ventanaCiudad;
    }

    public void setVentanaCiudad(VentanaCiudad ventanaCiudad) {
        this.ventanaCiudad = ventanaCiudad;
    }
    
   
    
}
