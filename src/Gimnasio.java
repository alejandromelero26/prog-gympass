public class Gimnasio {
    // declaramos los atributos
    private String codigo;
    private String nombre;
    private Socio[] listaSocios;
    private Sala[] listaSalas;
    private int responsableId;

    // realizamos los distintos constructores
    public Gimnasio(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaSocios = new Socio[12]; // Tamaño fijo 12
        this.listaSalas = new Sala[6];    // Tamaño fijo 6
        this.responsableId = -1;          // Inicializado a -1
    }

    // --- metodos obligatorios ---

    /**
     * Agrega un socio al primer espacio disponible en el arreglo.
     * @return true si se pudo agregar, false si está lleno.
     */

    public boolean agregarSocio(Socio nuevoSocio) {
        for (int i = 0; i < listaSocios.length; i++) {
            if (listaSocios[i] == null) {
                listaSocios[i] = nuevoSocio;
                return true;
            }
        }
        return false;
    }

    /**
     * Agrega una sala al primer espacio disponible.
     * @return true si se pudo agregar, false si está lleno.
     */

    public boolean agregarSala(Sala nuevaSala) {
        for (int i = 0; i < listaSalas.length; i++) {
            if (listaSalas[i] == null) {
                listaSalas[i] = nuevaSala;
                return true;
            }
        }
        return false;
    }

    /**
     * Asigna el ID del responsable.
     */

    public void asignarResponsable(int id) {
        this.responsableId = id;
    }

    // Getters

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public Socio[] getListaSocios() {
        return listaSocios;
    }
    public Sala[] getListaSalas() {
        return listaSalas;
    }

    public int getResponsableId() {
        return responsableId;
    }

    // Setters

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


