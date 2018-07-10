/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import paneles.*;
import dialogos.*;
import com.cpyt.dao.DenunciaDAO;
import com.cpyt.dao.GenericDAO;
import com.cpyt.dao.PenalizacionDAO;
import com.cpyt.dao.UsuarioDAO;
import com.cpyt.entity.ArmaIncautada;
import com.cpyt.entity.Denuncia;
import com.cpyt.entity.Droga;
import com.cpyt.entity.Municion;
import com.cpyt.entity.Operativo;
import com.cpyt.entity.Otro;
import com.cpyt.entity.Persona;
import com.cpyt.entity.PersonaDenuncia;
import com.cpyt.entity.ServicioPolicial;
import com.cpyt.entity.Usuario;
import com.cpyt.entity.VehiculoIncautado;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static principal.Principal.pnlPrincipal;

/**
 *
 * @author Yoel
 */
public class dlgReporteDenuncias extends javax.swing.JDialog {

    /**
     * Creates new form persona
     */
    
    DefaultTableModel dtm;
    GenericDAO g = new GenericDAO();
    public dlgReporteDenuncias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarDatos();
        cargarComboDelito();
        this.cboTipoDelito.addItem("--Seleccione--");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cboDelito = new javax.swing.JComboBox<>();
        cboSubTipoDelito = new javax.swing.JComboBox<>();
        cboTipoDelito = new javax.swing.JComboBox<>();
        cboSubDetalleDelito = new javax.swing.JComboBox<>();
        cboModalidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtDESDE = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtHasta = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        txtTotalDenuncias = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdDelito = new javax.swing.JLabel();
        txtIdTipoDelito = new javax.swing.JLabel();
        txtIdSubTipoDelito = new javax.swing.JLabel();
        txtIdSubDetalleDelito = new javax.swing.JLabel();
        txtIdModa = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cboDelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDelitoActionPerformed(evt);
            }
        });

        cboSubTipoDelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSubTipoDelitoActionPerformed(evt);
            }
        });

        cboTipoDelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoDelitoActionPerformed(evt);
            }
        });

        cboSubDetalleDelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSubDetalleDelitoActionPerformed(evt);
            }
        });

        cboModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboModalidadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 86, 186));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Delito :");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 86, 186));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tipo de Delito :");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(38, 86, 186));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("SubTipo Delito :");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 86, 186));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Modalidad :");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(38, 86, 186));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("SubDetalle Delito :");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(38, 86, 186));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Hasta :");

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(38, 86, 186));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Desde :");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Apellidos y Nombres", "Situación", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tableDatos);

        txtTotalDenuncias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotalDenuncias.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Total de Denuncias :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDESDE, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTotalDenuncias, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(681, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(168, 168, 168)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtDESDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTotalDenuncias, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 298, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        txtIdDelito.setText("0");

        txtIdTipoDelito.setText("0");

        txtIdSubTipoDelito.setText("0");

        txtIdSubDetalleDelito.setText("0");

        txtIdModa.setText("0");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reporte de Denuncias");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboModalidad, 0, 328, Short.MAX_VALUE)
                    .addComponent(cboSubTipoDelito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboDelito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTipoDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboSubDetalleDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(txtIdSubTipoDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdSubDetalleDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdModa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdTipoDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdDelito, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cboDelito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboSubTipoDelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cboTipoDelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cboSubDetalleDelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(cboModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdSubDetalleDelito)
                    .addComponent(txtIdSubTipoDelito)
                    .addComponent(txtIdModa)
                    .addComponent(txtIdTipoDelito)
                    .addComponent(txtIdDelito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDelitoActionPerformed
        //GenericDAO g = new GenericDAO();
        Integer idDeli = g.getIdItemSeleccionado("id_deli", "delito", "nombre", cboDelito.getSelectedItem().toString(), "");
        txtIdDelito.setText(String.valueOf(idDeli));

        cargarComboTipoDelito();
    }//GEN-LAST:event_cboDelitoActionPerformed

    private void cboSubTipoDelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSubTipoDelitoActionPerformed
        if (cboTipoDelito.getSelectedItem()!=null && !cboTipoDelito.getSelectedItem().toString().equals("--Seleccione--")) {

            if(!(cboSubTipoDelito.getSelectedItem()==null)){
                //GenericDAO g = new GenericDAO();
                Integer idSubTipoDeli = g.getIdItemSeleccionado("id_stdelito", "subtipo_delito", "nombre", cboSubTipoDelito.getSelectedItem().toString(), "");
                txtIdSubTipoDelito.setText(String.valueOf(idSubTipoDeli));
            }

        }

        cargarComboSubDetalleDelito();
    }//GEN-LAST:event_cboSubTipoDelitoActionPerformed

    private void cboTipoDelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoDelitoActionPerformed

        if (!cboDelito.getSelectedItem().toString().equals("--Seleccione--")) {

            if(!(cboTipoDelito.getSelectedItem()==null)){
                //GenericDAO g = new GenericDAO();
                Integer idTipoDeli = g.getIdItemSeleccionado("id_tdeli", "tipo_delito", "nombre", cboTipoDelito.getSelectedItem().toString(), "");
                txtIdTipoDelito.setText(String.valueOf(idTipoDeli));
                
            }

        }

        cargarComboModalidad();
        cargarComboSubTipoDelito();
    }//GEN-LAST:event_cboTipoDelitoActionPerformed

    private void cboSubDetalleDelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSubDetalleDelitoActionPerformed
        if (cboSubTipoDelito.getSelectedItem()!=null && !cboSubTipoDelito.getSelectedItem().toString().equals("--Seleccione--")) {

            if(!(cboSubDetalleDelito.getSelectedItem()==null)){
                //GenericDAO g = new GenericDAO();
                Integer idSubDetalleDeli = g.getIdItemSeleccionado("id_sddelito", "subdetalle_delito", "nombre", cboSubDetalleDelito.getSelectedItem().toString(), "");
                txtIdSubDetalleDelito.setText(String.valueOf(idSubDetalleDeli));
            }

        }

    }//GEN-LAST:event_cboSubDetalleDelitoActionPerformed

    private void cboModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboModalidadActionPerformed
        if (cboTipoDelito.getSelectedItem()!=null && !cboTipoDelito.getSelectedItem().toString().equals("--Seleccione--")) {

            if(!(cboModalidad.getSelectedItem()==null)){
                //GenericDAO g = new GenericDAO();
                Integer idModa = g.getIdItemSeleccionado("id_moda", "modalidad", "nombre", cboModalidad.getSelectedItem().toString(), "");
                txtIdModa.setText(String.valueOf(idModa));
            }

        }
    }//GEN-LAST:event_cboModalidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgReporteDenuncias dialog = new dlgReporteDenuncias(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboDelito;
    private javax.swing.JComboBox<String> cboModalidad;
    private javax.swing.JComboBox<String> cboSubDetalleDelito;
    private javax.swing.JComboBox<String> cboSubTipoDelito;
    private javax.swing.JComboBox<String> cboTipoDelito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDatos;
    private com.toedter.calendar.JDateChooser txtDESDE;
    private com.toedter.calendar.JDateChooser txtHasta;
    private javax.swing.JLabel txtIdDelito;
    private javax.swing.JLabel txtIdModa;
    private javax.swing.JLabel txtIdSubDetalleDelito;
    private javax.swing.JLabel txtIdSubTipoDelito;
    private javax.swing.JLabel txtIdTipoDelito;
    private javax.swing.JLabel txtTotalDenuncias;
    // End of variables declaration//GEN-END:variables
    private void cargarComboDelito() {
        //GenericDAO g = new GenericDAO();
        List<Object> sad = g.getComboList("delito", "id_deli", "nombre", "");
        Object[] s = new Object[]{};
        this.cboDelito.addItem("--Seleccione--");
        for (int i = 0;i<sad.size();i++) {
            s = (Object[])sad.get(i);
            System.out.println("Id = "+s[0]);
            System.out.println("Nombre = "+s[1]);
            
            this.cboDelito.addItem(s[1].toString());
        
        }
    }

    private void cargarComboTipoDelito() {
        //GenericDAO g = new GenericDAO();
        List<Object> sad = g.getComboList("tipo_delito", "id_tdeli", "nombre", "where id_deli="+txtIdDelito.getText());
        Object[] s = new Object[]{};
        this.cboTipoDelito.removeAllItems();
        this.cboTipoDelito.addItem("--Seleccione--");
        for (int i = 0;i<sad.size();i++) {
            s = (Object[])sad.get(i);
            System.out.println("Id = "+s[0]);
            System.out.println("Nombre = "+s[1]);
            
            this.cboTipoDelito.addItem(s[1].toString());
        
        }
        boolean existe = false;
        if(sad.size()==0){
            this.cboTipoDelito.setEnabled(false);
            this.cboTipoDelito.removeAllItems();
            this.cboTipoDelito.addItem("No existe");
            txtIdTipoDelito.setText("0");;
            txtIdSubTipoDelito.setText("0");
            txtIdSubDetalleDelito.setText("0");
        }else{
            this.cboTipoDelito.setEnabled(true);
        }
    }
    
    private void cargarComboSubTipoDelito() {
        //GenericDAO g = new GenericDAO();
        List<Object> sad = g.getComboList("subtipo_delito", "id_stdelito", "nombre", "where id_tdelito="+txtIdTipoDelito.getText());
        Object[] s = new Object[]{};
        this.cboSubTipoDelito.removeAllItems();
        this.cboSubTipoDelito.addItem("--Seleccione--");
        for (int i = 0;i<sad.size();i++) {
            s = (Object[])sad.get(i);
            System.out.println("Id = "+s[0]);
            System.out.println("Nombre = "+s[1]);
            
            this.cboSubTipoDelito.addItem(s[1].toString());
        
        }
        boolean existe = false;
        if(sad.size()==0){
            this.cboSubTipoDelito.setEnabled(false);
            this.cboSubTipoDelito.removeAllItems();
            this.cboSubTipoDelito.addItem("No existe");
            txtIdSubTipoDelito.setText("0");
            txtIdSubDetalleDelito.setText("0");
        }else{
            this.cboSubTipoDelito.setEnabled(true);
        }
    }

    private void cargarComboSubDetalleDelito() {
        //GenericDAO g = new GenericDAO();
        List<Object> sad = g.getComboList("subdetalle_delito", "id_sddelito", "nombre", "where id_stdelito="+txtIdSubTipoDelito.getText());
        Object[] s = new Object[]{};
        this.cboSubDetalleDelito.removeAllItems();
        this.cboSubDetalleDelito.addItem("--Seleccione--");
        for (int i = 0;i<sad.size();i++) {
            s = (Object[])sad.get(i);
            System.out.println("Id = "+s[0]);
            System.out.println("Nombre = "+s[1]);
            
            this.cboSubDetalleDelito.addItem(s[1].toString());
        
        }
        boolean existe = false;
        if(sad.size()==0){
            this.cboSubDetalleDelito.setEnabled(false);
            this.cboSubDetalleDelito.removeAllItems();
            this.cboSubDetalleDelito.addItem("No existe");
            txtIdSubDetalleDelito.setText("0");
        }else{
            this.cboSubDetalleDelito.setEnabled(true);
        }
    }

    private void cargarComboModalidad() {
        //GenericDAO g = new GenericDAO();
        List<Object> sad = g.getComboList("modalidad", "id_moda", "nombre", "where id_stdelito="+txtIdTipoDelito.getText());
        Object[] s = new Object[]{};
        this.cboModalidad.removeAllItems();
        this.cboModalidad.addItem("--Seleccione--");
        for (int i = 0;i<sad.size();i++) {
            s = (Object[])sad.get(i);
            System.out.println("Id = "+s[0]);
            System.out.println("Nombre = "+s[1]);
            
            this.cboModalidad.addItem(s[1].toString());
        
        }
        boolean existe = false;
        if(sad.size()==0){
            this.cboModalidad.setEnabled(false);
            this.cboModalidad.removeAllItems();
            this.cboModalidad.addItem("No existe");
        }else{
            this.cboModalidad.setEnabled(true);
        }
    }

    private void cargarDatos() {
        DenunciaDAO dd = new DenunciaDAO();
        
        SimpleDateFormat fdt=new SimpleDateFormat("YYYY-MM-dd");
        
        String desde=null;
        if(txtDESDE.getDate()!=null){
           desde=fdt.format(txtDESDE.getDate()); 
        }
        
        String hasta=null;
        if(txtHasta.getDate()!=null){
           hasta=fdt.format(txtHasta.getDate()); 
        }
        
      
        
        List<Object> datos = dd.getDenunciasReporte(txtIdDelito.getText(),txtIdTipoDelito.getText(),txtIdSubTipoDelito.getText(),txtIdSubDetalleDelito.getText(),txtIdModa.getText(),desde,hasta);

        Object[][] matriz = new Object[datos.size()][7];
        Object[] s = new Object[]{};
        for (int i = 0; i < datos.size(); i++) {
            
            s=(Object[]) datos.get(i);
            //System.out.println(s[0]);
            
            matriz[i][0] = s[0];
            matriz[i][1] = s[1];
            matriz[i][2] = s[2];
            matriz[i][3] = s[3];
            matriz[i][4] = s[4];
            matriz[i][5] = s[5];
            matriz[i][6] = s[6];
            

        }
        txtTotalDenuncias.setText(String.valueOf(datos.size()));
        Object[][] data = matriz;
        String[] cabecera = {"Código", "Delito","TipoDelito","Subtipodelito", "SubDetalleDelito","Modalidad", "Fecha Hecho"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);    }

}
