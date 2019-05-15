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
    private ArrayList<Autobus> autobuses;

    public Linea(int numLinea, ArrayList<Marquesina> marquesinas, ArrayList<Autobus> autobuses) {
        this.numLinea = numLinea;
        this.marquesinas=marquesinas;   
        this.autobuses = autobuses;
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
    
    public ArrayList<Autobus> getAutobuses() {
        return autobuses;
    }
    
    public void setAutobuses(ArrayList<Autobus> autobuses) {
        this.autobuses = autobuses;
    }
}
