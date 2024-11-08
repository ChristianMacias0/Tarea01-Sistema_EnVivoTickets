/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_envivotickets.Sistemas;

import sistema_envivotickets.Usuarios.User;

/**
 *
 * @author rb122
 */
public class Incidencia {
    
    int incidenciaId;
    String descripcion;
    String estado;
    User usuario;

    public Incidencia(int incidenciaId, String descripcion, String estado, User usuario) {
        this.incidenciaId = incidenciaId;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuario = usuario;
    }
    
    

    public int getIncidenciaId() {
        return incidenciaId;
    }

    public void setIncidenciaId(int incidenciaId) {
        this.incidenciaId = incidenciaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
    
    //Metodos
    public void actualizarEstado(){
        
       
        //Codigo para el metodo
    }
    
}
