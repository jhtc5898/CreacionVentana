/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.modelo;

/**
 *
 * @author Jose
 */
public class Inscripcion {
    
    private Persona persona;
    private Competencia competencia;

    public Inscripcion(Persona persona, Competencia competencia) {
        this.persona = persona;
        this.competencia = competencia;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
    
    
    
}
