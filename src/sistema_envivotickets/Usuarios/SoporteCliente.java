package sistema_envivotickets.Usuarios;

import sistema_envivotickets.Sistemas.Incidencia;

public class SoporteCliente {

        int idSoporte;
        String nombre;
        String correo;

    public int getIdSoporte() {
        return idSoporte;
    }

    public void setIdSoporte(int idSoporte) {
        this.idSoporte = idSoporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
    
    public void atenderIncidencia(Incidencia i){
        //Metodo trabajar con incidencias
    }
    
    public void escalarIncidencia(Incidencia i){
        //Codigo para metodo escalar Incidencias
    }
}
