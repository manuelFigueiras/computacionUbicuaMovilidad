/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compubicuasmartcity;

/**
 *
 * @author Jose
 */
public class Coordenadas {
    
    private int xPosition;
    private int yPosition;

    public Coordenadas(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public int getX() {
        return xPosition;
    }

    public int getY() {
        return yPosition;
    }

    public void setX(int x) {
        this.xPosition = x;
    }

    public void setY(int y) {
        this.yPosition = y;
    }
    
    
}
