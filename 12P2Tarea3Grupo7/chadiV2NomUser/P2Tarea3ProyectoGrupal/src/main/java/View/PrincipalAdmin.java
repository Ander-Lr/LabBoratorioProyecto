package View;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PrincipalAdmin extends javax.swing.JFrame {

    public PrincipalAdmin() {        
        initComponents();
        PaneOpcionPrincipal OpcionPrincipal = new PaneOpcionPrincipal();
        ActivarBoton(OpcionPrincipal);
        setLocationRelativeTo(null);
    }
    private void ActivarBoton(JPanel panel){
        panel.setSize(890,600);
        panel.setLocation(0,0);
        
        JPFondoPrincipal.removeAll();
        JPFondoPrincipal.add(panel, BorderLayout.CENTER);
        JPFondoPrincipal.revalidate();
        JPFondoPrincipal.repaint();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LPBase = new javax.swing.JPanel();
        JLOpsalir = new javax.swing.JLabel();
        JLOpHome = new javax.swing.JLabel();
        JLOpCartelera = new javax.swing.JLabel();
        JLCarrito = new javax.swing.JLabel();
        JLBarraMenu = new javax.swing.JLabel();
        JPFondoPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LPBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLOpsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLOpsalirMouseClicked(evt);
            }
        });
        LPBase.add(JLOpsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 40, 30));

        JLOpHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLOpHomeMouseClicked(evt);
            }
        });
        LPBase.add(JLOpHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 40, 40));

        JLOpCartelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLOpCarteleraMouseClicked(evt);
            }
        });
        LPBase.add(JLOpCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 40, 30));

        JLCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLCarritoMouseClicked(evt);
            }
        });
        LPBase.add(JLCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 40, 30));

        JLBarraMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo_Principal.png"))); // NOI18N
        LPBase.add(JLBarraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        getContentPane().add(LPBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 600));

        javax.swing.GroupLayout JPFondoPrincipalLayout = new javax.swing.GroupLayout(JPFondoPrincipal);
        JPFondoPrincipal.setLayout(JPFondoPrincipalLayout);
        JPFondoPrincipalLayout.setHorizontalGroup(
            JPFondoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        JPFondoPrincipalLayout.setVerticalGroup(
            JPFondoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(JPFondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 890, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLOpHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpHomeMouseClicked
        PaneOpcionPrincipal OpcionPrincipal = new PaneOpcionPrincipal();
        ActivarBoton(OpcionPrincipal);
    }//GEN-LAST:event_JLOpHomeMouseClicked

    private void JLOpsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpsalirMouseClicked
        dispose();
    }//GEN-LAST:event_JLOpsalirMouseClicked

    private void JLOpCarteleraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLOpCarteleraMouseClicked
        PaneOpcionCartelera OpcionCartelera = new PaneOpcionCartelera();
        ActivarBoton(OpcionCartelera);
    }//GEN-LAST:event_JLOpCarteleraMouseClicked

    private void JLCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCarritoMouseClicked
        PaneOpcionCarrito carrito = new PaneOpcionCarrito();
        ActivarBoton(carrito);
    }//GEN-LAST:event_JLCarritoMouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLBarraMenu;
    private javax.swing.JLabel JLCarrito;
    private javax.swing.JLabel JLOpCartelera;
    private javax.swing.JLabel JLOpHome;
    private javax.swing.JLabel JLOpsalir;
    private javax.swing.JPanel JPFondoPrincipal;
    private javax.swing.JPanel LPBase;
    // End of variables declaration//GEN-END:variables
}
