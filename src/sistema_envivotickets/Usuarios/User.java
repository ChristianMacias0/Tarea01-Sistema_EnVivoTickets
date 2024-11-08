package sistema_envivotickets.Usuarios;

public class User {

    //ATRIBUTOS
    private int id;
    private String name;
    private String email;
    private String contrasena;
    private String telefono;

    //METODOS
    public boolean iniciarSesion(String email, String contrasena) {
        // Comprueba si el email y la contraseña coinciden con los datos de un usuario existente
        // Si coinciden, devuelve true, si no devuelve false\
        return false;
    }

    public void actualizarDatos(){
        // Pregunta al usuario que datos desea actualizar y se aplica la logica de codigo correspondiente a la respuesta del mismo
    }

    private void actualizarDatos(String datoActual){
        // Actualiza el dato elegido por el usuario
    }
    
    public void cerrarSesion(){
        // Cierra la sesion del usuario
    }

    //GETTERS

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public String getTelefono() {
        return telefono;
    }

}
