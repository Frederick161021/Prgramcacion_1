package Proyecto;
import Parcial_1.*;
import java.awt.Toolkit;

public class P1_NumerosRomanos extends javax.swing.JFrame {

    static P1Proyecto P1 = new P1Proyecto();
    
    public P1_NumerosRomanos() {
        initComponents();
        this.setLocationRelativeTo(null);
        TrasparenciaBoton();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalida = new javax.swing.JButton();
        jLabelDatos = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabelRegresar = new javax.swing.JLabel();
        JButtonLImpiar = new javax.swing.JButton();
        jLabelLimpiar = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jLabelAñoNacio = new javax.swing.JLabel();
        jLabelAñoNacio1 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jButtonInico = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabelDatos.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jLabelDatos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDatos.setText("Datos:");
        getContentPane().add(jLabelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Back.png"))); // NOI18N
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 142, -1, -1));

        jLabelRegresar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabelRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegresar.setText("Regresar");
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        JButtonLImpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        JButtonLImpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLImpiarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonLImpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 80, -1));

        jLabelLimpiar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabelLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLimpiar.setText("Limpiar");
        getContentPane().add(jLabelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        jLabelResultado.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResultado.setText("Conversión a numeros romanos:");
        getContentPane().add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabelAñoNacio.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelAñoNacio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAñoNacio.setText("Digite un Numero del 1 al 100:");
        getContentPane().add(jLabelAñoNacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabelAñoNacio1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelAñoNacio1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAñoNacio1.setText("Numero:");
        getContentPane().add(jLabelAñoNacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jTextFieldCantidad.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldCantidad.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 104, 120, 30));

        jButtonInico.setBackground(new java.awt.Color(51, 102, 255));
        jButtonInico.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonInico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInico.setText("Iniciar Programa");
        jButtonInico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 210, 50));

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

    public void TrasparenciaBoton(){
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
        jTextFieldCantidad.setText("");
    }//GEN-LAST:event_JButtonLImpiarActionPerformed

    private void jButtonInicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicoActionPerformed
        int cantidad = Integer.parseInt(jTextFieldCantidad.getText());
        String salida="";

        salida+= P1.NumerosRomanos(cantidad);
        JTA.setText(salida);
    }//GEN-LAST:event_jButtonInicoActionPerformed

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
            java.util.logging.Logger.getLogger(P1_NumerosRomanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P1_NumerosRomanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P1_NumerosRomanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P1_NumerosRomanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P1_NumerosRomanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonLImpiar;
    private javax.swing.JTextArea JTA;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonInico;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JLabel jLabelAñoNacio;
    private javax.swing.JLabel jLabelAñoNacio1;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCantidad;
    // End of variables declaration//GEN-END:variables
}
