package mascotapp.entidades;

public class Mascota {

    private String nombre;
    private String apodo;
    //que tipo de animal es ej: perro, gato, etc...
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int enería;
    
    //Constructor vacio
    public Mascota() {
    }

    //COstructor con parametros
    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;

    }
    
    //setter y getter

    public void setNombre(String nombre) {

        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    


    

}
