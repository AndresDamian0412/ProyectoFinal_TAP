/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanels_Proyecto;

import java.awt.event.ItemEvent;
import javax.swing.JComboBox;

/**
 *
 * @author josep
 */
public class reg_linea_inv_editar extends javax.swing.JPanel {
    public String seleccion;
    /**
     * Creates new form reg_linea_inv_editar
     */
    public reg_linea_inv_editar() {
        initComponents();
        claveTxt.setEditable(false);
        lineaTxt.setEditable(false);
        autorizacionDate.setEnabled(false);
        vigenciaDate.setEnabled(false);

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
        vigenciaDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        buscarporBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lineaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editarBtn = new javax.swing.JButton();
        buscarBtn = new javax.swing.JButton();
        claveTxt = new javax.swing.JTextField();
        autorizacionDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLineas = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(5000, 5000));
        setMinimumSize(new java.awt.Dimension(661, 441));
        setPreferredSize(new java.awt.Dimension(661, 441));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(384, 185));
        jPanel1.setMinimumSize(new java.awt.Dimension(384, 185));
        jPanel1.setPreferredSize(new java.awt.Dimension(384, 185));

        jLabel4.setText("BUSCAR POR:");

        buscarporBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "CLAVE", "NOM. DE LINEA", "FECHA DE AUTORIZACIÓN", "FECHA DE VIGENCIA" }));
        buscarporBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                buscarporBoxItemStateChanged(evt);
            }
        });

        jLabel1.setText("CLAVE:");

        jLabel2.setText("NOM. DE LINEA:");

        jLabel3.setText("FECHA AUTORIZACIÓN:");

        jLabel6.setText("FECHA VIGENCIA:");

        editarBtn.setText("EDITAR");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        buscarBtn.setText("BUSCAR");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lineaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autorizacionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vigenciaDate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(claveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarporBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(editarBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBtn)
                    .addComponent(jLabel4)
                    .addComponent(buscarporBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(claveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lineaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(autorizacionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(vigenciaDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarBtn)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(jPanel1);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LINEAS DE INVESTIGACIÓN");
        add(jLabel5);

        tablaLineas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CLAVE", "LINEA DE INVESTIGACIÓN", "AUTORIZACIÓN", "VIGENCIA"
            }
        ));
        jScrollPane2.setViewportView(tablaLineas);

        add(jScrollPane2);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarporBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_buscarporBoxItemStateChanged
        // TODO add your handling code here:
        seleccion = (String) buscarporBox.getSelectedItem();
        switch (seleccion) {
            case "Seleccionar...":
                claveTxt.setEditable(false);
                lineaTxt.setEditable(false);
                autorizacionDate.setEnabled(false);
                vigenciaDate.setEnabled(false);
                break;
            case "CLAVE":
                claveTxt.setEditable(true);
                lineaTxt.setEditable(false);
                autorizacionDate.setEnabled(false);
                vigenciaDate.setEnabled(false);
                break;
            case "NOM. DE LINEA":
                claveTxt.setEditable(false);
                lineaTxt.setEditable(true);
                autorizacionDate.setEnabled(false);
                vigenciaDate.setEnabled(false);
                break;
            case "FECHA DE AUTORIZACIÓN":
                claveTxt.setEditable(false);
                lineaTxt.setEditable(false);
                autorizacionDate.setEnabled(true);
                vigenciaDate.setEnabled(false);
                break;
            case "FECHA DE VIGENCIA":
                claveTxt.setEditable(false);
                lineaTxt.setEditable(false);
                autorizacionDate.setEnabled(false);
                vigenciaDate.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_buscarporBoxItemStateChanged

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser autorizacionDate;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JComboBox<String> buscarporBox;
    private javax.swing.JTextField claveTxt;
    private javax.swing.JButton editarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lineaTxt;
    public javax.swing.JTable tablaLineas;
    private com.toedter.calendar.JDateChooser vigenciaDate;
    // End of variables declaration//GEN-END:variables
}
