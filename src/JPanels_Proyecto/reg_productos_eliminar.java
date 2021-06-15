package JPanels_Proyecto;

import javax.swing.table.DefaultTableModel;
import proyectofinal_rapa.conexion_db;

public class reg_productos_eliminar extends javax.swing.JPanel {

    DefaultTableModel tablaModelo;
    conexion_db conexion = new conexion_db();
    
    public reg_productos_eliminar() {
        initComponents();
        rellenaComboLineas();
        rellenaComboColab();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_editar = new javax.swing.JButton();
        eti_fecha_registro = new javax.swing.JLabel();
        como_estatus1 = new javax.swing.JComboBox<>();
        combo_tipo1 = new javax.swing.JComboBox<>();
        combo_colab2 = new javax.swing.JComboBox<>();
        eti_linea_Inv1 = new javax.swing.JLabel();
        eti_nombre = new javax.swing.JLabel();
        eti_nivel = new javax.swing.JLabel();
        txt_Nombre1 = new javax.swing.JTextField();
        combo_linea_inv = new javax.swing.JComboBox<>();
        combo_Nivel1 = new javax.swing.JComboBox<>();
        eti_colaboradores = new javax.swing.JLabel();
        eti_tipo1 = new javax.swing.JLabel();
        eti_buscar = new javax.swing.JLabel();
        combo_colab1 = new javax.swing.JComboBox<>();
        combo_buscar = new javax.swing.JComboBox<>();
        eti_estatus = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        btn_Buscar = new javax.swing.JButton();
        combo_colab3 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(1041, 602));
        setMinimumSize(new java.awt.Dimension(1041, 602));
        setPreferredSize(new java.awt.Dimension(1041, 602));

        btn_editar.setBackground(new java.awt.Color(255, 0, 0));
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("ELIMINAR");

        eti_fecha_registro.setForeground(new java.awt.Color(0, 0, 0));
        eti_fecha_registro.setText("FECHA DE REGISTRO: ");

        como_estatus1.setBackground(new java.awt.Color(255, 255, 255));
        como_estatus1.setForeground(new java.awt.Color(0, 0, 0));
        como_estatus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Proceso", "Concluido" }));

        combo_tipo1.setBackground(new java.awt.Color(255, 255, 255));
        combo_tipo1.setForeground(new java.awt.Color(0, 0, 0));
        combo_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artículo", "Estancia Académica", "Informe Técnico", "Dirección de Tesis", "Prototipo" }));

        combo_colab2.setBackground(new java.awt.Color(255, 255, 255));
        combo_colab2.setForeground(new java.awt.Color(0, 0, 0));

        eti_linea_Inv1.setForeground(new java.awt.Color(0, 0, 0));
        eti_linea_Inv1.setText("LINEA DE INVESTIGACIÓN:");

        eti_nombre.setForeground(new java.awt.Color(0, 0, 0));
        eti_nombre.setText("NOMBRE PRODUCTO: ");

        eti_nivel.setForeground(new java.awt.Color(0, 0, 0));
        eti_nivel.setText("NIVEL: ");

        txt_Nombre1.setEditable(false);
        txt_Nombre1.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre1.setForeground(new java.awt.Color(0, 0, 0));

        combo_linea_inv.setBackground(new java.awt.Color(255, 255, 255));
        combo_linea_inv.setForeground(new java.awt.Color(0, 0, 0));
        combo_linea_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_linea_invActionPerformed(evt);
            }
        });

        combo_Nivel1.setBackground(new java.awt.Color(255, 255, 255));
        combo_Nivel1.setForeground(new java.awt.Color(0, 0, 0));
        combo_Nivel1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura", "Maestría", "Doctorado" }));

        eti_colaboradores.setForeground(new java.awt.Color(0, 0, 0));
        eti_colaboradores.setText("COLABORADORES (MAX 3) :");

        eti_tipo1.setForeground(new java.awt.Color(0, 0, 0));
        eti_tipo1.setText("TIPO PRODUCTO: ");

        eti_buscar.setForeground(new java.awt.Color(0, 0, 0));
        eti_buscar.setText("BUSCAR POR:");

        combo_colab1.setBackground(new java.awt.Color(255, 255, 255));
        combo_colab1.setForeground(new java.awt.Color(0, 0, 0));

        combo_buscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_estatus.setForeground(new java.awt.Color(0, 0, 0));
        eti_estatus.setText("ESTATUS: ");

        btn_Buscar.setText("BUSCAR");

        combo_colab3.setBackground(new java.awt.Color(255, 255, 255));
        combo_colab3.setForeground(new java.awt.Color(0, 0, 0));
        combo_colab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_colab3ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(eti_linea_Inv1)
                                .addComponent(eti_colaboradores)
                                .addComponent(eti_buscar)
                                .addComponent(eti_nombre)
                                .addComponent(eti_tipo1))
                            .addComponent(btnActualizar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Buscar)
                                .addGap(30, 30, 30)
                                .addComponent(eti_nivel)
                                .addGap(18, 18, 18)
                                .addComponent(combo_Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_linea_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eti_fecha_registro)
                                        .addGap(18, 18, 18)
                                        .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eti_estatus)
                                        .addGap(18, 18, 18)
                                        .addComponent(como_estatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_colab1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_editar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(combo_colab2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combo_colab3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 231, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_buscar)
                    .addComponent(combo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar)
                    .addComponent(eti_nivel)
                    .addComponent(combo_Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti_fecha_registro)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(como_estatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eti_estatus))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_colab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_colab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_colaboradores)
                    .addComponent(combo_colab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo_colab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_colab3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_colab3ActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked

    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        tablaModelo = (DefaultTableModel) tablaProductos.getModel();
        conexion.llenarTablaProductos(tablaModelo);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void combo_linea_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_linea_invActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_linea_invActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JComboBox<String> combo_Nivel1;
    private javax.swing.JComboBox<String> combo_buscar;
    private javax.swing.JComboBox<String> combo_colab1;
    private javax.swing.JComboBox<String> combo_colab2;
    private javax.swing.JComboBox<String> combo_colab3;
    private javax.swing.JComboBox<String> combo_linea_inv;
    private javax.swing.JComboBox<String> combo_tipo1;
    private javax.swing.JComboBox<String> como_estatus1;
    private com.toedter.calendar.JDateChooser date1;
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
    private javax.swing.JTextField txt_Nombre1;
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
