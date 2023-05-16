/*
Juego Ahorcado: 
Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 */
package entidad;

/**
 *
 * @author usuario
 */
public class Ahorcado {
    private String[] palabra;
    private int lEncontradas;
    private int CantJuadasMax;
    private String[] palabraAdivina;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int lEncontradas, int CantJuadasMax, String[] palabraAdivina) {
        this.palabra = palabra;
        this.lEncontradas = lEncontradas;
        this.CantJuadasMax = CantJuadasMax;
        this.palabraAdivina = palabraAdivina;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getlEncontradas() {
        return lEncontradas;
    }

    public void setlEncontradas(int lEncontradas) {
        this.lEncontradas = lEncontradas;
    }

    public int getCantJuadasMax() {
        return CantJuadasMax;
    }

    public void setCantJuadasMax(int CantJuadasMax) {
        this.CantJuadasMax = CantJuadasMax;
    }

    public String[] getPalabraAdivina() {
        return palabraAdivina;
    }

    public void setPalabraAdivina(String[] palabraAdivina) {
        this.palabraAdivina = palabraAdivina;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", lEncontradas=" + lEncontradas + ", CantJuadasMax=" + CantJuadasMax + ", palabraAdivina=" + palabraAdivina + '}';
    }
    
}
