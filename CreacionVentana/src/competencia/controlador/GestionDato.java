/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competencia.controlador;

import competencia.modelo.Ciudad;
import competencia.modelo.Competencia;
import competencia.modelo.Inscripcion;
import competencia.modelo.Persona;
import java.util.List;

/**
 *
 * @author Jose
 */
public class GestionDato {
    
    private List<Persona> personaList;
    private List<Ciudad> ciudadList;
    private List<Competencia> competenciaList;
    private List<Inscripcion> inscripcionList;

    public GestionDato(List<Persona> personaList, List<Ciudad> ciudadList, List<Competencia> competenciaList, List<Inscripcion> inscripcionList) {
        this.personaList = personaList;
        this.ciudadList = ciudadList;
        this.competenciaList = competenciaList;
        this.inscripcionList = inscripcionList;
    }
    
   
    
    public boolean addPersona(Persona p)
    {
        return this.personaList.add(p);
    }
    
    public boolean addCiudad(Ciudad c)
    {
        return this.ciudadList.add(c);
    }
    
    public boolean addCompetencia(Competencia com)
    {
        return this.competenciaList.add(com);
    }
    
    public boolean addInscripcion(Inscripcion i)
    {
        return this.inscripcionList.add(i);
    }
    

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public List<Ciudad> getCiudadList() {
        return ciudadList;
    }

    public void setCiudadList(List<Ciudad> ciudadList) {
        this.ciudadList = ciudadList;
    }

    public List<Competencia> getCompetenciaList() {
        return competenciaList;
    }

    public void setCompetenciaList(List<Competencia> competenciaList) {
        this.competenciaList = competenciaList;
    }

    public List<Inscripcion> getInscripcionList() {
        return inscripcionList;
    }

    public void setInscripcionList(List<Inscripcion> inscripcionList) {
        this.inscripcionList = inscripcionList;
    } 
    
}
