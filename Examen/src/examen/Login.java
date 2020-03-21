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
        b.cargarArchivo();
        for (Usuario i : b.getListaPersonas()) {
            usuario.add(i);
            System.out.println(i.getUsuario() + " " + i.getContra());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
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
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        PrincipalCliente = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        atmBox1 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        atmBox2 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton10 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jButton11 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        atmBox3 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        cu_id = new javax.swing.JTextField();
        cu_tarjeta = new javax.swing.JFormattedTextField();
        cu_saldo = new javax.swing.JSpinner();
        jLabel41 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        atmBox4 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
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
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        atmBox = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cant_100 = new javax.swing.JSpinner();
        cant_500 = new javax.swing.JSpinner();
        jButton8 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        L_usuario = new javax.swing.JTextField();
        L_Pass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        cc_id.setEditable(false);

        jLabel4.setText("ID :");

        jLabel5.setText("Primer Nombre:");

        jLabel6.setText("Segundo Nombre:");

        jLabel7.setText("Primer Apellido:");

        jLabel8.setText("Segundo Apellido:");

        jLabel9.setText("Pass:");

        cc_fecha.setFormat(0);

        jLabel10.setText("Fecha Nacimiento:");

        jLabel11.setText("Numero de cuenta:");

        try {
            cc_numCuenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cc_numCuenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jButton3.setText("REGISTRARSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel20.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(263, 263, 263)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(17, 17, 17)
                                .addComponent(cc_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cc_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel20))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cc_usuario)
                                        .addComponent(cc_id)
                                        .addComponent(cc_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cc_numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cc_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cc_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cc_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cc_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cc_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cc_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cc_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cc_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cc_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cc_numCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuenta Cliente", jPanel1);

        jLabel12.setText("Primer Apellido:");

        cm_id.setEditable(false);

        jLabel13.setText("Segundo Apellido:");

        jLabel14.setText("Pass:");

        jButton4.setText("REGISTRARSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Fecha Nacimiento:");

        jLabel16.setText("ID :");

        jLabel18.setText("Primer Nombre:");

        jLabel19.setText("Segundo Nombre:");

        jLabel17.setText("Usuario:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel14))
                                        .addGap(23, 23, 23)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cm_nombre1)
                                    .addComponent(cm_apellido1)
                                    .addComponent(cm_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cm_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cm_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(cm_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cm_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cm_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cm_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cm_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cm_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cm_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cm_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cm_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cm_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cm_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel15)))
                .addGap(36, 36, 36)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuenta Mantenimiento", jPanel2);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("REGISTRO ");

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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        atmBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --------------------------------" }));

        jLabel31.setText("Seleccione cuenta:");

        jLabel33.setText("Ingrese la cantidad de dinero que desea Retirar:");

        jButton9.setText("RETIRAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(29, 29, 29)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(36, 36, 36)
                        .addComponent(atmBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(263, 263, 263))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atmBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(51, 51, 51)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Retirar Dinero", jPanel3);

        atmBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --------------------------------" }));

        jLabel34.setText("Mis cuentas:");

        jLabel35.setText("Ingrese la cantidad de dinero que desea Depositar:");

        jButton10.setText("DEPOSITAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(atmBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atmBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel35))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Depositar Dinero", jPanel4);

        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel37.setText("Ingrese la cantidad de dinero que desea Depositar:");

        jButton11.setText("DEPOSITAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

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

        jLabel36.setText("Cuentas");

        atmBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --------------------------------" }));
        atmBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                atmBox3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(atmBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atmBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Depositar En Otra Cuenta", jPanel10);

        jLabel38.setText("ID:");

        jLabel39.setText("Numero Tarjeta:");

        jLabel40.setText("Saldo:");

        cu_id.setEditable(false);
        cu_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cu_idActionPerformed(evt);
            }
        });

        try {
            cu_tarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cu_tarjeta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel41.setText("CREAR NUEVA CUENTA");

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cu_saldo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cu_tarjeta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cu_id, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(352, 352, 352))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel41)
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(cu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(cu_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40)
                    .addComponent(cu_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Nueva Cuenta", jPanel5);

        atmBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --------------------------------" }));
        atmBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                atmBox4ItemStateChanged(evt);
            }
        });

        jLabel42.setText("Cuenta:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(atmBox4, 0, 442, Short.MAX_VALUE)))
                .addGap(430, 430, 430))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atmBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Revisar Estado Cuenta", jPanel6);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel43.setText("TRANSACCIONES");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jTabbedPane2.addTab("Transacciones", jPanel7);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setText("BIENVENIDO");

        jMenu2.setText("Log Out");
        jMenuBar2.add(jMenu2);

        PrincipalCliente.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout PrincipalClienteLayout = new javax.swing.GroupLayout(PrincipalCliente.getContentPane());
        PrincipalCliente.getContentPane().setLayout(PrincipalClienteLayout);
        PrincipalClienteLayout.setHorizontalGroup(
            PrincipalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PrincipalClienteLayout.setVerticalGroup(
            PrincipalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalClienteLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane3StateChanged(evt);
            }
        });

        atm_id.setEditable(false);

        atm_anio.setEditable(false);
        atm_anio.setText("2020");

        jButton6.setText("Seleccione");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("CREAR ATM");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

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

        jLabel22.setText("Ubicacion:");

        jLabel23.setText("ID:");

        jLabel24.setText("Tiempo Reparacion:");

        jLabel25.setText("Año de Creacion:");

        jLabel26.setText("Saldo Disponible:");

        jLabel27.setText("Usuario de mantenimiento:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel25))
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(atm_id)
                                .addComponent(atm_ubicacion)
                                .addComponent(atm_tiempo)
                                .addComponent(atm_anio, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(atm_Saldo))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(atm_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel22))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(atm_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel23))
                                                .addGap(18, 18, 18)
                                                .addComponent(atm_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel24))
                                        .addGap(18, 18, 18)
                                        .addComponent(atm_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(atm_Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel26))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6)
                            .addComponent(jLabel27)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Creacion de ATM", jPanel8);

        atmBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --------------------------------" }));
        atmBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                atmBoxItemStateChanged(evt);
            }
        });

        jLabel28.setText("ATM:");

        jLabel29.setText("Cantidad de Billetes de 100:");

        jLabel30.setText("Cantidad de Billetes de 500:");

        cant_100.setEnabled(false);

        cant_500.setEnabled(false);

        jButton8.setText("Agregar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel32.setText("INGRESAR DINERO");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cant_100, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(18, 18, 18)
                            .addComponent(atmBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cant_500))
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(639, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel32)
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atmBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(53, 53, 53)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cant_100, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(cant_500, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Agregar Dinero ", jPanel9);

        javax.swing.GroupLayout PrincipalMantenimientoLayout = new javax.swing.GroupLayout(PrincipalMantenimiento.getContentPane());
        PrincipalMantenimiento.getContentPane().setLayout(PrincipalMantenimientoLayout);
        PrincipalMantenimientoLayout.setHorizontalGroup(
            PrincipalMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PrincipalMantenimientoLayout.setVerticalGroup(
            PrincipalMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalMantenimientoLayout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Pass:");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addComponent(L_Pass)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton2)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

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
        PrincipalCliente.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
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
