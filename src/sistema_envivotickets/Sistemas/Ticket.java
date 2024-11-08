package sistema_envivotickets.Sistemas;
import java.util.Date;

import sistema_envivotickets.Enums.Estado;
import sistema_envivotickets.Usuarios.*;

public class Ticket {
    
    //ATRIBUTOS
    
    private int id;
    private User usuario;
    private Funcion funcion;
    private Asiento asiento;
    private Estado estado;
    private Date fechaCompra;

    //METODOS
    private static boolean confirmarCompra(){
        // LOGICA DE VERIFICACION DE LA TRANSACCION DE COMPRA
    }

    public static Ticket comprarTicket(){
        Ticket ticket = new Ticket();
        //LOGICA DE COMPRA DE TICKET
        
        return confirmarCompra() ? ticket : null;
    }

    public void cancelarTicket(){
        //LOGICA DE CANCELACION DE TICKET
    }

    public boolean esValido(){
        //LOGICA DE VERIFICACION DE VALIDIDAD DEL TICKET
    }


    //GETTERS

    public int getId() {
        return id;
    }
    
    public User getUsuario() {
        return usuario;
    }
    
    public Funcion getFuncion() {
        return funcion;
    }
    
    public Asiento getAsiento() {
        return asiento;
    }
    
    public Estado getEstado() {
        return estado;
    }
    
    public Date getFechaCompra() {
        return fechaCompra;
    }


}
