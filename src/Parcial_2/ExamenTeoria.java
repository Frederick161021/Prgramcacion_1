package Parcial_2;
import javax.swing.*;
import java.awt.*;
public class ExamenTeoria {
    public static void CicloFor(){
     String salida="";
    salida+="Del 100 al 90\n";
        for (int f =100; f >= 90; f--) {
            salida+=""+ f+"\n";
        }
        salida+="\n";
        
     JTextArea jta = new JTextArea(salida);
     jta.setBackground(Color.white);
     jta.setForeground(Color.blue);   
     JOptionPane.showMessageDialog(null, jta);
    }
    public static void main(String[] args) {
        CicloFor();
    }
    
}
