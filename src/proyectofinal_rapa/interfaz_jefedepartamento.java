package proyectofinal_rapa;

import JPanels_Proyecto.jefe_depa_prod_gral;
import JPanels_Proyecto.reg_docente;
import JPanels_Proyecto.reg_linea_inv;

/**
 *
 * @author josep
 */
public class interfaz_jefedepartamento extends javax.swing.JFrame {

    public interfaz_jefedepartamento() {
        initComponents();
        this.setLocation(150, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesGroupBtns = new javax.swing.ButtonGroup();
        panel_jefeDepartamento = new javax.swing.JPanel();
        img_usuario = new javax.swing.JLabel();
        Nombre_JefeDepar = new javax.swing.JLabel();
        eti_jefe_depa = new javax.swing.JLabel();
        eti_depart = new javax.swing.JLabel();
        panel_Registro = new javax.swing.JPanel();
        btn_linea_invest = new javax.swing.JButton();
        eti_linea_deInvs = new javax.swing.JLabel();
        eti_docentes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel_btn_visualizar = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panel_visualizar = new javax.swing.JPanel();
        panel_btn_visualizar1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_jefeDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        panel_jefeDepartamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jefe Departamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        img_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_jefe_oficina (2).png"))); // NOI18N

        Nombre_JefeDepar.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_JefeDepar.setText("Nombre");

        eti_jefe_depa.setForeground(new java.awt.Color(0, 0, 0));
        eti_jefe_depa.setText("Jefe de departamento: ");

        eti_depart.setForeground(new java.awt.Color(0, 0, 0));
        eti_depart.setText("Departamento");

        javax.swing.GroupLayout panel_jefeDepartamentoLayout = new javax.swing.GroupLayout(panel_jefeDepartamento);
        panel_jefeDepartamento.setLayout(panel_jefeDepartamentoLayout);
        panel_jefeDepartamentoLayout.setHorizontalGroup(
            panel_jefeDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_jefeDepartamentoLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(eti_jefe_depa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(panel_jefeDepartamentoLayout.createSequentialGroup()
                .addGroup(panel_jefeDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_jefeDepartamentoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(eti_depart))
                    .addGroup(panel_jefeDepartamentoLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Nombre_JefeDepar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_jefeDepartamentoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(img_usuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_jefeDepartamentoLayout.setVerticalGroup(
            panel_jefeDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jefeDepartamentoLayout.createSequentialGroup()
                .addComponent(img_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_JefeDepar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eti_jefe_depa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eti_depart)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(panel_jefeDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 210));

        panel_Registro.setBackground(new java.awt.Color(255, 255, 255));
        panel_Registro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        btn_linea_invest.setBackground(new java.awt.Color(255, 255, 255));
        btn_linea_invest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea_investigacion_icono.JPG"))); // NOI18N
        btn_linea_invest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eti_linea_deInvs.setForeground(new java.awt.Color(0, 0, 0));
        eti_linea_deInvs.setText("Linea de investigación");

        eti_docentes.setForeground(new java.awt.Color(0, 0, 0));
        eti_docentes.setText("Docentes");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar_usuario_icono.JPG"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                            .addComponent(jButton1))))
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addComponent(jButton1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(panel_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 200));

        panel_btn_visualizar.setBackground(new java.awt.Color(255, 255, 255));
        panel_btn_visualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Visualizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/produccion_general_icono.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producción general");

        javax.swing.GroupLayout panel_btn_visualizarLayout = new javax.swing.GroupLayout(panel_btn_visualizar);
        panel_btn_visualizar.setLayout(panel_btn_visualizarLayout);
        panel_btn_visualizarLayout.setHorizontalGroup(
            panel_btn_visualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_btn_visualizarLayout.createSequentialGroup()
                .addGroup(panel_btn_visualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_btn_visualizarLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton2))
                    .addGroup(panel_btn_visualizarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panel_btn_visualizarLayout.setVerticalGroup(
            panel_btn_visualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_btn_visualizarLayout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel_btn_visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 190, 100));

        panel_visualizar.setBackground(new java.awt.Color(255, 255, 255));
        panel_visualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panel_visualizarLayout = new javax.swing.GroupLayout(panel_visualizar);
        panel_visualizar.setLayout(panel_visualizarLayout);
        panel_visualizarLayout.setHorizontalGroup(
            panel_visualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        panel_visualizarLayout.setVerticalGroup(
            panel_visualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        getContentPane().add(panel_visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 680, 570));

        panel_btn_visualizar1.setBackground(new java.awt.Color(255, 255, 255));
        panel_btn_visualizar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setText("SALIR");

        javax.swing.GroupLayout panel_btn_visualizar1Layout = new javax.swing.GroupLayout(panel_btn_visualizar1);
        panel_btn_visualizar1.setLayout(panel_btn_visualizar1Layout);
        panel_btn_visualizar1Layout.setHorizontalGroup(
            panel_btn_visualizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
            .addGroup(panel_btn_visualizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_btn_visualizar1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel_btn_visualizar1Layout.setVerticalGroup(
            panel_btn_visualizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(panel_btn_visualizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_btn_visualizar1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(panel_btn_visualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 190, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel Nombre_JefeDepar;
    private javax.swing.JButton btn_linea_invest;
    private javax.swing.JLabel eti_depart;
    private javax.swing.JLabel eti_docentes;
    private javax.swing.JLabel eti_jefe_depa;
    private javax.swing.JLabel eti_linea_deInvs;
    private javax.swing.JLabel img_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup opcionesGroupBtns;
    private javax.swing.JPanel panel_Registro;
    private javax.swing.JPanel panel_btn_visualizar;
    private javax.swing.JPanel panel_btn_visualizar1;
    private javax.swing.JPanel panel_jefeDepartamento;
    private javax.swing.JPanel panel_visualizar;
    // End of variables declaration//GEN-END:variables
}
