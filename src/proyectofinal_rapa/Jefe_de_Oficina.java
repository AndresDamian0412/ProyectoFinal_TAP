package proyectofinal_rapa;


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
        jPanel1 = new javax.swing.JPanel();

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
        Panel_Informes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(eti_informes)
                .addGap(42, 42, 42))
        );

        getContentPane().add(Panel_Informes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 250));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 870, 570));

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
    private javax.swing.JLabel Foto_perfil;
    private javax.swing.JLabel Nombre_Jefe_Oficina;
    private javax.swing.JPanel Panel_Informes;
    private javax.swing.JPanel Panel_Usuario_JefeOficina;
    private javax.swing.JLabel Puesto_Jefe_Oficina;
    private javax.swing.JLabel eti_departamento_jefeOficina;
    private javax.swing.JLabel eti_informes;
    private javax.swing.JLabel img_Informe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
