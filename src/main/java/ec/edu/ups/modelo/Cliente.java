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
public class Cliente extends Persona {

    private Persona idCliente;

    public Cliente() {
    }

    public Cliente(int idpersona, String cedula, String nombre, String apellido, String telefono, String direccion, String fechaNacimiento) {
        super(idpersona, cedula, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.idCliente = idCliente;
    }

    public Persona getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Persona idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}
