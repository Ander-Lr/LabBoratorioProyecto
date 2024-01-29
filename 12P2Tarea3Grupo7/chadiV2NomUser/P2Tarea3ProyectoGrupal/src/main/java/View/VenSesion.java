
package View;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VenSesion extends javax.swing.JFrame {

    /**
     * Creates new form VenPrincipal
     */
    public VenSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        InicializarTextField();
        JLDecSalir.setText("SALIR");
       
       
    }
    private void InicializarTextField(){
        TextUsuario.setText("");
        JLPClave.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLOpRegistrece = new javax.swing.JLabel();
        JLDecRegistrar = new javax.swing.JLabel();
        JLIniciar = new javax.swing.JLabel();
        JLOpIniciar = new javax.swing.JLabel();
        JLOpSalir = new javax.swing.JLabel();
        JLDecSalir = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        JLPClave = new javax.swing.JPasswordField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLOpRegistrece.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLOpRegistreceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLOpRegistreceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLOpRegistreceMouseExited(evt);
            }
        });
        getContentPane().add(JLOpRegistrece, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 150, 20));

        JLDecRegistrar.setFont(new java.awt.Font("Calibri", 2, 16)); // NOI18N
        JLDecRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        JLDecRegistrar.setText("REGISTRARSE AQUI");
        JLDecRegistrar.setAlignmentY(0.0F);
        JLDecRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLDecRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLDecRegistrarMouseEntered(evt);
            }
        });
        getContentPane().add(JLDecRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 130, 20));

        JLIniciar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        JLIniciar.setForeground(new java.awt.Color(255, 255, 255));
        JLIniciar.setText("INICIAR");
        getContentPane().add(JLIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 80, 40));

        JLOpIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLOpIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLOpIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLOpIniciarMouseExited(evt);
            }
        });
        getContentPane().add(JLOpIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 130, 40));

        JLOpSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLOpSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLOpSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLOpSalirMouseExited(evt);
            }
        });
        getContentPane().add(JLOpSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 40));

        JLDecSalir.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        JLDecSalir.setForeground(new java.awt.Color(255, 255, 255));
        JLDecSalir.setText("SALIR");
        JLDecSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLDecSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLDecSalirMouseExited(evt);
            }
        });
        getContentPane().add(JLDecSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        TextUsuario.setBackground(new java.awt.Color(227, 227, 227));
        TextUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TextUsuario.setBorder(null);
        TextUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextUsuarioMouseExited(evt);
            }
        });
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 167, 160, 20));

        JLPClave.setBackground(new java.awt.Color(225, 219, 219));
        JLPClave.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        JLPClave.setBorder(null);
        JLPClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLPClaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLPClaveMouseExited(evt);
            }
        });
        getContentPane().add(JLPClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 237, 160, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ISesion.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLOpSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpSalirMouseClicked
        dispose();
    }//GEN-LAST:event_JLOpSalirMouseClicked

    private void JLOpIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpIniciarMouseClicked
        String Usuario = "Admin";
        String Contrasenia="Admin";
        String Clave= JLPClave.getText();
        if(TextUsuario.getText().equals(Usuario)&&Clave.equals(Contrasenia)){
            JOptionPane.showMessageDialog(this, "CORRECTO");
        }else{
            JOptionPane.showMessageDialog(this, "Usuario y contraseña incorrecta");
            TextUsuario.setText("");
            JLPClave.setText("");
        }
    }//GEN-LAST:event_JLOpIniciarMouseClicked

    private void JLOpRegistreceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpRegistreceMouseClicked
        VenRegistro regis = new VenRegistro();
        regis.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(this, "PASANDO A REGISTRARTE...");
    }//GEN-LAST:event_JLOpRegistreceMouseClicked

    private void TextUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextUsuarioMouseEntered
        //TextUsuario.setBackground(Color.white);
    }//GEN-LAST:event_TextUsuarioMouseEntered

    private void TextUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextUsuarioMouseExited
       TextUsuario.setBackground(new Color(227,227,227)); 
    }//GEN-LAST:event_TextUsuarioMouseExited

    private void JLPClaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLPClaveMouseEntered
        //JLPClave.setBackground(Color.white);
    }//GEN-LAST:event_JLPClaveMouseEntered

    private void JLPClaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLPClaveMouseExited
        JLPClave.setBackground(new Color(227,227,227)); 
    }//GEN-LAST:event_JLPClaveMouseExited

    private void JLOpSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpSalirMouseEntered
        JLDecSalir.setFont(new Font("Calibri", Font.BOLD, 20));
    }//GEN-LAST:event_JLOpSalirMouseEntered

    private void JLDecSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLDecSalirMouseExited

    }//GEN-LAST:event_JLDecSalirMouseExited

    private void JLDecSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLDecSalirMouseEntered
      
    }//GEN-LAST:event_JLDecSalirMouseEntered

    private void JLOpSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpSalirMouseExited
         JLDecSalir.setFont(new Font("Calibri", Font.PLAIN, 20));
    }//GEN-LAST:event_JLOpSalirMouseExited

    private void JLOpIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpIniciarMouseEntered
        JLIniciar.setFont(new Font("Calibri", Font.BOLD, 18));
    }//GEN-LAST:event_JLOpIniciarMouseEntered

    private void JLOpIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpIniciarMouseExited
        JLIniciar.setFont(new Font("Calibri", Font.PLAIN, 18));
    }//GEN-LAST:event_JLOpIniciarMouseExited

    private void JLOpRegistreceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpRegistreceMouseEntered
       JLDecRegistrar.setFont(new Font("Calibri",Font.BOLD + Font.ITALIC , 16));
    }//GEN-LAST:event_JLOpRegistreceMouseEntered

    private void JLOpRegistreceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpRegistreceMouseExited
        JLDecRegistrar.setFont(new Font("Calibri", Font.ITALIC, 16));
    }//GEN-LAST:event_JLOpRegistreceMouseExited

    private void JLDecRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLDecRegistrarMouseEntered
      
    }//GEN-LAST:event_JLDecRegistrarMouseEntered

    private void JLDecRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLDecRegistrarMouseClicked

    }//GEN-LAST:event_JLDecRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(VenSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenPrincipal().setVisible(true);
            }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenPrincipal().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel JLDecRegistrar;
    private javax.swing.JLabel JLDecSalir;
    private javax.swing.JLabel JLIniciar;
    private javax.swing.JLabel JLOpIniciar;
    private javax.swing.JLabel JLOpRegistrece;
    private javax.swing.JLabel JLOpSalir;
    private javax.swing.JPasswordField JLPClave;
    private javax.swing.JTextField TextUsuario;
    // End of variables declaration//GEN-END:variables
}
