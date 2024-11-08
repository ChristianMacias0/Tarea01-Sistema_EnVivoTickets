package sistema_envivotickets.Sistemas;

import sistema_envivotickets.Usuarios.User;
import java.util.*;

public class Notificacion {

    private int id;
    private String mensaje;
    private Date fechaEnvio;
    private User usuario;

    public int getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Date getDate(){
        return fechaEnvio;
    }

    public User getUser(){
        return usuario;
    }
}
