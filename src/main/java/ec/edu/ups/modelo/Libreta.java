/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.sql.Date;

/**
 *
 * @author David
 */
public class Libreta {

    private int codigoLibreta;
    private Date fechaApertura;
    private Cuenta cuenta;

    public Libreta() {
    }

    public Libreta(int codigoLibreta, Date fechaApertura) {
        this.codigoLibreta = codigoLibreta;
        this.fechaApertura = fechaApertura;
      
    }

    public int getCodigoLibreta() {
        return codigoLibreta;
    }

    public void setCodigoLibreta(int codigoLibreta) {
        this.codigoLibreta = codigoLibreta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Libreta{" + "codigoLibreta=" + codigoLibreta + ", fechaApertura=" + fechaApertura + ", cuenta=" + cuenta + '}';
    }

}
