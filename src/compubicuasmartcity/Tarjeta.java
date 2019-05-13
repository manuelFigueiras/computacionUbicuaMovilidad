/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compubicuasmartcity;

/**
 *
 * @author Manuel_Figueiras
 */
public class Tarjeta {
    private int Id;
    private Coordenadas coordenadas;
    private float saldo;

    public Tarjeta(int Id, Coordenadas coordenadas, float saldo) {
        this.Id = Id;
        this.coordenadas = coordenadas;
        this.saldo = saldo;
    }

    public int getId() {
        return Id;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
