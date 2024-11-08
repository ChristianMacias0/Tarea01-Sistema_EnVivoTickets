package sistema_envivotickets.Sistemas;

public class Evento {
    private int id;
    private String nombre;
    private String tipo;
    private String descripcion;

    //METODOS
    public void agregarEvento(Evento evento){
        //Agregar evento a la base de datos
    }
    public void eliminarEvento(Evento evento){
        //Eliminar evento de la base de datos
    }
    public void gestionarPreciosPromociones(){
        //Gestionar precios de las promociones de eventos
    }
    public void gestionarPoliticasCancelacion(String politicas){
        //Gestionar politicas de cancelacion de eventos
    }
    public void gestionarConfiguracionEvento(){
        //Gestionar configuracion de eventos
    }

    //Getters

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }

}
