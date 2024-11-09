package sistema_envivotickets.Sistemas;

public class Evento {
    private int id;
    private String nombre;
    private String tipo;
    private String descripcion;

    // Métodos
    public void agregarEvento(Evento evento) {
        // Simulación de agregación a la base de datos
        System.out.println("Evento agregado: " + evento.getNombre());
    }

    public void eliminarEvento(Evento evento) {
        // Simulación de eliminación de la base de datos
        System.out.println("Evento eliminado: " + evento.getNombre());
    }

    public void gestionarPreciosPromociones() {
        System.out.println("Configurando precios y promociones...");
    }

    public void gestionarPoliticasCancelacion(String politicas) {
        System.out.println("Política de cancelación actualizada: " + politicas);
    }

    public void gestionarConfiguracionEvento() {
        System.out.println("Configuración del evento actualizada.");
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public String getDescripcion() { return descripcion; }
}
