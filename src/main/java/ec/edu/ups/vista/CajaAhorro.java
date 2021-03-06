/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.vista.Administrador.ListarPersona;
import ec.edu.ups.vista.Cajero.ActualizarCajero;
import ec.edu.ups.vista.Cajero.BuscarCajero;
import ec.edu.ups.vista.Cajero.CrearCajero;
import ec.edu.ups.vista.Cajero.EliminarCajero;
import ec.edu.ups.vista.Cliente.ActualizarCliente;
import ec.edu.ups.vista.Cliente.BuscarCliente;
import ec.edu.ups.vista.Cliente.CrearCliente;
import ec.edu.ups.vista.Cliente.EliminarCliente;

/**
 *
 * @author David
 */
public class CajaAhorro extends javax.swing.JFrame {

    CrearCliente vistaCliente;
    BuscarCliente vistaCliente1;
    ActualizarCliente vistaCliente2;
    EliminarCliente vistaCliente3;
    CrearCajero vistaCliente11;
    BuscarCajero vistaCliente12;
    ActualizarCajero vistaCliente22;
    EliminarCajero vistaCliente32;
    ListarPersona vistaCliente4;

    /**
     * Creates new form CajaAhorro
     */
    public CajaAhorro() {
        initComponents();
        setResizable(false);
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

        escritorio = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        helpMenu1 = new javax.swing.JMenu();
        openMenuItem3 = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        openMenuItem4 = new javax.swing.JMenuItem();
        openMenuItem5 = new javax.swing.JMenuItem();
        openMenuItem6 = new javax.swing.JMenuItem();
        openMenuItem13 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        openMenuItem1 = new javax.swing.JMenuItem();
        openMenuItem7 = new javax.swing.JMenuItem();
        openMenuItem8 = new javax.swing.JMenuItem();
        openMenuItem9 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        openMenuItem2 = new javax.swing.JMenuItem();
        openMenuItem10 = new javax.swing.JMenuItem();
        openMenuItem11 = new javax.swing.JMenuItem();
        openMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        helpMenu1.setMnemonic('h');
        helpMenu1.setText("ADMINISTRADOR");

        openMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        openMenuItem3.setMnemonic('o');
        openMenuItem3.setText("LISTAR PERSONAS");
        openMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem3ActionPerformed(evt);
            }
        });
        helpMenu1.add(openMenuItem3);

        jMenuBar1.add(helpMenu1);

        fileMenu.setMnemonic('f');
        fileMenu.setText("CLIENTE");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("CREAR_CLIENTE");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        openMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem4.setMnemonic('o');
        openMenuItem4.setText("BUSCAR_CLIENTE");
        openMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem4ActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem4);

        openMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem5.setMnemonic('o');
        openMenuItem5.setText("ACTUALIZAR_CLIENTE");
        openMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem5ActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem5);

        openMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem6.setMnemonic('o');
        openMenuItem6.setText("ELIMINAR_CLIENTE");
        openMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem6ActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem6);

        openMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem13.setMnemonic('o');
        openMenuItem13.setText("LISTAR_CLIENTE");
        openMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem13ActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem13);

        jMenuBar1.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("CAJERO");

        openMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        openMenuItem1.setMnemonic('o');
        openMenuItem1.setText("CREAR_CAJERO");
        openMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(openMenuItem1);

        openMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        openMenuItem7.setMnemonic('o');
        openMenuItem7.setText("BUSCAR_CAJERO");
        openMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem7ActionPerformed(evt);
            }
        });
        editMenu.add(openMenuItem7);

        openMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        openMenuItem8.setMnemonic('o');
        openMenuItem8.setText("ACTUALIZAR_CAJERO");
        openMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem8ActionPerformed(evt);
            }
        });
        editMenu.add(openMenuItem8);

        openMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        openMenuItem9.setMnemonic('o');
        openMenuItem9.setText("ELIMINAR_CAJERO");
        openMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem9ActionPerformed(evt);
            }
        });
        editMenu.add(openMenuItem9);

        jMenuBar1.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("SOCIOS");

        openMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem2.setMnemonic('o');
        openMenuItem2.setText("CREAR_SOCIO");
        openMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem2ActionPerformed(evt);
            }
        });
        helpMenu.add(openMenuItem2);

        openMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem10.setMnemonic('o');
        openMenuItem10.setText("BUSCAR_SOCIO");
        openMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem10ActionPerformed(evt);
            }
        });
        helpMenu.add(openMenuItem10);

        openMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem11.setMnemonic('o');
        openMenuItem11.setText("ACTUALIZAR_SOCIO");
        openMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem11ActionPerformed(evt);
            }
        });
        helpMenu.add(openMenuItem11);

        openMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem12.setMnemonic('o');
        openMenuItem12.setText("ELIMINAR_SOCIO");
        openMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem12ActionPerformed(evt);
            }
        });
        helpMenu.add(openMenuItem12);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem3ActionPerformed
        vistaCliente4 = new ListarPersona();
        vistaCliente4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openMenuItem3ActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        vistaCliente = new CrearCliente();

        vistaCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void openMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem1ActionPerformed
        vistaCliente11 = new CrearCajero();
        escritorio.add(vistaCliente);
        vistaCliente.toFront();
        vistaCliente11.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openMenuItem1ActionPerformed

    private void openMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem2ActionPerformed
    }//GEN-LAST:event_openMenuItem2ActionPerformed

    private void openMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem4ActionPerformed
        vistaCliente1 = new BuscarCliente();
        vistaCliente1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openMenuItem4ActionPerformed

    private void openMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem5ActionPerformed
        vistaCliente2 = new ActualizarCliente();
        vistaCliente2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openMenuItem5ActionPerformed

    private void openMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem6ActionPerformed
        vistaCliente3 = new EliminarCliente();
        vistaCliente3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openMenuItem6ActionPerformed

    private void openMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem7ActionPerformed

        vistaCliente12 = new BuscarCajero();
        vistaCliente12.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openMenuItem7ActionPerformed

    private void openMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem8ActionPerformed

        vistaCliente22 = new ActualizarCajero();
        vistaCliente22.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openMenuItem8ActionPerformed

    private void openMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem9ActionPerformed
        vistaCliente32 = new EliminarCajero();
        vistaCliente32.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_openMenuItem9ActionPerformed

    private void openMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItem10ActionPerformed

    private void openMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItem11ActionPerformed

    private void openMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItem12ActionPerformed

    private void openMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItem13ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu editMenu;
    private javax.swing.JPanel escritorio;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu helpMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem openMenuItem1;
    private javax.swing.JMenuItem openMenuItem10;
    private javax.swing.JMenuItem openMenuItem11;
    private javax.swing.JMenuItem openMenuItem12;
    private javax.swing.JMenuItem openMenuItem13;
    private javax.swing.JMenuItem openMenuItem2;
    private javax.swing.JMenuItem openMenuItem3;
    private javax.swing.JMenuItem openMenuItem4;
    private javax.swing.JMenuItem openMenuItem5;
    private javax.swing.JMenuItem openMenuItem6;
    private javax.swing.JMenuItem openMenuItem7;
    private javax.swing.JMenuItem openMenuItem8;
    private javax.swing.JMenuItem openMenuItem9;
    // End of variables declaration//GEN-END:variables
}
