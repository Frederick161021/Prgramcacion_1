package Parcial_2;
import javax.swing.*;
import java.awt.*;

public class ExamenTeoria2 {

    public static void CicloWhile(){
String salida="Tabla de multiplicar del 20 \n";

   int F=1; 
   while(F<=10){  
       salida+=(F*20)+"\n";
       F++;  
   }  
        
     JTextArea jta = new JTextArea(salida);
     jta.setBackground(Color.white);
     jta.setForeground(Color.blue);   
     JOptionPane.showMessageDialog(null, jta);
    }
    
    public static void main(String[] args) {
       CicloWhile(); 
    }
    
}
