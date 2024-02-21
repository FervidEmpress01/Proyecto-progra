
package Vista;


import DataBase.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class JFDB extends javax.swing.JFrame {
    ConexionBD cx;
    public JFDB() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(400,400);
        cx=new ConexionBD();
        cx.conexion();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFusuario = new javax.swing.JTextField();
        jBiniciar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jPFcontra = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMIsalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 67, -1, -1));

        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 156, -1, -1));
        getContentPane().add(jTFusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 64, 90, -1));

        jBiniciar.setText("Iniciar");
        jBiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jBiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 80, -1));

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 70, -1));

        jPFcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPFcontraKeyPressed(evt);
            }
        });
        getContentPane().add(jPFcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jMenu1.setText("File");

        jMIsalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMIsalir.setText("Salir");
        jMIsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIsalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMIsalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBiniciarActionPerformed

           try {
            String user = this.jTFusuario.getText();
            String contraseña = String.valueOf(this.jPFcontra.getPassword());
            String query = "SELECT * FROM usuario WHERE usuario=? AND contraseña=?";
            
            try (PreparedStatement pst = cx.conexion().prepareStatement(query)) {
                pst.setString(1, user);
                pst.setString(2, contraseña);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Conexión exitosa");
                    this.setVisible(false);
                    JFOpciones jfop= new JFOpciones();
                    jfop.setVisible(true);                    
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
                    //cx.desconectar();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBiniciarActionPerformed

    private void jMIsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMIsalirActionPerformed

    private void jPFcontraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFcontraKeyPressed

    }//GEN-LAST:event_jPFcontraKeyPressed

   
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
            java.util.logging.Logger.getLogger(JFDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBiniciar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMIsalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPFcontra;
    private javax.swing.JTextField jTFusuario;
    // End of variables declaration//GEN-END:variables
}
