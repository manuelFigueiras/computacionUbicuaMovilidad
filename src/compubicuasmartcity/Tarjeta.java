/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compubicuasmartcity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel_Figueiras
 */
public class Tarjeta {
    private int Id;
    private Coordenadas coordenadas;
    private float saldo;
    private Date ultimoUso;
    SimpleDateFormat formatoFecha;

    public Tarjeta(int Id, Coordenadas coordenadas, float saldo) {
        this.Id = Id;
        this.coordenadas = coordenadas;
        this.saldo = saldo;
        formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ultimoUso = formatoFecha.parse("01/01/1970");
        } catch (ParseException ex) {
            Logger.getLogger(Tarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    public void setUltimoUso(Date fecha) {
        this.ultimoUso = fecha;
    }
    
    
}
