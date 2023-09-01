package Proyecto;
import Parcial_1.*;
import java.awt.Toolkit;

public class P1_ValidacionFecha extends javax.swing.JFrame {

    static P1Proyecto P1 = new P1Proyecto();
    
    public P1_ValidacionFecha() {
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
        jLabelDia = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jLabelMes = new javax.swing.JLabel();
        jTextFieldMes = new javax.swing.JTextField();
        jLabelAño = new javax.swing.JLabel();
        jTextFieldAño = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
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

        jLabelDia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelDia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDia.setText("Día:");
        getContentPane().add(jLabelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 20));

        jTextFieldDia.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldDia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldDia.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 90, -1));

        jLabelMes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelMes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMes.setText("Mes:");
        getContentPane().add(jLabelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jTextFieldMes.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldMes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldMes.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 90, -1));

        jLabelAño.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelAño.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAño.setText("Año:");
        getContentPane().add(jLabelAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jTextFieldAño.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldAño.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldAño.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 90, -1));

        jLabelResultado.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResultado.setText("Calculo:");
        getContentPane().add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jButtonInicio.setBackground(new java.awt.Color(51, 102, 255));
        jButtonInicio.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setText("Iniciar Programa");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

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
        jTextFieldDia.setText("");
        jTextFieldMes.setText("");
        jTextFieldAño.setText("");
    }//GEN-LAST:event_JButtonLImpiarActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        int dia=Integer.parseInt(jTextFieldDia.getText());
        int mes=Integer.parseInt(jTextFieldMes.getText());
        int año=Integer.parseInt(jTextFieldAño.getText());
        String salida="";
        salida+=P1.validacionFecha(dia,mes,año);
        JTA.setText(salida);
    }//GEN-LAST:event_jButtonInicioActionPerformed

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
            java.util.logging.Logger.getLogger(P1_ValidacionFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P1_ValidacionFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P1_ValidacionFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P1_ValidacionFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P1_ValidacionFecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonLImpiar;
    private javax.swing.JTextArea JTA;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JLabel jLabelAño;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAño;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldMes;
    // End of variables declaration//GEN-END:variables
}
