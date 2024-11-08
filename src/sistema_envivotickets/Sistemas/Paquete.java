package sistema_envivotickets.Sistemas;

public class Paquete {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean disponible;

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getPrecio(){
        return precio;
    }

    public boolean getDisponible(){
        return disponible;
    }
}
