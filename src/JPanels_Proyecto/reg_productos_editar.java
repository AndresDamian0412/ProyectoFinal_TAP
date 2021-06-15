package JPanels_Proyecto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import proyectofinal_rapa.conexion_db;

public class reg_productos_editar extends javax.swing.JPanel {

    private String seleccion;
    conexion_db conexion = new conexion_db();
    DefaultTableModel tablaModelo;

    public reg_productos_editar() {
        initComponents();
        rellenaComboLineas();
        rellenaComboColab();

        combo_linea_inv.disable();
        combo_nivel.disable();
        combo_tipo1.disable();
        txt_nombre.setEditable(false);
        combo_colab1.disable();
        combo_colab2.disable();
        combo_colab3.disable();
        date3.setEnabled(false);
        combo_estatus.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_editar = new javax.swing.JButton();
        eti_fecha_registro = new javax.swing.JLabel();
        combo_tipo1 = new javax.swing.JComboBox<>();
        eti_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        eti_colaboradores = new javax.swing.JLabel();
        combo_colab1 = new javax.swing.JComboBox<>();
        eti_estatus = new javax.swing.JLabel();
        combo_colab3 = new javax.swing.JComboBox<>();
        combo_estatus = new javax.swing.JComboBox<>();
        combo_colab2 = new javax.swing.JComboBox<>();
        eti_linea_Inv1 = new javax.swing.JLabel();
        eti_nivel = new javax.swing.JLabel();
        combo_linea_inv = new javax.swing.JComboBox<>();
        combo_nivel = new javax.swing.JComboBox<>();
        eti_tipo1 = new javax.swing.JLabel();
        eti_buscar = new javax.swing.JLabel();
        combo_buscar = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        date3 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_editar.setBackground(new java.awt.Color(255, 102, 0));
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        eti_fecha_registro.setForeground(new java.awt.Color(0, 0, 0));
        eti_fecha_registro.setText("FECHA DE REGISTRO: ");

        combo_tipo1.setBackground(new java.awt.Color(255, 255, 255));
        combo_tipo1.setForeground(new java.awt.Color(0, 0, 0));
        combo_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artículo", "Estancia Académica", "Informe Técnico", "Dirección de Tesis", "Prototipo" }));

        eti_nombre.setForeground(new java.awt.Color(0, 0, 0));
        eti_nombre.setText("NOMBRE PRODUCTO: ");

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));

        eti_colaboradores.setForeground(new java.awt.Color(0, 0, 0));
        eti_colaboradores.setText("COLABORADORES (MAX 3) :");

        combo_colab1.setBackground(new java.awt.Color(255, 255, 255));
        combo_colab1.setForeground(new java.awt.Color(0, 0, 0));
        combo_colab1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));

        eti_estatus.setForeground(new java.awt.Color(0, 0, 0));
        eti_estatus.setText("ESTATUS: ");

        combo_colab3.setBackground(new java.awt.Color(255, 255, 255));
        combo_colab3.setForeground(new java.awt.Color(0, 0, 0));
        combo_colab3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        combo_colab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_colab3ActionPerformed(evt);
            }
        });

        combo_estatus.setBackground(new java.awt.Color(255, 255, 255));
        combo_estatus.setForeground(new java.awt.Color(0, 0, 0));
        combo_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Proceso", "Concluido" }));

        combo_colab2.setBackground(new java.awt.Color(255, 255, 255));
        combo_colab2.setForeground(new java.awt.Color(0, 0, 0));
        combo_colab2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));

        eti_linea_Inv1.setForeground(new java.awt.Color(0, 0, 0));
        eti_linea_Inv1.setText("LINEA DE INVESTIGACIÓN:");

        eti_nivel.setForeground(new java.awt.Color(0, 0, 0));
        eti_nivel.setText("NIVEL: ");

        combo_linea_inv.setBackground(new java.awt.Color(255, 255, 255));
        combo_linea_inv.setForeground(new java.awt.Color(0, 0, 0));

        combo_nivel.setBackground(new java.awt.Color(255, 255, 255));
        combo_nivel.setEditable(true);
        combo_nivel.setForeground(new java.awt.Color(0, 0, 0));
        combo_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura", "Maestría", "Doctorado" }));

        eti_tipo1.setForeground(new java.awt.Color(0, 0, 0));
        eti_tipo1.setText("TIPO PRODUCTO: ");

        eti_buscar.setForeground(new java.awt.Color(0, 0, 0));
        eti_buscar.setText("BUSCAR POR:");

        combo_buscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "LINEA", "TIPO", "NOMBRE", "NIVEL", "FECHA", "ESTATUS" }));
        combo_buscar.setMaximumSize(new java.awt.Dimension(1041, 602));
        combo_buscar.setMinimumSize(new java.awt.Dimension(1041, 602));
        combo_buscar.setPreferredSize(new java.awt.Dimension(1041, 602));
        combo_buscar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_buscarItemStateChanged(evt);
            }
        });
        combo_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_buscarActionPerformed(evt);
            }
        });

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "LINEA DE INVESTIGACION", "TIPO", "NOMBRE", "COLABORADORES", "NIVEL", "FECHA DE REGISTRO", "ESTATUS"
            }
        ));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductos);

        btnActualizar.setText("Actualizar tabla");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eti_linea_Inv1)
                            .addComponent(eti_colaboradores)
                            .addComponent(eti_buscar)
                            .addComponent(eti_nombre)
                            .addComponent(eti_tipo1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(btn_buscar)
                                .addGap(26, 26, 26)
                                .addComponent(eti_nivel)
                                .addGap(18, 18, 18)
                                .addComponent(combo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_linea_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eti_estatus)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eti_fecha_registro)
                                        .addGap(18, 18, 18)
                                        .addComponent(date3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_colab1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_editar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(combo_colab2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combo_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_colab3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnActualizar)
                    .addContainerGap(674, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eti_buscar)
                        .addComponent(btn_buscar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(combo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti_nivel)
                            .addComponent(combo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti_linea_Inv1)
                            .addComponent(combo_linea_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eti_tipo1)
                            .addComponent(combo_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti_estatus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti_fecha_registro))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_colab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_colab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_colaboradores)
                    .addComponent(combo_colab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(218, Short.MAX_VALUE)
                    .addComponent(btnActualizar)
                    .addContainerGap(394, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo_colab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_colab3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_colab3ActionPerformed

    private void combo_buscarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_buscarItemStateChanged
        // TODO add your handling code here:
        seleccion = combo_buscar.getSelectedItem().toString();

        switch (seleccion) {
            case "Seleccionar...":
                combo_linea_inv.disable();
                combo_nivel.disable();
                combo_tipo1.disable();
                txt_nombre.setEditable(false);
                combo_colab1.disable();
                combo_colab2.disable();
                combo_colab3.disable();
                date3.setEnabled(false);
                combo_estatus.disable();
                break;

            case "LINEA":
                combo_linea_inv.enable();
                combo_nivel.disable();
                combo_tipo1.disable();
                txt_nombre.setEditable(false);
                combo_colab1.disable();
                combo_colab2.disable();
                combo_colab3.disable();
                date3.setEnabled(false);
                combo_estatus.disable();
                break;

            case "TIPO":
                combo_linea_inv.disable();
                combo_nivel.disable();
                combo_tipo1.enable();
                txt_nombre.setEditable(false);
                combo_colab1.disable();
                combo_colab2.disable();
                combo_colab3.disable();
                date3.setEnabled(false);
                combo_estatus.disable();
                break;

            case "NOMBRE":
                combo_linea_inv.disable();
                combo_nivel.disable();
                combo_tipo1.disable();
                txt_nombre.setEditable(true);
                combo_colab1.disable();
                combo_colab2.disable();
                combo_colab3.disable();
                date3.setEnabled(false);
                combo_estatus.disable();
                break;

            case "NIVEL":
                combo_linea_inv.disable();
                combo_nivel.enable();
                combo_tipo1.disable();
                txt_nombre.setEditable(false);
                combo_colab1.disable();
                combo_colab2.disable();
                combo_colab3.disable();
                date3.setEnabled(false);
                combo_estatus.disable();
                break;

            case "FECHA":
                combo_linea_inv.disable();
                combo_nivel.disable();
                combo_tipo1.disable();
                txt_nombre.setEditable(false);
                combo_colab1.disable();
                combo_colab2.disable();
                combo_colab3.disable();
                date3.setEnabled(true);
                combo_estatus.disable();
                break;

            case "ESTATUS":
                combo_linea_inv.disable();
                combo_nivel.disable();
                combo_tipo1.disable();
                txt_nombre.setEditable(false);
                combo_colab1.disable();
                combo_colab2.disable();
                combo_colab3.disable();
                date3.setEnabled(false);
                combo_estatus.enable();
                break;
        }
    }//GEN-LAST:event_combo_buscarItemStateChanged

    private void combo_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_buscarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        // <editor-fold defaultstate="collapsed" desc="Habilitación de Combos">
        combo_linea_inv.enable();
        combo_nivel.enable();
        combo_tipo1.enable();
        txt_nombre.setEditable(true);  //comprueba que se habiliten todos
        combo_colab1.enable();
        combo_colab2.enable();
        combo_colab3.enable();
        date3.setEnabled(true);
        combo_estatus.enable();
        // </editor-fold> 
        
        tablaModelo = (DefaultTableModel) tablaProductos.getModel();
        
        combo_linea_inv.setSelectedItem(tablaModelo.getValueAt(tablaProductos.getSelectedRow(), 0));
        combo_tipo1.setSelectedItem(tablaModelo.getValueAt(tablaProductos.getSelectedRow(), 1));
        txt_nombre.setText((String) tablaModelo.getValueAt(tablaProductos.getSelectedRow(), 2));
        combo_nivel.setSelectedItem(tablaModelo.getValueAt(tablaProductos.getSelectedRow(), 4));
        combo_estatus.setSelectedItem(tablaModelo.getValueAt(tablaProductos.getSelectedRow(), 6));
        
        String fecha = tablaModelo.getValueAt(tablaProductos.getSelectedRow(), 5).toString();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date autoDate = formato.parse(fecha);
            date3.setDate(autoDate);

        } catch (ParseException ex) {
            Logger.getLogger(reg_linea_inv_editar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //llenado de colaboladores
        String [] colab = new String[3];
        colab = (String[])tablaModelo.getValueAt(tablaProductos.getSelectedRow(), 3);
        combo_colab1.setSelectedItem(colab[0]);
        combo_colab2.setSelectedItem(colab[1]);
        combo_colab3.setSelectedItem(colab[2]);
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        tablaModelo = (DefaultTableModel) tablaProductos.getModel();
        conexion.llenarTablaProductos(tablaModelo);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        seleccion = (String) combo_buscar.getSelectedItem();
        String registro;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        tablaModelo = (DefaultTableModel) tablaProductos.getModel();

        switch (seleccion) {
            case "Seleccionar...":
                registro = null;
                break;
            case "LINEA":
                registro = combo_linea_inv.getSelectedItem().toString();
                conexion.buscarRegistroProductos(seleccion, registro, tablaModelo);
                break;
            case "NOMBRE":
                registro = txt_nombre.getText();
                conexion.buscarRegistroProductos(seleccion, registro, tablaModelo);
                break;
            case "TIPO":
                registro = combo_tipo1.getSelectedItem().toString();
                conexion.buscarRegistroProductos(seleccion, registro, tablaModelo);
                break;
            case "NIVEL":
                registro = combo_nivel.getSelectedItem().toString();
                conexion.buscarRegistroProductos(seleccion, registro, tablaModelo);
                break;
            case "FECHA":
                registro = df.format(date3.getDate());
                conexion.buscarRegistroProductos(seleccion, registro, tablaModelo);
                break;
            case "ESTATUS":
                registro = combo_estatus.getSelectedItem().toString();
                conexion.buscarRegistroProductos(seleccion, registro, tablaModelo);
                break;
        }
        combo_linea_inv.enable();
        combo_nivel.enable();
        combo_tipo1.enable();
        txt_nombre.setEditable(true);
        combo_colab1.enable();
        combo_colab2.enable();
        combo_colab3.enable();
        date3.setEnabled(true);
        combo_estatus.enable();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_editarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JComboBox<String> combo_buscar;
    private javax.swing.JComboBox<String> combo_colab1;
    private javax.swing.JComboBox<String> combo_colab2;
    private javax.swing.JComboBox<String> combo_colab3;
    private javax.swing.JComboBox<String> combo_estatus;
    public javax.swing.JComboBox<String> combo_linea_inv;
    private javax.swing.JComboBox<String> combo_nivel;
    private javax.swing.JComboBox<String> combo_tipo1;
    private com.toedter.calendar.JDateChooser date3;
    private javax.swing.JLabel eti_buscar;
    private javax.swing.JLabel eti_colaboradores;
    private javax.swing.JLabel eti_estatus;
    private javax.swing.JLabel eti_fecha_registro;
    private javax.swing.JLabel eti_linea_Inv1;
    private javax.swing.JLabel eti_nivel;
    private javax.swing.JLabel eti_nombre;
    private javax.swing.JLabel eti_tipo1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    public void rellenaComboLineas() {
        String[] lineas = conexion.rellenarComboLineas();
        for (String linea : lineas) {
            combo_linea_inv.addItem(linea);
        }
    }

    public void rellenaComboColab() {
        String[] docentes = conexion.rellenarComboColaboradores();
        for (String docente : docentes) {
            combo_colab1.addItem(docente);
            combo_colab2.addItem(docente);
            combo_colab3.addItem(docente);
        }
    }
}
