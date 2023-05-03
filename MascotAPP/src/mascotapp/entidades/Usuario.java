
package mascotapp.entidades;

import java.util.Date;

public class Usuario {
    public String nombre;
    public String apellido;
    public int ci;
    public Date nacimiento;
    public String pais;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int ci, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.nacimiento = nacimiento;
    }
    
    
    
}
