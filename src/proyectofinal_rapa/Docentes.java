package proyectofinal_rapa;

import JPanels_Proyecto.*;
import javax.swing.table.DefaultTableModel;

public class Docentes extends javax.swing.JFrame {

    DefaultTableModel tablaModelo;
    public conexion_db conexion = new conexion_db();

    public Docentes() {
        initComponents();
        this.setLocation(150, 100);
        this.setResizable(false);
        lbl_nombre.setText(login.getDatos()[0]);
        lbl_depa.setText(login.getDatos()[1]);

//        btn_agregar.addActionListener(this);
//        btn_editar.addActionListener(this);
//        btn_eliminar.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_usuario_docente = new javax.swing.JPanel();
        Foto_perfil = new javax.swing.JLabel();
        puesto_docente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_nombre = new javax.swing.JLabel();
        lbl_depa = new javax.swing.JLabel();
        Panel_ProductosAcademicos = new javax.swing.JPanel();
        eti_informes = new javax.swing.JLabel();
        Img_productosAcademicos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PanelBtns = new javax.swing.JPanel();
        agregar_btn = new javax.swing.JToggleButton();
        editar_btn = new javax.swing.JToggleButton();
        eliminar_btn = new javax.swing.JToggleButton();
        principal_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_usuario_docente.setBackground(new java.awt.Color(255, 255, 255));
        panel_usuario_docente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Docente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        Foto_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_jefe_oficina (2).png"))); // NOI18N

        puesto_docente.setForeground(new java.awt.Color(0, 0, 0));
        puesto_docente.setText("Docente");

        lbl_nombre.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombre.setText("Nombre");

        lbl_depa.setForeground(new java.awt.Color(0, 0, 0));
        lbl_depa.setText("Departamento");

        javax.swing.GroupLayout panel_usuario_docenteLayout = new javax.swing.GroupLayout(panel_usuario_docente);
        panel_usuario_docente.setLayout(panel_usuario_docenteLayout);
        panel_usuario_docenteLayout.setHorizontalGroup(
            panel_usuario_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_usuario_docenteLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(Foto_perfil)
                .addGap(34, 34, 34))
            .addGroup(panel_usuario_docenteLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbl_depa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_usuario_docenteLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panel_usuario_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puesto_docente)
                    .addComponent(lbl_nombre))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_usuario_docenteLayout.setVerticalGroup(
            panel_usuario_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usuario_docenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Foto_perfil)
                .addGap(18, 18, 18)
                .addComponent(lbl_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(puesto_docente)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lbl_depa)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(panel_usuario_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 320));

        Panel_ProductosAcademicos.setBackground(new java.awt.Color(255, 255, 255));
        Panel_ProductosAcademicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        Panel_ProductosAcademicos.setForeground(new java.awt.Color(0, 0, 0));

        eti_informes.setForeground(new java.awt.Color(0, 0, 0));
        eti_informes.setText("PRODUCTOS ACADEMICOS");

        Img_productosAcademicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Productos_academicos.jpg"))); // NOI18N

        javax.swing.GroupLayout Panel_ProductosAcademicosLayout = new javax.swing.GroupLayout(Panel_ProductosAcademicos);
        Panel_ProductosAcademicos.setLayout(Panel_ProductosAcademicosLayout);
        Panel_ProductosAcademicosLayout.setHorizontalGroup(
            Panel_ProductosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProductosAcademicosLayout.createSequentialGroup()
                .addGroup(Panel_ProductosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ProductosAcademicosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(eti_informes))
                    .addGroup(Panel_ProductosAcademicosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Img_productosAcademicos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_ProductosAcademicosLayout.setVerticalGroup(
            Panel_ProductosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ProductosAcademicosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Img_productosAcademicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(eti_informes)
                .addGap(53, 53, 53))
        );

        getContentPane().add(Panel_ProductosAcademicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 280));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelBtns.setMaximumSize(new java.awt.Dimension(260, 31));

        agregar_btn.setText("AGREGAR");
        agregar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));
        agregar_btn.setMargin(new java.awt.Insets(2, 30, 2, 90));
        agregar_btn.setPreferredSize(new java.awt.Dimension(80, 21));
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });
        PanelBtns.add(agregar_btn);

        editar_btn.setText("EDITAR");
        editar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        editar_btn.setPreferredSize(new java.awt.Dimension(80, 21));
        editar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_btnActionPerformed(evt);
            }
        });
        PanelBtns.add(editar_btn);

        eliminar_btn.setText("ELIMINAR");
        eliminar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        eliminar_btn.setPreferredSize(new java.awt.Dimension(80, 21));
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });
        PanelBtns.add(eliminar_btn);

        getContentPane().add(PanelBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 440, 30));

        principal_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        principal_panel.setMinimumSize(new java.awt.Dimension(661, 441));
        principal_panel.setPreferredSize(new java.awt.Dimension(661, 441));
        principal_panel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(principal_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 850, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btnActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        reg_productos_registrar rpr = new reg_productos_registrar();
        rpr.setSize(1041, 602);
        principal_panel.add(rpr);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_agregar_btnActionPerformed

    private void editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_btnActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        reg_productos_editar rpe = new reg_productos_editar();
        rpe.setSize(1041, 602);
        principal_panel.add(rpe);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_editar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        reg_productos_eliminar rpel = new reg_productos_eliminar();
        rpel.setSize(1041, 602);
        principal_panel.add(rpel);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_eliminar_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Docentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Foto_perfil;
    private javax.swing.JLabel Img_productosAcademicos;
    private javax.swing.JPanel PanelBtns;
    private javax.swing.JPanel Panel_ProductosAcademicos;
    private javax.swing.JToggleButton agregar_btn;
    private javax.swing.JToggleButton editar_btn;
    private javax.swing.JToggleButton eliminar_btn;
    private javax.swing.JLabel eti_informes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_depa;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JPanel panel_usuario_docente;
    private javax.swing.JPanel principal_panel;
    private javax.swing.JLabel puesto_docente;
    // End of variables declaration//GEN-END:variables

}
