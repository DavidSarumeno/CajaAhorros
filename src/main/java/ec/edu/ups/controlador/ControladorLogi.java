/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.Conexion.Conexion;
import ec.edu.ups.modelo.LOgin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author David
 */
public class ControladorLogi {

    public void crearLogin(LOgin login) {

        try {
            String sql = "INSERT INTO \"login\"VALUES(?,?,?)";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setString(1, login.getCorreo());
            sta.setString(2, login.getContrasenia());
            sta.setString(3, login.getTipo());
            sta.execute();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Crear Login" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public String validarUsuario(String usuario, String pass) {
        String tipo = "";
        try {
            String sql = "select tipo from login where correoelectronico = '" + usuario + "' and contrasenia = '" + pass + "'";
            Conexion.conectarBD();
            Statement sentencia = Conexion.getCon().createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            resultado.setFetchDirection(ResultSet.FETCH_FORWARD);
            if (resultado.next()) {
                tipo = resultado.getString("tipo");
                Conexion.desconectarBD();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tipo;
    }
}
