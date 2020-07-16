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
public class Administrador extends Persona {

    private Persona idAdministrador;

    public Administrador(int idpersona, String cedula, String nombre, String apellido, String telefono, String direccion, String fechaNacimiento) {
        super(idpersona, cedula, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.idAdministrador = idAdministrador;
    }

    public Persona getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Persona idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

}
