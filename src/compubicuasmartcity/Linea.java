/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compubicuasmartcity;

import java.util.ArrayList;

/**
 *
 * @author Manuel_Figueiras
 */
public class Linea {
    private int numLinea;
    private ArrayList<Marquesina> marquesinas;

    public Linea(int numLinea, ArrayList<Marquesina> marquesinas) {
        this.numLinea = numLinea;
        this.marquesinas=marquesinas;
    }
    
    public Linea(int numLinea) {
        this.numLinea = numLinea;
    }

    public int getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }

    public ArrayList<Marquesina> getMarquesinas() {
        return marquesinas;
    }

    public void setMarquesinas(ArrayList<Marquesina> marquesinas) {
        this.marquesinas = marquesinas;
    }
}
