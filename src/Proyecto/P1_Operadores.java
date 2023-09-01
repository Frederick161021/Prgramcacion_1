package Proyecto;
import Parcial_1.*;
import java.awt.Toolkit;

public class P1_Operadores extends javax.swing.JFrame {

    static P1Proyecto P1 = new P1Proyecto();
    
    public P1_Operadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        TrasparenciaBoton();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalida = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabelRegresar = new javax.swing.JLabel();
        JButtonLImpiar = new javax.swing.JButton();
        jLabelLimpiar = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jLabelDatos = new javax.swing.JLabel();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jLabelNumero1 = new javax.swing.JLabel();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jLabelNumero2 = new javax.swing.JLabel();
        jButtonSuma = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonMultiplicacion = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonModulo = new javax.swing.JButton();
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
        jLabelResultado.setText("Calculo:");
        getContentPane().add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabelDatos.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jLabelDatos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDatos.setText("Datos:");
        getContentPane().add(jLabelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextFieldNumero1.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldNumero1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextFieldNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 110, -1));

        jLabelNumero1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNumero1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero1.setText("Numero 1:");
        getContentPane().add(jLabelNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jTextFieldNumero2.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldNumero2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldNumero2.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 110, -1));

        jLabelNumero2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNumero2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero2.setText("Numero 2:");
        getContentPane().add(jLabelNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jButtonSuma.setBackground(new java.awt.Color(51, 102, 255));
        jButtonSuma.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonSuma.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSuma.setText("Suma");
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jButtonResta.setBackground(new java.awt.Color(255, 102, 0));
        jButtonResta.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonResta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonResta.setText("Resta");
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jButtonMultiplicacion.setBackground(new java.awt.Color(0, 204, 51));
        jButtonMultiplicacion.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMultiplicacion.setText("Multiplicación");
        jButtonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jButtonDivision.setBackground(new java.awt.Color(102, 0, 102));
        jButtonDivision.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonDivision.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDivision.setText("División");
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jButtonModulo.setBackground(new java.awt.Color(102, 102, 255));
        jButtonModulo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonModulo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModulo.setText("Modulo");
        jButtonModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModuloActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

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
        jTextFieldNumero1.setText("");
        jTextFieldNumero2.setText("");
    }//GEN-LAST:event_JButtonLImpiarActionPerformed

    private void jTextFieldNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero2ActionPerformed

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        int num1 = Integer.parseInt(jTextFieldNumero1.getText());
        int num2 = Integer.parseInt(jTextFieldNumero2.getText());
        int opcion=1;
        String salida="";
        salida = P1.Operadores(opcion,num1, num2);
        JTA.setText(salida);
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        int num1 = Integer.parseInt(jTextFieldNumero1.getText());
        int num2 = Integer.parseInt(jTextFieldNumero2.getText());
        int opcion=2;
        String salida="";
        salida = P1.Operadores(opcion,num1, num2);
        JTA.setText(salida);
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButtonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacionActionPerformed
        int num1 = Integer.parseInt(jTextFieldNumero1.getText());
        int num2 = Integer.parseInt(jTextFieldNumero2.getText());
        int opcion=3;
        String salida="";
        salida += P1.Operadores(opcion,num1, num2);
        JTA.setText(salida);
    }//GEN-LAST:event_jButtonMultiplicacionActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        int num1 = Integer.parseInt(jTextFieldNumero1.getText());
        int num2 = Integer.parseInt(jTextFieldNumero2.getText());
        int opcion=4;
        String salida="";
        salida += P1.Operadores(opcion,num1, num2);
        JTA.setText(salida);
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModuloActionPerformed
        int num1 = Integer.parseInt(jTextFieldNumero1.getText());
        int num2 = Integer.parseInt(jTextFieldNumero2.getText());
        int opcion=5;
        String salida="";
        salida += P1.Operadores(opcion,num1, num2);
        JTA.setText(salida);
    }//GEN-LAST:event_jButtonModuloActionPerformed

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
            java.util.logging.Logger.getLogger(P1_Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P1_Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P1_Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P1_Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P1_Operadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonLImpiar;
    private javax.swing.JTextArea JTA;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonModulo;
    private javax.swing.JButton jButtonMultiplicacion;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelNumero2;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    // End of variables declaration//GEN-END:variables
}
