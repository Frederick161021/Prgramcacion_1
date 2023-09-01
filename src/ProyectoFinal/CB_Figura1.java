package ProyectoFinal;

public class CB_Figura1 {
    public CB_Figura1(){}
    public String Figura1FOR(){
 String salida="Figura: 001(For)\n";
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
    return salida;
    }
    
    
    public String Figura1WHILE(){
   String salida="Figura: 001(While)\n";
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
   return salida;
}


public String Figura1DOWHILE(){
   String salida="Figura: 001(Do-While)\n";
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
   return salida;   
}

}
