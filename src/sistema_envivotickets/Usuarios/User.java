package sistema_envivotickets.Usuarios;

public class User {
    private int id;
    private String name;
    private String email;
    private String contrasena;
    private String telefono;

    // Métodos
    public boolean iniciarSesion(String email, String contrasena) {
        // Verificación simple de email y contraseña
        if (this.email.equals(email) && this.contrasena.equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso.");
            return true;
        } else {
            System.out.println("Credenciales incorrectas.");
            return false;
        }
    }

    public void actualizarDatos(String nuevoEmail, String nuevoTelefono) {
        this.email = nuevoEmail;
        this.telefono = nuevoTelefono;
        System.out.println("Datos actualizados correctamente.");
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada.");
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getContrasena() { return contrasena; }
    public String getTelefono() { return telefono; }
}
