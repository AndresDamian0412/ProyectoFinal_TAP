package proyectofinal_rapa;

import JPanels_Proyecto.*;


public class Jefe_de_Oficina extends javax.swing.JFrame {

    public Jefe_de_Oficina() {
        initComponents();
        this.setLocation(150, 100);
        Nombre_Jefe_Oficina.setText(login.getDatos()[0]);
        eti_departamento_jefeOficina.setText(login.getDatos()[1]);
        
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Usuario_JefeOficina = new javax.swing.JPanel();
        Foto_perfil = new javax.swing.JLabel();
        Puesto_Jefe_Oficina = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Nombre_Jefe_Oficina = new javax.swing.JLabel();
        eti_departamento_jefeOficina = new javax.swing.JLabel();
        btn_semestrales = new javax.swing.JButton();
        btn_anuales = new javax.swing.JButton();
        btnTipo = new javax.swing.JButton();
        btn_rango = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        principal_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Usuario_JefeOficina.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Usuario_JefeOficina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        Foto_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_jefe_oficina (2).png"))); // NOI18N

        Puesto_Jefe_Oficina.setForeground(new java.awt.Color(0, 0, 0));
        Puesto_Jefe_Oficina.setText("Jefe de oficina");

        Nombre_Jefe_Oficina.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Jefe_Oficina.setText("Nombre");

        eti_departamento_jefeOficina.setForeground(new java.awt.Color(0, 0, 0));
        eti_departamento_jefeOficina.setText("Departamento");

        btn_semestrales.setText("SEMESTRALES");
        btn_semestrales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_semestralesActionPerformed(evt);
            }
        });

        btn_anuales.setText("ANUALES");
        btn_anuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anualesActionPerformed(evt);
            }
        });

        btnTipo.setText("TIPO PRODUCTOS");
        btnTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoActionPerformed(evt);
            }
        });

        btn_rango.setText("RANGO DE FECHAS");
        btn_rango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rangoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Usuario_JefeOficinaLayout = new javax.swing.GroupLayout(Panel_Usuario_JefeOficina);
        Panel_Usuario_JefeOficina.setLayout(Panel_Usuario_JefeOficinaLayout);
        Panel_Usuario_JefeOficinaLayout.setHorizontalGroup(
            Panel_Usuario_JefeOficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                .addGroup(Panel_Usuario_JefeOficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Nombre_Jefe_Oficina))
                    .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Puesto_Jefe_Oficina)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(Foto_perfil)
                .addGap(34, 34, 34))
            .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                .addGroup(Panel_Usuario_JefeOficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btn_anuales))
                    .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(eti_departamento_jefeOficina))
                    .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btn_semestrales))
                    .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_Usuario_JefeOficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_rango)
                            .addComponent(btnTipo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Usuario_JefeOficinaLayout.setVerticalGroup(
            Panel_Usuario_JefeOficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Foto_perfil)
                .addGap(18, 18, 18)
                .addComponent(Nombre_Jefe_Oficina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Puesto_Jefe_Oficina)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eti_departamento_jefeOficina)
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btn_semestrales)
                .addGap(18, 18, 18)
                .addComponent(btn_anuales)
                .addGap(18, 18, 18)
                .addComponent(btn_rango)
                .addGap(18, 18, 18)
                .addComponent(btnTipo)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_Usuario_JefeOficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 570));

        javax.swing.GroupLayout principal_panelLayout = new javax.swing.GroupLayout(principal_panel);
        principal_panel.setLayout(principal_panelLayout);
        principal_panelLayout.setHorizontalGroup(
            principal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        principal_panelLayout.setVerticalGroup(
            principal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(principal_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 870, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_semestralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_semestralesActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        info_semestral is = new info_semestral();
        is.setSize(principal_panel.getSize());
        principal_panel.add(is);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_btn_semestralesActionPerformed

    private void btnTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        info_tipo_productos itp = new info_tipo_productos();
        itp.setSize(principal_panel.getSize());
        principal_panel.add(itp);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_btnTipoActionPerformed

    private void btn_rangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rangoActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        info_rangoFechas irf = new info_rangoFechas();
        irf.setSize(principal_panel.getSize());
        principal_panel.add(irf);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_btn_rangoActionPerformed

    private void btn_anualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anualesActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        info_anual ia = new info_anual();
        ia.setSize(principal_panel.getSize());
        principal_panel.add(ia);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_btn_anualesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jefe_de_Oficina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Foto_perfil;
    private javax.swing.JLabel Nombre_Jefe_Oficina;
    private javax.swing.JPanel Panel_Usuario_JefeOficina;
    private javax.swing.JLabel Puesto_Jefe_Oficina;
    private javax.swing.JButton btnTipo;
    private javax.swing.JButton btn_anuales;
    private javax.swing.JButton btn_rango;
    private javax.swing.JButton btn_semestrales;
    private javax.swing.JLabel eti_departamento_jefeOficina;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel principal_panel;
    // End of variables declaration//GEN-END:variables
}
