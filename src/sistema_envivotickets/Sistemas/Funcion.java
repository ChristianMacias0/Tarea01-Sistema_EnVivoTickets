package sistema_envivotickets.Sistemas;

import java.time.LocalDateTime;
import java.util.List;

public class Funcion {
    
    private int id;
    private LocalDateTime fechaHora;
    private Evento evento;
    private List<Seccion> secciones;

    public int getId(){
        return id;
    }

    public LocalDateTime getfechaHora(){
        return fechaHora;
    }

    public Evento getEvento(){
        return evento;
    }

    public List<Seccion> getSecciones(){
        return secciones;
    }
}
