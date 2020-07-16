/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.Conexion.Conexion;
import ec.edu.ups.modelo.Cuenta;
import ec.edu.ups.modelo.DepoReti;
import ec.edu.ups.modelo.Libreta;
import ec.edu.ups.modelo.LibretaDetalle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author David
 */
public class ControladorLibreta {
    
    public void crearLibreta(Libreta libreta) {
        try {
            String sql = "INSERT INTO \"libreta\"VALUES(?,?,?)";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setInt(1, libreta.getCodigoLibreta());
            sta.setDate(2, libreta.getFechaApertura());
            sta.setInt(3, libreta.getCuenta().getCodigoCuenta());
            sta.execute();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Crear Cliente" + ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    public void crearDetalle(LibretaDetalle libretaDetalle) {
        try {
            String sql = "INSERT INTO \"libretadetalle\"VALUES(?,?,?,?)";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setInt(1, libretaDetalle.getCodigoDetalle());
            sta.setDate(2, libretaDetalle.getFecha());
            sta.setDouble(3, libretaDetalle.getMonto());
            sta.setInt(4, libretaDetalle.getLibreta().getCodigoLibreta());
            sta.execute();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Crear Cliente" + ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    public void crearDepoReti(DepoReti depoReti) {
        try {
            String sql = "INSERT INTO \"deporeti\"VALUES(?,?,?,?)";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setInt(1, depoReti.getIdDepoReti());
            sta.setString(2, depoReti.getTipoTransaccion());
            sta.setDouble(3, depoReti.getMonto());
            sta.setInt(4, depoReti.getLibreta().getCodigoLibreta());
            sta.execute();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Crear Cliente" + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public Libreta buscarLibretaCuenta(Cuenta cuenta) {
        String sql = "select * from \"libreta\" where cuenta_codigocuenta = " + cuenta.getCodigoCuenta();
        Libreta libreta = null;
        Conexion.conectarBD();
        try {
            Statement sta = Conexion.getCon().createStatement();
            ResultSet res = sta.executeQuery(sql);
            res.next();
            libreta = new Libreta();
            libreta.setCuenta(cuenta);
            libreta.setCodigoLibreta(res.getInt(1));
            libreta.setFechaApertura(res.getDate(2));
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Buscar Cliente" + ex.getMessage());
            ex.printStackTrace();
        }
        return  libreta;
    }
    
    public int obtenerCodigo() {
        int codigo = 0;
        String sql = "SELECT max(codigolibreta) " + "FROM \"libreta\" ";
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
    
    public int obtenerCodigoDetalle() {
        int codigo = 0;
        String sql = "SELECT max(codigodetalle) " + "FROM \"libretadetalle\" ";
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
    
    public int obtenerCodigoDeporReti() {
        int codigo = 0;
        String sql = "SELECT max(iddeporeti) " + "FROM \"deporeti\" ";
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
