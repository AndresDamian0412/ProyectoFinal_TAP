/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanels_Proyecto;

/**
 *
 * @author josep
 */
public class reg_docente extends javax.swing.JPanel {

    /**
     * Creates new form reg_docente
     */
    public reg_docente() {
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

        opciones_btns = new javax.swing.ButtonGroup();
        buttonsPanel = new javax.swing.JPanel();
        agregar_btn = new javax.swing.JToggleButton();
        editar_btn = new javax.swing.JToggleButton();
        eliminar_btn = new javax.swing.JToggleButton();
        principal_panel = new javax.swing.JPanel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        buttonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        opciones_btns.add(agregar_btn);
        agregar_btn.setText("AGREGAR");
        agregar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));
        agregar_btn.setMargin(new java.awt.Insets(2, 30, 2, 90));
        agregar_btn.setPreferredSize(new java.awt.Dimension(80, 21));
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });
        buttonsPanel.add(agregar_btn);

        opciones_btns.add(editar_btn);
        editar_btn.setText("EDITAR");
        editar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        editar_btn.setPreferredSize(new java.awt.Dimension(80, 21));
        editar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_btnActionPerformed(evt);
            }
        });
        buttonsPanel.add(editar_btn);

        opciones_btns.add(eliminar_btn);
        eliminar_btn.setText("ELIMINAR");
        eliminar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        eliminar_btn.setPreferredSize(new java.awt.Dimension(80, 21));
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });
        buttonsPanel.add(eliminar_btn);

        add(buttonsPanel);

        principal_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        principal_panel.setMinimumSize(new java.awt.Dimension(661, 441));
        principal_panel.setPreferredSize(new java.awt.Dimension(661, 441));
        principal_panel.setLayout(new java.awt.BorderLayout());
        add(principal_panel);
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btnActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        reg_docente_registrar rdr = new reg_docente_registrar();
        rdr.setSize(416,205);
        principal_panel.add(rdr);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_agregar_btnActionPerformed

    private void editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_btnActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        reg_docente_editar rde = new reg_docente_editar();
        rde.setSize(416,205);
        principal_panel.add(rde);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_editar_btnActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        // TODO add your handling code here:
        principal_panel.removeAll();
        reg_docente_eliminar rdel = new reg_docente_eliminar();
        rdel.setSize(416,205);
        principal_panel.add(rdel);
        principal_panel.revalidate();
        principal_panel.repaint();
    }//GEN-LAST:event_eliminar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton agregar_btn;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JToggleButton editar_btn;
    private javax.swing.JToggleButton eliminar_btn;
    private javax.swing.ButtonGroup opciones_btns;
    private javax.swing.JPanel principal_panel;
    // End of variables declaration//GEN-END:variables
}
