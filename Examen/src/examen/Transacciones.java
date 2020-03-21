/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;

/**
 *
 * @author Mvrivera
 */
public class Transacciones implements Serializable{
    private String Descripcion,fecha,hora,num_cuenta,id;

    public Transacciones(String Descripcion, String fecha, String hora, String num_cuenta, String id) {
        this.Descripcion = Descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.num_cuenta = num_cuenta;
        this.id = id;
    }
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Transacciones{" + "Descripcion=" + Descripcion + ", fecha=" + fecha + ", hora=" + hora + ", num_cuenta=" + num_cuenta + ", id=" + id + '}';
    }
    
    
    
    
    
}
