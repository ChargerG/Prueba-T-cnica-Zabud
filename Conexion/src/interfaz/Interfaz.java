package interfaz;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian Camilo González Ramos
 * 
 * Esta clase contiene el código necesario para desplegar la interfaz gráfica
 * Pero también contiene los métodos que se implementaron para la utilización
 * De este programa.
 * 
 * En esta clase también se importa una clase ubicada en el package conexion
 * Permite implemetar su clase Conexion para configurar la comunicación con la 
 * Base de Datos.
 */
public class Interfaz extends javax.swing.JFrame {
    int total = 0;
    String textoC = "";
    String textoF = "";
    Conexion cc = new Conexion();
    Connection conectar = cc.conexion();

    /**
     * Constructor de está clase donde se inician los componentes
     * También se implementa el método cargarDatos();
     * El cual carga lo que contiene la base de datos a la interfaz gráfica.
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l5 = new javax.swing.JLabel();
        f3 = new javax.swing.JTextField();
        l6 = new javax.swing.JLabel();
        f4 = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        l7 = new javax.swing.JLabel();
        f5 = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        l1 = new javax.swing.JLabel();
        f1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        a1 = new javax.swing.JTextArea();
        l8 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        f2 = new javax.swing.JTextField();
        bt5 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        a2 = new javax.swing.JTextArea();
        l9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        f6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        l5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setText("Nombre:");

        f3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        l6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setText("Unidades:");

        f4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        bt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt1.setText("Limpiar");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt2.setText("Guardar");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt3.setText("Eliminar");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt4.setText("Actualizar");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        l7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setText("Precio:");

        f5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(l6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(l5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l7)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(f5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(f3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f4, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l5)
                    .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l6)
                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l7)
                    .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt2)
                        .addComponent(bt3)
                        .addComponent(bt4)))
                .addContainerGap())
        );

        l4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        l4.setText("Agregue, Elimine o Actualice un Producto:");

        l2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        l2.setText("Busquedad:");

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        l1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l1.setText("Sistema de Productos");

        f1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        f1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f1KeyReleased(evt);
            }
        });

        a1.setColumns(20);
        a1.setRows(5);
        jScrollPane2.setViewportView(a1);

        l8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        l8.setText("Factura:");

        l3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        l3.setText("Cantidad:");

        f2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        bt5.setBackground(new java.awt.Color(0, 102, 204));
        bt5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt5.setForeground(new java.awt.Color(255, 255, 255));
        bt5.setText("Agregar Item");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt7.setBackground(new java.awt.Color(0, 102, 204));
        bt7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt7.setForeground(new java.awt.Color(255, 255, 255));
        bt7.setText("Facturar");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setBackground(new java.awt.Color(0, 102, 204));
        bt8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt8.setForeground(new java.awt.Color(255, 255, 255));
        bt8.setText("Salir");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt6.setBackground(new java.awt.Color(0, 102, 204));
        bt6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt6.setForeground(new java.awt.Color(255, 255, 255));
        bt6.setText("Limpiar");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        a2.setColumns(20);
        a2.setRows(5);
        a2.setText("\n");
        jScrollPane3.setViewportView(a2);

        l9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        l9.setText("Productos Agregados al Carrito:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l2)
                                    .addComponent(l3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(f1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(f2)
                                    .addComponent(f6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l4)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l8)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bt5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l9)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l1)
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(l1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(l4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l8)
                    .addComponent(l9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        insertarDatos();
        cargarDatos();
    }//GEN-LAST:event_bt2ActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        int filaSel = t1.rowAtPoint(evt.getPoint());
        f3.setText(t1.getValueAt(filaSel, 1).toString());
        f4.setText(t1.getValueAt(filaSel, 2).toString());
        f5.setText(t1.getValueAt(filaSel, 3).toString());
    }//GEN-LAST:event_t1MouseClicked

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        actualizarDatos();
        limpiarCampos();
        cargarDatos();
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        eliminarDatos();
        limpiarCampos();
        cargarDatos();
    }//GEN-LAST:event_bt3ActionPerformed

    private void f1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f1KeyReleased
        filtrarDatos(f1.getText());
    }//GEN-LAST:event_f1KeyReleased

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        agregarCarrito();    
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        limpiarCampos();
        cargarDatos();
        a1.setText(textoF + "\n\n" + "Total: " + total + "$" + "\n" + " ---------------------------" + "\n\n");
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        a1.setText("");
        a2.setText("");
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt8ActionPerformed

    /**
     * El método insertarDatos() se encarga de registar los registros que contienen los campos
     * De la interfaz gráfica, esto se hace llenando los campos de la interfaz como:
     * Nombre, Unidades y Precio.
     * 
     * Luego disparando el evento del botón Guardar.
     * Se debe tener en cuenta que también se utilizan los comandos de MySQL para realizar está operación.
     */
    public void insertarDatos() {

        try {
            String sql = "insert into productos (nombre, cantidad, valor) values(?,?,?)";
            PreparedStatement ps = conectar.prepareStatement(sql);

            ps.setString(1, f3.getText());
            ps.setInt(2, Integer.parseInt(f4.getText()));
            ps.setDouble(3, Double.parseDouble(f5.getText()));

            ps.execute();

            JOptionPane.showMessageDialog(null, "Registro Exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Registro " + e.getMessage());
        }

    }

    /**
     * El método eliminarDatos() se encarga de eliminar los registros seleccionados, esto se hace
     * Seleccionando el registro de la tabla que contiene la interfaz y luego disparando el evento 
     * Del botón Eliminar.
     * 
     * Se debe tener en cuenta que también se utilizan los comandos de MySQL para realizar está operación.
     */
    public void eliminarDatos() {

        int filaSel = t1.getSelectedRow();

        try {

            String sql = "delete from productos where codigo = " + t1.getValueAt(filaSel, 0);
            Statement st = conectar.createStatement();

            int n = st.executeUpdate(sql);

            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado Exitosamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar Registro " + e.getMessage());
        }

    }

    /**
     * El método cargarDatos() se encarga de cargar los datos de la base de datos
     * Al mismo tiempo también los carga al modelo de latabla de la interfaz gráfica.
     * 
     * Se implementa el método cuando se inicia la interfaz y también cuando se dispara el evento
     * Del botón guardar.
     */
    public void cargarDatos() {
        String[] titulos = {"Código", "Nombre", "Cantidad", "Precio"};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from productos";

        try {

            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("valor");

                modelo.addRow(registros);

            }

            t1.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Carga " + e.getMessage());
        }
    }

    /**
     * Este método solo se encarga de limpiar los campos de registro de un nuevo producto.
     */
    public void limpiarCampos() {
        f3.setText("");
        f4.setText("");
        f5.setText("");
    }

    /**
     * Este método se encarga de actualizar un registro de la base de datos, para lograr está operación
     * Es necesario solo se debe seleccionar el producto de la tabla que se encuentra en la interfaz gráfica
     * De forma que esta acción llena los campos de registro de forma autonóma, con esto se realizan los respectivos cambios
     * 
     * Para acentuar un cambio o actualización solo se debe disparar el evento del botón actualizar, esto genera el cambio
     * Y actualiza tanto base de datos como los valores contenidos en la tabla de la interfaz gráfica.
     */
    public void actualizarDatos() {
        try {
            String sql = " update productos set nombre = ?, cantidad = ?, valor = ? where codigo = ? ";

            int filaSel = t1.getSelectedRow();
            String dao = (String) t1.getValueAt(filaSel, 0);

            PreparedStatement ps = conectar.prepareStatement(sql);

            ps.setString(1, f3.getText());
            ps.setInt(2, Integer.parseInt(f4.getText()));
            ps.setDouble(3, Double.parseDouble(f5.getText()));

            ps.setString(4, dao);
            ps.execute();

            JOptionPane.showMessageDialog(null, "Edición de Registro Exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Edición " + e.getMessage());
        }

    }

    /**
     * Este método se encarga de filtrar datos de la tabla de registros para una busqueda rápida de los elementos.
     * @param valor es el String que contendrá la caja de texto f1, esto se da por medio de un evento que proporciona el uso
     * De un JTextField llamado KeyReleased.
     * 
     * El filtro se puede notar en la interfaz de usuario.
     */
    public void filtrarDatos(String valor) {
        String[] titulos = {"Código", "Nombre", "Cantidad", "Precio"};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from productos where nombre like '%" + valor + "%'";

        try {

            Statement st = conectar.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("valor");

                modelo.addRow(registros);

            }

            t1.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Carga " + e.getMessage());
        }
    }

    /**
     * Este método se encarga de agregar los items que vaya agregando el usuario encargado de manipular este aplicativo
     * Solo debe sebe seleccionar el producto de la tabla de la interfaz y llenar los campos Unidades y Cliente.
     * De tal forma que el usuario verá el registro de los items que ha ido agregando.
     * 
     * Es común notar que se disparará una excepción en caso de no llenar el campo de unidades ya que es necesario
     * Para el calculo de factura y para el registro en el JTextArea a2.
     */
    public void agregarCarrito() {
        try {
                String producto = f3.getText().toString();
                String cliente = f6.getText().toString();
                int unidades = Integer.parseInt(f4.getText());
                int precio = Integer.parseInt(f5.getText());

                if (Integer.parseInt(f2.getText()) <= unidades && Integer.parseInt(f2.getText()) >= 1) {
                    facturarProductos(unidades, Integer.parseInt(f2.getText()));
                    textoC += " ***************************" + "\n\n" + "      Productos Agregados" + "\n\n" + " Producto: " + producto + "\n" + " Unidades: " + Integer.parseInt(f2.getText()) + "\n" + " Precio Unirario: " + precio + "\n\n";
                    textoF += "\n" + " Producto: " + producto + " x " + Integer.parseInt(f2.getText()) + "U" + "\n" + " Precio Unirario: " + precio + "\n\n";
                    a1.setText(" ***************************" + "\n\n" + "      Factura de Productos" + "\n\n" + " Cliente: " + cliente + "\n\n"+textoF);
                    a2.setText(textoC);   
                    f2.setText("");
                    JOptionPane.showMessageDialog(null, "Producto Agregado");
                } else {
                    JOptionPane.showMessageDialog(null, "No es Posible Agregar " + Integer.parseInt(f2.getText()));
                }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Agregar Producto, Llene el Campo Cantidad " + e.getMessage());
        }

    }
    
    /**
     * Este método se encarga de facturar los items que ya se agregaron, con ello este método realiza el calculo del valor total
     * Y también actualiza la base datos para restar a la cantidad de elementos existentes en la base datos.
     * 
     * @param unidad Es el número de elementos que se ingresan o que se van a vender.
     * @param precio Es el costro unitario de un producto o item.
     * @return Retorna el total de los productos o items que facturaron.
     * 
     * Para llevar acabo está operación es necesario disparar el evento por medio del botón Facturar.
     */
    public double facturarProductos(int unidad, int precio) {
        try {
                 unidad = Integer.parseInt(f2.getText());
                 precio = Integer.parseInt(f5.getText());
                 
                 total += unidad*precio;
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Calculo " + e.getMessage());
        }
        
    try {
            String sql = " update productos set nombre = ?, cantidad = ?, valor = ? where codigo = ? ";

            int filaSel = t1.getSelectedRow();
            String dao = (String) t1.getValueAt(filaSel, 0);

            PreparedStatement ps = conectar.prepareStatement(sql);

            ps.setString(1, f3.getText());
            ps.setInt(2, Integer.parseInt(f4.getText()) - Integer.parseInt(f2.getText()));
            ps.setDouble(3, Double.parseDouble(f5.getText()));

            ps.setString(4, dao);
            ps.execute();

            JOptionPane.showMessageDialog(null, "Operación Realizada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Operación " + e.getMessage());
        }

                
        System.out.println(total);
        return total;
    }

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a1;
    private javax.swing.JTextArea a2;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4;
    private javax.swing.JTextField f5;
    private javax.swing.JTextField f6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
