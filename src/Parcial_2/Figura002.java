package Parcial_2;
import javax.swing.*;
import java.awt.*;
public class Figura002 {

public static void FiguraFOR(){
String salida = "Figura Ciclo FOR\n";    
int VI=5, VF=5;
//Parte1
for (int F = 1; F <=5; F++) {        
    for (int C = 1; C <= 9; C++) {
        if(C>=VI && C <=VF)
            salida+="*";
        else
            salida += " ";
    }
    salida +="\n";
    VI--;
    VF++;
    }

//Parte2
VI=2; VF=8;
    for (int F = 6; F <=9; F++) {
        for (int C = 1; C <=9; C++) {
    if(C>=VI && C <=VF)
            salida+="*";
        else
            salida += " ";            
        }
        salida +="\n";
        VI++;
        VF--;
    }

    
JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.WHITE);
jta.setForeground(Color.red);

JOptionPane.showMessageDialog(null, jta);
}  

public static void FiguraWHILE(){
String salida = "Figura Ciclo WHILE\n";
int VI=5,VF=5;
int F=1, C=1;

//Parte 1
while(F<=5){
C=1;    
while(C<=9){
    if(C>=VI && C<=VF)
        salida +="*";
    else
        salida +=" ";
C++;    
}
   salida +="\n";
   VI--;
   VF++;
F++;    
}

//Parte 2
VI=2; VF=8;
F=6;
C=1;
while(F<=9){  
  C=1;  
  while(C<=9){
      if(C>= VI && C<= VF)
        salida+="*";
      else
          salida+=" ";
   C++;   
  }    
  salida +="\n";
  VI++;
  VF--;
 F++;   
}


JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.GREEN);
jta.setForeground(Color.WHITE);

JOptionPane.showMessageDialog(null, jta);
}

public static void FiguraDOWHILE(){
 String salida = "Figura CicloDOWHILE\n";
 int VI=5, VF=5;
 int F=1,C=1;
 
 //Parte 1
 do{     
   C=1;  
  do{
     if(C>= VI && C<= VF)
        salida+="*";
      else
          salida+=" ";      
   C++;   
  }while(C<=9);   
    salida += "\n";
    VI--;
    VF++;
  F++;   
 }while(F<=5);
 
 //Parte 2
 F=6;
 VI=2;
 VF=8;
 do{     
   C=1;  
  do{
     if(C>= VI && C<= VF)
        salida+="*";
      else
          salida+=" ";      
   C++;   
  }while(C<=9);   
    salida += "\n";
    VI++;
    VF--;
  F++;   
 }while(F<=9);
 
JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.BLUE);
jta.setForeground(Color.WHITE);

JOptionPane.showMessageDialog(null, jta);    
    
}

public static void menuOpciones(){
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
       menuOpciones();
    }
    
}

