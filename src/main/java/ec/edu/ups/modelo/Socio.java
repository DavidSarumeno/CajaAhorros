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
public class Socio extends Persona {

    private Persona idsocio;
    private String nombreEmpresa;
    private String rucEmpresa;

    public Socio(String nombreEmpresa, String rucEmpresa, int idpersona, String cedula, String nombre, String apellido, String telefono, String direccion, String fechaNacimiento) {
        super(idpersona, cedula, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.idsocio = idsocio;
        this.nombreEmpresa = nombreEmpresa;
        this.rucEmpresa = rucEmpresa;
    }

    public Persona getIdsocio() {
        return idsocio;
    }

    public void setIdsocio(Persona idsocio) {
        this.idsocio = idsocio;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

}
