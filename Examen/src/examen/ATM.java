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
public class ATM implements Serializable{
     private String ubicacion,id,tiempo;
    private int anio_fabri;
    private double dinero;

    public ATM(String ubicacion, String id, String tiempo, int anio_fabri, double dinero) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.tiempo = tiempo;
        this.anio_fabri = anio_fabri;
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero += dinero;
    }

   

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getAnio_fabri() {
        return anio_fabri;
    }

    public void setAnio_fabri(int anio_fabri) {
        this.anio_fabri = anio_fabri;
    }

    @Override
    public String toString() {
        return "ATM{" + "ubicacion=" + ubicacion + ", id=" + id + ", tiempo=" + tiempo + ", anio_fabri=" + anio_fabri + ", dinero=" + dinero + '}';
    }

  
    
    
}
