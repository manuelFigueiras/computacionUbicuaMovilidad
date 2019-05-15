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
public class Control extends Thread {

    private ArrayList<Linea> lineas;
    private FrameControl frameControl;

    public Control(ArrayList<Linea> lineas) {
        this.lineas = lineas;
        this.frameControl = new FrameControl();

        this.frameControl.setVisible(true);
    }

    public void run() {
        int i, j, k,z;
        z = 0;
        while (true) {
            for (i = 0; i < lineas.size(); i++) {
                for (j = 0; j < lineas.get(i).getMarquesinas().size(); j++) {
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
                                case 4:
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
                                case 4:
                                    frameControl.linea2Marquesina4Field.setText(String.valueOf(lineas.get(i).getMarquesinas().get(j).getViajerosBus().size()));
                                    break;
                            }
                        }
                }
                for (k = 0; k < lineas.get(i).getAutobuses().size(); k++) {
                    if (lineas.get(i).getNumLinea() == 1) {
                        frameControl.linea1BusStatus.setText("Autobús " + lineas.get(i).getAutobuses().get(k).getNumBus());
                        frameControl.linea1BusStatus.setText(frameControl.linea1BusStatus.getText() + ":\nViajeros: " + lineas.get(i).getAutobuses().get(k).getViajerosBus().size());
                        frameControl.linea1BusStatus.setText(frameControl.linea1BusStatus.getText() + ":\nPosición: " + lineas.get(i).getAutobuses().get(k).getxBus() + "x " + lineas.get(i).getAutobuses().get(k).getyBus() + "y");
                        frameControl.linea1BusStatus.setText(frameControl.linea1BusStatus.getText() + ":\n ----------------------");
                    } else {
                        frameControl.linea2BusStatus.setText("Autobús " + lineas.get(i).getAutobuses().get(k).getNumBus());
                        frameControl.linea2BusStatus.setText(frameControl.linea2BusStatus.getText() + ":\nViajeros: " + lineas.get(i).getAutobuses().get(k).getViajerosBus().size());
                        frameControl.linea2BusStatus.setText(frameControl.linea2BusStatus.getText() + ":\nPosición: " + lineas.get(i).getAutobuses().get(k).getxBus() + "x " + lineas.get(i).getAutobuses().get(k).getyBus() + "y");
                        frameControl.linea2BusStatus.setText(frameControl.linea2BusStatus.getText() + ":\n ----------------------");
                    }
                }
                for (int n = 0; n < lineas.get(i).getAutobuses().size(); n++) {
                    if (lineas.get(i).getNumLinea() == 1) {
                        for (int u = 0; u < lineas.get(i).getMarquesinas().size(); u++) {
                            if (lineas.get(i).getMarquesinas().get(u).getViajerosBus().size() > 0) {
                                double vx = lineas.get(i).getAutobuses().get(n).getVelocidadX();
                                double vy = lineas.get(i).getAutobuses().get(n).getVelocidadY();
                                int px = lineas.get(i).getAutobuses().get(n).getxBus();
                                int py = lineas.get(i).getAutobuses().get(n).getyBus();
                                if (lineas.get(i).getAutobuses().get(n).getyBus() == 350 && lineas.get(i).getMarquesinas().get(u).getxBus() == lineas.get(i).getAutobuses().get(n).getxBus()) {
                                    lineas.get(i).getAutobuses().get(n).setPararSiguienteMarquesina(true);
                                    if (lineas.get(i).getAutobuses().get(n).getPararSiguienteMarquesina() == true) {
                                        lineas.get(i).getAutobuses().get(n).setxBus(lineas.get(i).getMarquesinas().get(u).getxBus());
                                        lineas.get(i).getAutobuses().get(n).setVelocidadX(0);
                                        lineas.get(i).getAutobuses().get(n).setVelocidadY(0);
                                        lineas.get(i).getMarquesinas().get(u).subirBus(lineas.get(i).getAutobuses().get(n));
                                        //lineas.get(i).getAutobuses().get(n).setVelocidadX(1);
                                        try {
                                            sleep(3000);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        lineas.get(i).getAutobuses().get(n).setxBus(px);
                                        lineas.get(i).getAutobuses().get(n).setxBus(py);
                                        lineas.get(i).getAutobuses().get(n).setVelocidadX(vx);
                                        lineas.get(i).getAutobuses().get(n).setVelocidadY(vy);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int u = 0; u < lineas.get(i).getMarquesinas().size(); u++) {
                            if (lineas.get(i).getMarquesinas().get(u).getViajerosBus().size() > 0) {
                                if (lineas.get(i).getAutobuses().get(n).getxBus() == 350) {
                                    lineas.get(i).getAutobuses().get(n).setPararSiguienteMarquesina(true);
                                }
                            }
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
}
