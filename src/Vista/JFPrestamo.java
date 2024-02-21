
package Vista;
import DataBase.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author USUARIO
 */
public class JFPrestamo extends javax.swing.JFrame {

    ConexionBD con= new ConexionBD();
    Connection cn= con.conexion();
    String atributoID="ID";
    String IDa="IDa";
    public JFPrestamo() {
        initComponents();
        mostrarTablaEstudiante("");
        mostrarTablaLibro("");
        mostrarTablaPrestamo("");
        bloquear();
        this.setLocationRelativeTo(null);
    }
    
    public void mostrarTablaEstudiante(String valor){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("ID/Numero");
        modelo.addColumn("Nombre");
        modelo.addColumn("IdEstudiante");
        modelo.addColumn("FechaDeNacimiento");
        jTablaEstudiante.setModel(modelo);
        
        String sql= "SELECT * FROM estudiante";
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
            jTablaEstudiante.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(JFEstudiante.class.getName()).log(Level.SEVERE, null, ex);
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
        public void mostrarTablaPrestamo(String valor){
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("ID/Numero");
        modelo.addColumn("IdLibro");
        modelo.addColumn("IdEstudiante");
        modelo.addColumn("FechaPrestamo");
        modelo.addColumn("FechaDevolucion");
        jTBprestamo.setModel(modelo);
        
        String sql= "";
        
        if(valor.equals("")){
            sql= "SELECT * FROM prestamo";
        }else{
         sql = "SELECT * FROM prestamo WHERE ID='"+valor+"'"; 
        }
              
        String datos[]= new String[5];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               datos[0]=rs.getString(1);
               datos[1]=rs.getString(2);
               datos[2]=rs.getString(3);
               datos[3]=rs.getString(4);
               datos[4]=rs.getString(5);
               modelo.addRow(datos);
            }
            jTBprestamo.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(JFLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void bloquear(){
        this.jTFIDEstudiante.setEnabled(false);
        this.jDCFechaNacimientoAutor.setEnabled(false);
        this.jTFNombreAutor.setEnabled(false);
        this.jTFIDAutor.setEnabled(false);
        this.jTFIdLibro.setEnabled(false);
        this.jTFNroCopias.setEnabled(false);
        this.jTFTitulo.setEnabled(false);
        this.jTFIdEstudiante2.setEnabled(false);
        this.jTFidLibro2.setEnabled(false);
        this.jTFidPrestamo.setEnabled(false);
    }
    
    public void limpiar(){
        this.jTFIdLibro.setText("");
        this.jTFTitulo.setText(" ");
        this.jTFNroCopias.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotonesBusqueda = new javax.swing.ButtonGroup();
        GrupoDeBotonesLibro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFIDEstudiante = new javax.swing.JTextField();
        jTFNombreAutor = new javax.swing.JTextField();
        jRBIDEstudiante = new javax.swing.JRadioButton();
        jBBuscar = new javax.swing.JButton();
        jTFBuscador = new javax.swing.JTextField();
        jDCFechaNacimientoAutor = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaLibro = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaEstudiante = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFTitulo = new javax.swing.JTextField();
        jTFNroCopias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFIdLibro = new javax.swing.JTextField();
        jTFIDAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFbuscarLibro = new javax.swing.JTextField();
        jBbuscarLibro = new javax.swing.JButton();
        jRBidLibro = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTBprestamo = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTFIdEstudiante2 = new javax.swing.JTextField();
        jTFidPrestamo = new javax.swing.JTextField();
        jTFidLibro2 = new javax.swing.JTextField();
        jDCFechaPrestamo = new com.toedter.calendar.JDateChooser();
        jDCFechaDevolucion = new com.toedter.calendar.JDateChooser();
        jBGuardar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));

        jLabel1.setText("ID Estudiante");

        jLabel2.setText("Nombre ");

        jLabel3.setText("Fecha de Nacimiento");

        jRBIDEstudiante.setText("ID Estudiante");
        jRBIDEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBIDEstudianteActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFIDEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCFechaNacimientoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBuscar)
                .addGap(18, 18, 18)
                .addComponent(jRBIDEstudiante)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFIDEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jDCFechaNacimientoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBIDEstudiante)
                    .addComponent(jBBuscar)
                    .addComponent(jTFBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
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
        jTablaLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaLibroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaLibro);

        jTablaEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablaEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaEstudianteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablaEstudiante);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Libro"));

        jLabel4.setText("TItulo");

        jLabel5.setText("Nro Copias");

        jLabel6.setText("Id Libro");

        jTFIDAutor.setEditable(false);

        jLabel7.setText("ID Autor");

        jBbuscarLibro.setText("Buscar");
        jBbuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarLibroActionPerformed(evt);
            }
        });

        jRBidLibro.setText("Id Libro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(jTFbuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTFIDAutor)
                        .addComponent(jTFNroCopias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(jTFTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFIdLibro, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBbuscarLibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBidLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
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
                    .addComponent(jTFIDAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFbuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarLibro)
                    .addComponent(jRBidLibro))
                .addGap(33, 33, 33))
        );

        jLabel8.setText("Estudiante:");

        jLabel9.setText("Libro:");

        jTBprestamo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTBprestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBprestamoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTBprestamo);

        jLabel10.setText("Prestamo:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Prestamo"));

        jLabel11.setText("Id Prestamo:");

        jLabel12.setText("Id Estudiante:");

        label12.setText("Id Libro:");

        jLabel13.setText("Fecha Prestamo:");

        jLabel14.setText("Fecha Devolucion:");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBactualizar.setText("Actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFidPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(label12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFidLibro2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFIdEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDCFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDCFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jBactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBlimpiar)
                        .addGap(18, 18, 18))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFidPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTFIdEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label12)
                    .addComponent(jTFidLibro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jDCFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jDCFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBlimpiar)
                    .addComponent(jBeliminar)
                    .addComponent(jBactualizar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addContainerGap(399, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(174, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBIDEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBIDEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBIDEstudianteActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        this.GrupoBotonesBusqueda.add(this.jRBIDEstudiante);
        if(this.jRBIDEstudiante.isSelected()){atributoID="ID"; mostrarTablaEstudiante(this.jTFBuscador.getText());}
        else{
            JOptionPane.showMessageDialog(null, "Ningun campo seleccionado");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTablaEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaEstudianteMouseClicked
        int fila= this.jTablaEstudiante.getSelectedRow();

        if(fila>=0){

            this.jTFBuscador.setText(this.jTablaEstudiante.getValueAt(fila, 0).toString());
            this.jTFNombreAutor.setText(this.jTablaEstudiante.getValueAt(fila, 1).toString());
            this.jTFIDEstudiante.setText(this.jTablaEstudiante.getValueAt(fila, 0).toString());
            this.jTFIdEstudiante2.setText(this.jTablaEstudiante.getValueAt(fila, 0).toString());
            this.jDCFechaNacimientoAutor.setDateFormatString(this.jTablaEstudiante.getValueAt(fila, 3).toString());

        }else{
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    }//GEN-LAST:event_jTablaEstudianteMouseClicked

    private void jTablaLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaLibroMouseClicked
        int fila= this.jTablaLibro.getSelectedRow();
        
        if(fila>=0){
            this.jTFIdLibro.setText(this.jTablaLibro.getValueAt(fila, 0).toString());
            this.jTFidLibro2.setText(this.jTablaLibro.getValueAt(fila, 0).toString());
            this.jTFTitulo.setText(this.jTablaLibro.getValueAt(fila, 1).toString());
            this.jTFNroCopias.setText(this.jTablaLibro.getValueAt(fila, 2).toString());
            this.jTFIDAutor.setText(this.jTablaLibro.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_jTablaLibroMouseClicked

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            PreparedStatement pps= cn.prepareStatement("INSERT INTO prestamo(IdLibro,IdEstudiante,FechaPrestamo,FechaDevolucion) VALUES (?, ?, ?, ?)");
            pps.setString(1, jTFidLibro2.getText());
            pps.setString(2, jTFIdEstudiante2.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaPrestamo = sdf.format(jDCFechaPrestamo.getDate());
            pps.setString(3, fechaPrestamo);
            String fechaDevolucion = sdf.format(jDCFechaDevolucion.getDate());
            pps.setString(4, fechaDevolucion);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            mostrarTablaPrestamo("");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JFLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        int fila= this.jTBprestamo.getSelectedRow();
        String valor= this.jTBprestamo.getValueAt(fila, 0).toString();
        int respuesta=JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este elemento");
        if(respuesta== JOptionPane.YES_OPTION){
          if(fila>=0){
            
            try {
                PreparedStatement pps= cn.prepareStatement("DELETE FROM prestamo WHERE ID='"+ valor + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dato Eliminado");
                mostrarTablaPrestamo("");

            } catch (SQLException ex) {
                Logger.getLogger(JFLibro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jTBprestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBprestamoMouseClicked
        int fila = jTBprestamo.getSelectedRow();
        if(fila>=0){
            this.jTFidPrestamo.setText(this.jTBprestamo.getValueAt(fila, 0).toString());
            this.jTFidLibro2.setText(this.jTBprestamo.getValueAt(fila, 1).toString());
            this.jTFIdEstudiante2.setText(this.jTBprestamo.getValueAt(fila, 2).toString());
            this.jDCFechaPrestamo.setDateFormatString( this.jTBprestamo.getValueAt(fila, 3).toString());
            this.jDCFechaDevolucion.setDateFormatString(this.jTBprestamo.getValueAt(fila, 4).toString());
        }
    }//GEN-LAST:event_jTBprestamoMouseClicked

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        try {
            PreparedStatement pps= cn.prepareStatement("UPDATE prestamo SET Titulo='"+this.jTFTitulo.getText() +"', Ncopias='"+this.jTFNroCopias.getText()+"' WHERE id='"+ this.jTFIdLibro.getText()+"';");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
            limpiar();
            mostrarTablaLibro("");
        } catch (SQLException ex) {
            Logger.getLogger(JFAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBbuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarLibroActionPerformed
        this.GrupoDeBotonesLibro.add(this.jRBidLibro);
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
            java.util.logging.Logger.getLogger(JFPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotonesBusqueda;
    private javax.swing.ButtonGroup GrupoDeBotonesLibro;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBbuscarLibro;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBlimpiar;
    private com.toedter.calendar.JDateChooser jDCFechaDevolucion;
    private com.toedter.calendar.JDateChooser jDCFechaNacimientoAutor;
    private com.toedter.calendar.JDateChooser jDCFechaPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JRadioButton jRBIDEstudiante;
    private javax.swing.JRadioButton jRBidLibro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTBprestamo;
    private javax.swing.JTextField jTFBuscador;
    private javax.swing.JTextField jTFIDAutor;
    private javax.swing.JTextField jTFIDEstudiante;
    private javax.swing.JTextField jTFIdEstudiante2;
    private javax.swing.JTextField jTFIdLibro;
    private javax.swing.JTextField jTFNombreAutor;
    private javax.swing.JTextField jTFNroCopias;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JTextField jTFbuscarLibro;
    private javax.swing.JTextField jTFidLibro2;
    private javax.swing.JTextField jTFidPrestamo;
    private javax.swing.JTable jTablaEstudiante;
    private javax.swing.JTable jTablaLibro;
    private javax.swing.JLabel label12;
    // End of variables declaration//GEN-END:variables
}
