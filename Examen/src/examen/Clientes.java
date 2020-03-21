/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Clientes extends Usuario{
    
    private ArrayList<Cuenta> cuenta=new ArrayList();
    private ArrayList<Transacciones> transacciones=new ArrayList();

    public Clientes(String id, String primernombre, String segundonombre, String primerapellido, String segundoapellido, String contra, String usuario, int anio_nacimiento, int anio_afiliacion) {
        super(id, primernombre, segundonombre, primerapellido, segundoapellido, contra, usuario, anio_nacimiento, anio_afiliacion);
    }

    public ArrayList<Cuenta> getCuenta() {
        return cuenta;
    }

    public void setCuenta(ArrayList<Cuenta> cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList<Transacciones> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transacciones> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Clientes{" + "cuenta=" + cuenta + ", transacciones=" + transacciones + '}';
    }


}
