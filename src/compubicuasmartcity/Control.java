/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compubicuasmartcity;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        int i, j, k;
        while (true) {
            for (i=0; i < lineas.size(); i++) { 
                for (j=0; j < lineas.get(i).getMarquesinas().size(); j++) {
                    if (lineas.get(i).getMarquesinas().get(j).getViajerosBus().size() > 0 ) {
                        if (i == 0) {
                            switch (j) {
                                case 0:
                                    frameControl.linea1Marquesina0Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                                    break;
                                case 1:
                                    frameControl.linea1Marquesina1Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                                    break;
                                case 2:
                                    frameControl.linea1Marquesina2Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                                    break;
                                case 3:
                                    frameControl.linea1Marquesina3Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                                    break;
                            }
                        } else {
                            switch (j) {
                                case 0:
                                    frameControl.linea2Marquesina0Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                                    break;
                                case 1:
                                    frameControl.linea2Marquesina1Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                                    break;
                                case 2:
                                    frameControl.linea2Marquesina2Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                                    break;
                                case 3:
                                    frameControl.linea2Marquesina3Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                                    break;
                            }
                        }
                    }
                    for (k=0; k<lineas.get(i).getAutobuses().size();k++ ) {
                       frameControl.linea1BusStatus.setText("Autobús " + lineas.get(i).getAutobuses().get(k).getNumBus());
                       frameControl.linea1BusStatus.setText(frameControl.linea1BusStatus.getText()+ ":\nViajeros: " + lineas.get(i).getAutobuses().get(k).getViajerosBus().size());
                       frameControl.linea1BusStatus.setText(frameControl.linea1BusStatus.getText()+ ":\nPosición: " + lineas.get(i).getAutobuses().get(k).getxBus() + "x " + lineas.get(i).getAutobuses().get(k).getyBus() + "y");
                       frameControl.linea1BusStatus.setText(frameControl.linea1BusStatus.getText()+ ":\n ----------------------");
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    } 
}