package sistema_envivotickets.Sistemas;

public class Compra {



    private static boolean confirmarCompra(){
        // LOGICA DE VERIFICACION DE LA TRANSACCION DE COMPRA
        return true;
    }

    public static Ticket comprarTicket(){
        Ticket ticket = new Ticket();
        //LOGICA DE COMPRA DE TICKET
        
        return confirmarCompra() ? ticket : null;
    }

    
}
