/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mvrivera
 */
public class ArchivosTexto {
     private Scanner sc = new Scanner(System.in);
    private String texto;
    private File archivo;
    private ArrayList<Logs> lista;

    public ArchivosTexto() {
    }

    public ArchivosTexto(String texto, ArrayList<Logs> lista) {
        archivo = new File(texto);
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Logs> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Logs> lista) {
        this.lista = lista;
    }
    public void setCliente(Logs c){
        lista.add((Logs)c);
    }

    public void Escribir() throws Exception {
        FileWriter fw = new FileWriter(archivo,true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Logs p : lista) {
            
                String prueba = p.getUsuario()+ "," + p.getDescripcion()+ "," + p.getDate()+";\n";
                bw.append(prueba);
            
        }
        bw.flush();
        bw.close();
        fw.close();
    }
}
