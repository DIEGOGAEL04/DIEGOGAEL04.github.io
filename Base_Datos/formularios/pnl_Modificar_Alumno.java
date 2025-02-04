/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos.formularios;

import Base_Datos.SQL.Metodos_SQL;
import java.awt.Component;
import java.awt.Toolkit;

/**
 *
 * @author HP
 */
public class pnl_Modificar_Alumno extends javax.swing.JPanel {
 Metodos_SQL metodos_sql=new Metodos_SQL();
    /**
     * Creates new form pnl_Modificar_Alumno
     */
    public pnl_Modificar_Alumno() {
        initComponents();
    }

    
    public void borrar(){
        txtActualizarAP.setText("");
        txtActualizarAm.setText("");
        txtActualizarNom.setText("");
        combo_CarreraActualizar.setSelectedIndex(0);
        txtBuscarIdActu.setText("");
        bloquear();
    }
    
    public void validacion_busqueda_actualizar(java.awt.event.KeyEvent evt) {
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
        if (txtBuscarIdActu.getText().length() >= 18) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    public void bloquear() {
        for (Component a : jPanel2.getComponents()) {
            a.setEnabled(false);
        }
        for (Component b : Pnl_Opciones_Actualizar.getComponents()) {
            b.setEnabled(false);

        }
    }
     public void desbloquear() {
        for (Component a : jPanel2.getComponents()) {
            a.setEnabled(true);
        }
        for (Component b : Pnl_Opciones_Actualizar.getComponents()) {
            b.setEnabled(true);

        }
        validacion_datos();
    }
     public void borrar2(){
        lblActulizar.setText("");
        txtBuscarIdActu.setText("");
    }
     public void validacion_datos(){
        if (txtActualizarAP.getText().isEmpty() || txtActualizarAm.getText().isEmpty() || combo_CarreraActualizar.getSelectedItem().equals() ){
            btnActualizar.setEnabled(false);
        }else{
            btnActualizar.setEnabled(true);
        }
    }
    
    public void busqueda_usuario(){
        String id = txtBuscarIdActu.getText();
    }
     public void modificar_datos() {
        String nombre =txtActualizarNom.getText();
        String apellidoP = txtActualizarAP.getText();
        String apellidoM = txtActualizarAm.getText();
        int id = Integer.parseInt(txtBuscarIdActu.getText());
      String carrera =combo_CarreraActualizar.getSelectedItem().toString();

        metodos_sql.modificar_datos_alumnos(nombre, apellidoP, apellidoM, carrera, id);
        borrar();
        txtBuscarIdActu.setText("");
        lblActulizar.setText("");
    }
     
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtActualizarNom = new javax.swing.JTextField();
        txtActualizarAP = new javax.swing.JTextField();
        txtActualizarAm = new javax.swing.JTextField();
        combo_CarreraActualizar = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtBuscarIdActu = new javax.swing.JTextField();
        lblActualizar = new javax.swing.JLabel();
        lblActulizar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Pnl_Opciones_Actualizar = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnBorrarActualizar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Actualizacion alumno");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "inserte datos del alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Paterno:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Carrera:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Apellido Materno:");

        txtActualizarNom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtActualizarNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarNomActionPerformed(evt);
            }
        });

        txtActualizarAP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtActualizarAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarAPActionPerformed(evt);
            }
        });

        txtActualizarAm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtActualizarAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarAmActionPerformed(evt);
            }
        });

        combo_CarreraActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_CarreraActualizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Carrera", "Paradigmas", "Software", "Gastronomia", "Seguridad ciudadana" }));
        combo_CarreraActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_CarreraActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActualizarNom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_CarreraActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(txtActualizarAP, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtActualizarAm, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81)))
                .addGap(277, 277, 277))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtActualizarNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtActualizarAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtActualizarAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo_CarreraActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Insserta Id para actualizar los datos:");

        txtBuscarIdActu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBuscarIdActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarIdActuActionPerformed(evt);
            }
        });

        lblActualizar.setText("---------");

        lblActulizar.setText("---------");

        Pnl_Opciones_Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        Pnl_Opciones_Actualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrarActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnBorrarActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBorrarActualizar.setText("Borrar");
        btnBorrarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_Opciones_ActualizarLayout = new javax.swing.GroupLayout(Pnl_Opciones_Actualizar);
        Pnl_Opciones_Actualizar.setLayout(Pnl_Opciones_ActualizarLayout);
        Pnl_Opciones_ActualizarLayout.setHorizontalGroup(
            Pnl_Opciones_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_Opciones_ActualizarLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(Pnl_Opciones_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(btnBorrarActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        Pnl_Opciones_ActualizarLayout.setVerticalGroup(
            Pnl_Opciones_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_Opciones_ActualizarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnBorrarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarIdActu, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblActulizar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pnl_Opciones_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBuscarIdActu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActualizar)
                    .addComponent(lblActulizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Pnl_Opciones_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtActualizarNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizarNomActionPerformed

    private void txtActualizarAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarAPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizarAPActionPerformed

    private void txtActualizarAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarAmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizarAmActionPerformed

    private void combo_CarreraActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_CarreraActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_CarreraActualizarActionPerformed

    private void txtBuscarIdActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarIdActuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarIdActuActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        modificar_datos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActualizarActionPerformed
        // TODO add your handling code here:
        borrar();
        
    }//GEN-LAST:event_btnBorrarActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Opciones_Actualizar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrarActualizar;
    private javax.swing.JComboBox<String> combo_CarreraActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblActulizar;
    private javax.swing.JTextField txtActualizarAP;
    private javax.swing.JTextField txtActualizarAm;
    private javax.swing.JTextField txtActualizarNom;
    private javax.swing.JTextField txtBuscarIdActu;
    // End of variables declaration//GEN-END:variables
}
