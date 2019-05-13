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
public class Marquesina {
    private int xBus;
    private int yBus;
    private ArrayList<Viajero> viajeros;
    
    public  Marquesina(int xBus, int yBus){
        this.xBus=xBus;
        this.yBus=yBus;
    }

    public int getxBus() {
        return xBus;
    }

    public int getyBus() {
        return yBus;
    }

    public ArrayList<Viajero> getViajerosBus() {
        return viajeros;
    }

    public void setxBus(int xBus) {
        this.xBus = xBus;
    }

    public void setyBus(int yBus) {
        this.yBus = yBus;
    }

    public void setViajerosBus(ArrayList<Viajero> viajerosBus) {
        Control avisarParada;
        this.viajeros = viajerosBus;
    }
    
    public int recontarViajeros(){
        return this.viajeros.size();
    }
    
    public boolean tenerSolicitadaParada(){
        boolean paradaSolicitada = false;
        for (int i=0; i<this.viajeros.size(); i++){
            //if (viajerosBus.get(i).getSolicitudParada() == true){
                paradaSolicitada = true;
            //}
        }
        return paradaSolicitada;
    }
    
    public void asignarViajerosAMarquesina(ArrayList<Viajero> viajerosExistentes){
        for (int i=0; i<viajerosExistentes.size(); i++){
            if ((viajerosExistentes.get(i).getxPosition() - this.getxBus() == 0) && (viajerosExistentes.get(i).getyPosition() - this.yBus == 0)){
                this.viajeros.add(viajerosExistentes.get(i));
            }
        }
    }
}
