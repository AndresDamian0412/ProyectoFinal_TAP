/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanels_Proyecto;

/**
 *
 * @author axel8
 */
public class reg_productos_editar extends javax.swing.JPanel {

    /**
     * Creates new form reg_productos_editar
     */
    public reg_productos_editar() {
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

        jPanel1 = new javax.swing.JPanel();
        eti_linea_Inv = new javax.swing.JLabel();
        combo_linea_inv = new javax.swing.JComboBox<>();
        eti_tipo = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combo_colaboradores_1 = new javax.swing.JComboBox<>();
        combo_colaboradores_3 = new javax.swing.JComboBox<>();
        combo_colaboradores_2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        combo_Nivel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        DD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        YYYY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        como_estatus = new javax.swing.JComboBox<>();
        btn_Registrar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        DD1 = new javax.swing.JTextField();
        eti_fecha_registro = new javax.swing.JLabel();
        diagonal1 = new javax.swing.JLabel();
        combo_tipo1 = new javax.swing.JComboBox<>();
        MM1 = new javax.swing.JTextField();
        eti_nombre = new javax.swing.JLabel();
        txt_Nombre1 = new javax.swing.JTextField();
        diagonal3 = new javax.swing.JLabel();
        eti_colaboradores = new javax.swing.JLabel();
        YYYY1 = new javax.swing.JTextField();
        combo_colaboradores_4 = new javax.swing.JComboBox<>();
        eti_estatus = new javax.swing.JLabel();
        combo_colaboradores_5 = new javax.swing.JComboBox<>();
        como_estatus1 = new javax.swing.JComboBox<>();
        combo_colaboradores_6 = new javax.swing.JComboBox<>();
        eti_linea_Inv1 = new javax.swing.JLabel();
        eti_nivel = new javax.swing.JLabel();
        combo_linea_inv1 = new javax.swing.JComboBox<>();
        combo_Nivel1 = new javax.swing.JComboBox<>();
        eti_tipo1 = new javax.swing.JLabel();
        eti_buscar = new javax.swing.JLabel();
        combo_buscar = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        eti_linea_Inv.setForeground(new java.awt.Color(0, 0, 0));
        eti_linea_Inv.setText("LINEA DE INVESTIGACIÓN:");

        combo_linea_inv.setBackground(new java.awt.Color(255, 255, 255));
        combo_linea_inv.setForeground(new java.awt.Color(0, 0, 0));
        combo_linea_inv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_tipo.setForeground(new java.awt.Color(0, 0, 0));
        eti_tipo.setText("TIPO: ");

        combo_tipo.setBackground(new java.awt.Color(255, 255, 255));
        combo_tipo.setForeground(new java.awt.Color(0, 0, 0));
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE: ");

        txt_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("COLABORADORES (MAX 3) :");

        combo_colaboradores_1.setBackground(new java.awt.Color(255, 255, 255));
        combo_colaboradores_1.setForeground(new java.awt.Color(0, 0, 0));
        combo_colaboradores_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_colaboradores_3.setBackground(new java.awt.Color(255, 255, 255));
        combo_colaboradores_3.setForeground(new java.awt.Color(0, 0, 0));
        combo_colaboradores_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_colaboradores_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_colaboradores_3ActionPerformed(evt);
            }
        });

        combo_colaboradores_2.setBackground(new java.awt.Color(255, 255, 255));
        combo_colaboradores_2.setForeground(new java.awt.Color(0, 0, 0));
        combo_colaboradores_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NIVEL: ");

        combo_Nivel.setBackground(new java.awt.Color(255, 255, 255));
        combo_Nivel.setForeground(new java.awt.Color(0, 0, 0));
        combo_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FECHA DE REGISTRO: ");

        DD.setBackground(new java.awt.Color(255, 255, 255));
        DD.setForeground(new java.awt.Color(0, 0, 0));
        DD.setText("DD");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("/");

        MM.setBackground(new java.awt.Color(255, 255, 255));
        MM.setForeground(new java.awt.Color(0, 0, 0));
        MM.setText("MM");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("/");

        YYYY.setBackground(new java.awt.Color(255, 255, 255));
        YYYY.setForeground(new java.awt.Color(0, 0, 0));
        YYYY.setText("YYYY");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ESTATUS: ");

        como_estatus.setBackground(new java.awt.Color(255, 255, 255));
        como_estatus.setForeground(new java.awt.Color(0, 0, 0));
        como_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_Registrar.setBackground(new java.awt.Color(51, 204, 0));
        btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrar.setText("REGISTRAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(eti_linea_Inv)
                            .addComponent(eti_tipo)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(combo_linea_inv, 0, 239, Short.MAX_VALUE)
                                .addComponent(combo_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Nombre))
                            .addComponent(como_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(YYYY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combo_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combo_colaboradores_1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_colaboradores_2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_colaboradores_3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btn_Registrar)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_linea_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_linea_Inv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_tipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_colaboradores_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_colaboradores_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_colaboradores_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YYYY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(como_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btn_Registrar)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_editar.setBackground(new java.awt.Color(255, 102, 0));
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("EDITAR");

        DD1.setBackground(new java.awt.Color(255, 255, 255));
        DD1.setForeground(new java.awt.Color(0, 0, 0));
        DD1.setText("DD");

        eti_fecha_registro.setForeground(new java.awt.Color(0, 0, 0));
        eti_fecha_registro.setText("FECHA DE REGISTRO: ");

        diagonal1.setForeground(new java.awt.Color(0, 0, 0));
        diagonal1.setText("/");

        combo_tipo1.setBackground(new java.awt.Color(255, 255, 255));
        combo_tipo1.setForeground(new java.awt.Color(0, 0, 0));
        combo_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        MM1.setBackground(new java.awt.Color(255, 255, 255));
        MM1.setForeground(new java.awt.Color(0, 0, 0));
        MM1.setText("MM");

        eti_nombre.setForeground(new java.awt.Color(0, 0, 0));
        eti_nombre.setText("NOMBRE: ");

        txt_Nombre1.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre1.setForeground(new java.awt.Color(0, 0, 0));

        diagonal3.setForeground(new java.awt.Color(0, 0, 0));
        diagonal3.setText("/");

        eti_colaboradores.setForeground(new java.awt.Color(0, 0, 0));
        eti_colaboradores.setText("COLABORADORES (MAX 3) :");

        YYYY1.setBackground(new java.awt.Color(255, 255, 255));
        YYYY1.setForeground(new java.awt.Color(0, 0, 0));
        YYYY1.setText("YYYY");

        combo_colaboradores_4.setBackground(new java.awt.Color(255, 255, 255));
        combo_colaboradores_4.setForeground(new java.awt.Color(0, 0, 0));
        combo_colaboradores_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_estatus.setForeground(new java.awt.Color(0, 0, 0));
        eti_estatus.setText("ESTATUS: ");

        combo_colaboradores_5.setBackground(new java.awt.Color(255, 255, 255));
        combo_colaboradores_5.setForeground(new java.awt.Color(0, 0, 0));
        combo_colaboradores_5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_colaboradores_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_colaboradores_5ActionPerformed(evt);
            }
        });

        como_estatus1.setBackground(new java.awt.Color(255, 255, 255));
        como_estatus1.setForeground(new java.awt.Color(0, 0, 0));
        como_estatus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_colaboradores_6.setBackground(new java.awt.Color(255, 255, 255));
        combo_colaboradores_6.setForeground(new java.awt.Color(0, 0, 0));
        combo_colaboradores_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_linea_Inv1.setForeground(new java.awt.Color(0, 0, 0));
        eti_linea_Inv1.setText("LINEA DE INVESTIGACIÓN:");

        eti_nivel.setForeground(new java.awt.Color(0, 0, 0));
        eti_nivel.setText("NIVEL: ");

        combo_linea_inv1.setBackground(new java.awt.Color(255, 255, 255));
        combo_linea_inv1.setForeground(new java.awt.Color(0, 0, 0));
        combo_linea_inv1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_Nivel1.setBackground(new java.awt.Color(255, 255, 255));
        combo_Nivel1.setForeground(new java.awt.Color(0, 0, 0));
        combo_Nivel1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eti_tipo1.setForeground(new java.awt.Color(0, 0, 0));
        eti_tipo1.setText("TIPO: ");

        eti_buscar.setForeground(new java.awt.Color(0, 0, 0));
        eti_buscar.setText("BUSCAR POR:");

        combo_buscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_buscar.setText("BUSCAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eti_estatus)
                    .addComponent(eti_fecha_registro)
                    .addComponent(eti_nivel)
                    .addComponent(eti_linea_Inv1)
                    .addComponent(eti_colaboradores)
                    .addComponent(eti_buscar)
                    .addComponent(eti_nombre)
                    .addComponent(eti_tipo1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar))
                    .addComponent(txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_linea_inv1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diagonal1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diagonal3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(YYYY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(como_estatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addComponent(btn_editar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_colaboradores_4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_colaboradores_6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_colaboradores_5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_buscar)
                    .addComponent(combo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_linea_Inv1)
                    .addComponent(combo_linea_inv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_tipo1)
                    .addComponent(combo_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_colaboradores_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_colaboradores_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_colaboradores_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eti_colaboradores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_nivel)
                    .addComponent(combo_Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eti_fecha_registro)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diagonal1)
                                .addComponent(MM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diagonal3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(YYYY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_editar)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(como_estatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eti_estatus)))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo_colaboradores_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_colaboradores_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_colaboradores_3ActionPerformed

    private void combo_colaboradores_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_colaboradores_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_colaboradores_5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DD;
    private javax.swing.JTextField DD1;
    private javax.swing.JTextField MM;
    private javax.swing.JTextField MM1;
    private javax.swing.JTextField YYYY;
    private javax.swing.JTextField YYYY1;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JComboBox<String> combo_Nivel;
    private javax.swing.JComboBox<String> combo_Nivel1;
    private javax.swing.JComboBox<String> combo_buscar;
    private javax.swing.JComboBox<String> combo_colaboradores_1;
    private javax.swing.JComboBox<String> combo_colaboradores_2;
    private javax.swing.JComboBox<String> combo_colaboradores_3;
    private javax.swing.JComboBox<String> combo_colaboradores_4;
    private javax.swing.JComboBox<String> combo_colaboradores_5;
    private javax.swing.JComboBox<String> combo_colaboradores_6;
    private javax.swing.JComboBox<String> combo_linea_inv;
    private javax.swing.JComboBox<String> combo_linea_inv1;
    private javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JComboBox<String> combo_tipo1;
    private javax.swing.JComboBox<String> como_estatus;
    private javax.swing.JComboBox<String> como_estatus1;
    private javax.swing.JLabel diagonal1;
    private javax.swing.JLabel diagonal3;
    private javax.swing.JLabel eti_buscar;
    private javax.swing.JLabel eti_colaboradores;
    private javax.swing.JLabel eti_estatus;
    private javax.swing.JLabel eti_fecha_registro;
    private javax.swing.JLabel eti_linea_Inv;
    private javax.swing.JLabel eti_linea_Inv1;
    private javax.swing.JLabel eti_nivel;
    private javax.swing.JLabel eti_nombre;
    private javax.swing.JLabel eti_tipo;
    private javax.swing.JLabel eti_tipo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Nombre1;
    // End of variables declaration//GEN-END:variables
}