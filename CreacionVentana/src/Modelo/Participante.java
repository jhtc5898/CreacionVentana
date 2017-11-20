
package Modelo;


public class Participante 
{
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String FNa;

    public Participante(String Nombre, String Apellido, String Cedula, String FNa) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.FNa = FNa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getFNa() {
        return FNa;
    }

    public void setFNa(String FNa) {
        this.FNa = FNa;
    }


    
}
