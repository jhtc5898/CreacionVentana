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
public class Ciudad {
    
    private String nombre;
    private String provincia;
    private String datoComboN;

    
    public Ciudad(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public Ciudad(String datoComboN) {
        
        this.datoComboN=datoComboN;
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDatoComboN() {
        return datoComboN;
    }

    public void setDatoComboN(String datoComboN) {
        this.datoComboN = datoComboN;
    }

    
    
    @Override
    public String toString() {
        return nombre + "-" + provincia;
    }
    
    
    
}
