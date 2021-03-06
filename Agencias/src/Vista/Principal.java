package Vista;

import Controlador.ControllerAgencias;

/**
 *
 * @author Hilary Madeley Calva Camacho
 */
public class Principal extends javax.swing.JFrame {

    ControllerAgencias agencia1 = new ControllerAgencias();
    ControllerAgencias agencia2 = new ControllerAgencias();
    ControllerAgencias agencia3 = new ControllerAgencias();
    ControllerAgencias agencia4 = new ControllerAgencias();
    ControllerAgencias agencia5 = new ControllerAgencias();
    
    public Principal() {
        initComponents();
        this.setTitle("AGENCIA MIRASOL REGISTRO DE VENTAS");
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
        btnMenor = new javax.swing.JButton();
        cbxMes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtMesMenor = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMayor = new javax.swing.JTextArea();
        btnAgencia5Registro = new javax.swing.JButton();
        btnAgencia4Registro = new javax.swing.JButton();
        btnAgencia3Registro = new javax.swing.JButton();
        btnAgencia2Registro = new javax.swing.JButton();
        btnAgencia1Registro = new javax.swing.JButton();
        btnResumenAgencia5 = new javax.swing.JButton();
        btnResumenAgencia4 = new javax.swing.JButton();
        btnResumenAgencia3 = new javax.swing.JButton();
        btnResumenAgencia2 = new javax.swing.JButton();
        btnResumenAgencia1 = new javax.swing.JButton();
        btnCalcularPromedio = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPromedio = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtVentasTotal = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAgencias = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnJson3 = new javax.swing.JButton();
        btnJson5 = new javax.swing.JButton();
        btnJson4 = new javax.swing.JButton();
        btnJson2 = new javax.swing.JButton();
        btnJson1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenor.setBackground(new java.awt.Color(255, 255, 255));
        btnMenor.setForeground(new java.awt.Color(28, 16, 4));
        btnMenor.setText("Mostrar");
        btnMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, -1, -1));

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(cbxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 382, 150, 30));

        jLabel8.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(57, 34, 12));
        jLabel8.setText("TOTAL DE VENTAS: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 140, 30));

        jLabel9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 34, 12));
        jLabel9.setText("MES CON MENORES VENTAS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 210, 30));

        jLabel11.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(57, 34, 12));
        jLabel11.setText("RESUMEN DE VENTAS POR AGENCIAS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 260, 30));

        jLabel15.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(57, 34, 12));
        jLabel15.setText("PROMEDIO DE VENTAS POR MES");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 230, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(58, 31, 4));
        jLabel16.setText("MES:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 100, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 31, 4));
        jLabel12.setText("PROMEDIO:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, 20));

        jLabel17.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(57, 34, 12));
        jLabel17.setText("AGENCIA CON MAYOR VENTA AL MES");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 260, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(58, 31, 4));
        jLabel18.setText("AGENCIA:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 100, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(58, 31, 4));
        jLabel13.setText("Mes: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 50, 20));

        txtMesMenor.setColumns(20);
        txtMesMenor.setRows(5);
        jScrollPane5.setViewportView(txtMesMenor);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 120, 50));

        txtMayor.setColumns(20);
        txtMayor.setRows(5);
        jScrollPane4.setViewportView(txtMayor);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 120, 50));

        btnAgencia5Registro.setBackground(new java.awt.Color(60, 34, 8));
        btnAgencia5Registro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnAgencia5Registro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgencia5Registro.setText("AGENCIA 5");
        btnAgencia5Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgencia5RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgencia5Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 110, 30));

        btnAgencia4Registro.setBackground(new java.awt.Color(60, 34, 8));
        btnAgencia4Registro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnAgencia4Registro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgencia4Registro.setText("AGENCIA 4");
        btnAgencia4Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgencia4RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgencia4Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 110, 30));

        btnAgencia3Registro.setBackground(new java.awt.Color(60, 34, 8));
        btnAgencia3Registro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnAgencia3Registro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgencia3Registro.setText("AGENCIA 3");
        btnAgencia3Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgencia3RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgencia3Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 30));

        btnAgencia2Registro.setBackground(new java.awt.Color(60, 34, 8));
        btnAgencia2Registro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnAgencia2Registro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgencia2Registro.setText("AGENCIA 2");
        btnAgencia2Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgencia2RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgencia2Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 110, 30));

        btnAgencia1Registro.setBackground(new java.awt.Color(60, 34, 8));
        btnAgencia1Registro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnAgencia1Registro.setForeground(new java.awt.Color(255, 255, 255));
        btnAgencia1Registro.setText("AGENCIA 1");
        btnAgencia1Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgencia1RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgencia1Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 30));

        btnResumenAgencia5.setBackground(new java.awt.Color(255, 255, 255));
        btnResumenAgencia5.setForeground(new java.awt.Color(40, 21, 2));
        btnResumenAgencia5.setText("Agencia 5");
        btnResumenAgencia5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenAgencia5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResumenAgencia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, -1, -1));

        btnResumenAgencia4.setBackground(new java.awt.Color(255, 255, 255));
        btnResumenAgencia4.setForeground(new java.awt.Color(44, 23, 2));
        btnResumenAgencia4.setText("Agencia 4");
        btnResumenAgencia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenAgencia4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResumenAgencia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, -1, -1));

        btnResumenAgencia3.setBackground(new java.awt.Color(255, 255, 255));
        btnResumenAgencia3.setForeground(new java.awt.Color(47, 25, 3));
        btnResumenAgencia3.setText("Agencia 3");
        btnResumenAgencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenAgencia3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResumenAgencia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        btnResumenAgencia2.setBackground(new java.awt.Color(255, 255, 255));
        btnResumenAgencia2.setForeground(new java.awt.Color(47, 25, 4));
        btnResumenAgencia2.setText("Agencia 2");
        btnResumenAgencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenAgencia2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResumenAgencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, -1, -1));

        btnResumenAgencia1.setBackground(new java.awt.Color(255, 255, 255));
        btnResumenAgencia1.setForeground(new java.awt.Color(65, 36, 6));
        btnResumenAgencia1.setText("Agencia 1");
        btnResumenAgencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenAgencia1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResumenAgencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        btnCalcularPromedio.setBackground(new java.awt.Color(255, 255, 255));
        btnCalcularPromedio.setForeground(new java.awt.Color(28, 16, 4));
        btnCalcularPromedio.setText("Mostrar");
        btnCalcularPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPromedioActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcularPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        txtPromedio.setColumns(20);
        txtPromedio.setRows(5);
        jScrollPane3.setViewportView(txtPromedio);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 120, 50));

        txtVentasTotal.setColumns(20);
        txtVentasTotal.setRows(5);
        jScrollPane2.setViewportView(txtVentasTotal);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 120, 50));

        tableAgencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableAgencias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 410, 140));

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRO DE VENTAS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 160, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRO DE VENTAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 420, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FONDO1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 590, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FONDO1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FONDO2.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 320, 250));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FONDO3.jpeg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 90, 250));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FONDO3.jpeg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 250));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FONDO.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 320, 160));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FONDO.jpg"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 560, 160));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("GENERAR JSON");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 160, 30));

        btnJson3.setBackground(new java.awt.Color(255, 255, 255));
        btnJson3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnJson3.setForeground(new java.awt.Color(54, 33, 12));
        btnJson3.setText("Agencia 3");
        btnJson3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJson3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnJson3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, -1, -1));

        btnJson5.setBackground(new java.awt.Color(255, 255, 255));
        btnJson5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnJson5.setForeground(new java.awt.Color(54, 33, 12));
        btnJson5.setText("Agencia 5");
        btnJson5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJson5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnJson5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, -1, -1));

        btnJson4.setBackground(new java.awt.Color(255, 255, 255));
        btnJson4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnJson4.setForeground(new java.awt.Color(54, 33, 12));
        btnJson4.setText("Agencia 4");
        btnJson4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJson4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnJson4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, -1));

        btnJson2.setBackground(new java.awt.Color(255, 255, 255));
        btnJson2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnJson2.setForeground(new java.awt.Color(54, 33, 12));
        btnJson2.setText("Agencia 2");
        btnJson2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJson2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnJson2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, -1, -1));

        btnJson1.setBackground(new java.awt.Color(255, 255, 255));
        btnJson1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnJson1.setForeground(new java.awt.Color(54, 33, 12));
        btnJson1.setText("Agencia 1");
        btnJson1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJson1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnJson1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FONDO1.jpg"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 490, 90));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FONDO1.jpg"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 490, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgencia1RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgencia1RegistroActionPerformed
        agencia1.matrizIngresada("Agencia 1");
    }//GEN-LAST:event_btnAgencia1RegistroActionPerformed

    private void btnAgencia2RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgencia2RegistroActionPerformed
        agencia2.matrizIngresada("Agencia 2");
    }//GEN-LAST:event_btnAgencia2RegistroActionPerformed

    private void btnAgencia3RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgencia3RegistroActionPerformed
        agencia3.matrizIngresada("Agencia 3");
    }//GEN-LAST:event_btnAgencia3RegistroActionPerformed

    private void btnAgencia4RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgencia4RegistroActionPerformed
        agencia4.matrizIngresada("Agencia 4");
    }//GEN-LAST:event_btnAgencia4RegistroActionPerformed

    private void btnAgencia5RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgencia5RegistroActionPerformed
        agencia5.matrizIngresada("Agencia 5");
    }//GEN-LAST:event_btnAgencia5RegistroActionPerformed

    private void btnResumenAgencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenAgencia1ActionPerformed
        txtVentasTotal.setText("");
        if (agencia1.mostrarResumen(tableAgencias, agencia1.getVentasInfo())==true) {
            agencia1.totalVentas(txtVentasTotal, agencia1.getVentasInfo());
        }
    }//GEN-LAST:event_btnResumenAgencia1ActionPerformed

    private void btnResumenAgencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenAgencia2ActionPerformed
        txtVentasTotal.setText("");
        if (agencia2.mostrarResumen(tableAgencias, agencia2.getVentasInfo())==true) {
            agencia2.totalVentas(txtVentasTotal, agencia2.getVentasInfo());
        }
    }//GEN-LAST:event_btnResumenAgencia2ActionPerformed

    private void btnResumenAgencia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenAgencia3ActionPerformed
        txtVentasTotal.setText("");
        if (agencia3.mostrarResumen(tableAgencias, agencia3.getVentasInfo())==true) {
            agencia3.totalVentas(txtVentasTotal, agencia3.getVentasInfo());
        }
    }//GEN-LAST:event_btnResumenAgencia3ActionPerformed

    private void btnResumenAgencia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenAgencia4ActionPerformed
        txtVentasTotal.setText("");
        if (agencia4.mostrarResumen(tableAgencias, agencia4.getVentasInfo())==true) {
            agencia4.totalVentas(txtVentasTotal, agencia4.getVentasInfo());
        }
    }//GEN-LAST:event_btnResumenAgencia4ActionPerformed

    private void btnResumenAgencia5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenAgencia5ActionPerformed
        txtVentasTotal.setText("");
        if (agencia5.mostrarResumen(tableAgencias, agencia5.getVentasInfo())==true) {
            agencia5.totalVentas(txtVentasTotal, agencia5.getVentasInfo());
        }
    }//GEN-LAST:event_btnResumenAgencia5ActionPerformed

    private void btnCalcularPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPromedioActionPerformed

        txtPromedio.setText("");
        txtMayor.setText("");
        agencia1.promedioVentasMes(agencia1.getVentasInfo(), agencia2.getVentasInfo(), agencia3.getVentasInfo(), agencia4.getVentasInfo(), agencia5.getVentasInfo(), txtPromedio, cbxMes);
        agencia1.mayor(agencia1.getVentasInfo(), agencia2.getVentasInfo(), agencia3.getVentasInfo(), agencia4.getVentasInfo(), agencia5.getVentasInfo(),txtMayor, cbxMes);
           
    }//GEN-LAST:event_btnCalcularPromedioActionPerformed

    private void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorActionPerformed
        txtMesMenor.setText("");
        agencia1.sumaVentasMes(agencia1.getVentasInfo(), agencia2.getVentasInfo(), agencia3.getVentasInfo(), agencia4.getVentasInfo(), agencia5.getVentasInfo(), txtMesMenor); 
    }//GEN-LAST:event_btnMenorActionPerformed

    private void btnJson1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJson1ActionPerformed
        agencia1.generarGson(agencia1.getVentasInfo(), "Agencia1");
    }//GEN-LAST:event_btnJson1ActionPerformed

    private void btnJson2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJson2ActionPerformed
        agencia2.generarGson(agencia2.getVentasInfo(), "Agencia2");
    }//GEN-LAST:event_btnJson2ActionPerformed

    private void btnJson3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJson3ActionPerformed
        agencia3.generarGson(agencia3.getVentasInfo(), "Agencia3");
    }//GEN-LAST:event_btnJson3ActionPerformed

    private void btnJson4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJson4ActionPerformed
        agencia4.generarGson(agencia4.getVentasInfo(), "Agencia4");
    }//GEN-LAST:event_btnJson4ActionPerformed

    private void btnJson5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJson5ActionPerformed
        agencia5.generarGson(agencia5.getVentasInfo(), "Agencia5");
    }//GEN-LAST:event_btnJson5ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgencia1Registro;
    private javax.swing.JButton btnAgencia2Registro;
    private javax.swing.JButton btnAgencia3Registro;
    private javax.swing.JButton btnAgencia4Registro;
    private javax.swing.JButton btnAgencia5Registro;
    private javax.swing.JButton btnCalcularPromedio;
    private javax.swing.JButton btnJson1;
    private javax.swing.JButton btnJson2;
    private javax.swing.JButton btnJson3;
    private javax.swing.JButton btnJson4;
    private javax.swing.JButton btnJson5;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnResumenAgencia1;
    private javax.swing.JButton btnResumenAgencia2;
    private javax.swing.JButton btnResumenAgencia3;
    private javax.swing.JButton btnResumenAgencia4;
    private javax.swing.JButton btnResumenAgencia5;
    private javax.swing.JComboBox<String> cbxMes;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tableAgencias;
    private javax.swing.JTextArea txtMayor;
    private javax.swing.JTextArea txtMesMenor;
    private javax.swing.JTextArea txtPromedio;
    private javax.swing.JTextArea txtVentasTotal;
    // End of variables declaration//GEN-END:variables
}
