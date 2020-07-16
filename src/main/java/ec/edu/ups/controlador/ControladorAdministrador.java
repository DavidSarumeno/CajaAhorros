/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.Conexion.Conexion;
import ec.edu.ups.modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author David
 */
public class ControladorAdministrador extends ControladorPersona {

    @Override
    public void crearPersona(Persona administrador) {
        try {
            String sql = "INSERT INTO \"Persona\"VALUES(?,?,?,?,?,?,?)";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setInt(1, administrador.getIdpersona());
            sta.setString(2, administrador.getCedula());
            sta.setString(3, administrador.getNombre());
            sta.setString(4, administrador.getApellido());
            sta.setString(5, administrador.getTelefono());
            sta.setString(6, administrador.getDireccion());
            sta.setString(7, administrador.getFechaNacimiento());
            sta.execute();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Crear Cliente" + ex.getMessage());
            ex.printStackTrace();
        }

    }

    @Override
    public Persona buscarPersona(String cedula) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actualizarPersona(Persona cedula) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int obtenerCodigo() {
        int codigo = 0;
        String sql = "SELECT max(idpersona) " + "FROM \"Persona\" ";
        try {
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            ResultSet res = sta.executeQuery();
            res.next();
            codigo = res.getInt(1);
            res.close();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return codigo + 1;
    }

}
