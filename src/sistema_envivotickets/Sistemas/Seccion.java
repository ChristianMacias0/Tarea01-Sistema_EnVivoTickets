package sistema_envivotickets.Sistemas;

public class Seccion {
    
    private int id;
    private String nombre;
    private double precio;
    private int totalAsientos;
    private int asientosReservados;

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }
    
    public int getTotalAsientos(){
        return totalAsientos;
    }

    public int getAsientosReservados(){
        return asientosReservados;
    }
}
