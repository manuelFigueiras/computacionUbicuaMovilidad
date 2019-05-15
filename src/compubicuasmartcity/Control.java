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
        int i, j, k;
        while (true) {
            for (i = 0; i < lineas.size(); i++) {
                for (j = 0; j < lineas.get(i).getMarquesinas().size(); j++) {
                    if (lineas.get(i).getMarquesinas().get(j).getViajerosBus().size() > 0) {
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

                }
                for (k = 0; k < lineas.get(i).getAutobuses().size(); k++) {
                    if (lineas.get(i).getNumLinea() == 1) {
                        System.out.println("i = " + i + "k = " + k + "numero linea " + lineas.get(i).getNumLinea());
                        System.out.println("Linea 1: " + lineas.get(i).getAutobuses().get(k).getxBus());
                        frameControl.linea1BusStatus.setText("Autobús " + lineas.get(i).getAutobuses().get(k).getNumBus());
                        frameControl.linea1BusStatus.setText(frameControl.linea1BusStatus.getText() + ":\nViajeros: " + lineas.get(i).getAutobuses().get(k).getViajerosBus().size());
                        frameControl.linea1BusStatus.setText(frameControl.linea1BusStatus.getText() + ":\nPosición: " + lineas.get(i).getAutobuses().get(k).getxBus() + "x " + lineas.get(i).getAutobuses().get(k).getyBus() + "y");
                        frameControl.linea1BusStatus.setText(frameControl.linea1BusStatus.getText() + ":\n ----------------------");
                    } else {
                        System.out.println("i = " + i + "k = " + k + "numero linea " + lineas.get(i).getNumLinea());
                        System.out.println("Linea 2: " + lineas.get(i).getAutobuses().get(k).getxBus());
                        frameControl.linea2BusStatus.setText("Autobús " + lineas.get(i).getAutobuses().get(k).getNumBus());
                        frameControl.linea2BusStatus.setText(frameControl.linea2BusStatus.getText() + ":\nViajeros: " + lineas.get(i).getAutobuses().get(k).getViajerosBus().size());
                        frameControl.linea2BusStatus.setText(frameControl.linea2BusStatus.getText() + ":\nPosición: " + lineas.get(i).getAutobuses().get(k).getxBus() + "x " + lineas.get(i).getAutobuses().get(k).getyBus() + "y");
                        frameControl.linea2BusStatus.setText(frameControl.linea2BusStatus.getText() + ":\n ----------------------");
                    }
                }
                for (int n = 0; n < lineas.get(i).getAutobuses().size(); n++) {
                    if (lineas.get(i).getNumLinea() == 1) {
                        System.out.println("Por aquiiiiiiiiiiiiiiii1 -----------------");
                        for (int u = 0; u < lineas.get(i).getMarquesinas().size(); u++) {
                            if (lineas.get(i).getMarquesinas().get(u).getViajerosBus().size() > 0) {
                                System.out.println("Por aquiiiiiiiiiiiiiiii2 -----------------");
                                System.out.println("Marquesina x: "+lineas.get(i).getMarquesinas().get(u).getxBus());
                                System.out.println("Bus x: "+lineas.get(i).getAutobuses().get(n).getxBus());
                                if (lineas.get(i).getAutobuses().get(n).getyBus() == 350 && lineas.get(i).getMarquesinas().get(u).getxBus() - 40 == lineas.get(i).getAutobuses().get(n).getxBus()) {
                                    System.out.println("Por aquiiiiiiiiiiiiiiii3 -----------------");
                                    int posx = lineas.get(i).getAutobuses().get(n).getxBus();
                                    int posy = lineas.get(i).getAutobuses().get(n).getyBus();
                                    double velx = lineas.get(i).getAutobuses().get(n).getVelocidadX();
                                    double vely = lineas.get(i).getAutobuses().get(n).getVelocidadY();
                                    lineas.get(i).getAutobuses().get(n).setPararSiguienteMarquesina(true);
                                    do {
                                        lineas.get(i).getAutobuses().get(n).setxBus(600);
                                        lineas.get(i).getAutobuses().get(n).setyBus(350);
                                        lineas.get(i).getAutobuses().get(n).setVelocidadX(0);
                                        lineas.get(i).getAutobuses().get(n).setVelocidadY(0);
                                        lineas.get(i).getMarquesinas().get(u).subirBus(lineas.get(i).getAutobuses().get(n));
                                    } while (lineas.get(i).getAutobuses().get(n).getPararSiguienteMarquesina() == true /*&& !lineas.get(i).getMarquesinas().get(u).getViajerosBus().isEmpty()*/);
                                   /* lineas.get(i).getAutobuses().get(n).setxBus(posx);
                                    lineas.get(i).getAutobuses().get(n).setyBus(posy);
                                    lineas.get(i).getAutobuses().get(n).setVelocidadX(velx);
                                    lineas.get(i).getAutobuses().get(n).setVelocidadY(vely);*/
                                }
                            }
                        }
                    } else {
                        for (int u = 0; u < lineas.get(i).getMarquesinas().size(); u++) {
                            if (lineas.get(i).getMarquesinas().get(u).getViajerosBus().size() > 0) {
                                if (lineas.get(i).getAutobuses().get(n).getxBus() == 350) {
                                    System.out.println("Por aquiiiiiiiiasfasdfasdfsdfiiiiiiii -----------------");
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
