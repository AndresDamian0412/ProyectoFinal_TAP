/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_rapa;

/**
 *
 * @author axel8
 */
public class Docentes extends javax.swing.JFrame {

    /**
     * Creates new form Docentes
     */
    public Docentes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_usuario_docente = new javax.swing.JPanel();
        Foto_perfil = new javax.swing.JLabel();
        puesto_docente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Nombre_Docente = new javax.swing.JLabel();
        eti_departamento_docente = new javax.swing.JLabel();
        Panel_ProductosAcademicos = new javax.swing.JPanel();
        eti_informes = new javax.swing.JLabel();
        Img_productosAcademicos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        btn_Aceptar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tabla_productos_academicos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Fondo_Docentes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_usuario_docente.setBackground(new java.awt.Color(255, 255, 255));
        panel_usuario_docente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Docente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        Foto_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil_jefe_oficina (2).png"))); // NOI18N

        puesto_docente.setForeground(new java.awt.Color(0, 0, 0));
        puesto_docente.setText("Docente");

        Nombre_Docente.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Docente.setText("Nombre");

        eti_departamento_docente.setForeground(new java.awt.Color(0, 0, 0));
        eti_departamento_docente.setText("Departamento");

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
                .addComponent(eti_departamento_docente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_usuario_docenteLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panel_usuario_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puesto_docente)
                    .addComponent(Nombre_Docente))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_usuario_docenteLayout.setVerticalGroup(
            panel_usuario_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usuario_docenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Foto_perfil)
                .addGap(18, 18, 18)
                .addComponent(Nombre_Docente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(puesto_docente)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(eti_departamento_docente)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(panel_usuario_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 320));

        Panel_ProductosAcademicos.setBackground(new java.awt.Color(255, 255, 255));
        Panel_ProductosAcademicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(eti_informes)
                .addGap(53, 53, 53))
        );

        getContentPane().add(Panel_ProductosAcademicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 780, 260));

        btn_agregar.setBackground(new java.awt.Color(0, 204, 0));
        btn_agregar.setText("AGREGAR");
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btn_Aceptar1.setBackground(new java.awt.Color(255, 102, 0));
        btn_Aceptar1.setText("EDITAR");
        getContentPane().add(btn_Aceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("ELIMINAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LISTA DE PRODUCTOS ACADÉMICOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

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
        tabla_productos_academicos.setViewportView(jTable1);

        getContentPane().add(tabla_productos_academicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 780, 250));

        Fondo_Docentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_jefe_oficina.jpg"))); // NOI18N
        getContentPane().add(Fondo_Docentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1041, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel Fondo_Docentes;
    private javax.swing.JLabel Foto_perfil;
    private javax.swing.JLabel Img_productosAcademicos;
    private javax.swing.JLabel Nombre_Docente;
    private javax.swing.JPanel Panel_ProductosAcademicos;
    private javax.swing.JButton btn_Aceptar1;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JLabel eti_departamento_docente;
    private javax.swing.JLabel eti_informes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel_usuario_docente;
    private javax.swing.JLabel puesto_docente;
    private javax.swing.JScrollPane tabla_productos_academicos;
    // End of variables declaration//GEN-END:variables
}
