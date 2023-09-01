package Parcial_2;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CiclosDentroDeCiclos{

public static void CicloFOR(){

String salida= "CicloFor\n";
salida+="c1\tc2\tc3\n";
   //for(inicio, condicion, incemento)
   for(int c1=1; c1<=3; c1++){
       salida+=c1+"\n";
       for (int c2=1; c2<=3; c2++) {
       salida+="\t"+c2+"\n";    
           for (int c3=1; c3<=3; c3++) {
               salida+="\t\t"+c3+"\n";
           }
       } 
   }
JTextArea jta = new JTextArea(salida);
     jta.setBackground(Color.black);
     jta.setForeground(Color.white);
     JOptionPane.showMessageDialog(null, jta,"Ciclo For",
             JOptionPane.INFORMATION_MESSAGE);
}

    public static void main(String[] args) {

        CicloFOR();
        
        
        
    }
}
