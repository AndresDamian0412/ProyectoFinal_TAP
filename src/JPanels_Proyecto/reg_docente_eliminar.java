/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanels_Proyecto;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinal_rapa.conexion_db;

/**
 *
 * @author josep
 */
public class reg_docente_eliminar extends javax.swing.JPanel {
    conexion_db conexion = new conexion_db();
    DefaultTableModel tablaModel;
    public String seleccion, usuarioActual;
    /**
     * Creates new form reg_docente_eliminar
     */
    public reg_docente_eliminar() {
        initComponents();
        nombresTxt.setEditable(false);
        apellidosTxt.setEditable(false);
        usuarioTxt.setEditable(false);
        contraTxt.setEditable(false);
        departamentoBox.setEnabled(false);
        eliminarBtn.setEnabled(false);
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
        jLabel9 = new javax.swing.JLabel();
        contraTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombresTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        apellidosTxt = new javax.swing.JTextField();
        eliminarBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        departamentoBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        buscarporBox = new javax.swing.JComboBox<>();
        buscarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        actualizarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocentes = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setMaximumSize(new java.awt.Dimension(588, 149));
        jPanel2.setMinimumSize(new java.awt.Dimension(588, 149));

        jLabel9.setText("CONTRASE??A:");

        jLabel4.setText("NOMBRE(S):");

        jLabel10.setText("APELLIDOS:");

        eliminarBtn.setText("ELIMINAR");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("DEPARTAMENTO:");

        departamentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Sistemas y Computaci??n", "Ingenieria Industrial", "Cs. Econ??mico Administrativo", "Ingenier??as" }));

        jLabel12.setText("USUARIO:");

        jLabel13.setText("BUSCAR POR:");

        buscarporBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "USUARIO", "NOMBRE(S)", "APELLIDOS", "DEPARTAMENTO" }));
        buscarporBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                buscarporBoxItemStateChanged(evt);
            }
        });

        buscarBtn.setText("BUSCAR");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarporBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarBtn)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(departamentoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuarioTxt))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(eliminarBtn)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(buscarporBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarBtn))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(apellidosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(usuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(departamentoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(contraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(eliminarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2);

        jLabel1.setText("DOCENTES REGISTRADOS");
        jLabel1.setAlignmentX(0.5F);
        add(jLabel1);

        actualizarBtn.setText("ACTUALIZAR TABLA");
        actualizarBtn.setAlignmentX(0.5F);
        actualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBtnActionPerformed(evt);
            }
        });
        add(actualizarBtn);

        tablaDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "USUARIO", "CONTRASE??A", "NOMBRE(S)", "APELLIDOS", "DEPARTAMENTO"
            }
        ));
        tablaDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDocentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDocentes);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        // TODO add your handling code here:
        tablaModel = (DefaultTableModel) tablaDocentes.getModel();
        conexion.eliminarDocentes(usuarioTxt.getText());
        conexion.llenarTablaDocentes(tablaModel);
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void actualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBtnActionPerformed
        // TODO add your handling code here:
        tablaModel = (DefaultTableModel) tablaDocentes.getModel();
        conexion.llenarTablaDocentes(tablaModel);
    }//GEN-LAST:event_actualizarBtnActionPerformed

    private void tablaDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDocentesMouseClicked
        // TODO add your handling code here:
        tablaModel = (DefaultTableModel) tablaDocentes.getModel();
        String usuarioTabla = tablaModel.getValueAt(tablaDocentes.getSelectedRow(), 0).toString();
        usuarioTxt.setText(usuarioTabla);
        contraTxt.setText(tablaModel.getValueAt(tablaDocentes.getSelectedRow(), 1).toString());
        nombresTxt.setText(tablaModel.getValueAt(tablaDocentes.getSelectedRow(), 2).toString());
        apellidosTxt.setText(tablaModel.getValueAt(tablaDocentes.getSelectedRow(), 3).toString());
        departamentoBox.setSelectedItem(tablaModel.getValueAt(tablaDocentes.getSelectedRow(), 4).toString());

        nombresTxt.setEditable(false);
        apellidosTxt.setEditable(false);
        usuarioTxt.setEditable(false);
        contraTxt.setEditable(false);
        departamentoBox.setEnabled(false);
        eliminarBtn.setEnabled(true);
    }//GEN-LAST:event_tablaDocentesMouseClicked

    private void buscarporBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_buscarporBoxItemStateChanged
        // TODO add your handling code here:
        seleccion = buscarporBox.getSelectedItem().toString();
        vaciarCampos();
        switch (seleccion) {
            case "Seleccionar...":
            nombresTxt.setEditable(false);
            apellidosTxt.setEditable(false);
            usuarioTxt.setEditable(false);
            contraTxt.setEditable(false);
            departamentoBox.setEnabled(false);
            eliminarBtn.setEnabled(false);
            break;
            case "NOMBRE(S)":
            nombresTxt.setEditable(true);
            apellidosTxt.setEditable(false);
            usuarioTxt.setEditable(false);
            contraTxt.setEditable(false);
            departamentoBox.setEnabled(false);
            eliminarBtn.setEnabled(false);
            break;
            case "APELLIDOS":
            nombresTxt.setEditable(false);
            apellidosTxt.setEditable(true);
            usuarioTxt.setEditable(false);
            contraTxt.setEditable(false);
            departamentoBox.setEnabled(false);
            eliminarBtn.setEnabled(false);
            break;
            case "USUARIO":
            nombresTxt.setEditable(false);
            apellidosTxt.setEditable(false);
            usuarioTxt.setEditable(true);
            contraTxt.setEditable(false);
            departamentoBox.setEnabled(false);
            eliminarBtn.setEnabled(false);
            break;
            case "DEPARTAMENTO":
            nombresTxt.setEditable(false);
            apellidosTxt.setEditable(false);
            usuarioTxt.setEditable(false);
            contraTxt.setEditable(false);
            departamentoBox.setEnabled(true);
            eliminarBtn.setEnabled(false);
        }
    }//GEN-LAST:event_buscarporBoxItemStateChanged

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
        seleccion = buscarporBox.getSelectedItem().toString();
        String registro;
        tablaModel = (DefaultTableModel) tablaDocentes.getModel();

        switch(seleccion){
            case "Seleccionar...":
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una opcion");
            break;
            case "NOMBRE(S)":
            registro = nombresTxt.getText();
            if(registro.length() == 0){
                JOptionPane.showMessageDialog(null, "Por favor, rellene los campos");
            }else{
                conexion.buscarRegistroDocentes(seleccion, registro, tablaModel);
            }
            break;
            case "APELLIDOS":
            registro = apellidosTxt.getText();
            if(registro.length() == 0){
                JOptionPane.showMessageDialog(null, "Por favor, rellene los campos");
            }else{
                conexion.buscarRegistroDocentes(seleccion, registro, tablaModel);
            }
            break;
            case "USUARIO":
            registro = usuarioTxt.getText();
            if(registro.length() == 0){
                JOptionPane.showMessageDialog(null, "Por favor, rellene los campos");
            }else{
                conexion.buscarRegistroDocentes(seleccion, registro, tablaModel);
            }
            break;
            case "DEPARTAMENTO":
            registro = departamentoBox.getSelectedItem().toString();
            if(registro == "Seleccionar..."){
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una opcion");
            }else{
                conexion.buscarRegistroDocentes(seleccion, registro, tablaModel);
            }
            break;
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    public void vaciarCampos() {
        nombresTxt.setText(null);
        apellidosTxt.setText(null);
        usuarioTxt.setText(null);
        contraTxt.setText(null);
        departamentoBox.setSelectedItem("Seleccionar...");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBtn;
    private javax.swing.JTextField apellidosTxt;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JComboBox<String> buscarporBox;
    private javax.swing.JTextField contraTxt;
    private javax.swing.JComboBox<String> departamentoBox;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombresTxt;
    private javax.swing.JTable tablaDocentes;
    private javax.swing.JTextField usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
