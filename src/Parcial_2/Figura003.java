package Parcial_2;
import javax.swing.*;
import java.awt.*;
public class Figura003 {
    
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
        int Vi=4,Vf=5;
        
        for (int F = 1; F <= 4; F++) {
        for (int C = 1; C <= 5; C++) {
            if(C>=Vi && C<=Vf)
                salida += "*";
            else
                salida +=" ";
        }
        salida +="\n";

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
      while(F<=4){
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
    JTextArea jta = new JTextArea(salida);
     jta.setBackground(Color.black);
     jta.setForeground(Color.white);   
     JOptionPane.showMessageDialog(null, jta);
    }
    
    public static void CicloDoWhile(){
       String salida ="\n(DOWHILE) Figura003 \n";
   int F=1, C=1, VI=5, VF=5;
   do{
       
    C=1;  
    do{
        
    if(C>=VI && C<=VF)    
        salida += "*";
    else
        salida += " ";
    
     C++;   
    }while(C<=9);   
    salida+="\n";
    VI--;
    VF++;
    
   F++;    
   }while(F<=5); 
   
      F=1; C=1; VI=4; VF=5;
   do{
       
    C=1;  
    do{
        
    if(C>=VI && C<=VF)    
        salida += "*";
    else
        salida += " ";
    
     C++;   
    }while(C<=5);   
    salida+="\n";
    
   F++;    
   }while(F<=4); 
   
       JTextArea jta = new JTextArea(salida);
     jta.setBackground(Color.darkGray);
     jta.setForeground(Color.cyan);   
     JOptionPane.showMessageDialog(null, jta);
    }
    
    public static void MenuOpciones(){
        String entrada="";
        int opción=0;
        do{
        entrada= JOptionPane.showInputDialog("1.-Ciclo For\n 2.-Ciclo While\n 3.-Ciclo DoWhile\n 4.-Fin del programa");
        opción= Integer.parseInt(entrada);
        switch(opción){
            case 1: CicloFor();break;
            case 2: CicloWhile();break;
            case 3: CicloDoWhile();break;
            case 4: JOptionPane.showMessageDialog(null, "Fin del Programa");
            System.out.println("Fin del Programa");break;
            default: JOptionPane.showMessageDialog(null, "Opcion invalida");
        } 
        }while(opción!=4);
    }

    public static void main(String[] args) {
       MenuOpciones();
    }
    
}
