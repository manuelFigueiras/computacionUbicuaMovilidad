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
import javax.swing.JPanel;

/**
 *
 * @author Manuel_Figueiras
 */
public class Viajero extends JPanel {

    private String nombre;
    private String apellido;
    /*private Boolean solicitudParada;
    private Integer busSolicitado;*/
    private Integer xPosition;
    private Integer yPosition;
    
    private Tarjeta tarjeta;

    public Viajero(String nombre, String apellido, Boolean solicitudParada, Tarjeta tarjeta, Integer xPosition, Integer yPosition) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.tarjeta = tarjeta;
    }

    public Viajero(Integer xPosition, Integer yPosicion) {
        this.xPosition = xPosition;
        this.yPosition = yPosicion;
    }

    public Viajero() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getxPosition() {
        return xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.black);
        g2d.fillOval(xPosition, yPosition, 5, 5);
    }
}
