package ProyectoFinal;
import Proyecto.*;
import Parcial_1.*;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class CalculoDias extends javax.swing.JFrame {

    static P1Proyecto P1 = new P1Proyecto();
    
    public CalculoDias() {
        initComponents();
        this.setLocationRelativeTo(null);
        TrasparenciaBoton();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDatos = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jLabelLimpiar = new javax.swing.JLabel();
        jLabelRegresar = new javax.swing.JLabel();
        jComboBoxDiaNacio = new javax.swing.JComboBox<>();
        jComboBoxMesNacio = new javax.swing.JComboBox<>();
        jTextFieldAñoActual = new javax.swing.JTextField();
        jComboBoxMesActual = new javax.swing.JComboBox<>();
        jComboBoxDiaActual = new javax.swing.JComboBox<>();
        jTextFieldAñoNacio = new javax.swing.JTextField();
        jLabelMesNacio = new javax.swing.JLabel();
        jLabelDiaNacio = new javax.swing.JLabel();
        jLabelAñoNacio = new javax.swing.JLabel();
        jLabelMesActual = new javax.swing.JLabel();
        jLabelDiaActual = new javax.swing.JLabel();
        jLabelAñoActual = new javax.swing.JLabel();
        jButtonInico = new javax.swing.JButton();
        JButtonLImpiar = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonSalida = new javax.swing.JButton();
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

        jLabelResultado.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResultado.setText("Calculo:");
        getContentPane().add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabelLimpiar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabelLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLimpiar.setText("Limpiar");
        getContentPane().add(jLabelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        jLabelRegresar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabelRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegresar.setText("Regresar");
        getContentPane().add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jComboBoxDiaNacio.setBackground(new java.awt.Color(153, 255, 255));
        jComboBoxDiaNacio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBoxDiaNacio.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxDiaNacio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDiaNacioItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxDiaNacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 80, -1));

        jComboBoxMesNacio.setBackground(new java.awt.Color(153, 255, 255));
        jComboBoxMesNacio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBoxMesNacio.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxMesNacio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "_", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxMesNacio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMesNacioItemStateChanged(evt);
            }
        });
        jComboBoxMesNacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesNacioActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMesNacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 120, -1));

        jTextFieldAñoActual.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldAñoActual.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldAñoActual.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAñoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAñoActualActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAñoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 120, -1));

        jComboBoxMesActual.setBackground(new java.awt.Color(153, 255, 255));
        jComboBoxMesActual.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBoxMesActual.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxMesActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "_", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre ", "Noviembre", "Diciembre" }));
        jComboBoxMesActual.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMesActualItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxMesActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 120, -1));

        jComboBoxDiaActual.setBackground(new java.awt.Color(153, 255, 255));
        jComboBoxDiaActual.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBoxDiaActual.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jComboBoxDiaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 80, -1));

        jTextFieldAñoNacio.setBackground(new java.awt.Color(153, 255, 255));
        jTextFieldAñoNacio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldAñoNacio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAñoNacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAñoNacioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAñoNacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 120, -1));

        jLabelMesNacio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelMesNacio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMesNacio.setText("Mes de Nacimiento:");
        getContentPane().add(jLabelMesNacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabelDiaNacio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDiaNacio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDiaNacio.setText("Día de Nacimiento:");
        getContentPane().add(jLabelDiaNacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabelAñoNacio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelAñoNacio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAñoNacio.setText("Año de Nacimiento:");
        getContentPane().add(jLabelAñoNacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabelMesActual.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelMesActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMesActual.setText("Mes Actual:");
        getContentPane().add(jLabelMesActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabelDiaActual.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelDiaActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDiaActual.setText("Día Actual:");
        getContentPane().add(jLabelDiaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabelAñoActual.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelAñoActual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAñoActual.setText("Año Actual:");
        getContentPane().add(jLabelAñoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jButtonInico.setBackground(new java.awt.Color(51, 102, 255));
        jButtonInico.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jButtonInico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInico.setText("Iniciar Programa");
        jButtonInico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 210, 40));

        JButtonLImpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        JButtonLImpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLImpiarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonLImpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 80, -1));

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
    
    public void   TrasparenciaBoton(){
        jButtonBack.setOpaque(false);
        jButtonBack.setContentAreaFilled(false);
        jButtonBack.setBorderPainted(false);
        
        JButtonLImpiar.setOpaque(false);
        JButtonLImpiar.setContentAreaFilled(false);
        JButtonLImpiar.setBorderPainted(false);
    }
    
    public String[] DiaNacio(String mesInicial){
        String[] diaNacio = new String[32];
       
        if (mesInicial.equalsIgnoreCase("Enero")){
            diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
            diaNacio[30]="31";
        }
        
        
        
        if (mesInicial.equalsIgnoreCase("Febrero")){
            
           diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";

        }
        
        if (mesInicial.equalsIgnoreCase("Marzo")){
            
           diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
            diaNacio[30]="31"; 
        }  
        
        if (mesInicial.equalsIgnoreCase("Abril")){
            
            diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
        }   
        
         if (mesInicial.equalsIgnoreCase("Mayo")){
            
            diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
            diaNacio[30]="31";
        }

         if (mesInicial.equalsIgnoreCase("Junio")){
            
            diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
        }         
       
         if (mesInicial.equalsIgnoreCase("Julio")){
            
            diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
            diaNacio[30]="31";
        }  

         if (mesInicial.equalsIgnoreCase("Agosto")){
            
           diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
            diaNacio[30]="31"; 
        }
         
         if (mesInicial.equalsIgnoreCase("Septiembre")){
            
            diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
        } 
         
         if (mesInicial.equalsIgnoreCase("Octubre")){
            
            diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
            diaNacio[30]="31";
        }  
         
        if (mesInicial.equalsIgnoreCase("Noviembre")){
            
            diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
        }          
         
        if (mesInicial.equalsIgnoreCase("Diciembre")){  
            diaNacio[0]="1";
            diaNacio[1]="2";
            diaNacio[2]="3";
            diaNacio[3]="4";
            diaNacio[4]="5";
            diaNacio[5]="6";
            diaNacio[6]="7";
            diaNacio[7]="8";
            diaNacio[8]="9";
            diaNacio[9]="10";
            diaNacio[10]="11";
            diaNacio[11]="12";
            diaNacio[12]="13";
            diaNacio[13]="14";
            diaNacio[14]="15";
            diaNacio[15]="16";
            diaNacio[16]="17";
            diaNacio[17]="18";
            diaNacio[18]="19";
            diaNacio[19]="20";
            diaNacio[20]="21";
            diaNacio[21]="22";
            diaNacio[22]="23";
            diaNacio[23]="24";
            diaNacio[24]="25";
            diaNacio[25]="26";
            diaNacio[26]="27";
            diaNacio[27]="28";
            diaNacio[28]="29";
            diaNacio[29]="30";
            diaNacio[30]="31";
        }            
        
        return diaNacio;
    }
    
    
    
    
    
    
    public String[] DiaActual(String mesInicial){
        String[] diaActual = new String[32];
       
        if (mesInicial.equalsIgnoreCase("Enero")){
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
            diaActual[30]="31";
        }
        
        
        
        if (mesInicial.equalsIgnoreCase("Febrero")){
            
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
        }
        
        if (mesInicial.equalsIgnoreCase("Marzo")){
            
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
            diaActual[30]="31";
        }  
        
        if (mesInicial.equalsIgnoreCase("Abril")){
            
                        diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
        }   
        
         if (mesInicial.equalsIgnoreCase("Mayo")){
            
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
            diaActual[30]="31";
        }

         if (mesInicial.equalsIgnoreCase("Junio")){
         
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
        }         
       
         if (mesInicial.equalsIgnoreCase("Julio")){
            
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
            diaActual[30]="31";
        }  

         if (mesInicial.equalsIgnoreCase("Agosto")){
            
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
            diaActual[30]="31";
        } 
         
         if (mesInicial.equalsIgnoreCase("Septiembre")){
             
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
         }
         if (mesInicial.equalsIgnoreCase("Octubre")){
            
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
            diaActual[30]="31";
        }  
         
        if (mesInicial.equalsIgnoreCase("Noviembre")){
            
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
        }          
         
        if (mesInicial.equalsIgnoreCase("Diciembre")){  
            
            diaActual[0]="1";
            diaActual[1]="2";
            diaActual[2]="3";
            diaActual[3]="4";
            diaActual[4]="5";
            diaActual[5]="6";
            diaActual[6]="7";
            diaActual[7]="8";
            diaActual[8]="9";
            diaActual[9]="10";
            diaActual[10]="11";
            diaActual[11]="12";
            diaActual[12]="13";
            diaActual[13]="14";
            diaActual[14]="15";
            diaActual[15]="16";
            diaActual[16]="17";
            diaActual[17]="18";
            diaActual[18]="19";
            diaActual[19]="20";
            diaActual[20]="21";
            diaActual[21]="22";
            diaActual[22]="23";
            diaActual[23]="24";
            diaActual[24]="25";
            diaActual[25]="26";
            diaActual[26]="27";
            diaActual[27]="28";
            diaActual[28]="29";
            diaActual[29]="30";
            diaActual[30]="31";
        }            
        
        return diaActual;
    }

    
    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalidaActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.setVisible(false);
        Menu M = new Menu();
        M.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void JButtonLImpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLImpiarActionPerformed
        String salida=""+"Calculo:";
        jTextFieldAñoNacio.setText("");
        jTextFieldAñoActual.setText("");
        JTA.setText(salida);
    }//GEN-LAST:event_JButtonLImpiarActionPerformed

    private void jComboBoxMesNacioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMesNacioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
            if(this.jComboBoxMesNacio.getSelectedIndex()>=0){
                this.jComboBoxDiaNacio.setModel(new DefaultComboBoxModel(this.DiaNacio(this.jComboBoxMesNacio.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_jComboBoxMesNacioItemStateChanged

    private void jComboBoxMesNacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesNacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesNacioActionPerformed

    private void jComboBoxDiaNacioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDiaNacioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDiaNacioItemStateChanged

    private void jTextFieldAñoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAñoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAñoActualActionPerformed

    private void jComboBoxMesActualItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMesActualItemStateChanged
       if (evt.getStateChange() == ItemEvent.SELECTED){
            if(this.jComboBoxMesActual.getSelectedIndex()>=0){
                this.jComboBoxDiaActual.setModel(new DefaultComboBoxModel(this.DiaActual(this.jComboBoxMesActual.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_jComboBoxMesActualItemStateChanged

    private void jTextFieldAñoNacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAñoNacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAñoNacioActionPerformed

    private void jButtonInicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicoActionPerformed
        String mN = jComboBoxMesNacio.getSelectedItem().toString();
        String mA = jComboBoxMesActual.getSelectedItem().toString();
        int diaNacio = Integer.parseInt(jComboBoxDiaNacio.getSelectedItem().toString());
        int diaActual= Integer.parseInt(jComboBoxDiaActual.getSelectedItem().toString());
        int añoNacio = Integer.parseInt(jTextFieldAñoNacio.getText());
        int añoActual = Integer.parseInt(jTextFieldAñoActual.getText());

        int mesNacio=0, mesActual=0;

        boolean IEnero=mN.equals("Enero");
        boolean IFebrero=mN.equals("Febrero");
        boolean IMarzo=mN.equals("Marzo");
        boolean IAbril=mN.equals("Abril");
        boolean IMayo=mN.equals("Mayo");
        boolean IJunio=mN.equals("Junio");
        boolean IJulio=mN.equals("Julio");
        boolean IAgosto=mN.equals("Agosto");
        boolean ISeptiembre=mN.equals("Septiembre");
        boolean IOctubre=mN.equals("Octubre");
        boolean INoviembre=mN.equals("Noviembre");
        boolean IDiciembre=mN.equals("Diciembre");

        boolean FEnero=mA.equals("Enero");
        boolean FFebrero=mA.equals("Febrero");
        boolean FMarzo=mA.equals("Marzo");
        boolean FAbril=mA.equals("Abril");
        boolean FMayo=mA.equals("Mayo");
        boolean FJunio=mA.equals("Junio");
        boolean FJulio=mA.equals("Julio");
        boolean FAgosto=mA.equals("Agosto");
        boolean FSeptiembre=mA.equals("Septiembre");
        boolean FOctubre=mA.equals("Octubre");
        boolean FNoviembre=mA.equals("Noviembre");
        boolean FDiciembre=mA.equals("Diciembre");

        if(IEnero==true){
            mesNacio=1;
        }
        if(IFebrero==true){
            mesNacio=2;
        }
        if(IMarzo==true){
            mesNacio=3;
        }
        if(IAbril==true){
            mesNacio=4;
        }
        if(IMayo==true){
            mesNacio=5;
        }
        if(IJunio==true){
            mesNacio=6;
        }
        if(IJulio==true){
            mesNacio=7;
        }
        if(IAgosto==true){
            mesNacio=8;
        }
        if(ISeptiembre==true){
            mesNacio=9;
        }
        if(IOctubre==true){
            mesNacio=10;
        }
        if(INoviembre==true){
            mesNacio=11;
        }
        if(IDiciembre==true){
            mesNacio=12;
        }

        if(FEnero==true){
            mesActual=1;
        }
        if(FFebrero==true){
            mesActual=2;
        }
        if(FMarzo==true){
            mesActual=3;
        }
        if(FAbril==true){
            mesActual=4;
        }
        if(FMayo==true){
            mesActual=5;
        }
        if(FJunio==true){
            mesActual=6;
        }
        if(FJulio==true){
            mesActual=7;
        }
        if(FAgosto==true){
            mesActual=8;
        }
        if(FSeptiembre==true){
            mesActual=9;
        }
        if(FOctubre==true){
            mesActual=10;
        }
        if(FNoviembre==true){
            mesActual=11;
        }
        if(FDiciembre==true){
            mesActual=12;
        }
        
        String salida="Calculo:\n\n";
        CB_CalculoDias CD= new CB_CalculoDias();

        salida+="Desde la fecha del:  "+diaNacio+" / "+mN+" / "+añoNacio+
                " a la fecha actual del: "+diaActual+" / "+mA+" / "+añoActual+" han pasado: ";
        salida+= CD.calculoDias(diaNacio,mesNacio,añoNacio,diaActual,mesActual,añoActual);
        salida+= " Dias";
        JTA.setText(salida);
    }//GEN-LAST:event_jButtonInicoActionPerformed


    
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
            java.util.logging.Logger.getLogger(CalculoDias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoDias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoDias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoDias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculoDias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonLImpiar;
    private javax.swing.JTextArea JTA;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonInico;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JComboBox<String> jComboBoxDiaActual;
    private javax.swing.JComboBox<String> jComboBoxDiaNacio;
    private javax.swing.JComboBox<String> jComboBoxMesActual;
    private javax.swing.JComboBox<String> jComboBoxMesNacio;
    private javax.swing.JLabel jLabelAñoActual;
    private javax.swing.JLabel jLabelAñoNacio;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelDiaActual;
    private javax.swing.JLabel jLabelDiaNacio;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLimpiar;
    private javax.swing.JLabel jLabelMesActual;
    private javax.swing.JLabel jLabelMesNacio;
    private javax.swing.JLabel jLabelRegresar;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAñoActual;
    private javax.swing.JTextField jTextFieldAñoNacio;
    // End of variables declaration//GEN-END:variables
}
