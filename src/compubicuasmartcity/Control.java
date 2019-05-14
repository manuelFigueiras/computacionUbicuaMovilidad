/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compubicuasmartcity;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Jose Cutrín
 */

public class Control extends Thread{
    
    private ArrayList<Linea> lineas;
    private FrameControl frameControl;
    
    
    public Control(ArrayList<Linea> lineas){
        this.lineas = lineas;
        this.frameControl = new FrameControl();
  
        this.frameControl.setVisible(true);
    }

    public void run() {
        int i, j;
        while (true) {
            for (i=0; i < lineas.size(); i++) {    
                for (j=0; j < lineas.get(i).getMarquesinas().size(); j++) {
                    if (lineas.get(i).getMarquesinas().get(j).getViajerosBus().size() > 0 ) {
                        frameControl.linea1Marquesina0Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                    }
                }
            }
            
        }
    } 
}