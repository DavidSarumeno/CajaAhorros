/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author David SarumeÃ±o
 */
public class Conexion {

    private static Connection con = null;

    public static void conectarBD() {
        try {

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CajaAhorros", "postgres", "Cuenca123");
            if (con != null) {
                System.out.println("Conexion Exitosa");
            } else {
                System.out.println("Conexion Fallida");
            }

        } catch (SQLException ex) {
            System.out.println("Errore de Conexion " + ex.getMessage());
        }

    }

    public static void desconectarBD() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Conexion Cerrada");
            }
        } catch (SQLException ex) {
            System.out.println("Error al desconectar " + ex.getMessage());
        }
    }

    public static Connection getCon() {
        return con;
    }

}
