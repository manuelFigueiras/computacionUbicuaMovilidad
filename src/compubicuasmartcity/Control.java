/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compubicuasmartcity;

import java.util.ArrayList;

/**
 *
 * @author Jose Cutrín
 */

public class Control extends Thread{
    
    private ArrayList<Linea> lineas;
    
    
    public Control(ArrayList<Linea> lineas){
        this.lineas = lineas;
        
    }

    public void run() {
        while (true) {
            
        }
    } 
}