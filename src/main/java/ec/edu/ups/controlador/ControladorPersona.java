/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;

/**
 *
 * @author David
 */
public abstract class ControladorPersona {

    public abstract void crearPersona(Persona persona);

    public abstract Persona buscarPersona(String cedula);

    public abstract void actualizarPersona(Persona cedula);

    public abstract void eliminarPersona(Persona persona);
}
