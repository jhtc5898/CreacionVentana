/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.controlador;


import competencia.modelo.Competencia;
import competencia.modelo.Inscripcion;
import competencia.modelo.Persona;
import competencia.vista.VentanaCompetencia;
import competencia.vista.VentanaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Jose
 */
public class EventoRegistro implements ActionListener {
    
    private VentanaRegistro ventanaRegistro;
    private Persona persona;
    private Competencia competencia;

    public EventoRegistro(VentanaRegistro VentanaRegistro) {
        this.ventanaRegistro = VentanaRegistro;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int p = this.ventanaRegistro.getBoxPersona().getSelectedIndex();
        int c = this.ventanaRegistro.getBoxCompetencia().getSelectedIndex();

        for(int i = 0; i<this.ventanaRegistro.getBoxPersona().getItemCount();i++)
        {
  
            if(p==i){
               
               this.persona=ventanaRegistro.getGestionDato().getPersonaList().get(i);
               
            }
  
        }
        
        for(int i = 0; i<this.ventanaRegistro.getBoxCompetencia().getItemCount();i++)
        {
            
            if(c==i){
               
               this.competencia=ventanaRegistro.getGestionDato().getCompetenciaList().get(i);
               
            }
    
        }

        Inscripcion registro = new Inscripcion(persona,competencia);
        this.ventanaRegistro.getGestionDato().addInscripcion(registro);
        Object[][] datoRegistro = this.ventanaRegistro.cargaDatosTabla(this.ventanaRegistro.getGestionDato().getInscripcionList().size(), 2);
        this.ventanaRegistro.setDatos(datoRegistro);
        this.ventanaRegistro.getModeloTabla().setDataVector(this.ventanaRegistro.getDatos(), this.ventanaRegistro.getEncabezado());

    }

    public VentanaRegistro getVentanaRegistro() {
        return ventanaRegistro;
    }

    public void setVentanaRegistro(VentanaRegistro ventanaRegistro) {
        this.ventanaRegistro = ventanaRegistro;
    }

    
    
}
