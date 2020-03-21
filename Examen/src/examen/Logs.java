/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Date;

/**
 *
 * @author Mvrivera
 */
public class Logs {
    private String usuario,descripcion;
    private Date date;

    public Logs(String usuario, String descripcion, Date date) {
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.date = date;
    }

    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Logs{" + "usuario=" + usuario + ", descripcion=" + descripcion + ", date=" + date + '}';
    }
    
    
    
    
}
