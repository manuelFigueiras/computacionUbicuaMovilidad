/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compubicuasmartcity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Manuel_Figueiras
 */
public class Positions extends JPanel {

    //Definimos las dos posiciones de todos los elementos que utilizaresmos
    //Viajero 1
    private Viajero viajero1 = new Viajero("Alfonso", "López Pérez", true, new Tarjeta(1, new Coordenadas(0, 0), 8.0f), 5, 5);

    //Viajero 2
    private Viajero viajero2 = new Viajero("Rubén", "Bautista Carbón", false, new Tarjeta(2, new Coordenadas(0, 0), 8.0f), 5, 5);
    //Viajero 3
    private Viajero viajero3 = new Viajero("Agustín", "González Villar", false, new Tarjeta(3, new Coordenadas(0, 0), 8.0f), 5, 5);
    //Viajero 4
    private Viajero viajero4 = new Viajero("Manuel", "Figueiras Gago", false, new Tarjeta(4, new Coordenadas(0, 0), 8.0f), 5, 5);
    //Viajero 5
    private Viajero viajero5 = new Viajero("Aida", "Fernández Villar", false, new Tarjeta(5, new Coordenadas(0, 0), 8.0f), 5, 5);
    //Viajero 6
    private Viajero viajero6 = new Viajero("Luis", "Rivera Cardoso", true, new Tarjeta(6, new Coordenadas(0, 0), 8.0f), 5, 5);
    //Viajero 7
    private Viajero viajero7 = new Viajero("Cristiano", "Ronaldo", false, new Tarjeta(7, new Coordenadas(0, 0), 8.0f), 5, 5);
    //Viajero 8
    private Viajero viajero8 = new Viajero("Sergio", "Louzao Carbón", true, new Tarjeta(8, new Coordenadas(0, 0), 8.0f), 30, 30);
    //Viajero 9
    private Viajero viajero9 = new Viajero("Lucas", "Santos Torres", false, new Tarjeta(9, new Coordenadas(0, 0), 8.0f), 5, 5);
    //Viajero 10
    private Viajero viajero10 = new Viajero("Javier", "Pintos Gómez", false, new Tarjeta(10, new Coordenadas(0, 0), 8.0f), 5, 5);

    // Marquesinas Línea 1
    private Marquesina marquesinaL10 = new Marquesina(0, 370);
    private Marquesina marquesinaL11 = new Marquesina(150, 370);
    private Marquesina marquesinaL12 = new Marquesina(340, 370);
    private Marquesina marquesinaL13 = new Marquesina(490, 370);
    private Marquesina marquesinaL14 = new Marquesina(600, 370);
    // Marquesinas Linea 2
    private Marquesina marquesinaL20 = new Marquesina(380, 0);
    private Marquesina marquesinaL21 = new Marquesina(380, 180);
    private Marquesina marquesinaL22 = new Marquesina(380, 370);
    private Marquesina marquesinaL23 = new Marquesina(380, 490);
    private Marquesina marquesinaL24 = new Marquesina(380, 620);

    //Asignamos a cada marquesina los viajeros correspndientes
    /*  ArrayList<Viajero> v = new ArrayList<>();
    v.add*/
    //Autobús 1
    public Autobus bus1 = new Autobus(2, 300, 0, new ArrayList<>(), 0, 1, 20, 50);
    //Autobús 2
    public Autobus bus2 = new Autobus(3, 58, 80, new ArrayList<>(), 1, 1, 40, 40);
    //Autbus 3
    public Autobus bus3 = new Autobus(1, 0, 450, new ArrayList<>(), 1, 0, 50, 20);

    public ArrayList<Marquesina> inicializar(Linea l) {
        ArrayList<Marquesina> marque1 = new ArrayList<>();
        ArrayList<Marquesina> marque2 = new ArrayList<>();
        marque1.add(marquesinaL10);
        marque1.add(marquesinaL11);
        marque1.add(marquesinaL12);
        marque1.add(marquesinaL13);
        marque1.add(marquesinaL14);

        marque2.add(marquesinaL20);
        marque2.add(marquesinaL21);
        marque2.add(marquesinaL22);
        marque2.add(marquesinaL23);
        marque2.add(marquesinaL24);
        if (l.getNumLinea() == 1) {
            return marque1;
        } else {
            return marque2;
        }
    }

    public Autobus getAutobus(int num) {
        Autobus bus;
        switch (num) {
            case 1:
                bus = this.bus1;
                break;
            case 2:
                bus = this.bus2;
                break;
            case 3:
                bus = this.bus3;
                break;
            default:
                bus = null;
                break;
        }
        return bus;
    }

    int flag1 = 0, flag2 = 0, flag3 = 0;

    //Movimientod de los autobuses
    public void moverBusVertical(Autobus bus1) {
        if (bus1.getxBus() == 600 || bus1.getyBus() == 600) {
            flag1 = 1;
            bus1.setxBus(bus1.getxBus() - 100);
            bus1.nuevoViaje();
        }

        /*if (bus2.getxBus() == 600 || bus2.getyBus() == 600){
            flag2=1;
            bus2.setyBus(bus2.getyBus() - 100);
        }*/
        if (bus1.getxBus() == 0 || bus1.getyBus() == 0) {
            flag1 = 0;
            bus1.setxBus(bus1.getxBus() + 100);
            bus1.nuevoViaje();
        }
        /*    if (bus2.getxBus() == 0 || bus2.getyBus() == 0){
            flag2=0;
            bus2.setyBus(bus2.getyBus() + 100);
        }*/

        if (flag1 == 1) {
            bus1.setxBus(bus1.getxBus() - ((int) bus1.getVelocidadX()));
            bus1.setyBus(bus1.getyBus() - ((int) bus1.getVelocidadY()));
        } else if (flag1 == 0) {
            bus1.setxBus(bus1.getxBus() + ((int) bus1.getVelocidadX()));
            bus1.setyBus(bus1.getyBus() + ((int) bus1.getVelocidadY()));
        }

        /*    if (flag2 == 1){
            bus2.setxBus(bus2.getxBus()-((int)bus2.getVelocidadX()));
            bus2.setyBus(bus2.getxBus()-((int)bus2.getVelocidadY()));
        } else if (flag2 == 0){
           bus2.setxBus(bus2.getxBus()+((int)bus2.getVelocidadX()));
           bus2.setyBus(bus2.getxBus()+((int)bus2.getVelocidadY()));
        }*/
    }

    //Se podría crear un metodo para mover en diagonal.
    public void moverBusHorizontal(Autobus bus3) {

        if (bus3.getxBus() == 600 || bus3.getyBus() == 600) {
            flag3 = 1;
            bus3.setyBus(bus3.getyBus() + 100);
            bus3.nuevoViaje();
        }

        if (bus3.getxBus() == 0 || bus3.getyBus() == 0) {
            flag3 = 0;
            bus3.setyBus(bus3.getyBus() - 100);

            bus3.nuevoViaje();
        }

        if (bus3.getViaje() % 2 == 0) {
            bus3.setxBus(bus3.getxBus() - ((int) bus3.getVelocidadX()));
            bus3.setyBus(bus3.getyBus() - ((int) bus3.getVelocidadY()));
            if (bus3.getPararSiguienteMarquesina() == false) {
                if (bus3.getxBus() > marquesinaL10.getxBus() && bus3.getxBus() < marquesinaL11.getxBus()) {
                    bus3.setPararSiguienteMarquesina(true);
                }
            }
        } else {
            bus3.setxBus(bus3.getxBus() + ((int) bus3.getVelocidadX()));
            bus3.setyBus(bus3.getyBus() + ((int) bus3.getVelocidadY()));
            if (bus3.getPararSiguienteMarquesina() == false) {
                if (bus3.getxBus() > marquesinaL13.getxBus() && bus3.getxBus() < marquesinaL14.getxBus()) {
                    bus3.setPararSiguienteMarquesina(true);
                }
            }

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.red);
        g2d.fillRect(bus1.getxBus(), bus1.getyBus(), bus1.getTamannnoX(), bus1.getTamannoY());
        /*g2d.setColor(Color.green);
        g2d.fillRect(bus2.getxBus(), bus2.getyBus(), 30, 30);*/
        g2d.setColor(Color.green);
        g2d.fillRect(bus3.getxBus(), bus3.getyBus(), bus3.getTamannnoX(), bus3.getTamannoY());
        g2d.setColor(Color.black);

        // Pintamos marquesinas de la Línea 1
        g2d.fillRect(marquesinaL10.getxBus(), marquesinaL10.getyBus(), 50, 20);
        g2d.setColor(Color.black);
        g2d.fillRect(marquesinaL11.getxBus(), marquesinaL11.getyBus(), 50, 20);
        g2d.setColor(Color.black);
        g2d.fillRect(marquesinaL12.getxBus(), marquesinaL12.getyBus(), 50, 20);
        g2d.setColor(Color.black);
        g2d.fillRect(marquesinaL13.getxBus(), marquesinaL13.getyBus(), 50, 20);
        g2d.setColor(Color.black);
        g2d.fillRect(marquesinaL14.getxBus(), marquesinaL14.getyBus(), 50, 20);

        // Pintamos marquesinas de la línea 2
        g2d.setColor(Color.black);
        g2d.fillRect(marquesinaL20.getxBus(), marquesinaL20.getyBus(), 20, 50);
        g2d.setColor(Color.black);
        g2d.fillRect(marquesinaL21.getxBus(), marquesinaL21.getyBus(), 20, 50);
        g2d.setColor(Color.black);
        g2d.fillRect(marquesinaL22.getxBus(), marquesinaL22.getyBus(), 20, 50);
        g2d.setColor(Color.black);
        g2d.fillRect(marquesinaL23.getxBus(), marquesinaL23.getyBus(), 20, 50);
        g2d.setColor(Color.black);
        g2d.fillRect(marquesinaL24.getxBus(), marquesinaL24.getyBus(), 20, 50);

    }

    /*public boolean hacerParadaMarquesinaBu1(Autobus bus1) throws InterruptedException{
        if ((bus1.getxBus() == marquesinaL11.getxBus() && bus1.getyBus() == marquesinaL11.getyBus()) || (bus1.getxBus() == marquesina2.getxBus() && bus1.getyBus() == marquesina2.getyBus()) || (bus1.getxBus() == marquesina3.getxBus() && bus1.getyBus() == marquesina3.getyBus()) || (bus1.getxBus() == marquesina4.getxBus() && bus1.getyBus() == marquesina4.getyBus())){
            //Logica subida bajada del bus
            return true;
        }
        return false;
    }*/
    public void pararSiguienteMarquesina(Autobus bus) {

    }
}
