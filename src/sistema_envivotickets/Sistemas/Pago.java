/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_envivotickets.Sistemas;

import java.util.Date;
import sistema_envivotickets.Usuarios.User;

/**
 *
 * @author rb122
 */
public class Pago {
    int idPago;
    Double monto;
    Date fecha;
    String estado;
    User Usuario;

    public Pago(int idPago, Double monto, Date fecha, String estado, User Usuario) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.estado = estado;
        this.Usuario = Usuario;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public User getUsuario() {
        return Usuario;
    }

    public void setUsuario(User Usuario) {
        this.Usuario = Usuario;
    }
    
    
    //Metodos
    public void procesarPago(){
        //Procesar pago
    }
    
    public void cancelarPago(){
        //cancelar pago
    }
}
