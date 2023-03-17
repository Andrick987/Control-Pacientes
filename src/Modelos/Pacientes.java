
package Modelos;

public class Pacientes {
    
    String Apellidos;
    String Nombres;

    public Pacientes(String Apellidos, String Nombres) {
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    
}
