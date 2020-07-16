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
public class Cuenta {

    private int codigoCuenta;
    private Cliente cliente;
    private String tipoCuenta;
    private String numCuenta;
    private Date fecha;
    private double ingreso;
    private String descripcionIngresos;
    private double egresos;
    private String egresosIngresos;
    private double monto;

    public Cuenta() {
    }

    public Cuenta(int codigoCuenta, String tipoCuenta, String numCuenta, Date fecha, double ingreso, String descripcionIngresos, double egresos, String egresosIngresos, double monto) {
        this.codigoCuenta = codigoCuenta;
        this.tipoCuenta = tipoCuenta;
        this.numCuenta = numCuenta;
        this.fecha = fecha;
        this.ingreso = ingreso;
        this.descripcionIngresos = descripcionIngresos;
        this.egresos = egresos;
        this.egresosIngresos = egresosIngresos;
        this.monto = monto;
    }

    public int getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(int codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public String getDescripcionIngresos() {
        return descripcionIngresos;
    }

    public void setDescripcionIngresos(String descripcionIngresos) {
        this.descripcionIngresos = descripcionIngresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public String getEgresosIngresos() {
        return egresosIngresos;
    }

    public void setEgresosIngresos(String egresosIngresos) {
        this.egresosIngresos = egresosIngresos;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
