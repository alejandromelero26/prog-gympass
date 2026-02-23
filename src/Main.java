public class Main {
    public static void main(String[] args) {
        // Crear 2 socios
        Socio socio1 = new Socio(101, "Carlos Pérez");
        Socio socio2 = new Socio(102, "Ana García");

        // Crear 2 salas
        Sala sala1 = new Sala(1, "Sala de Boxeo");
        Sala sala2 = new Sala(2, "Sala de Pilates");

        // Mostrar información por consola
        System.out.println("--- Información de Socios ---");
        System.out.println(socio1.toString());
        System.out.println(socio2.toString());

        System.out.println("\n--- Información de Salas ---");
        System.out.println(sala1.toString());
        System.out.println(sala2.toString());
    }
}
