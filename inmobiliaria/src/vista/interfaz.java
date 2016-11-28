/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Manuel
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        this.panelTitular.setVisible(true);
        this.panelVendedores.setVisible(false);
        this.panelInmuebles.setVisible(false);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitular = new javax.swing.JPanel();
        btnTitVentas = new javax.swing.JButton();
        lblNombreAgencia = new javax.swing.JLabel();
        btnTitInmuebles = new javax.swing.JButton();
        btnTitVendedores = new javax.swing.JButton();
        panelVendedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTitVendedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTitVenCodAgencia = new javax.swing.JLabel();
        lblTitVenNombreAgencia = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTitVenApellidos = new javax.swing.JTextField();
        txtTitVenNombre = new javax.swing.JTextField();
        txtTitVenDni = new javax.swing.JTextField();
        txtTitVenTelefono = new javax.swing.JTextField();
        txtTiVentCorreo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnTitVenNuevo = new javax.swing.JButton();
        btnTitVenGuardar = new javax.swing.JButton();
        btnTitVenModificar = new javax.swing.JButton();
        btnTitVenSalir = new javax.swing.JButton();
        btnTitVenEliminar = new javax.swing.JButton();
        panelInmuebles = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTitInmCodAgencia = new javax.swing.JLabel();
        lblTitInmNombreAgencia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTitInmueble = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTitInmPropietario = new javax.swing.JTextField();
        txtTitInmDireccion = new javax.swing.JTextField();
        txtTitInmSuperficie = new javax.swing.JTextField();
        txtTitInmLicencia = new javax.swing.JTextField();
        txtTitInmNumHab = new javax.swing.JTextField();
        txtTitInmNumBaños = new javax.swing.JTextField();
        txtTitInmTipoGas = new javax.swing.JTextField();
        txtTitInmUbicacion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnTitInmNuevoLocal = new javax.swing.JButton();
        btnTitInmGuardar = new javax.swing.JButton();
        btnTitInmModificar = new javax.swing.JButton();
        btnTitInmSalir = new javax.swing.JButton();
        btnTitInmEliminar = new javax.swing.JButton();
        btnTitInmNuevoPiso = new javax.swing.JButton();
        panelVentas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTitVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventasNor.png"))); // NOI18N
        btnTitVentas.setBorder(null);
        btnTitVentas.setBorderPainted(false);
        btnTitVentas.setContentAreaFilled(false);
        btnTitVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTitVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTitVentas.setIconTextGap(-3);
        btnTitVentas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventasPre.png"))); // NOI18N
        btnTitVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventasRol.png"))); // NOI18N
        btnTitVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitVentasActionPerformed(evt);
            }
        });

        lblNombreAgencia.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNombreAgencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreAgencia.setText("NOMBRE DE LA INMOBILIARIA");

        btnTitInmuebles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InmueblesNor.png"))); // NOI18N
        btnTitInmuebles.setBorder(null);
        btnTitInmuebles.setBorderPainted(false);
        btnTitInmuebles.setContentAreaFilled(false);
        btnTitInmuebles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTitInmuebles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTitInmuebles.setIconTextGap(-3);
        btnTitInmuebles.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InmueblesPre.png"))); // NOI18N
        btnTitInmuebles.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/InmueblesRol.png"))); // NOI18N
        btnTitInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitInmueblesActionPerformed(evt);
            }
        });

        btnTitVendedores.setBackground(new java.awt.Color(0, 0, 0));
        btnTitVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vendedorNor.png"))); // NOI18N
        btnTitVendedores.setBorder(null);
        btnTitVendedores.setBorderPainted(false);
        btnTitVendedores.setContentAreaFilled(false);
        btnTitVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTitVendedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTitVendedores.setIconTextGap(-3);
        btnTitVendedores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vendedorPre.png"))); // NOI18N
        btnTitVendedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vendedorRol.png"))); // NOI18N
        btnTitVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitVendedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTitularLayout = new javax.swing.GroupLayout(panelTitular);
        panelTitular.setLayout(panelTitularLayout);
        panelTitularLayout.setHorizontalGroup(
            panelTitularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreAgencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitularLayout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(btnTitVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(btnTitInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btnTitVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        panelTitularLayout.setVerticalGroup(
            panelTitularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTitularLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(lblNombreAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(panelTitularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTitVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTitInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTitVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );

        tablaTitVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaTitVendedor);

        jLabel1.setText("Código Agencia: ");

        lblTitVenCodAgencia.setText("codigo");

        lblTitVenNombreAgencia.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitVenNombreAgencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitVenNombreAgencia.setText("NOMBRE DE LA INMOBILIARIA");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor"));

        jLabel5.setText("Apellidos:");

        jLabel4.setText("Nombre:");

        jLabel3.setText("DNI:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Correo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitVenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTiVentCorreo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTitVenApellidos)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTitVenDni, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitVenNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTitVenDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTitVenNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTitVenApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTitVenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTiVentCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTitVenNuevo.setText("Nuevo");
        jPanel3.add(btnTitVenNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        btnTitVenGuardar.setText("Guardar");
        jPanel3.add(btnTitVenGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, -1));

        btnTitVenModificar.setText("Modificar");
        jPanel3.add(btnTitVenModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 140, -1));

        btnTitVenSalir.setText("Salir");
        jPanel3.add(btnTitVenSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 140, -1));

        btnTitVenEliminar.setText("Eliminar");
        jPanel3.add(btnTitVenEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 140, -1));

        javax.swing.GroupLayout panelVendedoresLayout = new javax.swing.GroupLayout(panelVendedores);
        panelVendedores.setLayout(panelVendedoresLayout);
        panelVendedoresLayout.setHorizontalGroup(
            panelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(panelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVendedoresLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(panelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitVenNombreAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelVendedoresLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(panelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelVendedoresLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(6, 6, 6)
                                    .addComponent(lblTitVenCodAgencia))
                                .addGroup(panelVendedoresLayout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 17, Short.MAX_VALUE)))
        );
        panelVendedoresLayout.setVerticalGroup(
            panelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
            .addGroup(panelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVendedoresLayout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addGroup(panelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(lblTitVenCodAgencia))
                    .addGap(6, 6, 6)
                    .addComponent(lblTitVenNombreAgencia)
                    .addGap(60, 60, 60)
                    .addGroup(panelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelVendedoresLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
        );

        jLabel2.setText("Código Agencia: ");

        lblTitInmCodAgencia.setText("codigo");

        lblTitInmNombreAgencia.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitInmNombreAgencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitInmNombreAgencia.setText("NOMBRE DE LA INMOBILIARIA");

        tablaTitInmueble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaTitInmueble);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles del Inmueble"));

        jLabel8.setText("Direccion:");

        jLabel9.setText("Propietario:");

        jLabel10.setText("Superficie");

        jLabel11.setText("Num. Habitaciones:");

        jLabel12.setText("Num. Baños:");

        jLabel13.setText("Tipo de Gas:");

        jLabel16.setText("Licencia:");

        jLabel15.setText("Ubicación:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitInmLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitInmSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitInmDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitInmPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitInmUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitInmTipoGas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitInmNumBaños, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitInmNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTitInmDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtTitInmNumHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTitInmPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtTitInmNumBaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTitInmSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtTitInmTipoGas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTitInmLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtTitInmUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTitInmNuevoLocal.setText("Nuevo Local");
        jPanel4.add(btnTitInmNuevoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, -1));

        btnTitInmGuardar.setText("Guardar");
        jPanel4.add(btnTitInmGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        btnTitInmModificar.setText("Modificar");
        btnTitInmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitInmModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnTitInmModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, -1));

        btnTitInmSalir.setText("Salir");
        jPanel4.add(btnTitInmSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, -1));

        btnTitInmEliminar.setText("Eliminar");
        jPanel4.add(btnTitInmEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, -1));

        btnTitInmNuevoPiso.setText("Nuevo Piso");
        jPanel4.add(btnTitInmNuevoPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, -1));

        javax.swing.GroupLayout panelInmueblesLayout = new javax.swing.GroupLayout(panelInmuebles);
        panelInmuebles.setLayout(panelInmueblesLayout);
        panelInmueblesLayout.setHorizontalGroup(
            panelInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitInmNombreAgencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelInmueblesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(lblTitInmCodAgencia)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelInmueblesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(panelInmueblesLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelInmueblesLayout.setVerticalGroup(
            panelInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInmueblesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblTitInmCodAgencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitInmNombreAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panelInmueblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelVentasLayout = new javax.swing.GroupLayout(panelVentas);
        panelVentas.setLayout(panelVentasLayout);
        panelVentasLayout.setHorizontalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        panelVentasLayout.setVerticalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(panelVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(panelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTitVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTitVentasActionPerformed

    private void btnTitVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitVendedoresActionPerformed
        this.panelTitular.setVisible(false);
        this.panelVendedores.setVisible(true);
        this.panelInmuebles.setVisible(false);
        
    }//GEN-LAST:event_btnTitVendedoresActionPerformed

    private void btnTitInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitInmueblesActionPerformed
        this.panelTitular.setVisible(false);
        this.panelVendedores.setVisible(false);
        this.panelInmuebles.setVisible(true);
    }//GEN-LAST:event_btnTitInmueblesActionPerformed

    private void btnTitInmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitInmModificarActionPerformed
        
    }//GEN-LAST:event_btnTitInmModificarActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTitInmEliminar;
    private javax.swing.JButton btnTitInmGuardar;
    private javax.swing.JButton btnTitInmModificar;
    private javax.swing.JButton btnTitInmNuevoLocal;
    private javax.swing.JButton btnTitInmNuevoPiso;
    private javax.swing.JButton btnTitInmSalir;
    private javax.swing.JButton btnTitInmuebles;
    private javax.swing.JButton btnTitVenEliminar;
    private javax.swing.JButton btnTitVenGuardar;
    private javax.swing.JButton btnTitVenModificar;
    private javax.swing.JButton btnTitVenNuevo;
    private javax.swing.JButton btnTitVenSalir;
    private javax.swing.JButton btnTitVendedores;
    private javax.swing.JButton btnTitVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNombreAgencia;
    private javax.swing.JLabel lblTitInmCodAgencia;
    private javax.swing.JLabel lblTitInmNombreAgencia;
    private javax.swing.JLabel lblTitVenCodAgencia;
    private javax.swing.JLabel lblTitVenNombreAgencia;
    private javax.swing.JPanel panelInmuebles;
    private javax.swing.JPanel panelTitular;
    private javax.swing.JPanel panelVendedores;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JTable tablaTitInmueble;
    private javax.swing.JTable tablaTitVendedor;
    private javax.swing.JTextField txtTiVentCorreo;
    private javax.swing.JTextField txtTitInmDireccion;
    private javax.swing.JTextField txtTitInmLicencia;
    private javax.swing.JTextField txtTitInmNumBaños;
    private javax.swing.JTextField txtTitInmNumHab;
    private javax.swing.JTextField txtTitInmPropietario;
    private javax.swing.JTextField txtTitInmSuperficie;
    private javax.swing.JTextField txtTitInmTipoGas;
    private javax.swing.JTextField txtTitInmUbicacion;
    private javax.swing.JTextField txtTitVenApellidos;
    private javax.swing.JTextField txtTitVenDni;
    private javax.swing.JTextField txtTitVenNombre;
    private javax.swing.JTextField txtTitVenTelefono;
    // End of variables declaration//GEN-END:variables
}
