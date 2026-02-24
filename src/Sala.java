public class Sala {
    // Atributos privados
    private final int codigoSala;
    private final String descripcion;


    public Sala(int codigoSala, String descripcion) {
        this.codigoSala = codigoSala;
        this.descripcion = descripcion;
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Sala [codigo=" + codigoSala + ", descripcion=" + descripcion + "]";
    }
}