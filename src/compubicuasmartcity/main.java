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
 * @author Manuel_Figueiras
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Ceamos un objeto
        JFrame frame = new JFrame("Movilidad smart city");
        Positions movilidad = new Positions();
        frame.add(movilidad);
        //Dimensionamos la pantalla
        frame.setSize(900, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
          //Inicializamos las dos lineas con sus respectivas marquesinas
        Linea linea1 = new Linea(1);
        Linea linea2 = new Linea(2);
        
        linea1.setMarquesinas(movilidad.inicializar(linea1));
        linea2.setMarquesinas(movilidad.inicializar(linea2));
        ArrayList<Linea> lineas = new ArrayList();
        lineas.add(linea1);
        lineas.add(linea2);
        try {
            Control control = new Control(lineas);
            control.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ArrayList<Autobus> busesLinea1 = new ArrayList<>();
        ArrayList<Autobus> busesLinea2 = new ArrayList<>();
        busesLinea1.add(movilidad.getAutobus(3));
        busesLinea2.add(movilidad.getAutobus(1));
        linea1.setAutobuses(busesLinea1);
        linea2.setAutobuses(busesLinea2);
        
        Viajero v1 = new Viajero("Alfonso","López Pérez",true,new Tarjeta(1,new Coordenadas(0,0),8.0f),5,5);
        linea1.getMarquesinas().get(2).getViajerosBus().add(v1);
        

        Viajero v2 = new Viajero("Alfonso","López Pérez",true,new Tarjeta(1,new Coordenadas(0,0),8.0f),5,5);
        linea2.getMarquesinas().get(3).getViajerosBus().add(v1);

        
    

        //Vamos dibujando los autobuses en las distintas posiciones
        //Hay que hacer 2 hilos. Uno por cada bus. Cuando uno llegue a la parada el otro debe de seguir circulando.
                
        
        while (true) {
            try {
                movilidad.moverBusHorizontal(movilidad.bus3);
                movilidad.moverBusVertical(movilidad.bus1);
                
                movilidad.repaint();
         /*       if (movilidad.hacerParadaMarquesinaBu1(movilidad.bus1) == true){
                    for (int i=0; i<100000; i++){
                        movilidad.bus1.setxBus(movilidad.bus1.getxBus());
                        movilidad.bus1.setyBus(movilidad.bus1.getyBus());
                        
                    }
                }*/
                Thread.sleep(35);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
