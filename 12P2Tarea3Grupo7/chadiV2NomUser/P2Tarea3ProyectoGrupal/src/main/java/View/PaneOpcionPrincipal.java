
package View;


public class PaneOpcionPrincipal extends javax.swing.JPanel {

  
    public PaneOpcionPrincipal() {
    initComponents();
    
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JAcercaDeNosotros = new javax.swing.JLabel();
        JContacto = new javax.swing.JLabel();
        JLFondo = new javax.swing.JLabel();

        setForeground(new java.awt.Color(20, 20, 20));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JAcercaDeNosotros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acercaDeNosotro.png"))); // NOI18N
        JAcercaDeNosotros.setToolTipText("<html>\n<head>\n<style>\n#contenido {\n  background: #fff;\n  color: #000;\n  padding: 15px;\n}\n</style>\n</head>\n<body>\n\n<div id=\"contenido\">\n  <p>¡Hola! Somos estudiantes de 2do semestre de la carrera,</p>\n  <p>Ingeniería en Tecnologías de la Información. Estamos en el</p>\n  <p>curso de Programación Orientada a Objetos. Esta es una app</p>\n  <p>desarrollada para la gestión de cine. Somos el grupo número</p>\n  <p>7, conformado por Lara Anderson, Shadia Reyes y Jhonny Romero.</p>\n</div>\n\n</body>\n</html>");
        add(JAcercaDeNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        JContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contactos.png"))); // NOI18N
        JContacto.setToolTipText("<html>\n<head>\n<style>\n#contenido {\n  background: #fff;\n  color: #000;\n  padding: 15px;\n}\n</style>\n</head>\n<body>\n\n<div id=\"contenido\">\n  <p>Jhonny Joel Romero Lopez</p>\n  <p>+593997173609</p>\n  <p>jjromero5@espe.edu.ec</p>\n  <p>Santo Domingo Ecuador</p>\n  <hr> <!-- Línea divisoria -->\n\n  <p>SHADYA NICOLE REYES ZAMBRANO</p>\n  <p>+593994993546</p>\n  <p>snreyes2@espe.edu.ec</p>\n  <p>Santo Domingo Ecuador</p>\n  <hr> <!-- Línea divisoria -->\n\n  <p>ANDERSON LENIN LARA CHICAIZA</p>\n  <p>+593998779907</p>\n  <p>allara1@espe.edu.ec</p>\n  <p>Santo Domingo Ecuador</p>\n</div>\n\n</body>\n</html>");
        add(JContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        JLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo_Caretelera.png"))); // NOI18N
        add(JLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JAcercaDeNosotros;
    private javax.swing.JLabel JContacto;
    private javax.swing.JLabel JLFondo;
    // End of variables declaration//GEN-END:variables
}
