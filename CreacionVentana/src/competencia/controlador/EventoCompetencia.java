/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.controlador;


import competencia.modelo.Ciudad;
import competencia.modelo.Competencia;
import competencia.vista.VentanaCompetencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Jose
 */
public class EventoCompetencia implements ActionListener {

    private VentanaCompetencia ventanaCompetencia;
    private Ciudad ciudad;
   
    

    public EventoCompetencia(VentanaCompetencia VentanaCompetencia) {
        this.ventanaCompetencia = VentanaCompetencia;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String n = this.ventanaCompetencia.getTxtList().get(0).getText();
        String f = this.ventanaCompetencia.getTxtList().get(1).getText();
        int p = this.ventanaCompetencia.getBoxCiudad().getSelectedIndex();
        
       
        for(int i = 0; i<this.ventanaCompetencia.getBoxCiudad().getItemCount();i++)
        {
            
            if(p==i){
               
               this.ciudad=ventanaCompetencia.getGestionDato().getCiudadList().get(i);
               
            }
            
            
        }

        
        Competencia competencia = new Competencia(n, f,ciudad);

        this.ventanaCompetencia.getGestionDato().addCompetencia(competencia);

        this.ventanaCompetencia.getTxtList().get(0).setText("");
        this.ventanaCompetencia.getTxtList().get(1).setText("");

        Object[][] datoCompetencia = this.ventanaCompetencia.cargaDatosTabla(this.ventanaCompetencia.getGestionDato().getCompetenciaList().size(), 3);
        this.ventanaCompetencia.setDatos(datoCompetencia);
        this.ventanaCompetencia.getModeloTabla().setDataVector(this.ventanaCompetencia.getDatos(), this.ventanaCompetencia.getEncabezado());

    }

    public VentanaCompetencia getVentanaCompetencia() {
        return ventanaCompetencia;
    }

    public void setVentanaCompetencia(VentanaCompetencia ventanaCompetencia) {
        this.ventanaCompetencia = ventanaCompetencia;
    }

    
    
}
