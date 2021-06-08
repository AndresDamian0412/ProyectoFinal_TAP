package proyectofinal_rapa;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class login extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    private static String[] datos = new String[2];

    public static String[] getDatos() {
        return datos;
    }

    public login() {
        this.setContentPane(fondo);
        initComponents();
        panelLogin.setLocation(50, 100);
        this.setLocation(50,100);
        this.setTitle("REGISTRO Y ADMINISTRACIÓN DE PRODUCTOS ACADEMICOS (RAPA)");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtContra = new javax.swing.JPasswordField();
        lblNuevouser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelLogin.setPreferredSize(new java.awt.Dimension(350, 200));

        lblBienvenida.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Bienvenido/a");

        txtUsuario.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtUsuario.setText("Nombre de usuario");
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(139, 182, 150), null, null));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnIniciar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnIniciar.setText("Iniciar sesión");
        btnIniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtContra.setText("jPasswordField1");
        txtContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraFocusGained(evt);
            }
        });

        lblNuevouser.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblNuevouser.setForeground(new java.awt.Color(0, 43, 255));
        lblNuevouser.setText("¿No cuenta con un usuario? Click aquí para registrarte!");
        lblNuevouser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevouserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(txtContra)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                                .addComponent(lblNuevouser)
                                .addGap(25, 25, 25)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnIniciar)
                .addGap(60, 60, 60)
                .addComponent(btnVolver)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNuevouser)
                .addGap(19, 19, 19)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnVolver))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        // TODO add your handling code here:
        txtUsuario.selectAll();
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
        portada p = new portada();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        // TODO add your handling code here:
        String user, contra;
        user = txtUsuario.getText();
        contra = new String(txtContra.getPassword());
        conexion_db cdb = new conexion_db();
        String[] aux = new String[3];
        aux = cdb.login(user, contra);
        String puesto = aux[0];
        datos[0]=aux[1];
        datos[1] = aux[2];
        
        if(!(puesto.isEmpty())){
            switch (puesto){
                case ("Docente") :{
                    Docentes d = new Docentes();
                    d.setVisible(true);
                    this.dispose();
                    break;
                }
                
                case ("Jefe de Departamento"):{
                    interfaz_jefedepartamento jdp = new interfaz_jefedepartamento();
                    jdp.setVisible(true);
                    this.dispose();
                    break;
                }
                
                case ("Jefe de Oficina"):{
                    Jefe_de_Oficina jdo = new Jefe_de_Oficina();
                    jdo.setVisible(true);
                    this.dispose();
                    break;
                }
                
                default :{
                    JOptionPane.showMessageDialog(null, "Lo sentimos, su puesto no coincide con ninguno en la lista de usuarios permitidos.");
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Verifique sus datos e ingrese de nuevo");
        }
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void txtContraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraFocusGained
        // TODO add your handling code here:
        txtContra.selectAll();
    }//GEN-LAST:event_txtContraFocusGained

    private void lblNuevouserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevouserMouseClicked
        // TODO add your handling code here:
        registro_de_jefes rdj = new registro_de_jefes();
        rdj.setVisible(true);
    }//GEN-LAST:event_lblNuevouserMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblNuevouser;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/Diseño sin título.png")).getImage();
            
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
