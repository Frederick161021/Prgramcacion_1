package ProyectoFinal;

public class CB_Figura2 {
    public CB_Figura2(){}
    
    public String FiguraFOR(){
String salida = "Figura:002 (FOR)\n";    
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
return salida;
}  

public String FiguraWHILE(){
String salida = "Figura:002 (While)\n"; 
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
return salida;
}

public String FiguraDOWHILE(){
String salida = "Figura:002 (Do-While)\n"; 
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
return salida;
}
}
