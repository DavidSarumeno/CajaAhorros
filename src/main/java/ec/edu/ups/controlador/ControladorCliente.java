/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.Conexion.Conexion;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author David
 */
public class ControladorCliente extends ControladorPersona {

    @Override
    public void crearPersona(Persona cliente) {
        try {
            String sql = "INSERT INTO \"persona\"VALUES(?,?,?,?,?,?,?)";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setInt(1, cliente.getIdpersona());
            sta.setString(2, cliente.getCedula());
            sta.setString(3, cliente.getNombre());
            sta.setString(4, cliente.getApellido());
            sta.setString(5, cliente.getTelefono());
            sta.setString(6, cliente.getDireccion());
            sta.setString(7, cliente.getFechaNacimiento());
            sta.execute();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Crear Cliente" + ex.getMessage());
            ex.printStackTrace();
        }

    }

    public void crearCliente(Cliente clien) {
        try {
            String sql = "INSERT INTO \"cliente\"VALUES(?,?)";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setInt(1, obtenerCodigoCliente());
            sta.setInt(2, clien.getIdpersona());
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
        String sql = "SELECT * FROM \"persona\" WHERE cedula =?";
        Persona cliente = null;
        Conexion.conectarBD();
        try {
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setString(1, cedula);
            ResultSet res = sta.executeQuery();
            res.next();
            cliente = new Cliente();
            cliente.setIdpersona(res.getInt(1));
            cliente.setCedula(res.getString(2));
            cliente.setNombre(res.getString(3));
            cliente.setApellido(res.getString(4));
            cliente.setTelefono(res.getString(5));
            cliente.setDireccion(res.getString(6));
            cliente.setFechaNacimiento(res.getString(7));
            Conexion.desconectarBD();

        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Buscar Cliente" + ex.getMessage());
            ex.printStackTrace();
        }
        return cliente;

    }

    public Cliente buscarCLiente(String cedula) {
        String sql = "SELECT c.* FROM \"cliente\" c, \"persona\" p WHERE p.cedula = '" + cedula +"' and c.persona_idcodigo = p.idcodigo";
        Cliente cliente = null;
        Conexion.conectarBD();
        try {
            Statement sta = Conexion.getCon().createStatement();
            ResultSet res = sta.executeQuery(sql);
            res.next();
            System.out.println("Respuesta"+buscarPersona(cedula));
            cliente = new Cliente();
            cliente.setIdCliente(buscarPersona(cedula));
            cliente.setIdpersona(res.getInt("persona_idcodigo"));
            Conexion.desconectarBD();

        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Buscar Cliente" + ex.getMessage());
            ex.printStackTrace();
        }
        return cliente;
    }

    @Override
    public void actualizarPersona(Persona clienten) {
        try {
            String sql = "UPDATE \"persona\" SET idcodigo = ?, nombre = ?, apellido = ? , telefono = ?, direccion = ?, fechaNacimiento = ?  WHERE cedula = ?";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setInt(1, clienten.getIdpersona());
            sta.setString(2, clienten.getNombre());
            sta.setString(3, clienten.getApellido());
            sta.setString(4, clienten.getTelefono());
            sta.setString(5, clienten.getDireccion());
            sta.setString(6, clienten.getFechaNacimiento());
            sta.setString(7, clienten.getCedula());
            sta.executeUpdate();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Actualizar Cliente" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminarPersona(Persona cedula) {

        try {
            String sql = "DELETE FROM \"persona\" WHERE cedula = ?";
            Conexion.conectarBD();
            PreparedStatement sta = Conexion.getCon().prepareStatement(sql);
            sta.setString(1, cedula.getCedula());
            sta.executeUpdate();
            sta.close();
            Conexion.desconectarBD();
        } catch (SQLException ex) {
            System.out.println("Error en el Controlador Eliminar Cliente " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public int obtenerCodigo() {
        int codigo = 0;
        String sql = "SELECT max(idcodigo) " + "FROM \"persona\" ";
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

    public int obtenerCodigoCliente() {
        int codigo = 0;
        String sql = "SELECT max(idcliente) " + "FROM \"cliente\" ";
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
