public class Socio {
    private final int numSocio;
    private final String nombre;

    public Socio(int numSocio, String nombre) {
        this.numSocio = numSocio;
        this.nombre = nombre;
    }
    public int getNumSocio() {

        return numSocio;
    }
    public String getNombre() {
        return nombre;
    }
    public String toString() {
        return "[" + numSocio + "] " + nombre;
    }

}
