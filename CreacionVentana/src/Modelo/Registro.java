/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author johne
 */
public class Registro
{
    private Participante Participante;

    public Registro(Participante Participante) {
        this.Participante = Participante;
    }

    public Participante getParticipante() {
        return Participante;
    }

    public void setParticipante(Participante Participante) {
        this.Participante = Participante;
    }
    
    
    
}
