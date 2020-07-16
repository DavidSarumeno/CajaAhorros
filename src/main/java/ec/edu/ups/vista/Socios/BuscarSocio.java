/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.Socios;

import ec.edu.ups.vista.Cliente.*;
import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Persona;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class BuscarSocio extends javax.swing.JFrame {

    ControladorCliente controladorCliente;

    /**
     * Creates new form BuscarCliente
     */
    public BuscarSocio() {
        initComponents();
        controladorCliente = new ControladorCliente();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jppanel = new javax.swing.JPanel();
        jltexto = new javax.swing.JLabel();
        jlcodigo = new javax.swing.JLabel();
        jlcedula = new javax.swing.JLabel();
        jlnombre = new javax.swing.JLabel();
        jlapellido = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        txtCedula1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        jltelefono = new javax.swing.JLabel();
        jldireccion = new javax.swing.JLabel();
        jlfecha = new javax.swing.JLabel();
        txtDireccion1 = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        txtFechaNacimiento1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jltexto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jltexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltexto.setText("SOCIO");

        jlcodigo.setText("CODIGO");

        jlcedula.setText("CEDULA");

        jlnombre.setText("NOMBRE");

        jlapellido.setText("APELLIDO");

        txtCodigo1.setEnabled(false);

        txtCedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedula1ActionPerformed(evt);
            }
        });

        txtNombre1.setEnabled(false);

        txtApellido1.setEnabled(false);

        jltelefono.setText("TELEFONO");

        jldireccion.setText("DIRECCION");

        jlfecha.setText("FECHA NACIMIENTO");

        txtDireccion1.setEnabled(false);

        txtTelefono1.setEnabled(false);

        txtFechaNacimiento1.setEnabled(false);

        javax.swing.GroupLayout jppanelLayout = new javax.swing.GroupLayout(jppanel);
        jppanel.setLayout(jppanelLayout);
        jppanelLayout.setHorizontalGroup(
            jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jltexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jppanelLayout.createSequentialGroup()
                        .addGroup(jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jppanelLayout.createSequentialGroup()
                                .addGroup(jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jppanelLayout.createSequentialGroup()
                                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jppanelLayout.createSequentialGroup()
                                        .addComponent(txtCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jppanelLayout.createSequentialGroup()
                                .addComponent(jldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jppanelLayout.createSequentialGroup()
                                .addComponent(jlfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jppanelLayout.setVerticalGroup(
            jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jppanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jltexto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedula1ActionPerformed
        Persona clienteBuscar = controladorCliente.buscarPersona(txtCedula1.getText());
        if (clienteBuscar != null) {
            txtCodigo1.setText(String.valueOf(clienteBuscar.getIdpersona()));
            txtCedula1.setText(clienteBuscar.getCedula());
            txtNombre1.setText(clienteBuscar.getNombre());
            txtApellido1.setText(clienteBuscar.getApellido());
            txtDireccion1.setText(clienteBuscar.getDireccion());
            txtTelefono1.setText(clienteBuscar.getTelefono());
            txtFechaNacimiento1.setText(clienteBuscar.getFechaNacimiento());

            JOptionPane.showMessageDialog(this, "Busqueda Existosa");
    }//GEN-LAST:event_txtCedula1ActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlapellido;
    private javax.swing.JLabel jlcedula;
    private javax.swing.JLabel jlcodigo;
    private javax.swing.JLabel jldireccion;
    private javax.swing.JLabel jlfecha;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel jltelefono;
    private javax.swing.JLabel jltexto;
    private javax.swing.JPanel jppanel;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtCedula1;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtFechaNacimiento1;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables
}
