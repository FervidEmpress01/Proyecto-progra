package Vista;




import DataBase.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author davidandres
 */
public class JFLibro extends javax.swing.JFrame {
    ConexionBD con= new ConexionBD();
    Connection cn= con.conexion();
    String atributoID="ID";
    String titulo="Titulo";
    
    public JFLibro() {
        initComponents();
        mostrarTablaAutor("");
        mostrarTablaLibro("");
        bloquear();
        this.setLocationRelativeTo(null);
    }

    
      public void mostrarTablaAutor(String valor){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("ID/Numero");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de Nacimiento");
        jTablaAutor.setModel(modelo);
        
        String sql= "";
        
        if(valor.equals("")){
            sql= "SELECT * FROM autor";
        }else{
         sql = "SELECT * FROM autor WHERE ID='"+valor+"'"; 
        }
        
        
        String datos[]= new String[3];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               datos[0]=rs.getString(1);
               datos[1]=rs.getString(2);
               datos[2]=rs.getString(3);
               modelo.addRow(datos);
            }
            jTablaAutor.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(JFLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public void mostrarTablaLibro(String valor){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("ID/Numero");
        modelo.addColumn("Titulo");
        modelo.addColumn("Nro Copias");
        modelo.addColumn("Id Autor");
        jTablaLibro.setModel(modelo);
        
        String sql= "";
        
        
        if(valor.equals("")){
            sql= "SELECT * FROM libro";
        }else{
         sql = "SELECT * FROM libro WHERE ID='"+valor+"'"; 
        }
        
        
        String datos[]= new String[4];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               datos[0]=rs.getString(1);
               datos[1]=rs.getString(2);
               datos[2]=rs.getString(3);
               datos[3]=rs.getString(4);
               modelo.addRow(datos);
            }
            jTablaLibro.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(JFLibro.class.getName()).log(Level.SEVERE, null, ex);
        }




    }
    
    public void bloquear(){
        this.jTFIDAutor.setEnabled(false);
        this.jTFFechaNacimientoAutor.setEnabled(false);
        this.jTFNombreAutor.setEnabled(false);
        this.jTFIDAutor2.setEnabled(false);
        this.jTFIdLibro.setEnabled(false);
    }
    
    public void desbloquear(){
        this.jBModificarR.setEnabled(true);
        this.jBModificarR.setEnabled(true);
        
    }
    
    public void limpiar(){
        this.jTFIdLibro.setText("");
        this.jTFTitulo.setText(" ");
        this.jTFNroCopias.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotonesBusqueda = new javax.swing.ButtonGroup();
        GrupoBotonesBusquedaLibro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFIDAutor = new javax.swing.JTextField();
        jTFNombreAutor = new javax.swing.JTextField();
        jRBIDAutor = new javax.swing.JRadioButton();
        jBBuscar = new javax.swing.JButton();
        jTFBuscador = new javax.swing.JTextField();
        jTFFechaNacimientoAutor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaLibro = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaAutor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFTitulo = new javax.swing.JTextField();
        jTFNroCopias = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFIdLibro = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jTFIDAutor2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBModificarR = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jTFbuscarLibro = new javax.swing.JTextField();
        jBbuscarLibro = new javax.swing.JButton();
        jRBidLibro = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBRevisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));

        jLabel1.setText("ID Autor");

        jLabel2.setText("Nombre ");

        jLabel3.setText("Fecha de Nacimiento");

        jRBIDAutor.setText("ID Autor");
        jRBIDAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBIDAutorActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFIDAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombreAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jTFFechaNacimientoAutor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBuscar)
                .addGap(18, 18, 18)
                .addComponent(jRBIDAutor)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFIDAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFFechaNacimientoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBIDAutor)
                    .addComponent(jBBuscar)
                    .addComponent(jTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTablaLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablaLibro);

        jTablaAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablaAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaAutorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablaAutor);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Libro"));

        jLabel4.setText("TItulo");

        jLabel5.setText("Nro Copias");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Id Libro");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jTFIDAutor2.setEditable(false);

        jLabel7.setText("ID Autor");

        jBModificarR.setText("Modificar");
        jBModificarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarRActionPerformed(evt);
            }
        });

        jBactualizar.setText("Actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        jBbuscarLibro.setText("Buscar");
        jBbuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarLibroActionPerformed(evt);
            }
        });

        jRBidLibro.setText("ID Libro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFIDAutor2)
                            .addComponent(jTFNroCopias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jTFTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFIdLibro, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBModificarR)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jBEliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jBLimpiar)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBactualizar)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBGuardar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTFbuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscarLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBidLibro)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBactualizar)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTFIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFNroCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIDAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBModificarR)
                    .addComponent(jBLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFbuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarLibro)
                    .addComponent(jRBidLibro))
                .addGap(7, 7, 7))
        );

        jLabel8.setText("Autor:");

        jLabel9.setText("Libro:");

        jBRevisar.setText("Regresar");
        jBRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRevisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBRevisar)
                        .addGap(442, 442, 442))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBRevisar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
            try {
            PreparedStatement pps= cn.prepareStatement("INSERT INTO libro(Titulo,Ncopias,IdAutor) VALUES (?, ?, ?)");
            pps.setString(1, jTFTitulo.getText());
            pps.setString(2, jTFNroCopias.getText());
            pps.setString(3, this.jTFIDAutor2.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            mostrarTablaLibro("");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JFLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila= this.jTablaLibro.getSelectedRow();
        String valor= this.jTablaLibro.getValueAt(fila, 0).toString();
        int respuesta=JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este elemento");
        if(respuesta== JOptionPane.YES_OPTION){
          if(fila>=0){
            
            try {
                PreparedStatement pps= cn.prepareStatement("DELETE FROM libro WHERE ID='"+ valor + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");
                mostrarTablaLibro("");

            } catch (SQLException ex) {
                Logger.getLogger(JFLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRevisarActionPerformed
        setVisible(false);
        JFOpciones jop= new JFOpciones();
        jop.setVisible(true);
      
    }//GEN-LAST:event_jBRevisarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
         this.GrupoBotonesBusqueda.add(this.jRBIDAutor);
        if(this.jRBIDAutor.isSelected()){atributoID="ID"; mostrarTablaAutor(this.jTFBuscador.getText());}
        else{
            JOptionPane.showMessageDialog(null, "Ningun campo seleccionado");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBModificarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarRActionPerformed

        int fila= this.jTablaLibro.getSelectedRow();
        TableModel modelo= this.jTablaAutor.getModel();
        int numeroDeFilas= modelo.getRowCount();
        
        if(fila>=0){
            
            for(int i=0; i<numeroDeFilas; i++){
                
                if(this.jTablaAutor.getValueAt(i, 0).toString().equals(this.jTablaLibro.getValueAt(fila, 3).toString())){
                    this.jTFBuscador.setText(this.jTablaAutor.getValueAt(i, 0).toString());
                    this.jTFNombreAutor.setText(this.jTablaAutor.getValueAt(i, 1).toString());     
                    this.jTFFechaNacimientoAutor.setText(this.jTablaAutor.getValueAt(i, 2).toString());
                }
            }          
            this.jTFIdLibro.setText(this.jTablaLibro.getValueAt(fila, 0).toString());
            this.jTFTitulo.setText(this.jTablaLibro.getValueAt(fila, 1).toString());
            this.jTFNroCopias.setText(this.jTablaLibro.getValueAt(fila, 2).toString());
            this.jTFIDAutor.setText(this.jTablaLibro.getValueAt(fila, 3).toString());
            
        }else{
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    }//GEN-LAST:event_jBModificarRActionPerformed

    private void jTablaAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaAutorMouseClicked
        int fila= this.jTablaAutor.getSelectedRow();
            
        if(fila>=0){
            
            this.jTFBuscador.setText(this.jTablaAutor.getValueAt(fila, 0).toString());
            this.jTFNombreAutor.setText(this.jTablaAutor.getValueAt(fila, 1).toString());
            this.jTFIDAutor.setText(this.jTablaAutor.getValueAt(fila, 0).toString());
            this.jTFIDAutor2.setText(this.jTablaAutor.getValueAt(fila, 0).toString());
            this.jTFFechaNacimientoAutor.setText(this.jTablaAutor.getValueAt(fila, 2).toString());
            

        }else{
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    }//GEN-LAST:event_jTablaAutorMouseClicked

    private void jRBIDAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBIDAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBIDAutorActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        try {
            PreparedStatement pps= cn.prepareStatement("UPDATE libro SET Titulo='"+this.jTFTitulo.getText() +"', Ncopias='"+this.jTFNroCopias.getText()+"' WHERE id='"+ this.jTFIdLibro.getText()+"';");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
            limpiar();
            mostrarTablaLibro("");
        } catch (SQLException ex) {
            Logger.getLogger(JFAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBbuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarLibroActionPerformed
        this.GrupoBotonesBusquedaLibro.add(this.jRBidLibro);
        if(this.jRBidLibro.isSelected()){atributoID="ID"; mostrarTablaLibro(this.jTFbuscarLibro.getText());}
        else{
            JOptionPane.showMessageDialog(null, "Ningun campo seleccionado");
        }
    }//GEN-LAST:event_jBbuscarLibroActionPerformed

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
            java.util.logging.Logger.getLogger(JFLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotonesBusqueda;
    private javax.swing.ButtonGroup GrupoBotonesBusquedaLibro;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificarR;
    private javax.swing.JButton jBRevisar;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBbuscarLibro;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JRadioButton jRBIDAutor;
    private javax.swing.JRadioButton jRBidLibro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFBuscador;
    private javax.swing.JTextField jTFFechaNacimientoAutor;
    private javax.swing.JTextField jTFIDAutor;
    private javax.swing.JTextField jTFIDAutor2;
    private javax.swing.JTextField jTFIdLibro;
    private javax.swing.JTextField jTFNombreAutor;
    private javax.swing.JTextField jTFNroCopias;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JTextField jTFbuscarLibro;
    private javax.swing.JTable jTablaAutor;
    private javax.swing.JTable jTablaLibro;
    // End of variables declaration//GEN-END:variables
}
