package Proyecto;
import Parcial_1.*;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class P1_DiasMeses extends javax.swing.JFrame {

    static P1Proyecto P1 = new P1Proyecto();
    
    public P1_DiasMeses() {
        initComponents();
        this.setLocationRelativeTo(null);
        TrasparenciaBoton();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Icon.png")));        
    }

    public void   TrasparenciaBoton(){
        jButtonBack.setOpaque(false);
        jButtonBack.setContentAreaFilled(false);
        jButtonBack.setBorderPainted(false);
        
        JButtonLImpiar.setOpaque(false);
        JButtonLImpiar.setContentAreaFilled(false);
        JButtonLImpiar.setBorderPainted(false);
    }
    
    public String[] MesFinal(String mesInicial){
        String[] mesFinal = new String[13];
       
        if (mesInicial.equalsIgnoreCase("Enero")){
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Enero";
            mesFinal[2]="Febrero";
            mesFinal[3]="Marzo";
            mesFinal[4]="Abril";
            mesFinal[5]="Mayo";
            mesFinal[6]="Junio";
            mesFinal[7]="Julio";
            mesFinal[8]="Agosto";
            mesFinal[9]="Septiembre";
            mesFinal[10]="Octubre";
            mesFinal[11]="Noviembre";
            mesFinal[12]="Diciembre";
        }
        
        if (mesInicial.equalsIgnoreCase("Febrero")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Febrero";
            mesFinal[2]="Marzo";
            mesFinal[3]="Abril";
            mesFinal[4]="Mayo";
            mesFinal[5]="Junio";
            mesFinal[6]="Julio";
            mesFinal[7]="Agosto";
            mesFinal[8]="Septiembre";
            mesFinal[9]="Octubre";
            mesFinal[10]="Noviembre";
            mesFinal[11]="Diciembre";
        }
        
        if (mesInicial.equalsIgnoreCase("Marzo")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Marzo";
            mesFinal[2]="Abril";
            mesFinal[3]="Mayo";
            mesFinal[4]="Junio";
            mesFinal[5]="Julio";
            mesFinal[6]="Agosto";
            mesFinal[7]="Septiembre";
            mesFinal[8]="Octubre";
            mesFinal[9]="Noviembre";
            mesFinal[10]="Diciembre";
        }  
        
        if (mesInicial.equalsIgnoreCase("Abril")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Abril";
            mesFinal[2]="Mayo";
            mesFinal[3]="Junio";
            mesFinal[4]="Julio";
            mesFinal[5]="Agosto";
            mesFinal[6]="Septiembre";
            mesFinal[7]="Octubre";
            mesFinal[8]="Noviembre";
            mesFinal[9]="Diciembre";
        }   
        
         if (mesInicial.equalsIgnoreCase("Mayo")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Mayo";
            mesFinal[2]="Junio";
            mesFinal[3]="Julio";
            mesFinal[4]="Agosto";
            mesFinal[5]="Septiembre";
            mesFinal[6]="Octubre";
            mesFinal[7]="Noviembre";
            mesFinal[8]="Diciembre";
        }

         if (mesInicial.equalsIgnoreCase("Junio")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Junio";
            mesFinal[2]="Julio";
            mesFinal[3]="Agosto";
            mesFinal[4]="Septiembre";
            mesFinal[5]="Octubre";
            mesFinal[6]="Noviembre";
            mesFinal[7]="Diciembre";
        }         
       
         if (mesInicial.equalsIgnoreCase("Julio")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Julio";
            mesFinal[2]="Agosto";
            mesFinal[3]="Septiembre";
            mesFinal[4]="Octubre";
            mesFinal[5]="Noviembre";
            mesFinal[6]="Diciembre";
        }  

         if (mesInicial.equalsIgnoreCase("Agosto")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Agosto";
            mesFinal[2]="Septiembre";
            mesFinal[3]="Octubre";
            mesFinal[4]="Noviembre";
            mesFinal[5]="Diciembre";
        }
         
         if (mesInicial.equalsIgnoreCase("Septiembre")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Septiembre";
            mesFinal[2]="Octubre";
            mesFinal[3]="Noviembre";
            mesFinal[4]="Diciembre";
        } 
         
         if (mesInicial.equalsIgnoreCase("Octubre")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Octubre";
            mesFinal[2]="Noviembre";
            mesFinal[3]="Diciembre";
        }  
         
        if (mesInicial.equalsIgnoreCase("Noviembre")){
            
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Noviembre";
            mesFinal[2]="Diciembre";
        }          
         
        if (mesInicial.equalsIgnoreCase("Diciembre")){  
            mesFinal[0]="Seleccione un Mes";
            mesFinal[1]="Diciembre";
        }            
        
        return mesFinal;
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIndicaciones = new javax.swing.JLabel();
        jLabelDatos = new javax.swing.JLabel();
        jLabelLimpiar = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jButtonInico = new javax.swing.JButton();
        jComboBoxMesInicial = new javax.swing.JComboBox<>();
        jComboBoxMesFinal = new javax.swing.JComboBox<>();
        JButtonLImpiar = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonSalida = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIndicaciones.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelIndicaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIndicaciones.setText("Calculo de Días entre los Meses");
        getContentPane().add(jLabelIndicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabelDatos.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jLabelDatos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDatos.setText("Datos:");
        getContentPane().add(jLabelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelLimpiar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabelLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLimpiar.setText("Limpiar");
        getContentPane().add(jLabelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jLabelResultado.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResultado.setText("Calculo:");
        getContentPane().add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabelRegresar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabelRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegresar.setText("Regresar");
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jButtonInico.setBackground(new java.awt.Color(51, 102, 255));
        jButtonInico.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonInico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInico.setText("Iniciar Programa");
        jButtonInico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInico, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 210, 50));

        jComboBoxMesInicial.setBackground(new java.awt.Color(153, 255, 255));
        jComboBoxMesInicial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBoxMesInicial.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxMesInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre ", "Noviembre", "Diciembre" }));
        jComboBoxMesInicial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMesInicialItemStateChanged(evt);
            }
        });
        jComboBoxMesInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMesInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 190, -1));

        jComboBoxMesFinal.setBackground(new java.awt.Color(153, 255, 255));
        jComboBoxMesFinal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBoxMesFinal.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxMesFinal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMesFinalItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxMesFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 190, -1));

        JButtonLImpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        JButtonLImpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLImpiarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonLImpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 80, -1));

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Back.png"))); // NOI18N
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 142, -1, -1));

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

    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalidaActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.setVisible(false);
        PantallaMenuParcial1 PMP1 = new PantallaMenuParcial1();
        PMP1.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jComboBoxMesInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesInicialActionPerformed

    private void jComboBoxMesFinalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMesFinalItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesFinalItemStateChanged

    private void jComboBoxMesInicialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMesInicialItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
            if(this.jComboBoxMesInicial.getSelectedIndex()>0){
                this.jComboBoxMesFinal.setModel(new DefaultComboBoxModel(this.MesFinal(this.jComboBoxMesInicial.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_jComboBoxMesInicialItemStateChanged

    private void JButtonLImpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLImpiarActionPerformed
        String salida=""+"Calculo:";
        JTA.setText(salida);
    }//GEN-LAST:event_JButtonLImpiarActionPerformed

    private void jButtonInicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicoActionPerformed
        String mI = jComboBoxMesInicial.getSelectedItem().toString();
        String mF = jComboBoxMesFinal.getSelectedItem().toString();
        
        int mesInicial=0, mesFinal=0;
        
        boolean IEnero=mI.equals("Enero");
        boolean IFebrero=mI.equals("Febrero");
        boolean IMarzo=mI.equals("Marzo");
        boolean IAbril=mI.equals("Abril");
        boolean IMayo=mI.equals("Mayo");
        boolean IJunio=mI.equals("Junio");
        boolean IJulio=mI.equals("Julio");
        boolean IAgosto=mI.equals("Agosto");
        boolean ISeptiembre=mI.equals("Septiembre");
        boolean IOctubre=mI.equals("Octubre");
        boolean INoviembre=mI.equals("Noviembre");
        boolean IDiciembre=mI.equals("Diciembre");
        
        boolean FEnero=mF.equals("Enero");
        boolean FFebrero=mF.equals("Febrero");
        boolean FMarzo=mF.equals("Marzo");
        boolean FAbril=mF.equals("Abril");
        boolean FMayo=mF.equals("Mayo");
        boolean FJunio=mF.equals("Junio");
        boolean FJulio=mF.equals("Julio");
        boolean FAgosto=mF.equals("Agosto");
        boolean FSeptiembre=mF.equals("Septiembre");
        boolean FOctubre=mF.equals("Octubre");
        boolean FNoviembre=mF.equals("Noviembre");
        boolean FDiciembre=mF.equals("Diciembre");
        
        if(IEnero==true){
            mesInicial=1;
        }
        if(IFebrero==true){
            mesInicial=2;
        }
        if(IMarzo==true){
            mesInicial=3;
        }
        if(IAbril==true){
            mesInicial=4;
        }
        if(IMayo==true){
            mesInicial=5;
        }
        if(IJunio==true){
            mesInicial=6;
        }
        if(IJulio==true){
            mesInicial=7;
        }
        if(IAgosto==true){
            mesInicial=8;
        }
        if(ISeptiembre==true){
            mesInicial=9;
        }
        if(IOctubre==true){
            mesInicial=10;
        }
        if(INoviembre==true){
            mesInicial=11;
        }
        if(IDiciembre==true){
            mesInicial=12;
        }
        
        
        
        if(FEnero==true){
            mesFinal=1;
        }
        if(FFebrero==true){
            mesFinal=2;
        }
        if(FMarzo==true){
            mesFinal=3;
        }
        if(FAbril==true){
            mesFinal=4;
        }
        if(FMayo==true){
            mesFinal=5;
        }
        if(FJunio==true){
            mesFinal=6;
        }
        if(FJulio==true){
            mesFinal=7;
        }
        if(FAgosto==true){
            mesFinal=8;
        }
        if(FSeptiembre==true){
            mesFinal=9;
        }
        if(FOctubre==true){
            mesFinal=10;
        }
        if(FNoviembre==true){
            mesFinal=11;
        }
        if(FDiciembre==true){
            mesFinal=12;
        }
        
        
        String salida="Calculo:\n\n";
        
        salida+="Los dias entre el mes de "+ mI+"  al mes de "+mF+ " es de: ";
        salida+= P1.DiasMeses(mesInicial,mesFinal);
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
            java.util.logging.Logger.getLogger(P1_DiasMeses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P1_DiasMeses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P1_DiasMeses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P1_DiasMeses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P1_DiasMeses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonLImpiar;
    private javax.swing.JTextArea JTA;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonInico;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JComboBox<String> jComboBoxMesFinal;
    private javax.swing.JComboBox<String> jComboBoxMesInicial;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIndicaciones;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
