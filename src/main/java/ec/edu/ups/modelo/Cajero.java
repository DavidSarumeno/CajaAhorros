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
public class Cajero extends Persona {

    private Persona idCajero;

    public Cajero(int idpersona, String cedula, String nombre, String apellido, String telefono, String direccion, String fechaNacimiento) {
        super(idpersona, cedula, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.idCajero = idCajero;
    }

    public Persona getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(Persona idCajero) {
        this.idCajero = idCajero;
    }

}
