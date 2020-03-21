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
public class Usuario_mantenimiento extends Usuario{
 private ArrayList<ATM> atms=new ArrayList();
 

    public Usuario_mantenimiento(String id, String primernombre, String segundonombre, String primerapellido, String segundoapellido, String contra, String usuario, int anio_nacimiento, int anio_afiliacion) {
        super(id, primernombre, segundonombre, primerapellido, segundoapellido, contra, usuario, anio_nacimiento, anio_afiliacion);
    }

    public ArrayList<ATM> getAtms() {
        return atms;
    }

    public void setAtms(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    @Override
    public String toString() {
        return "Usuario_mantenimiento{" + "atms=" + atms + '}';
    }
 
 
    
    
}
