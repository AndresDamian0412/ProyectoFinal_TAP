package proyectofinal_rapa;

import JPanels_Proyecto.jefe_depa_prod_gral;
import JPanels_Proyecto.reg_docente;
import JPanels_Proyecto.reg_linea_inv;
import javax.swing.JOptionPane;

public class interfaz_jefedepartamento extends javax.swing.JFrame {

    public interfaz_jefedepartamento() {
        initComponents();
        this.setLocation(150, 100);
        lbl_nombre.setText(login.getDatos()[0]);
        lbl_depa.setText(login.getDatos()[1]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesGroupBtns = new javax.swing.ButtonGroup();
        areas_panel = new javax.swing.JPanel();
        panel_jefeDepartamento2 = new javax.swing.JPanel();
        img_usuario2 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        eti_jefe_depa2 = new javax.swing.JLabel();
        lbl_depa = new javax.swing.JLabel();
        panel_Registro = new javax.swing.JPanel();
        btn_linea_invest = new javax.swing.JButton();
        eti_linea_deInvs = new javax.swing.JLabel();
        eti_docentes = new javax.swing.JLabel();
        btn_docentes = new javax.swing.JButton();
        panel_btn_visualizar = new javax.swing.JPanel();
        brn_prod_gral = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        visual_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        areas_panel.setBackground(new java.awt.Color(255, 255, 255));
        areas_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areas_panel.setMaximumSize(new java.awt.Dimension(190, 590));
        areas_panel.setPreferredSize(new java.awt.Dimension(190, 590));
        areas_panel.setLayout(new javax.swing.BoxLayout(areas_panel, javax.swing.BoxLayout.Y_AXIS));

        panel_jefeDepartamento2.setBackground(new java.awt.Color(255, 255, 255));
        panel_jefeDepartamento2.setBorder(javax.swing.BorderFactory.createTitledBorder("Jefe Departamento"));

        img_usuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_jefe_oficina (2).png"))); // NOI18N

        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre.setText("Nombre");

        eti_jefe_depa2.setText("Jefe de departamento: ");

        lbl_depa.setText("Departamento");

        javax.swing.GroupLayout panel_jefeDepartamento2Layout = new javax.swing.GroupLayout(panel_jefeDepartamento2);
        panel_jefeDepartamento2.setLayout(panel_jefeDepartamento2Layout);
        panel_jefeDepartamento2Layout.setHorizontalGroup(
            panel_jefeDepartamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jefeDepartamento2Layout.createSequentialGroup()
                .addGroup(panel_jefeDepartamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_jefeDepartamento2Layout.createSequentialGroup()
                        .addGroup(panel_jefeDepartamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_jefeDepartamento2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(img_usuario2))
                            .addGroup(panel_jefeDepartamento2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(lbl_depa)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_jefeDepartamento2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(eti_jefe_depa2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_jefeDepartamento2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_jefeDepartamento2Layout.setVerticalGroup(
            panel_jefeDepartamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jefeDepartamento2Layout.createSequentialGroup()
                .addComponent(img_usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eti_jefe_depa2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_depa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        areas_panel.add(panel_jefeDepartamento2);

        panel_Registro.setBackground(new java.awt.Color(255, 255, 255));
        panel_Registro.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        btn_linea_invest.setBackground(new java.awt.Color(255, 255, 255));
        btn_linea_invest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea_investigacion_icono.JPG"))); // NOI18N
        btn_linea_invest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_linea_invest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_linea_investActionPerformed(evt);
            }
        });

        eti_linea_deInvs.setText("Linea de investigación");

        eti_docentes.setText("Usuarios");

        btn_docentes.setBackground(new java.awt.Color(255, 255, 255));
        btn_docentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar_usuario_icono.JPG"))); // NOI18N
        btn_docentes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_docentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_RegistroLayout = new javax.swing.GroupLayout(panel_Registro);
        panel_Registro.setLayout(panel_RegistroLayout);
        panel_RegistroLayout.setHorizontalGroup(
            panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegistroLayout.createSequentialGroup()
                .addGroup(panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_RegistroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(eti_linea_deInvs))
                    .addGroup(panel_RegistroLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti_docentes)
                            .addComponent(btn_linea_invest)
                            .addComponent(btn_docentes))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_RegistroLayout.setVerticalGroup(
            panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RegistroLayout.createSequentialGroup()
                .addComponent(eti_linea_deInvs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_linea_invest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eti_docentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_docentes)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        areas_panel.add(panel_Registro);

        panel_btn_visualizar.setBackground(new java.awt.Color(255, 255, 255));
        panel_btn_visualizar.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualizar"));

        brn_prod_gral.setBackground(new java.awt.Color(255, 255, 255));
        brn_prod_gral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/produccion_general_icono.png"))); // NOI18N
        brn_prod_gral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brn_prod_gral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brn_prod_gralActionPerformed(evt);
            }
        });

        jLabel1.setText("Producción general");

        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_btn_visualizarLayout = new javax.swing.GroupLayout(panel_btn_visualizar);
        panel_btn_visualizar.setLayout(panel_btn_visualizarLayout);
        panel_btn_visualizarLayout.setHorizontalGroup(
            panel_btn_visualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_btn_visualizarLayout.createSequentialGroup()
                .addGroup(panel_btn_visualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_btn_visualizarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(panel_btn_visualizarLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(brn_prod_gral))
                    .addGroup(panel_btn_visualizarLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_btn_visualizarLayout.setVerticalGroup(
            panel_btn_visualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_btn_visualizarLayout.createSequentialGroup()
                .addComponent(brn_prod_gral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        areas_panel.add(panel_btn_visualizar);

        getContentPane().add(areas_panel);

        visual_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout visual_panelLayout = new javax.swing.GroupLayout(visual_panel);
        visual_panel.setLayout(visual_panelLayout);
        visual_panelLayout.setHorizontalGroup(
            visual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );
        visual_panelLayout.setVerticalGroup(
            visual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        getContentPane().add(visual_panel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_linea_investActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_linea_investActionPerformed
        // TODO add your handling code here:
        visual_panel.removeAll();
        reg_linea_inv rli = new reg_linea_inv();
        rli.setSize(visual_panel.getSize());
        visual_panel.add(rli);
        visual_panel.revalidate();
        visual_panel.repaint();
    }//GEN-LAST:event_btn_linea_investActionPerformed

    private void btn_docentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_docentesActionPerformed
        // TODO add your handling code here:
        visual_panel.removeAll();
        reg_docente rd = new reg_docente();
        rd.setSize(visual_panel.getSize());
        visual_panel.add(rd);
        visual_panel.revalidate();
        visual_panel.repaint();
    }//GEN-LAST:event_btn_docentesActionPerformed

    private void brn_prod_gralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brn_prod_gralActionPerformed
        // TODO add your handling code here:
        visual_panel.removeAll();
        jefe_depa_prod_gral jdpg = new jefe_depa_prod_gral();
        jdpg.setSize(visual_panel.getSize());
        visual_panel.add(jdpg);
        visual_panel.revalidate();
        visual_panel.repaint();
    }//GEN-LAST:event_brn_prod_gralActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        if ((JOptionPane.showConfirmDialog(this, "¿En verdad desea cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION)) == 0) {
            login l = new login();
            l.setVisible(true);
            this.dispose();
        }else{
            //Nada
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_jefedepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areas_panel;
    private javax.swing.JButton brn_prod_gral;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_docentes;
    private javax.swing.JButton btn_linea_invest;
    private javax.swing.JLabel eti_docentes;
    private javax.swing.JLabel eti_jefe_depa2;
    private javax.swing.JLabel eti_linea_deInvs;
    private javax.swing.JLabel img_usuario2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_depa;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.ButtonGroup opcionesGroupBtns;
    private javax.swing.JPanel panel_Registro;
    private javax.swing.JPanel panel_btn_visualizar;
    private javax.swing.JPanel panel_jefeDepartamento2;
    private javax.swing.JPanel visual_panel;
    // End of variables declaration//GEN-END:variables
}
