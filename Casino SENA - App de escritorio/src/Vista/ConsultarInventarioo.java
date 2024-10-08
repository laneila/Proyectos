package Vista;

import Controlador.Controlador;
import javax.swing.table.DefaultTableModel;
public class ConsultarInventarioo extends javax.swing.JPanel {

    private Menu_Admin adm;

    public ConsultarInventarioo() {
        initComponents();
    }

    public void setAdm(Menu_Admin adm) {
        this.adm = adm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        boxProductos = new javax.swing.JComboBox<>();
        btnCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablainv = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        iconTipo = new javax.swing.JLabel();
        ExportarBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boxmetodo = new javax.swing.JComboBox<>();
        seleccionarFecha = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(913, 616));
        setMinimumSize(new java.awt.Dimension(913, 616));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1557, 908));
        jPanel3.setMinimumSize(new java.awt.Dimension(1557, 908));
        jPanel3.setPreferredSize(new java.awt.Dimension(1557, 908));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(104, 131, 161));
        jLabel2.setText("Productos");

        boxProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxProductos.setForeground(new java.awt.Color(102, 102, 102));
        boxProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija el producto...", "arroz", "salmon", "alga nori", "aguacate", "cerdo", "harina de trigo", "pan", "camarones", "pollo", "cebolla", "repollo", "papa", "zanahoria", "sake", "amazake", "ramune", "agua" }));
        boxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxProductosActionPerformed(evt);
            }
        });

        btnCargar.setBackground(new java.awt.Color(255, 102, 102));
        btnCargar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("Cargar");
        btnCargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        tablainv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad Entrada", "Cantidad Salida", "Fecha de Salida"
            }
        ));
        jScrollPane1.setViewportView(tablainv);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 131, 161));
        jLabel1.setText("Consultar inventario");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(104, 131, 161));
        jLabel6.setText("Metodo de consulta");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/carpas (1).png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 194, 209)));

        iconTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/xlsx (1).png"))); // NOI18N

        ExportarBtn.setBackground(new java.awt.Color(104, 131, 161));
        ExportarBtn.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        ExportarBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExportarBtn.setText("Exportar");
        ExportarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExportarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 44, 44));
        jLabel4.setText("¿Desea guardar el informe? ¡Pruebe aquí!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExportarBtn)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconTipo)
                    .addComponent(ExportarBtn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        boxmetodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boxmetodo.setForeground(new java.awt.Color(102, 102, 102));
        boxmetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija el metodo de consulta...", "Ultimas fechas", "Seleccionar fecha" }));
        boxmetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxmetodoActionPerformed(evt);
            }
        });

        seleccionarFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seleccionarFecha.setForeground(new java.awt.Color(102, 102, 102));
        seleccionarFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la fecha..." }));
        seleccionarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarFechaActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(boxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCargar)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxmetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seleccionarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(boxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(boxmetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(15, 15, 15)
                        .addComponent(seleccionarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargar)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProductosActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_boxProductosActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        
        Controlador c = new Controlador();
        String producto = (String) boxProductos.getSelectedItem();
        String metodo = (String) boxmetodo.getSelectedItem();
        String fecha = (String) seleccionarFecha.getSelectedItem();
        DefaultTableModel modelo = (DefaultTableModel) tablainv.getModel();
        
        c.consultarInventario(producto, metodo, fecha, tablainv, modelo);
        
    }//GEN-LAST:event_btnCargarActionPerformed

    private void ExportarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarBtnActionPerformed
        
            Controlador c = new Controlador();
            String producto = (String) boxProductos.getSelectedItem();
            String metodo = (String) boxmetodo.getSelectedItem();
            String fecha = (String) seleccionarFecha.getSelectedItem();
            
            c.realizarInformeInventario(tablainv, producto, metodo, fecha);
    }//GEN-LAST:event_ExportarBtnActionPerformed

    private void boxmetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxmetodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxmetodoActionPerformed

    private void seleccionarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionarFechaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        Controlador c = new Controlador();
        
        String producto = (String) boxProductos.getSelectedItem();
        String metodo = (String) boxmetodo.getSelectedItem();
        
        c.metodoConsulta(producto, metodo, seleccionarFecha);

    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportarBtn;
    private javax.swing.JComboBox<String> boxProductos;
    private javax.swing.JComboBox<String> boxmetodo;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel iconTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> seleccionarFecha;
    public javax.swing.JTable tablainv;
    // End of variables declaration//GEN-END:variables
}
