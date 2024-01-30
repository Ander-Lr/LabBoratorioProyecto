
package View;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class PaneOpcionPrincipal extends javax.swing.JPanel implements Runnable{
    
    String hora,minutos,segundos,ampm;
    Calendar calendario;
    Thread h1;
    
    public PaneOpcionPrincipal() {
    initComponents();
    h1 =new Thread(this);
    h1.start();
    
    
        setVisible(true);
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JAcercaDeNosotros = new javax.swing.JLabel();
        JContacto = new javax.swing.JLabel();
        lbReloj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JLFondo = new javax.swing.JLabel();

        setForeground(new java.awt.Color(20, 20, 20));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JAcercaDeNosotros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acercaDeNosotro.png"))); // NOI18N
        JAcercaDeNosotros.setToolTipText("<html>\n<head>\n<style>\n#contenido {\n  background: #fff;\n  color: #000;\n  padding: 15px;\n}\n</style>\n</head>\n<body>\n\n<div id=\"contenido\">\n  <p>¡Hola! Somos estudiantes de 2do semestre de la carrera,</p>\n  <p>Ingeniería en Tecnologías de la Información. Estamos en el</p>\n  <p>curso de Programación Orientada a Objetos. Esta es una app</p>\n  <p>desarrollada para la gestión de cine. Somos el grupo número</p>\n  <p>7, conformado por Lara Anderson, Shadia Reyes y Jhonny Romero.</p>\n</div>\n\n</body>\n</html>");
        add(JAcercaDeNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        JContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contactos.png"))); // NOI18N
        JContacto.setToolTipText("<html>\n<head>\n<style>\n#contenido {\n  background: #fff;\n  color: #000;\n  padding: 15px;\n}\n</style>\n</head>\n<body>\n\n<div id=\"contenido\">\n  <p>Jhonny Joel Romero Lopez</p>\n  <p>+593997173609</p>\n  <p>jjromero5@espe.edu.ec</p>\n  <p>Santo Domingo Ecuador</p>\n  <hr> <!-- Línea divisoria -->\n\n  <p>SHADYA NICOLE REYES ZAMBRANO</p>\n  <p>+593994993546</p>\n  <p>snreyes2@espe.edu.ec</p>\n  <p>Santo Domingo Ecuador</p>\n  <hr> <!-- Línea divisoria -->\n\n  <p>ANDERSON LENIN LARA CHICAIZA</p>\n  <p>+593998779907</p>\n  <p>allara1@espe.edu.ec</p>\n  <p>Santo Domingo Ecuador</p>\n</div>\n\n</body>\n</html>");
        add(JContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        lbReloj.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        lbReloj.setForeground(new java.awt.Color(255, 255, 255));
        add(lbReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Estreno2 (1).gif"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(801, 236));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 800, 236));

        JLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo_Caretelera.png"))); // NOI18N
        add(JLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JAcercaDeNosotros;
    private javax.swing.JLabel JContacto;
    private javax.swing.JLabel JLFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbReloj;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
        Thread ct=Thread.currentThread();
        while(ct==h1){
            calcular();
            lbReloj.setText(hora+":"+minutos+":"+segundos+":"+ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            
        }
    }

    private void calcular() {
        Calendar calendario =new GregorianCalendar();
        Date fechaHoraActual =new Date();
        
        calendario.setTime(fechaHoraActual);
        ampm=calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if (ampm.equals("PM")){
           int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
           hora =h>9?""+h:"0"+h;
        }
           else{
                hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+
                        calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
               }
               minutos=calendario.get(Calendar.MINUTE)
                       >9?""+calendario.get(Calendar.MINUTE):"0"+calendario
                       .get(Calendar.MINUTE);
                  segundos=calendario.get(Calendar.SECOND)
                       >9?""+calendario.get(Calendar.SECOND):"0"+calendario
                       .get(Calendar.SECOND);     
         
                       }             

    

   
        }   
    
    

