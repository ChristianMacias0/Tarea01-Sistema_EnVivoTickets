package sistema_envivotickets.Sistemas;

import sistema_envivotickets.Enums.Estado;

public class Asiento {
    private int id;
    private String numero;
    private Seccion seccion;
    private Estado estado = Estado.DISPONIBLE;

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Número: " + numero);
        System.out.println("Sección: " + seccion.getNombre());
        System.out.println("Estado: " + estado);
    }

    public void reservar() {
        if (estado == Estado.DISPONIBLE) {
            estado = Estado.RESERVADO;
            System.out.println("Asiento reservado con éxito.");
        } else {
            System.out.println("El asiento no está disponible para reserva.");
        }
    }

    public void liberar() {
        if (estado == Estado.RESERVADO) {
            estado = Estado.DISPONIBLE;
            System.out.println("Asiento liberado.");
        } else {
            System.out.println("El asiento no está reservado.");
        }
    }

    public int getId() { return id; }
    public String getNumero() { return numero; }
    public Seccion getSeccion() { return seccion; }
    public Estado getEstado() { return estado; }
}
