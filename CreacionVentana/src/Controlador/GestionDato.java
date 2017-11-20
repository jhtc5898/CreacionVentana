/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.EventoVentanaPrincipal;
import Modelo.Participante;
import Modelo.Registro;
import creacionventana.VentanaParticipante;
import java.util.List;


public class GestionDato
{
    private List<Participante> ParticipantesList; 
    private List<Registro> RegistroList;

    public GestionDato(List<Participante> ParticipantesList, List<Registro> RegistroList) {
        this.ParticipantesList = ParticipantesList;
        this.RegistroList = RegistroList;
    }

    public List<Registro> getRegistroList() {
        return RegistroList;
    }

    public void setRegistroList(List<Registro> RegistroList) {
        this.RegistroList = RegistroList;
    }

   

    public List<Participante> getParticipantesList() {
        return ParticipantesList;
    }

    public void setParticipantesList(List<Participante> ParticipantesList) {
        this.ParticipantesList = ParticipantesList;
    }
    
    public boolean addParticipante(Participante p) 
            {
                boolean retorno=false;
                retorno=this.ParticipantesList.add(p);
                return retorno;
            }
    public boolean addRegistro(Registro R)
            {
                boolean retorno= false;
                retorno=this.RegistroList.add(R);
                return retorno;
            }
    
}
