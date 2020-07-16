/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author David
 */
public class DepoReti {

    private int idDepoReti;
    private String tipoTransaccion;
    private double monto;
    private Libreta libreta;

    public DepoReti() {
    }

    public DepoReti(int idDepoReti, String tipoTransaccion, double monto) {
        this.idDepoReti = idDepoReti;
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
    }

    

    public int getIdDepoReti() {
        return idDepoReti;
    }

    public void setIdDepoReti(int idDepoReti) {
        this.idDepoReti = idDepoReti;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    

    public Libreta getLibreta() {
        return libreta;
    }

    public void setLibreta(Libreta libreta) {
        this.libreta = libreta;
    }

}
