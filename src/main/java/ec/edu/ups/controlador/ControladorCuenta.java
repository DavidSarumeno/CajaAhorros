/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.Conexion.Conexion;
import ec.edu.ups.modelo.Cuenta;
import ec.edu.ups.modelo.Libreta;
import ec.edu.ups.modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author David
 */
public class ControladorCuenta {

    ControladorCliente c = new ControladorCliente();

    public void crearCuenta(Cuenta cuenta) {
        try {
            String sql = "INSERT INTO \"cuenta\"VALUES(?,?,?,?,?,?,?,?,?,?)";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setInt(1, cuenta.getCodigoCuenta());
            sta.setString(2, cuenta.getTipoCuenta());
            sta.setString(3, cuenta.getNumCuenta());
            sta.setDate(4, cuenta.getFecha());
            sta.setDouble(5, cuenta.getIngreso());
            sta.setString(6, cuenta.getDescripcionIngresos());
            sta.setDouble(7, cuenta.getEgresos());
            sta.setString(8, cuenta.getDescripcionIngresos());
            sta.setDouble(9, cuenta.getMonto());
            sta.setInt(10, cuenta.getCliente().getIdpersona());
            sta.execute();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Crear Cliente" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public int obtenerCodigo() {
        int codigo = 0;
        String sql = "SELECT max(codigocuenta) " + "FROM \"cuenta\" ";
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

    public Cuenta buscarCuenta(String cedula) {

        String sql = "SELECT c.* FROM \"cuenta\" c,\"cliente\" a, \"persona\" p WHERE p.cedula = '" + cedula + "' and a.persona_idcodigo = p.idcodigo and c.cliente_idcliente = a.idcliente";
        System.out.println("Hola" + sql);
        Cuenta cuenta = null;
        Conexion.conectarBD();
        try {
            Statement sta = Conexion.getCon().createStatement();
            ResultSet res = sta.executeQuery(sql);
            res.next();
            cuenta = new Cuenta();
            cuenta.setCodigoCuenta(res.getInt("codigocuenta"));
            cuenta.setCliente(c.buscarCLiente(cedula));
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Buscar Cliente" + ex.getMessage());
            ex.printStackTrace();
        }
        return cuenta;
    }
}
