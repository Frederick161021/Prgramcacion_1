package Parcial_2;
import java.awt.Color;
import javax.swing.*;

public class NumerosLetras {

public static String Centenas(int centenas){
    String salida ="";
    switch(centenas){
        case 1: salida = "CIEN"; break;
    }    
    return salida;
}    

public static String Decenas(int decenas){
    String salida ="";
    switch(decenas){
        case 1: salida = "DIEZ"; break;
        case 2: salida = "VEINTE"; break;
        case 3: salida = "TREINTA"; break;
        case 4: salida = "CUARENTA"; break;
        case 5: salida = "CINCUENTA"; break;
        case 6: salida = "SESENTA"; break;
        case 7: salida = "SETENTA"; break;
        case 8: salida = "OCHENTA"; break;
        case 9: salida = "NOVENTA"; break;        
    }    
    return salida;
}    

public static String Unidades(int unidades){
    String salida="";
    switch(unidades){
        case 1: salida = "UNO"; break;
        case 2: salida = "DOS"; break;
        case 3: salida = "TRES"; break;
        case 4: salida = "CUATRO"; break;
        case 5: salida = "CINCO"; break;
        case 6: salida = "SEIS"; break;
        case 7: salida = "SIETE"; break;
        case 8: salida = "OCHO"; break;
        case 9: salida = "NOEVE"; break;     
    }
    return salida;
}

public static void Calculo(){
 int cantidad=0, centenas=0, decenas=0,unidades=0;
 String entrada="";
 String salida="";
 entrada = JOptionPane.showInputDialog("Enter Cantidad >=1 y Cantidad <= 100 ");
 cantidad = Integer.parseInt(entrada);
 
 if (cantidad >= 1 && cantidad <=100){
     centenas=cantidad / 100;
     cantidad =cantidad % 100;
     decenas = cantidad / 10;
     cantidad = cantidad % 10;
     unidades = cantidad;
     
     
     salida = "Centenas= " + centenas + " Decenas = " + decenas + " Unidades = " + unidades + "\n ";
    if (centenas >0)
        salida += Centenas(centenas);
    
     if (decenas >0 && unidades==0)
         salida += Decenas(decenas);
     
     if (decenas ==0 && unidades > 0)
        salida+=Unidades(unidades); 
     
     if (decenas>20 && unidades>5)
         salida+=Decenas(decenas)+" Y "+Unidades(unidades);

     if (decenas==1 && (unidades>=1 && unidades<=5))
         
        if(unidades==1){
        salida+="ONCE";
        }
             if(unidades==2){
         salida+="DOCE";
             }
                     if(unidades==3){
        salida+="TRECE";
                     }
                if(unidades==4){             
        salida+="CATORCE";
        }
                        if(unidades==5){
        salida+="QUINCE";
                }
                        
     JTextArea jta = new JTextArea(salida);
     jta.setBackground(Color.white);
     jta.setForeground(Color.BLUE);
     
     JOptionPane.showMessageDialog(null, jta,"Numeros Letras",
             JOptionPane.INFORMATION_MESSAGE);
     
 }
 else 
 {
     salida = "Fin de Programa";
     JTextArea jta = new JTextArea(salida);
     jta.setBackground(Color.white);
     jta.setForeground(Color.BLUE);
     
     JOptionPane.showMessageDialog(null, jta,"Numeros Letras",
             JOptionPane.INFORMATION_MESSAGE);
 }
}    
    
    public static void main(String[] args) {
        Calculo();
    }
    
}

