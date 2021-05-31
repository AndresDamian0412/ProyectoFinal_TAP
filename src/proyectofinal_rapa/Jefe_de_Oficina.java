package proyectofinal_rapa;

public class Jefe_de_Oficina extends javax.swing.JFrame {

    public Jefe_de_Oficina() {
        initComponents();
        this.setLocation(150, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        Panel_Usuario_JefeOficina = new javax.swing.JPanel();
        Foto_perfil = new javax.swing.JLabel();
        Puesto_Jefe_Oficina = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Nombre_Jefe_Oficina = new javax.swing.JLabel();
        eti_departamento_jefeOficina = new javax.swing.JLabel();
        Panel_Informes = new javax.swing.JPanel();
        img_Informe = new javax.swing.JLabel();
        eti_informes = new javax.swing.JLabel();
        Titulo_Informes = new javax.swing.JLabel();
        eti_Tipo_Presentacion = new javax.swing.JLabel();
        combo_presentacion = new javax.swing.JComboBox<>();
        eti_Titulo_Informe_Generado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Aceptar = new javax.swing.JButton();
        Fondo_Jefe_Oficina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Usuario_JefeOficina.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Usuario_JefeOficina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        Foto_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_jefe_oficina (2).png"))); // NOI18N

        Puesto_Jefe_Oficina.setForeground(new java.awt.Color(0, 0, 0));
        Puesto_Jefe_Oficina.setText("Jefe de oficina");

        Nombre_Jefe_Oficina.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Jefe_Oficina.setText("Nombre");

        eti_departamento_jefeOficina.setForeground(new java.awt.Color(0, 0, 0));
        eti_departamento_jefeOficina.setText("Departamento");

        javax.swing.GroupLayout Panel_Usuario_JefeOficinaLayout = new javax.swing.GroupLayout(Panel_Usuario_JefeOficina);
        Panel_Usuario_JefeOficina.setLayout(Panel_Usuario_JefeOficinaLayout);
        Panel_Usuario_JefeOficinaLayout.setHorizontalGroup(
            Panel_Usuario_JefeOficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(Foto_perfil)
                .addGap(34, 34, 34))
            .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                .addGroup(Panel_Usuario_JefeOficinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Nombre_Jefe_Oficina))
                    .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Puesto_Jefe_Oficina)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Panel_Usuario_JefeOficinaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(eti_departamento_jefeOficina)
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
                .addGap(36, 36, 36)
                .addComponent(eti_departamento_jefeOficina)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_Usuario_JefeOficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 320));

        Panel_Informes.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Informes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        Panel_Informes.setForeground(new java.awt.Color(0, 0, 0));

        img_Informe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Informes_Jefe_Oficina.png"))); // NOI18N

        eti_informes.setForeground(new java.awt.Color(0, 0, 0));
        eti_informes.setText("INFORMES");

        javax.swing.GroupLayout Panel_InformesLayout = new javax.swing.GroupLayout(Panel_Informes);
        Panel_Informes.setLayout(Panel_InformesLayout);
        Panel_InformesLayout.setHorizontalGroup(
            Panel_InformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InformesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_Informe)
                .addGap(54, 54, 54))
            .addGroup(Panel_InformesLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(eti_informes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_InformesLayout.setVerticalGroup(
            Panel_InformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InformesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(img_Informe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(eti_informes)
                .addGap(42, 42, 42))
        );

        getContentPane().add(Panel_Informes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 250));

        Titulo_Informes.setFont(new java.awt.Font("Bookman Old Style", 0, 48)); // NOI18N
        Titulo_Informes.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_Informes.setText("Informes");
        getContentPane().add(Titulo_Informes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 220, -1));

        eti_Tipo_Presentacion.setForeground(new java.awt.Color(0, 0, 0));
        eti_Tipo_Presentacion.setText("TIPO DE PRESENTACIÓN: ");
        getContentPane().add(eti_Tipo_Presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 150, 30));

        combo_presentacion.setBackground(new java.awt.Color(255, 255, 255));
        combo_presentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 220, -1));

        eti_Titulo_Informe_Generado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eti_Titulo_Informe_Generado.setForeground(new java.awt.Color(0, 0, 0));
        eti_Titulo_Informe_Generado.setText("INFORME GENERADO");
        getContentPane().add(eti_Titulo_Informe_Generado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 690, 380));

        btn_Aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Aceptar.setText("Aceptar");
        getContentPane().add(btn_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 80, 30));

        Fondo_Jefe_Oficina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_jefe_oficina.jpg"))); // NOI18N
        getContentPane().add(Fondo_Jefe_Oficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1054, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jefe_de_Oficina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_Jefe_Oficina;
    private javax.swing.JLabel Foto_perfil;
    private javax.swing.JLabel Nombre_Jefe_Oficina;
    private javax.swing.JPanel Panel_Informes;
    private javax.swing.JPanel Panel_Usuario_JefeOficina;
    private javax.swing.JLabel Puesto_Jefe_Oficina;
    private javax.swing.JLabel Titulo_Informes;
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JComboBox<String> combo_presentacion;
    private javax.swing.JLabel eti_Tipo_Presentacion;
    private javax.swing.JLabel eti_Titulo_Informe_Generado;
    private javax.swing.JLabel eti_departamento_jefeOficina;
    private javax.swing.JLabel eti_informes;
    private javax.swing.JLabel img_Informe;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
