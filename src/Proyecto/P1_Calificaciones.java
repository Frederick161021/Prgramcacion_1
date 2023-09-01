package Proyecto;
import Parcial_1.*;
import java.awt.Toolkit;


public class P1_Calificaciones extends javax.swing.JFrame {

    static P1Proyecto P1 = new P1Proyecto();
    
    public P1_Calificaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        TrasparenciaBoton();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Icon.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDatos = new javax.swing.JLabel();
        jButtonSalida = new javax.swing.JButton();
        jLabelRegresar = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabelLimpiar = new javax.swing.JLabel();
        JButtonLImpiar = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jLabelCalificacion1 = new javax.swing.JLabel();
        jTextFieldCalificacion1 = new javax.swing.JTextField();
        jLabelCalificacion2 = new javax.swing.JLabel();
        jTextFieldCalificacion2 = new javax.swing.JTextField();
        jLabelCalificacion3 = new javax.swing.JLabel();
        jTextFieldCalificacion3 = new javax.swing.JTextField();
        jLabelCalificacion4 = new javax.swing.JLabel();
        jTextFieldCalificacion4 = new javax.swing.JTextField();
        jLabelCalificacion5 = new javax.swing.JLabel();
        jTextFieldCalificacion5 = new javax.swing.JTextField();
        jButtonInicio = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDatos.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jLabelDatos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDatos.setText("Datos:");
        getContentPane().add(jLabelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButtonSalida.setBackground(new java.awt.Color(204, 0, 51));
        jButtonSalida.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jButtonSalida.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalida.setText("X");
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabelRegresar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabelRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegresar.setText("Regresar");
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Back.png"))); // NOI18N
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 142, -1, -1));

        jLabelLimpiar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabelLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLimpiar.setText("Limpiar");
        getContentPane().add(jLabelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        JButtonLImpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        JButtonLImpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLImpiarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonLImpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 80, -1));

        jLabelResultado.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResultado.setText("Calculo:");
        getContentPane().add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabelCalificacion1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCalificacion1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCalificacion1.setText("Calificación 1:");
        getContentPane().add(jLabelCalificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jTextFieldCalificacion1.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldCalificacion1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldCalificacion1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldCalificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 90, -1));

        jLabelCalificacion2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCalificacion2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCalificacion2.setText("Calificación 2:");
        getContentPane().add(jLabelCalificacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jTextFieldCalificacion2.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldCalificacion2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldCalificacion2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldCalificacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 90, -1));

        jLabelCalificacion3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCalificacion3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCalificacion3.setText("Calificación 3:");
        getContentPane().add(jLabelCalificacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jTextFieldCalificacion3.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldCalificacion3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldCalificacion3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldCalificacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 90, -1));

        jLabelCalificacion4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCalificacion4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCalificacion4.setText("Calificación 4:");
        getContentPane().add(jLabelCalificacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jTextFieldCalificacion4.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldCalificacion4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldCalificacion4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldCalificacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 90, -1));

        jLabelCalificacion5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelCalificacion5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCalificacion5.setText("Calificación 5:");
        getContentPane().add(jLabelCalificacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jTextFieldCalificacion5.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldCalificacion5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldCalificacion5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldCalificacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 90, -1));

        jButtonInicio.setBackground(new java.awt.Color(51, 102, 255));
        jButtonInicio.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setText("Iniciar Programa");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabelFondo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelFondo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iPhone_png by Kyle Gray.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 728, 210));

        JTA.setBackground(new java.awt.Color(0, 102, 102));
        JTA.setColumns(20);
        JTA.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JTA.setForeground(new java.awt.Color(255, 255, 255));
        JTA.setRows(5);
        jScrollPane1.setViewportView(JTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 728, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void   TrasparenciaBoton(){
        jButtonBack.setOpaque(false);
        jButtonBack.setContentAreaFilled(false);
        jButtonBack.setBorderPainted(false);
        
        JButtonLImpiar.setOpaque(false);
        JButtonLImpiar.setContentAreaFilled(false);
        JButtonLImpiar.setBorderPainted(false);
    }
    
    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalidaActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.setVisible(false);
        PantallaMenuParcial1 PMP1 = new PantallaMenuParcial1();
        PMP1.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void JButtonLImpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLImpiarActionPerformed
        String salida=""+"Calculo:";
        JTA.setText(salida);
        jTextFieldCalificacion1.setText("");
        jTextFieldCalificacion2.setText("");
        jTextFieldCalificacion3.setText("");
        jTextFieldCalificacion4.setText("");
        jTextFieldCalificacion5.setText("");
    }//GEN-LAST:event_JButtonLImpiarActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        int Calificacion1=Integer.parseInt(jTextFieldCalificacion1.getText());
        int Calificacion2=Integer.parseInt(jTextFieldCalificacion2.getText());
        int Calificacion3=Integer.parseInt(jTextFieldCalificacion3.getText());
        int Calificacion4=Integer.parseInt(jTextFieldCalificacion4.getText());
        int Calificacion5=Integer.parseInt(jTextFieldCalificacion5.getText());
        String salida="";
        salida+=P1.calificaciones(Calificacion1, Calificacion2, Calificacion3, Calificacion4, Calificacion5);
        JTA.setText(salida);
    }//GEN-LAST:event_jButtonInicioActionPerformed

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
            java.util.logging.Logger.getLogger(P1_Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P1_Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P1_Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P1_Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P1_Calificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonLImpiar;
    private javax.swing.JTextArea JTA;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JLabel jLabelCalificacion1;
    private javax.swing.JLabel jLabelCalificacion2;
    private javax.swing.JLabel jLabelCalificacion3;
    private javax.swing.JLabel jLabelCalificacion4;
    private javax.swing.JLabel jLabelCalificacion5;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCalificacion1;
    private javax.swing.JTextField jTextFieldCalificacion2;
    private javax.swing.JTextField jTextFieldCalificacion3;
    private javax.swing.JTextField jTextFieldCalificacion4;
    private javax.swing.JTextField jTextFieldCalificacion5;
    // End of variables declaration//GEN-END:variables
}
