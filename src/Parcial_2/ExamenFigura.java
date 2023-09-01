package Parcial_2;
import javax.swing.*;
import java.awt.*;
public class ExamenFigura {
    
    public static void CicloFor(){
        String salida="(For)Figura 003\n";
        int VI=5, VF=5;
       
        for (int F = 1; F <= 5; F++) {
        for (int C = 1; C <= 9; C++) {
            if(C>=VI && C<=VF)
                salida += "*";
            else
                salida +=" ";
        }
        salida +="\n";
        VI--;
        VF++;
    }
        VI=4; VF=5;
        
        for (int F = 1; F <= 2; F++) {
        for (int C = 1; C <= 5; C++) {
            if(C>=VI && C<=VF)
                salida += "*";
            else
                salida +=" ";
        }
        salida +="\n";
        }
        VI=1; VF=9;
    for (int F =1 ; F <=9; F++) {
        for (int C = 1; C <= 9; C++) {
            if(C>=VI && C<=VF)
                salida += "*";
            else
                salida +=" ";
        }
        salida +="\n";
        VI++;
        VF--;
    }
            
     JTextArea jta = new JTextArea(salida);
     jta.setBackground(Color.white);
     jta.setForeground(Color.blue);   
     JOptionPane.showMessageDialog(null, jta);
    }
    
    public static void CicloWhile(){
         String salida="(WHILE) Figura003\n";
   int VI=5, VF=5;
   int F=1, C=1;
   
   while(F<=5){
       C=1;
       while(C<=9){
           if(C>=VI && C<=VF)
               salida+="*";
           else
               salida += " ";           
         C++;  
       }
       salida +="\n";
       VI--;
       VF++;
       F++;  
   }  
   
   VI=4;VF=5; F=1; C=1;    
      while(F<=2){
       C=1;
       while(C<=5){
           if(C>=VI && C<=VF)
               salida+="*";
           else
               salida += " ";           
         C++;  
       }
       salida +="\n";
       F++;  
   }  
      VI=1;VF=9; F=1; C=1; 
         while(F<=5){
       C=1;
       while(C<=9){
           if(C>=VI && C<=VF)
               salida+="*";
           else
               salida += " ";           
         C++;  
       }
       salida +="\n";
       VI++;
       VF--;
       F++;  
   }
         
    JTextArea jta = new JTextArea(salida);
     jta.setBackground(Color.black);
     jta.setForeground(Color.white);   
     JOptionPane.showMessageDialog(null, jta);
    }

    public static void MenuOpciones(){
        String entrada="";
        int opción=0;
        do{
        entrada= JOptionPane.showInputDialog("1.-Ciclo For\n 2.-Ciclo While\n 3.-Fin del programa");
        opción= Integer.parseInt(entrada);
        switch(opción){
            case 1: CicloFor();break;
            case 2: CicloWhile();break;
            case 3: JOptionPane.showMessageDialog(null, "Fin del Programa");
            System.out.println("Fin del Programa");break;
            default: JOptionPane.showMessageDialog(null, "Opcion invalida");
        } 
        }while(opción!=3);
    }
    
    public static void main(String[] args) {
        MenuOpciones();
    }
    
}
