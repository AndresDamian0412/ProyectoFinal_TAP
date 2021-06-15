package JPanels_Proyecto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinal_rapa.conexion_db;

public class reg_productos_registrar extends javax.swing.JPanel {

    DefaultTableModel tablaModelo;
    conexion_db conexion = new conexion_db();

    public reg_productos_registrar() {
        initComponents();
        rellenaComboLineas();
        rellenaComboColab();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eti_linea_Inv = new javax.swing.JLabel();
        combo_linea_inv = new javax.swing.JComboBox<>();
        eti_tipo = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        eti_nombre = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        eti_colaboradores = new javax.swing.JLabel();
        combo_colab1 = new javax.swing.JComboBox<>();
        combo_colab3 = new javax.swing.JComboBox<>();
        combo_colab2 = new javax.swing.JComboBox<>();
        eti_nivel = new javax.swing.JLabel();
        combo_Nivel = new javax.swing.JComboBox<>();
        eti_fecha_registro = new javax.swing.JLabel();
        date2 = new com.toedter.calendar.JDateChooser();
        btn_registrar = new javax.swing.JButton();
        eti_estatus = new javax.swing.JLabel();
        combo_estatus1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(1041, 441));
        setMinimumSize(new java.awt.Dimension(1041, 441));
        setPreferredSize(new java.awt.Dimension(1041, 441));

        eti_linea_Inv.setForeground(new java.awt.Color(0, 0, 0));
        eti_linea_Inv.setText("LINEA DE INVESTIGACIÓN:");

        combo_linea_inv.setBackground(new java.awt.Color(255, 255, 255));
        combo_linea_inv.setForeground(new java.awt.Color(0, 0, 0));

        eti_tipo.setForeground(new java.awt.Color(0, 0, 0));
        eti_tipo.setText("TIPO PRODUCTO: ");

        combo_tipo.setBackground(new java.awt.Color(255, 255, 255));
        combo_tipo.setForeground(new java.awt.Color(0, 0, 0));
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artículo", "Estancia Académica", "Informe Técnico", "Dirección de Tesis", "Prototipo" }));

        eti_nombre.setForeground(new java.awt.Color(0, 0, 0));
        eti_nombre.setText("NOMBRE PRODUCTO: ");

        txt_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setForeground(new java.awt.Color(0, 0, 0));

        eti_colaboradores.setForeground(new java.awt.Color(0, 0, 0));
        eti_colaboradores.setText("COLABORADORES (MAX 3) :");

        combo_colab1.setBackground(new java.awt.Color(255, 255, 255));
        combo_colab1.setForeground(new java.awt.Color(0, 0, 0));
        combo_colab1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));

        combo_colab3.setBackground(new java.awt.Color(255, 255, 255));
        combo_colab3.setForeground(new java.awt.Color(0, 0, 0));
        combo_colab3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        combo_colab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_colab3ActionPerformed(evt);
            }
        });

        combo_colab2.setBackground(new java.awt.Color(255, 255, 255));
        combo_colab2.setForeground(new java.awt.Color(0, 0, 0));
        combo_colab2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));

        eti_nivel.setForeground(new java.awt.Color(0, 0, 0));
        eti_nivel.setText("NIVEL: ");

        combo_Nivel.setBackground(new java.awt.Color(255, 255, 255));
        combo_Nivel.setForeground(new java.awt.Color(0, 0, 0));
        combo_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura", "Maestría", "Doctorado" }));

        eti_fecha_registro.setForeground(new java.awt.Color(0, 0, 0));
        eti_fecha_registro.setText("FECHA DE REGISTRO: ");

        btn_registrar.setBackground(new java.awt.Color(0, 255, 17));
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        eti_estatus.setForeground(new java.awt.Color(0, 0, 0));
        eti_estatus.setText("ESTATUS: ");

        combo_estatus1.setBackground(new java.awt.Color(255, 255, 255));
        combo_estatus1.setForeground(new java.awt.Color(0, 0, 0));
        combo_estatus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Proceso", "Concluido" }));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eti_linea_Inv)
                            .addComponent(eti_tipo)
                            .addComponent(eti_colaboradores)
                            .addComponent(eti_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnActualizar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_linea_inv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti_nivel)
                                .addGap(18, 18, 18)
                                .addComponent(combo_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti_fecha_registro)
                                .addGap(18, 18, 18)
                                .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eti_estatus)
                                .addGap(18, 18, 18)
                                .addComponent(combo_estatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo_colab1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_registrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_colab2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_colab3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_linea_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_linea_Inv)
                    .addComponent(combo_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_nivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eti_tipo))
                    .addComponent(eti_fecha_registro)
                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_estatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eti_estatus))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eti_nombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eti_colaboradores)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_colab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_colab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_colab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btnActualizar))
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 195, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo_colab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_colab3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_colab3ActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        if (!txt_Nombre.getText().isEmpty() || date2.getDate().toString().isEmpty()) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String[] colaboradores = new String[3];
            colaboradores[0] = combo_colab1.getSelectedItem().toString();
            colaboradores[1] = combo_colab2.getSelectedItem().toString();
            colaboradores[2] = combo_colab3.getSelectedItem().toString();
            conexion_db cdb = new conexion_db();
            System.out.println("Enviando registro");
            cdb.registrarProductos(combo_linea_inv.getSelectedItem().toString(), combo_tipo.getSelectedItem().toString(),
                    txt_Nombre.getText(), colaboradores, combo_Nivel.getSelectedItem().toString(), df.format(date2.getDate()), combo_estatus1.getSelectedItem().toString());
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos");
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked

    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        tablaModelo = (DefaultTableModel) tablaProductos.getModel();
        conexion.llenarTablaProductos(tablaModelo);
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> combo_Nivel;
    private javax.swing.JComboBox<String> combo_colab1;
    private javax.swing.JComboBox<String> combo_colab2;
    private javax.swing.JComboBox<String> combo_colab3;
    private javax.swing.JComboBox<String> combo_estatus1;
    private javax.swing.JComboBox<String> combo_linea_inv;
    private javax.swing.JComboBox<String> combo_tipo;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JLabel eti_colaboradores;
    private javax.swing.JLabel eti_estatus;
    private javax.swing.JLabel eti_fecha_registro;
    private javax.swing.JLabel eti_linea_Inv;
    private javax.swing.JLabel eti_nivel;
    private javax.swing.JLabel eti_nombre;
    private javax.swing.JLabel eti_tipo;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables

    public void rellenaComboLineas() {
        String[] lineas = conexion.rellenarComboLineas();
        for (String linea : lineas) {
            combo_linea_inv.addItem(linea);
        }
    }
    
    public void rellenaComboColab(){
        String[] docentes = conexion.rellenarComboColaboradores();
        for (String docente : docentes) {
            combo_colab1.addItem(docente);
            combo_colab2.addItem(docente);
            combo_colab3.addItem(docente);
        }
    }
}
