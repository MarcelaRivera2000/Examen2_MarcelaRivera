/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Usuario implements Serializable{
 private String id,primernombre,segundonombre,primerapellido,segundoapellido,contra,usuario;
 private int anio_nacimiento,anio_afiliacion;
 private ArrayList<Transacciones>transacciones=new ArrayList();

    public Usuario(String id, String primernombre, String segundonombre, String primerapellido, String segundoapellido, String contra, String usuario, int anio_nacimiento, int anio_afiliacion) {
        this.id = id;
        this.primernombre = primernombre;
        this.segundonombre = segundonombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.contra = contra;
        this.usuario = usuario;
        this.anio_nacimiento = anio_nacimiento;
        this.anio_afiliacion = anio_afiliacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public int getAnio_afiliacion() {
        return anio_afiliacion;
    }

    public void setAnio_afiliacion(int anio_afiliacion) {
        this.anio_afiliacion = anio_afiliacion;
    }

    public ArrayList<Transacciones> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transacciones> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", primernombre=" + primernombre + ", segundonombre=" + segundonombre + ", primerapellido=" + primerapellido + ", segundoapellido=" + segundoapellido + ", contra=" + contra + ", usuario=" + usuario + ", anio_nacimiento=" + anio_nacimiento + ", anio_afiliacion=" + anio_afiliacion + ", transacciones=" + transacciones + '}';
    }
    
 
    
}
