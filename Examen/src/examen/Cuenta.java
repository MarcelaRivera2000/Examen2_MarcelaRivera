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
public class Cuenta  implements Serializable {
    private String num_cuenta;
    private double saldo;
    private String id;

    public Cuenta(String num_cuenta, double saldo, String id) {
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
        this.id = id;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "num_cuenta=" + num_cuenta + ", saldo=" + saldo + ", id=" + id + '}';
    }
    
    
    
    
    
}
