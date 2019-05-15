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
public class Autobus {

    private int numBus;
    private int xBus;
    private int yBus;
    private ArrayList<Viajero> viajerosBus;
    //private Linea linea;
    private double velocidadX;
    private double velocidadY;
    private int tamannnoX;
    private int tamannoY;
    private boolean pararSiguienteMarquesina;
    int viaje;
    
    public  Autobus(int numBus, int xBus, int yBus, ArrayList<Viajero> viajerosBus,int vX,int vY, int tx,int ty){
        this.numBus = numBus;
        this.xBus=xBus;
        this.yBus=yBus;
        this.viajerosBus = viajerosBus;  
        this.velocidadX=vX;
        this.velocidadY=vY;
        this.tamannnoX=tx;
        this.tamannoY=ty;
        this.pararSiguienteMarquesina = false;
        this.viaje = 0;
        
    }

    public int getxBus() {
        return xBus;
    }

    public int getyBus() {
        return yBus;
    }

    public ArrayList<Viajero> getViajerosBus() {
        return viajerosBus;
    }

    public void setxBus(int xBus) {
        this.xBus = xBus;
    }

    public void setyBus(int yBus) {
        this.yBus = yBus;
    }

    public void setViajerosBus(ArrayList<Viajero> viajerosBus) {
        this.viajerosBus = viajerosBus;
    }
    
    public int recontarViajeros(){
        return this.viajerosBus.size();
    }

    public int getNumBus() {
        return numBus;
    }

    public void setNumBus(int numBus) {
        this.numBus = numBus;
    }

    public double getVelocidadX() {
        return velocidadX;
    }

    public double getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadX(double velocidadX) {
        this.velocidadX = velocidadX;
    }

    public void setVelocidadY(double velocidadY) {
        this.velocidadY = velocidadY;
    }

    public int getTamannnoX() {
        return tamannnoX;
    }

    public int getTamannoY() {
        return tamannoY;
    }
    
    public int getViaje() {
        return viaje;
    }

    public void setTamannnoX(int tamannnoX) {
        this.tamannnoX = tamannnoX;
    }

    public void setTamannoY(int tamannoY) {
        this.tamannoY = tamannoY;
    }

    public boolean isPararSiguienteMarquesina() {
        return pararSiguienteMarquesina;
    }

    public void setPararSiguienteMarquesina(boolean pararSiguienteMarquesina) {
        this.pararSiguienteMarquesina = pararSiguienteMarquesina;
    }
    
    public boolean getPararSiguienteMarquesina() {
        return pararSiguienteMarquesina;
    }
    
    public void nuevoViaje() {
        this.viaje++;
    }
    
    
    public void actualizarEstadoNumeroPersonas(){
        //Como vamos a saber las personas qeu bajan y suben en cada parada????????????????
        /* El autobús tiene un contador en las puertas. Si viajero tiene un método subirBus(), ese método debe 
        añadir el viajero al autobús, y después hacemos el recuento */
    }
    
    
}
