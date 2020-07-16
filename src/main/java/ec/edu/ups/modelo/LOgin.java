/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;
/**
 *
 * @author David
 */
public class LOgin {

    private String correo;
    private String contrasenia;
    private String tipo;

    public LOgin() {

    }

    public LOgin(String correo, String contrasenia, String tipo) {
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
    }



    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "LOgin{" + "correo=" + correo + ", contrasenia=" + contrasenia + ", tipo=" + tipo + '}';
    }

}
