/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mvrivera
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(721, 410);
        b.cargarArchivo();

        for (Usuario i : b.getListaPersonas()) {
            usuario.add(i);
            if(i instanceof Clientes){
            System.out.println("Cliente  Usuario: "+i.getUsuario() + " Pass:" + i.getContra());     
            }
             if(i instanceof Usuario_mantenimiento){
            System.out.println("Mantenimiento  Usuario:"+i.getUsuario() + " Pass:" + i.getContra());     
            }
           
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cc_id = new javax.swing.JTextField();
        cc_nombre1 = new javax.swing.JTextField();
        cc_nombre2 = new javax.swing.JTextField();
        cc_apellido1 = new javax.swing.JTextField();
        cc_apellido2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cc_pass = new javax.swing.JPasswordField();
        cc_fecha = new datechooser.beans.DateChooserCombo();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cc_numCuenta = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        cc_usuario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cm_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cm_nombre1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cm_nombre2 = new javax.swing.JTextField();
        cm_apellido1 = new javax.swing.JTextField();
        cm_pass = new javax.swing.JPasswordField();
        cm_apellido2 = new javax.swing.JTextField();
        cm_fecha = new datechooser.beans.DateChooserCombo();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cm_usuario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        PrincipalCliente = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        atmBox1 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton9 = new javax.swing.JButton();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        atmBox2 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton10 = new javax.swing.JButton();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jButton11 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        atmBox3 = new javax.swing.JComboBox<>();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        cu_id = new javax.swing.JTextField();
        cu_tarjeta = new javax.swing.JFormattedTextField();
        cu_saldo = new javax.swing.JSpinner();
        jLabel41 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        atmBox4 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        PrincipalMantenimiento = new javax.swing.JFrame();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        atm_ubicacion = new javax.swing.JTextField();
        atm_id = new javax.swing.JTextField();
        atm_tiempo = new javax.swing.JTextField();
        atm_anio = new javax.swing.JTextField();
        atm_Saldo = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMantenimiento = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        atmBox = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cant_100 = new javax.swing.JSpinner();
        cant_500 = new javax.swing.JSpinner();
        jButton8 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jLabel45 = new javax.swing.JLabel();
        L_usuario = new javax.swing.JTextField();
        L_Pass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("REGISTRO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        cc_id.setEditable(false);
        jPanel1.add(cc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 194, 244, 38));
        jPanel1.add(cc_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 82, 244, 38));
        jPanel1.add(cc_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 244, 38));
        jPanel1.add(cc_apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 138, 244, 38));
        jPanel1.add(cc_apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 244, 38));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("ID :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Primer Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Segundo Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Primer Apellido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Segundo Apellido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Pass:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 323, -1, -1));
        jPanel1.add(cc_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 312, 244, 38));

        cc_fecha.setFormat(0);
        jPanel1.add(cc_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 368, 244, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Numero de cuenta:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        try {
            cc_numCuenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cc_numCuenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(cc_numCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 240, 36));

        jButton3.setText("REGISTRARSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 486, 627, 48));
        jPanel1.add(cc_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 244, 244, 42));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Usuario:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 257, -1, -1));

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel144.setText("jLabel118");
        jPanel1.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 380, 320));

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel1.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 540, 320));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel48.setText("jLabel46");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 390, 1050, 660));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel1.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 370, 390));

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel147.setText("jLabel117");
        jPanel1.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jTabbedPane1.addTab("Cuenta Cliente", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel47.setText("REGISTRO");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Primer Apellido:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 149, -1, -1));

        cm_id.setEditable(false);
        jPanel2.add(cm_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 194, 244, 38));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Segundo Apellido:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 149, -1, -1));
        jPanel2.add(cm_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 82, 244, 38));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Pass:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 317, -1, -1));
        jPanel2.add(cm_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 244, 38));
        jPanel2.add(cm_apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 138, 244, 38));
        jPanel2.add(cm_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 306, 243, 38));
        jPanel2.add(cm_apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 244, 38));
        jPanel2.add(cm_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 356, 243, 40));

        jButton4.setText("REGISTRARSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 432, 600, 46));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Fecha Nacimiento:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("ID :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 205, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Primer Nombre:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 93, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Segundo Nombre:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 93, -1, -1));
        jPanel2.add(cm_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 250, 244, 38));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Usuario:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 261, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel46.setText("jLabel46");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1050, 660));

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel2.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 370, 390));

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel141.setText("jLabel117");
        jPanel2.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel142.setText("jLabel118");
        jPanel2.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, -10, 430, 320));

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel2.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 470, 320));

        jTabbedPane1.addTab("Cuenta Mantenimiento", jPanel2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c91a505154cc2b1e3b2134a20959799d.png"))); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu1.setText("Volver");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        Registro.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atmBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --------------------------------" }));
        jPanel3.add(atmBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 470, 43));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("Seleccione cuenta:");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 180, -1, -1));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setText("Ingrese la cantidad de dinero que desea Retirar:");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 236, -1, -1));
        jPanel3.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 270, 45));

        jButton9.setText("RETIRAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 318, 620, 61));

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel156.setText("jLabel117");
        jPanel3.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel3.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 430, 390));

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel158.setText("jLabel118");
        jPanel3.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 430, 320));

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel3.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 470, 450));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel52.setText("jLabel46");
        jPanel3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1050, 660));

        jTabbedPane2.addTab("Retirar Dinero", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atmBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --------------------------------" }));
        jPanel4.add(atmBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 480, 43));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("Mis cuentas:");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("Ingrese la cantidad de dinero que desea Depositar:");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));
        jPanel4.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 203, 45));

        jButton10.setText("DEPOSITAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 570, 61));

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel160.setText("jLabel117");
        jPanel4.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel4.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 430, 390));

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel162.setText("jLabel118");
        jPanel4.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 430, 320));

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel4.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 470, 450));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel53.setText("jLabel46");
        jPanel4.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1050, 660));

        jTabbedPane2.addTab("Depositar Dinero", jPanel4);

        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setText("Ingrese la cantidad de dinero que desea Depositar:");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 399, -1, -1));
        jPanel10.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 290, 45));

        jButton11.setText("DEPOSITAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 448, 650, 61));

        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Primer Nombre", "Primer Apellido", "Usuario", "Numero cuenta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCuentasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCuentas);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 51, 899, 232));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("Cuentas");
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 337, -1, -1));

        atmBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------------------------" }));
        atmBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                atmBox3ItemStateChanged(evt);
            }
        });
        jPanel10.add(atmBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 324, 590, 43));

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel164.setText("jLabel117");
        jPanel10.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel10.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 430, 390));

        jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel166.setText("jLabel118");
        jPanel10.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 430, 320));

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel10.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 470, 450));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel54.setText("jLabel46");
        jPanel10.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1050, 660));

        jTabbedPane2.addTab("Depositar En Otra Cuenta", jPanel10);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setText("ID:");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 155, -1, -1));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setText("Numero Tarjeta:");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 223, -1, -1));

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setText("Saldo:");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 314, -1, -1));

        cu_id.setEditable(false);
        cu_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cu_idActionPerformed(evt);
            }
        });
        jPanel5.add(cu_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 144, 295, 38));

        try {
            cu_tarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cu_tarjeta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel5.add(cu_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 270, 36));
        jPanel5.add(cu_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 284, 295, 46));

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel41.setText("CREAR NUEVA CUENTA");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 85, -1, -1));

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 362, 413, 53));

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel168.setText("jLabel117");
        jPanel5.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel5.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 430, 390));

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel170.setText("jLabel118");
        jPanel5.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 430, 320));

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel5.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 470, 450));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel55.setText("jLabel46");
        jPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1050, 660));

        jTabbedPane2.addTab("Nueva Cuenta", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atmBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --------------------------------" }));
        atmBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                atmBox4ItemStateChanged(evt);
            }
        });
        jPanel6.add(atmBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 462, 43));

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setText("Cuenta:");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 523, 269));

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel172.setText("jLabel117");
        jPanel6.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel6.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 430, 390));

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel174.setText("jLabel118");
        jPanel6.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 430, 320));

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel6.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 470, 450));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel56.setText("jLabel46");
        jPanel6.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1050, 660));

        jTabbedPane2.addTab("Revisar Estado Cuenta", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 942, 517));

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setText("TRANSACCIONES");
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel176.setText("jLabel117");
        jPanel7.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel7.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 430, 390));

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel178.setText("jLabel118");
        jPanel7.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 430, 320));

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel7.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 470, 450));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel57.setText("jLabel46");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1050, 660));

        jTabbedPane2.addTab("Transacciones", jPanel7);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c91a505154cc2b1e3b2134a20959799d.png"))); // NOI18N
        jMenuBar2.add(jMenu2);

        jMenu6.setText("Log Out");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        PrincipalCliente.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout PrincipalClienteLayout = new javax.swing.GroupLayout(PrincipalCliente.getContentPane());
        PrincipalCliente.getContentPane().setLayout(PrincipalClienteLayout);
        PrincipalClienteLayout.setHorizontalGroup(
            PrincipalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PrincipalClienteLayout.setVerticalGroup(
            PrincipalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalClienteLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane3StateChanged(evt);
            }
        });

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(atm_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 82, 280, 36));

        atm_id.setEditable(false);
        jPanel8.add(atm_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 136, 280, 37));
        jPanel8.add(atm_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 191, 280, 37));

        atm_anio.setEditable(false);
        atm_anio.setText("2020");
        jPanel8.add(atm_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 246, 280, 37));
        jPanel8.add(atm_Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 301, 280, 37));

        jButton6.setText("Seleccione");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 280, -1));

        jButton7.setText("CREAR ATM");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 776, 54));

        tablaMantenimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Usuario", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMantenimiento);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 82, -1, 320));

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel51.setText("CREACION DE ATM");
        jPanel8.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Ubicacion:");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 90, -1, -1));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("ID:");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 144, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Tiempo Reparacion:");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 209, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Año de Creacion:");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 265, -1, 18));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Saldo Disponible:");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 319, -1, -1));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Usuario de mantenimiento:");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 383, -1, -1));

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel148.setText("jLabel117");
        jPanel8.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel8.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 430, 390));

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel150.setText("jLabel118");
        jPanel8.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 430, 320));

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel8.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 470, 450));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel49.setText("jLabel46");
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1050, 660));

        jTabbedPane3.addTab("Creacion de ATM", jPanel8);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atmBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --------------------------------" }));
        atmBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                atmBoxItemStateChanged(evt);
            }
        });
        jPanel9.add(atmBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 111, 312, 43));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("ATM:");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 122, -1, -1));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Cantidad de Billetes de 100:");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 218, -1, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("Cantidad de Billetes de 500:");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 273, -1, -1));

        cant_100.setEnabled(false);
        jPanel9.add(cant_100, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 207, 157, 42));

        cant_500.setEnabled(false);
        jPanel9.add(cant_500, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 262, 157, 42));

        jButton8.setText("Agregar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 322, 364, 44));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel32.setText("INGRESAR DINERO");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 54, -1, -1));

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel152.setText("jLabel117");
        jPanel9.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 360, 420));

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jPanel9.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 430, 390));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel154.setText("jLabel118");
        jPanel9.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 430, 320));

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        jPanel9.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 470, 440));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clo.jpg"))); // NOI18N
        jLabel50.setText("jLabel46");
        jPanel9.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1050, 660));

        jTabbedPane3.addTab("Agregar Dinero ", jPanel9);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c91a505154cc2b1e3b2134a20959799d.png"))); // NOI18N
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Log Out");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu5);

        PrincipalMantenimiento.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout PrincipalMantenimientoLayout = new javax.swing.GroupLayout(PrincipalMantenimiento.getContentPane());
        PrincipalMantenimiento.getContentPane().setLayout(PrincipalMantenimientoLayout);
        PrincipalMantenimientoLayout.setHorizontalGroup(
            PrincipalMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PrincipalMantenimientoLayout.setVerticalGroup(
            PrincipalMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalMantenimientoLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel45.setText("BOWLEE BAC");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));
        getContentPane().add(L_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 349, 41));
        getContentPane().add(L_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 349, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Pass:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 420, 43));

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bowlee.png"))); // NOI18N
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 235, 233));

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        getContentPane().add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 370, 220));

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel135.setText("jLabel117");
        getContentPane().add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 420));

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jLabel134.setText("jLabel116");
        getContentPane().add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 0, 70, 420));

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel136.setText("jLabel118");
        getContentPane().add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 380, 320));

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clo.jpg"))); // NOI18N
        getContentPane().add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 190, 210));

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        getContentPane().add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int y = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cont = 0;
        boolean aux1 = true;
        for (Usuario i : usuario) {
            if (i.getUsuario().equals(L_usuario.getText()) && i.getContra().equals(L_Pass.getText())) {
                aux1 = false;
                posi = cont;
                if (i instanceof Clientes) {
                    PrincipalCliente.pack();
                    PrincipalCliente.setLocationRelativeTo(this);
                    PrincipalCliente.setVisible(true);
                    this.setVisible(false);
                    llenarcombox();
                    String codigo = "CUE" + (1 + r.nextInt(132000)) + "SDD";
                    cu_id.setText(codigo);
                    String aux3 = "";
                    for (Transacciones u : ((Clientes) usuario.get(posi)).getTransacciones()) {
                        aux3 += "ID: " + u.getId() + "\n" + "Descrpcion: " + u.getDescripcion() + "\nFecha:" + u.getDate() + "\n---------------------------------------------------\n";
                    }
                    jTextArea2.setText(aux3);

                }
                if (i instanceof Usuario_mantenimiento) {
                    PrincipalMantenimiento.pack();
                    PrincipalMantenimiento.setLocationRelativeTo(this);
                    PrincipalMantenimiento.setVisible(true);
                    llenarMantenimiento();
                    this.setVisible(false);
                    String codigo = "AMT" + (21321 + r.nextInt(10000)) + "DAsdaSF";
                    atm_id.setText(codigo);
                }
                Date d = new Date();
                logs.add(new Logs(i.getUsuario(), ": Ingreso al programa: ", d));
                try {
                    ar.Escribir();
                } catch (Exception ex) {
                }
            }
            cont++;
        }
        if (aux1) {
            JOptionPane.showMessageDialog(this, "Ese usuario no existe");
            y++;
            Date d = new Date();
            logs.add(new Logs("Desconocido", ": Fallo al intento entrar al programa : ", d));
            try {
                ar.Escribir();
            } catch (Exception ex) {
            }
            if (y >= 5) {
                JOptionPane.showMessageDialog(this, "Deje de intentarlo :u");
                y = 0;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String f = cc_fecha.getText();
        String[] tokens = f.split(",");
        String anio = tokens[2].substring(1, tokens[2].length());
        b.cargarArchivo();
        Clientes c = new Clientes(cc_id.getText(), cc_nombre1.getText(), cc_nombre2.getText(), cc_apellido1.getText(), cc_apellido2.getText(), cc_pass.getText(), cc_usuario.getText(), Integer.parseInt(anio), 2020);
        c.getCuenta().add(new Cuenta(cc_numCuenta.getText(), 0, cc_id.getText()));
        b.setAlumno(c);
        usuario.add(c);
        b.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Se registro exitosamente");
        String codigo = "CC" + (1 + r.nextInt(200)) + "DASasd";
        cc_id.setText(codigo);
        Date d = new Date();
        logs.add(new Logs(c.getUsuario(), ": Se registro como usuario cliente : ", d));
        try {
            ar.Escribir();
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String f = cm_fecha.getText();
        String[] tokens = f.split(",");
        String anio = tokens[2].substring(1, tokens[2].length());
        b.cargarArchivo();
        Usuario_mantenimiento c = new Usuario_mantenimiento(cm_id.getText(), cm_nombre1.getText(), cm_nombre2.getText(), cm_apellido1.getText(), cm_apellido2.getText(), cm_pass.getText(), cm_usuario.getText(), Integer.parseInt(anio), 2020);
        b.setAlumno(c);
        b.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Se registro exitosamente");
        String codigo2 = "CM" + (200 + r.nextInt(400)) + "DASasd";
        cm_id.setText(codigo2);
        Date d = new Date();
        logs.add(new Logs(c.getUsuario(), ": Se registro como usuario de mantenimiento: ", d));
        try {
            ar.Escribir();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    Random r = new Random();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String codigo = "CC" + (1 + r.nextInt(200)) + "DASasd";
        String codigo2 = "CM" + (200 + r.nextInt(400)) + "DASasd";
        cc_id.setText(codigo);
        cm_id.setText(codigo2);

        Registro.pack();
        Registro.setLocationRelativeTo(this);
        Registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        DefaultComboBoxModel atms = (DefaultComboBoxModel) atmBox1.getModel();
        int cont = 0;
        for (Cuenta i : ((Clientes) usuario.get(posi)).getCuenta()) {
            if (i.getId().equals(((String) atms.getSelectedItem()))) {
                break;
            }
            cont++;
        }
        double y = Double.parseDouble(jSpinner1.getValue().toString());
        if (y < ((Clientes) usuario.get(posi)).getCuenta().get(cont).getSaldo()) {

            ((Clientes) usuario.get(posi)).getCuenta().get(cont).setSaldo(((Clientes) usuario.get(posi)).getCuenta().get(cont).getSaldo() - y);
            String codigo = "TRA" + (1432 + r.nextInt(421)) + "SDD";
            Date d = new Date();
            ((Clientes) usuario.get(posi)).getTransacciones().add(new Transacciones("Retiro$$$ " + y, ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta(), codigo, d));
            t.add(new Transacciones("Retiro$$$ " + y, ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta(), codigo, d));
            String recibo = "-----------RECIBO-----------\nBanco LaBowlee :3\n Usuario: " + usuario.get(posi).getUsuario() + "\nNumero de cuenta: " + ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta() + "\nTotal Retirado: " + y;
            JOptionPane.showMessageDialog(this, recibo);
            b.escribirArchivo();

            logs.add(new Logs(usuario.get(posi).getUsuario(), ": Retirno $$$: " + y + "de su cuenta:", d));
            try {
                ar.Escribir();
            } catch (Exception ex) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "SU SALDO ES INSUFICIENTE");
        }
        PrincipalCliente.setVisible(false);

        this.pack();
                this.setSize(721, 410);

        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DefaultComboBoxModel atms = (DefaultComboBoxModel) atmBox2.getModel();
        int cont = 0;
        for (Cuenta i : ((Clientes) usuario.get(posi)).getCuenta()) {
            if (i.getId().equals(((String) atms.getSelectedItem()))) {
                break;
            }
            cont++;
        }
        double y = Double.parseDouble(jSpinner2.getValue().toString());
        ((Clientes) usuario.get(posi)).getCuenta().get(cont).setSaldo(((Clientes) usuario.get(posi)).getCuenta().get(cont).getSaldo() + y);
        String recibo = "-----------RECIBO-----------\nBanco LaBowlee :3\n Usuario: " + usuario.get(posi).getUsuario() + "\nNumero de cuenta: " + ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta() + "\nTotal de Deposito: " + y;
        JOptionPane.showMessageDialog(this, recibo);
        Date d = new Date();
        String codigo = "TRA" + (1432 + r.nextInt(421)) + "SDD";

        ((Clientes) usuario.get(posi)).getTransacciones().add(new Transacciones("Deposito " + y, ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta(), codigo, d));
        t.add(new Transacciones("Deposito " + y, ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta(), codigo, d));
        logs.add(new Logs(usuario.get(posi).getUsuario(), ": Deposito $$$: " + y + "de su cuenta:", d));
        b.escribirArchivo();
        try {
            ART.Escribir();
            ar.Escribir();
        } catch (Exception ex) {
        }
        PrincipalCliente.setVisible(false);

        this.pack();
        this.setLocationRelativeTo(this);
                this.setSize(721, 410);

        this.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int aux1 = 0;
        DefaultComboBoxModel atms = (DefaultComboBoxModel) atmBox3.getModel();
        int cont = 0;
        for (Cuenta i : ((Clientes) usuario.get(aux22)).getCuenta()) {
            if (i.getId().equals(((String) atms.getSelectedItem()))) {
                break;
            }
            cont++;
        }
        double y = Double.parseDouble(jSpinner3.getValue().toString());
        ((Clientes) usuario.get(aux22)).getCuenta().get(cont).setSaldo(((Clientes) usuario.get(posi)).getCuenta().get(cont).getSaldo() + y);
        ((Clientes) usuario.get(posi)).getCuenta().get(cont).setSaldo(((Clientes) usuario.get(posi)).getCuenta().get(cont).getSaldo() - y);
        String recibo = "-----------RECIBO-----------\nBanco LaBowlee :3\n Usuario: " + usuario.get(posi).getUsuario() + "\nNumero de cuenta: " + ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta() + "\nTotal de Deposito: " + y;
        JOptionPane.showMessageDialog(this, recibo);
        Date d = new Date();
        logs.add(new Logs(usuario.get(posi).getUsuario(), ": Hizo un depocito de $$$: " + y + " a la cuenta de: " + usuario.get(aux22).getUsuario() + ":", d));
        String codigo = "TRA" + (1432 + r.nextInt(421)) + "SDD";
        ((Clientes) usuario.get(posi)).getTransacciones().add(new Transacciones("Deposito " + y + " En la cuenta de: " + usuario.get(aux22).getUsuario(), ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta(), codigo, d));
        t.add(new Transacciones("Deposito " + y + " En la cuenta de: " + usuario.get(aux22).getUsuario(), ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta(), codigo, d));
        b.escribirArchivo();
        try {
            ART.Escribir();
            ar.Escribir();
        } catch (Exception ex) {
        }
        PrincipalCliente.setVisible(false);
        this.pack();
                this.setSize(721, 410);

        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        llenarcuentas();
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void atmBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_atmBox3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_atmBox3ItemStateChanged
    int aux22;
    private void tablaCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCuentasMouseClicked
        int uu = tablaCuentas.getSelectedRow();
        int aux = 0, aux2 = 0;
        if (uu >= 0) {
            DefaultComboBoxModel atms = (DefaultComboBoxModel) atmBox3.getModel();
            for (Usuario b : usuario) {
                if (b instanceof Clientes) {
                    if (aux2 == uu) {
                        break;
                    }
                    aux2++;
                }
                aux++;
            }
            aux22 = aux;
                    atms.removeAllElements();
                    atms.addElement(" --------------------------------");
            for (Cuenta u : ((Clientes) usuario.get(aux)).getCuenta()) {
                atms.addElement(u.getId());
            }
            atmBox3.setModel(atms);
        }
    }//GEN-LAST:event_tablaCuentasMouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Registro.setVisible(false);
        this.pack();
        this.setSize(721, 410);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void cu_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cu_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cu_idActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Cuenta c = new Cuenta(cu_tarjeta.getText(), Double.parseDouble(cu_saldo.getValue().toString()), cu_id.getText());
        ((Clientes) usuario.get(posi)).getCuenta().add(c);
        JOptionPane.showMessageDialog(this, "Se agrego una nueva cuenta exitosamente");
        b.escribirArchivo();
        String codigo = "CUE" + (1 + r.nextInt(132000)) + "SDD";
        cu_id.setText(codigo);
        cu_tarjeta.setText("");
        cu_saldo.setValue(0);
        Date d = new Date();
        logs.add(new Logs(usuario.get(posi).getUsuario(), ": creo una nueva cuenta " + ":", d));
        try {
            ART.Escribir();

            ar.Escribir();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTabbedPane3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane3StateChanged
        DefaultComboBoxModel atms = (DefaultComboBoxModel) atmBox.getModel();
        for (Usuario u : usuario) {
            if (u instanceof Usuario_mantenimiento) {
                for (ATM i : ((Usuario_mantenimiento) u).getAtms()) {
                    atms.addElement(i.getId());
                }
            }

        }
        atmBox.setModel(atms);
    }//GEN-LAST:event_jTabbedPane3StateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultComboBoxModel atms = (DefaultComboBoxModel) atmBox.getModel();
        int cont = 0;
        System.out.println("llega");
        for (ATM i : ((Usuario_mantenimiento) usuario.get(posi)).getAtms()) {
            if (((String) atms.getSelectedItem()).equals(i.getId())) {

                break;
            }
            cont++;
        }
        System.out.println(cant_100.getValue() + "dsa");
        int cant100 = 100 * Integer.parseInt(cant_100.getValue().toString());
        int cant500 = 500 * Integer.parseInt(cant_500.getValue().toString());
        int suma = cant100 + cant500;
        System.out.println(cant100 + " " + cant500);
        ((Usuario_mantenimiento) usuario.get(posi)).getAtms().get(cont).setDinero(suma);
        Date d = new Date();
        logs.add(new Logs(usuario.get(posi).getUsuario(), ": Ingreso $$: " + suma + " al ATM", d));
        try {
            ar.Escribir();
        } catch (Exception ex) {
        }

        String usu = JOptionPane.showInputDialog("Ingrese su Usuario:");
        String pass = JOptionPane.showInputDialog("Ingrese su Password:");
        for (Usuario i : usuario) {
            if (i.getUsuario().equals(usu) && i.getContra().equals(pass)) {
                this.pack();
                this.setLocationRelativeTo(this);
                this.setVisible(true);
                PrincipalMantenimiento.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void atmBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_atmBoxItemStateChanged
        boolean aux1 = true;
        if (evt.getStateChange() == 2) {
            DefaultComboBoxModel atms = (DefaultComboBoxModel) atmBox.getModel();
            for (ATM i : ((Usuario_mantenimiento) usuario.get(posi)).getAtms()) {
                if (((String) atms.getSelectedItem()).equals(i.getId())) {
                    cant_100.setEnabled(true);
                    cant_500.setEnabled(true);
                    aux1 = false;
                }
            }
            if (aux1) {
                JOptionPane.showMessageDialog(this, "Usted no esta asignado a ese ATM");
                Date d = new Date();
                logs.add(new Logs(usuario.get(posi).getUsuario(), ": Fallo! este usuario no tiene asignado ese ATM:", d));
                try {
                    ar.Escribir();
                } catch (Exception ex) {
                }
            }
        }
    }//GEN-LAST:event_atmBoxItemStateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int aux = 0, aux2 = 0;
        for (Usuario i : usuario) {
            if (i instanceof Usuario_mantenimiento) {
                if (atm_usu == aux2) {
                    break;
                }
                aux2++;
            }
            aux++;
        }
        ((Usuario_mantenimiento) usuario.get(aux)).getAtms().add(new ATM(atm_ubicacion.getText(), atm_id.getText(), atm_tiempo.getText(), 2020, Double.parseDouble(atm_Saldo.getText())));
        b.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Se creo el ATM correctamente");
        String codigo = "AMT" + (21321 + r.nextInt(10000)) + "DAsdaSF";
        atm_id.setText(codigo);
        Date d = new Date();
        logs.add(new Logs(usuario.get(posi).getUsuario(), ": Se creo un nuevo ATM :", d));
        try {
            ar.Escribir();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int u = tablaMantenimiento.getSelectedRow();
        if (u >= 0) {
            atm_usu = u;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void atmBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_atmBox4ItemStateChanged
        try {

            if (evt.getStateChange() == 2) {
                DefaultComboBoxModel atms = (DefaultComboBoxModel) atmBox1.getModel();
                int cont = 0;
                for (Cuenta i : ((Clientes) usuario.get(posi)).getCuenta()) {
                    if (i.getId().equals(((String) atms.getSelectedItem()))) {
                        break;
                    }
                    cont++;
                }
                String aux1 = "Usuario: " + usuario.get(posi).getUsuario() + "\nNumero Cuenta:" + ((Clientes) usuario.get(posi)).getCuenta().get(cont).getNum_cuenta() + "\nSaldo disponible: " + ((Clientes) usuario.get(posi)).getCuenta().get(cont).getSaldo();
                jTextArea1.setText("");
                jTextArea1.append(aux1);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_atmBox4ItemStateChanged

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        PrincipalMantenimiento.setVisible(false);
        this.pack();
        this.setSize(721, 410);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        PrincipalCliente.setVisible(false);
        this.pack();
        this.setSize(721, 410);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }//GEN-LAST:event_jMenu6MouseClicked

    public void llenarMantenimiento() {
        DefaultTableModel t = (DefaultTableModel) tablaMantenimiento.getModel();
        for (int j = t.getRowCount() - 1; j >= 0; j--) {
            t.removeRow(j);
        }
        for (Usuario oi : usuario) {
            if (oi instanceof Usuario_mantenimiento) {
                Object[] p = {oi.getPrimernombre(), oi.getPrimerapellido(), oi.getUsuario(), oi.getId()};
                t.addRow(p);
            }
        }
        tablaMantenimiento.setModel(t);
    }

    public void llenarcuentas() {
        DefaultTableModel t = (DefaultTableModel) tablaCuentas.getModel();
        for (int j = t.getRowCount() - 1; j >= 0; j--) {
            t.removeRow(j);
        }
        for (Usuario oi : usuario) {
            if (oi instanceof Clientes) {
                Object[] p = {oi.getPrimernombre(), oi.getPrimerapellido(), oi.getUsuario(), ((Clientes) oi).getCuenta()};
                t.addRow(p);
            }
        }
        tablaCuentas.setModel(t);
    }

    public void llenarcombox() {
        DefaultComboBoxModel atms = (DefaultComboBoxModel) atmBox1.getModel();  
        atms.removeAllElements();
                            atms.addElement(" --------------------------------");

        for (Cuenta u : ((Clientes) usuario.get(posi)).getCuenta()) {
            atms.addElement(u.getId());
        }
        atmBox1.setModel(atms);
        atmBox2.setModel(atms);
        atmBox4.setModel(atms);
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField L_Pass;
    private javax.swing.JTextField L_usuario;
    private javax.swing.JFrame PrincipalCliente;
    private javax.swing.JFrame PrincipalMantenimiento;
    private javax.swing.JFrame Registro;
    private javax.swing.JComboBox<String> atmBox;
    private javax.swing.JComboBox<String> atmBox1;
    private javax.swing.JComboBox<String> atmBox2;
    private javax.swing.JComboBox<String> atmBox3;
    private javax.swing.JComboBox<String> atmBox4;
    private javax.swing.JTextField atm_Saldo;
    private javax.swing.JTextField atm_anio;
    private javax.swing.JTextField atm_id;
    private javax.swing.JTextField atm_tiempo;
    private javax.swing.JTextField atm_ubicacion;
    private javax.swing.JSpinner cant_100;
    private javax.swing.JSpinner cant_500;
    private javax.swing.JTextField cc_apellido1;
    private javax.swing.JTextField cc_apellido2;
    private datechooser.beans.DateChooserCombo cc_fecha;
    private javax.swing.JTextField cc_id;
    private javax.swing.JTextField cc_nombre1;
    private javax.swing.JTextField cc_nombre2;
    private javax.swing.JFormattedTextField cc_numCuenta;
    private javax.swing.JPasswordField cc_pass;
    private javax.swing.JTextField cc_usuario;
    private javax.swing.JTextField cm_apellido1;
    private javax.swing.JTextField cm_apellido2;
    private datechooser.beans.DateChooserCombo cm_fecha;
    private javax.swing.JTextField cm_id;
    private javax.swing.JTextField cm_nombre1;
    private javax.swing.JTextField cm_nombre2;
    private javax.swing.JPasswordField cm_pass;
    private javax.swing.JTextField cm_usuario;
    private javax.swing.JTextField cu_id;
    private javax.swing.JSpinner cu_saldo;
    private javax.swing.JFormattedTextField cu_tarjeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTable tablaCuentas;
    private javax.swing.JTable tablaMantenimiento;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuario> usuario = new ArrayList();
    int posi, atm_usu;
    Binarios b = new Binarios("./Guardar.bin");
    ArrayList<Logs> logs = new ArrayList();
    ArchivosTexto ar = new ArchivosTexto("./Logs.txt", logs);
    ArrayList<Transacciones> t = new ArrayList();
    ArchivoTextoTrans ART = new ArchivoTextoTrans("./Transacciones.txt", t);
}
