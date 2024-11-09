package sistema_envivotickets.Sistemas;

public class Compra {
    
    private static boolean confirmarCompra() {
        // Lógica mínima de verificación de transacción
        return Math.random() > 0.2; // Ejemplo de probabilidad de éxito (80%)
    }

    public static Ticket comprarTicket() {
        Ticket ticket = new Ticket();
        // Simulación de asignación de asiento, evento, etc.
        if (confirmarCompra()) {
            System.out.println("Compra confirmada.");
            return ticket;
        } else {
            System.out.println("La compra no fue exitosa.");
            return null;
        }
    }
}
