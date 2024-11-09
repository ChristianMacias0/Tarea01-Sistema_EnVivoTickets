package sistema_envivotickets.Sistemas;

import sistema_envivotickets.Enums.Estado;
import sistema_envivotickets.Usuarios.User;
import java.util.Date;

public class Ticket {
    private int id;
    private User usuario;
    private Funcion funcion;
    private Asiento asiento;
    private Estado estado = Estado.DISPONIBLE;
    private Date fechaCompra;

    // Métodos
    public void cancelarTicket() {
        if (estado != Estado.AGOTADO) {
            estado = Estado.RESERVADO; // Asumimos que no está cancelado, sino "reservado"
            System.out.println("Ticket cancelado.");
        } else {
            System.out.println("El ticket no puede cancelarse.");
        }
    }

    public boolean esValido() {
        // Ejemplo de lógica mínima para validar el ticket
        return estado == Estado.DISPONIBLE || estado == Estado.RESERVADO;
    }

    // Getters
    public int getId() { return id; }
    public User getUsuario() { return usuario; }
    public Funcion getFuncion() { return funcion; }
    public Asiento getAsiento() { return asiento; }
    public Estado getEstado() { return estado; }
    public Date getFechaCompra() { return fechaCompra; }
}
