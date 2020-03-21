/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mvrivera
 */
public class ArchivoTextoTrans {
        private Scanner sc = new Scanner(System.in);
    private String texto;
    private File archivo;
    private ArrayList<Transacciones> lista;

    public ArchivoTextoTrans() {
    }

    public ArchivoTextoTrans(String texto, ArrayList<Transacciones> lista) {
        archivo = new File(texto);
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Transacciones> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Transacciones> lista) {
        this.lista = lista;
    }
    public void setCliente(Transacciones c){
        lista.add((Transacciones)c);
    }

    public void Escribir() throws Exception {
        FileWriter fw = new FileWriter(archivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Transacciones p : lista) {
                String prueba = p.getId()+ "," + p.getDescripcion()+ "," +p.getNum_cuenta()+","+ p.getDate()+";\n";
                bw.append(prueba);
            
        }
        bw.flush();
        bw.close();
        fw.close();
    }
}
