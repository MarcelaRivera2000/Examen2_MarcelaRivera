/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Mvrivera
 */
public class Transacciones implements Serializable{
    private String Descripcion,num_cuenta,id;
    private Date date;

    public Transacciones(String Descripcion, String num_cuenta, String id, Date date) {
        this.Descripcion = Descripcion;
        this.num_cuenta = num_cuenta;
        this.id = id;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
        return "Transacciones{" + "Descripcion=" + Descripcion + ", num_cuenta=" + num_cuenta + ", id=" + id + ", date=" + date + '}';
    }

  
    
    
    
    
    
}
