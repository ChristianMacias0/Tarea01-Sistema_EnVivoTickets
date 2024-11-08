package sistema_envivotickets.Sistemas;
import sistema_envivotickets.Enums.Estado;

public class Asiento {
    private int id;
    private String numero;
    private Seccion seccion;
    private Estado estado;

    //METODOS




    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Número: " + numero);
        System.out.println("Sección: " + seccion.getNombre());
        System.out.println("Estado: " + estado);
    }















    
    //GETTERS


    public int getId(){
        return id;
    }

    public String getNumero(){
        return numero;
    }

    public Seccion getSeccion(){
        return seccion;
    }

    public Estado getEstado(){
        return estado;
    }

    

}
