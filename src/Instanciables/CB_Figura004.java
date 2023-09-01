package Instanciables;
import javax.swing.*;
import java.awt.*;

public class CB_Figura004 {
    
    public CB_Figura004(){}
    
    public void FiguraFOR(){
String salida = "Figura4 Ciclo FOR\n";    
int VI=5, VF=5;
//Parte1
for (int F = 1; F <=4; F++) {        
    for (int C = 1; C <= 9; C++) {
        if(C>=VI && C <=VF)
            salida+="*";
        else
            salida += " ";
    }
    salida +="\n";
    VI--;
    }

//Parte2
VI=1; VF=9;
    for (int F = 5; F <=6; F++) {
        for (int C = 1; C <=9; C++) {
    if(C>=VI && C <=VF)
            salida+="*";
        else
            salida += " ";            
        }
        salida +="\n";
       
    }

//Parte3
VI=2; VF=5;
    for (int F = 7; F <=10; F++) {
        for (int C = 1; C <=9; C++) {
    if(C>=VI && C <=VF)
            salida+="*";
        else
            salida += " ";            
        }
        salida +="\n";
       VI++;
    }    
   JTextArea jta = new JTextArea(salida);
   jta.setBackground(Color.WHITE);
   jta.setForeground(Color.blue);

   JOptionPane.showMessageDialog(null, jta);   
} 

public void FiguraWHILE(){
   int VI=5,VF=5;
   int F=1, C=1;
   String salida="Figura4 Ciclo WHILE\n";    
   
   ////Parte 1
   while(F<=4){       
    C=1;   
    while(C<=9){
        if(C>=VI && C<=VF)
              salida +="*";
        else
              salida += " ";
        
     C++;   
    }
        salida +="\n";
        VI--;
     F++;  
   }
   
  ////Parte 2
  F=5;
  C=1;
  VI=1;
  VF=9;
  
   while(F<=6){       
    C=1;   
    while(C<=9){
        if(C>=VI && C<=VF)
              salida +="*";
        else
              salida += " ";
        
     C++;   
    }
        salida +="\n";
     F++;  
   }  
   
   
    ////Parte 3
  F=7;
  C=1;
  VI=2;
  VF=5;
  
   while(F<=10){       
    C=1;   
    while(C<=9){
        if(C>=VI && C<=VF)
              salida +="*";
        else
              salida += " ";
        
     C++;   
    }
        salida +="\n";
        VI++;
     F++;  
   }  
   JTextArea jta = new JTextArea(salida);
   jta.setBackground(Color.WHITE);
   jta.setForeground(Color.red);

   JOptionPane.showMessageDialog(null, jta);
}

public void FiguraDOWHILE(){
  int VI=5,VF=5;
   int F=1, C=1;
   String salida="Figura4 Ciclo DOWHILE\n";    
   
////Parte 1
do{
    
    C=1;
   do{
       if(C>= VI  && C<=VF)
           salida +="*";
       else
           salida += " ";
       
    C++;   
   } while(C<=9);
    salida+="\n";
    VI--;
  F++; 
}while(F<=4);
   

////Parte 2
F=5;
C=1;
VI=1;
VF=9;

do{
    
    C=1;
   do{
       if(C>= VI  && C<=VF)
           salida +="*";
       else
           salida += " ";
       
    C++;   
   } while(C<=9);
    salida+="\n";
  F++; 
}while(F<=6);

////Parte 3
F=7;
C=1;
VI=2;
VF=5;

do{
    
    C=1;
   do{
       if(C>= VI  && C<=VF)
           salida +="*";
       else
           salida += " ";
       
    C++;   
   } while(C<=9);
    salida+="\n";
    VI++;
  F++; 
}while(F<=10);



JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.WHITE);
jta.setForeground(Color.ORANGE);

JOptionPane.showMessageDialog(null, jta);

}
    
}
