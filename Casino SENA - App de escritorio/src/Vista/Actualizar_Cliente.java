package Vista;

import Controlador.Controlador;
import Modelo.Clientes;
import Modelo.MetodosEmpleados;
import Modelo.UtilidadesTablas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DIANA
 */
public class Actualizar_Cliente extends javax.swing.JPanel {
    private DefaultTableModel modeloTabla;
    private Menu_Cajero caj;
    private Menu_Admin adm;
    private RegistrarCliente rc = new RegistrarCliente();
    
    /**
     * Creates new form Actualizar_Cliente
     */
    public Actualizar_Cliente() {
        initComponents();
    }
     public Actualizar_Cliente(Menu_Cajero caj) {
        initComponents();
    }
    
    public Actualizar_Cliente(Menu_Admin adm) {
        initComponents();
    }

    public void setCaj(Menu_Cajero caj) {
        this.caj = caj;
    }

    public void setAdm(Menu_Admin adm) {
        this.adm = adm;
    }
    public void setiarcampos(){
        Inputnom.setText("");
        Inputape.setText("");
        Inputdire.setText("");
        Inputtele.setText("");
        InputCCCl.setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        InputCCCl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacliente = new javax.swing.JTable();
        btnBuscarCl1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Inputnom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Inputape = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Inputdire = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Inputtele = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JToggleButton();
        btnActuCl = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("C.C");

        InputCCCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCCClActionPerformed(evt);
            }
        });

        tablacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "C.C", "DIRECCIÓN", "TELÉFONO"
            }
        ));
        jScrollPane1.setViewportView(tablacliente);

        btnBuscarCl1.setBackground(new java.awt.Color(104, 131, 161));
        btnBuscarCl1.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        btnBuscarCl1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCl1.setText("Buscar");
        btnBuscarCl1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarCl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCl1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("Nombre");

        Inputnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputnomActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("Apellido");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("Direccion");

        Inputdire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputdireActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setText("Telefono");

        Inputtele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputteleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inputnom, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inputdire, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inputape, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inputtele, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inputnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inputdire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Inputtele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Inputape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InputCCCl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnBuscarCl1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(InputCCCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCl1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Roboto Light", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(104, 131, 161));
        jLabel2.setText("ACTUALIZAR CLIENTE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/chinavieja.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        jLabel1.setText("INTRODUZCA LA CEDULA DEL CLIENTE AL QUE DESEA ACTUALIZAR");

        volver.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 102, 102));
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/volvwe__1_-removebg-preview.png"))); // NOI18N
        volver.setText("VOLVER");
        volver.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        btnActuCl.setBackground(new java.awt.Color(104, 131, 161));
        btnActuCl.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnActuCl.setForeground(new java.awt.Color(255, 255, 255));
        btnActuCl.setText("Actualizar");
        btnActuCl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActuCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuClActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volver)
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActuCl)
                        .addGap(280, 280, 280)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(volver))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActuCl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCl1ActionPerformed
        MetodosEmpleados met = new MetodosEmpleados();
        String cedula = InputCCCl.getText(); // Supongamos que aquí obtienes la cédula ingresada en el formulario
        Clientes cliente = met.obtenerClientePorCedula(cedula);

        if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor,asegurese de llenar el campo antes de buscar","ERROR" ,JOptionPane.ERROR_MESSAGE);
            
        }else{
            if (cliente != null) {
                UtilidadesTablas.tablaNormal(tablacliente);
                DefaultTableModel modelo = (DefaultTableModel)tablacliente.getModel();
                modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
                Object[] objeto = new Object[5];

                objeto[0] = cliente.getNombre_clie();
                objeto[1] = cliente.getApe_clie();
                objeto[2] = cliente.getCed_ruc();
                objeto[3] = cliente.getDireccion_clie();
                objeto[4] = cliente.getTelef_clie();
                modelo.addRow(objeto);
            } else {
                // Manejar el caso en que no se encuentra ningún cliente con la cédula ingresada
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con la cédula ingresada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnBuscarCl1ActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        RegistrarCliente p = new RegistrarCliente();
        Controlador c = new Controlador();
        UtilidadesTablas.tablaNormal(rc.tablacliente);
        c.listar(rc.tablacliente);        
        if(caj != null) {

            // Establecer la referencia a la clase Menu_Cajero en el panel RegistrarCliente
            rc.setCaj(caj);

            // Mostrar el panel RegistrarCliente en el contenedor principal
            caj.mostrarC(rc);
        } else {
            
            rc.setAdm(adm);
            adm.mostrarpanel(rc);
        }
    }//GEN-LAST:event_volverActionPerformed

    private void btnActuClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuClActionPerformed
        MetodosEmpleados metem = new MetodosEmpleados();
        Controlador c = new Controlador();
        String nombre = Inputnom.getText();
        String apellido = Inputape.getText();
        String direccion = Inputdire.getText();
        String telefono = Inputtele.getText();
        String cedula = InputCCCl.getText();

        metem.actCliente(nombre, apellido, direccion, telefono, cedula);
        Clientes cliente = metem.obtenerClientePorCedula(cedula);
        
        if (cliente != null) {
                UtilidadesTablas.tablaNormal(tablacliente);
                DefaultTableModel modelo = (DefaultTableModel)tablacliente.getModel();
                modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
                Object[] objeto = new Object[5];

                objeto[0] = cliente.getNombre_clie();
                objeto[1] = cliente.getApe_clie();
                objeto[2] = cliente.getCed_ruc();
                objeto[3] = cliente.getDireccion_clie();
                objeto[4] = cliente.getTelef_clie();
                modelo.addRow(objeto);
            } else {
                // Manejar el caso en que no se encuentra ningún cliente con la cédula ingresada
                JOptionPane.showMessageDialog(null, "No se pudo listar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        setiarcampos();
        
       
        
       
        
        
        
    }//GEN-LAST:event_btnActuClActionPerformed

    private void InputdireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputdireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputdireActionPerformed

    private void InputteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputteleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputteleActionPerformed

    private void InputnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputnomActionPerformed

    private void InputCCClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCCClActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCCClActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputCCCl;
    private javax.swing.JTextField Inputape;
    private javax.swing.JTextField Inputdire;
    private javax.swing.JTextField Inputnom;
    private javax.swing.JTextField Inputtele;
    public javax.swing.JButton btnActuCl;
    public javax.swing.JButton btnBuscarCl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable tablacliente;
    private javax.swing.JToggleButton volver;
    // End of variables declaration//GEN-END:variables
}
