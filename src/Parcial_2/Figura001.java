package Parcial_2;
import javax.swing.*;
import java.awt.*;
public class Figura001 {

public static void FiguraFOR(){
String salida="(FOR) Figura001\n";
int VI=8,VF=8;

    for (int F = 1; F <= 8; F++) {
        for (int C = 1; C <= 8; C++) {
            if(C>=VI && C<=VF)
                salida += "*";
            else
                salida +=" ";
        }
        salida +="\n";
        VI--;
    }

    salida += "\nFigura002\n";
    VI=1;
    VF=1;
       for (int F = 1; F <= 8; F++) {
        for (int C = 1; C <= 8; C++) {
            if(C>=VI && C<=VF)
                salida += "*";
            else
                salida +=" ";
        }
        salida +="\n";
        VF++;
    } 
    
    
JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.white);
jta.setForeground(Color.blue);



//JOptionPane.showMessageDialog(null, (jta));
JOptionPane.showMessageDialog(null, jta);

}  

public static void FiguraWHILE(){
   String salida="(WHILE) Figura001\n";
   int VI=8, VF=8;
   int F=1, C=1;
   
   while(F<=8){
       C=1;
       while(C<=8){
           if(C>=VI && C<=VF)
               salida+="*";
           else
               salida += " ";           
         C++;  
       }
       salida +="\n";
       VI--;
       
     F++;  
   }
   
 salida +="\n(WHILE) Figura002 \n";
 VI=1; VF=1; F=1;C=1;
  while(F<=8){
       C=1;
       while(C<=8){
           if(C>=VI && C<=VF)
               salida+="*";
           else
               salida += " ";           
         C++;  
       }
       salida +="\n";
       VF++;
       
     F++;  
   }  

JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.white);
jta.setForeground(Color.blue);

JOptionPane.showMessageDialog(null, jta); 
   
   
}


public static void FiguraDOWHILE(){
 String salida ="\n(DOWHILE) Figura001 \n";
   int F=1, C=1, VI=8, VF=8;
   do{
       
    C=1;  
    do{
        
    if(C>=VI && C<=VF)    
        salida += "*";
    else
        salida += " ";
    
     C++;   
    }while(C<=8);   
    salida+="\n";
    VI--;
    
   F++;    
   }while(F<=8);
   
salida +="\n(DOWHILE) Figura002 \n";
VI=1;VF=1;C=1;F=1;

do{
 
 C=1;   
 do{
     
 if(C>=VI && C<=VF)    
     salida +="*";
 else
     salida +=" ";
 
 C++;   
 }while(C<=8);   
 
 salida +="\n";
 VF++;
F++;    
}while(F<=8);
   
JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.WHITE);
jta.setForeground(Color.MAGENTA);

JOptionPane.showMessageDialog(null, jta);     
}

public static void MenuOpciones(){
    String entrada="";
    int opcion = 0;
    
    do{
    entrada=JOptionPane.showInputDialog("1-. Ciclo FOR\n2.-Ciclo WHILE\n3.-Ciclo DOWHILE\n4.-Fin Programa");
     opcion=Integer.parseInt(entrada);
     
     switch(opcion){
         case 1: FiguraFOR(); break;
         case 2: FiguraWHILE(); break;
         case 3: FiguraDOWHILE(); break;
         case 4: JOptionPane.showMessageDialog(null, "Fin Programa"); break;
         default:JOptionPane.showMessageDialog(null, "Opcion Invalida");
     }
        
    }while (opcion!=4);
}

    public static void main(String[] args) {
     MenuOpciones();
    }
    
}

