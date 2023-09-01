package Parcial_2;

public class P2Proyecto {
  //TABLAS  
public static String Tabla(int tabla){
    String salida="";
    
    for (int T = 1; T <= 10; T++) {
        salida+=((tabla*T)+"\t");
    }
    salida+=("\n");
    return salida;
}
    
    public static String TablasMultiplicarFOR(int inicio, int fin){
      String salida= "Tablas:\n";
      for(int F = inicio; F<=fin; F++){
          salida+=Tabla(F);    
      }
      return salida;
    }  
    
    
    //FIGURAS
    public static String Figura001(){
String salida="Figura: 001\n";
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
    
    public static String Figura002(){
String salida = "Figura: 002\n";    
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
    
    public static String Figura003(){
        String salida="Figura: 003\n";
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
        return salida;
    }
    
    public static String Figura004(){
      String salida = "Figura: 004\n";     
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
    return salida;
    }     
    
    
    
    //NUMEROS-LETRAS
    public static String Centenas(int centenas){
    String salida ="";
    switch(centenas){
        case 1: salida = "CIEN "; break;
    }    
    return salida;
}    

public static String Decenas(int decenas){
    String salida ="";
    switch(decenas){
        case 1: salida += "DIECI"; break;
        case 2: salida += "VEINTI"; break;
        case 3: salida += "TREINTA "; break;
        case 4: salida += "CUARENTA "; break;
        case 5: salida += "CINCUENTA "; break;
        case 6: salida += "SESENTA "; break;
        case 7: salida += "SETENTA "; break;
        case 8: salida += "OCHENTA "; break;
        case 9: salida += "NOVENTA "; break;        
    }    
    return salida;
}    

public static String Unidades(int unidades){
    String salida="";
    switch(unidades){
        case 1: salida += "UNO"; break;
        case 2: salida += "DOS"; break;
        case 3: salida += "TRES"; break;
        case 4: salida += "CUATRO"; break;
        case 5: salida += "CINCO"; break;
        case 6: salida += "SEIS"; break;
        case 7: salida += "SIETE"; break;
        case 8: salida += "OCHO"; break;
        case 9: salida += "NUEVE"; break;     
    }
    return salida;
}

public static String Calculo(int cantidad){
 int centenas=0, decenas=0,unidades=0;
 String salida="EL numero es: "+cantidad+"\n";
 
 
 if (cantidad >= 0 && cantidad <=100){
     centenas=cantidad / 100;
     cantidad =cantidad % 100;
     decenas = cantidad / 10;
     cantidad = cantidad % 10;
     unidades = cantidad;
     
     
     salida += "Centenas= " + centenas + " Decenas = " + decenas + " Unidades = " + unidades + "\n ";
    
     
     if (centenas==0 && decenas==0 && unidades==0){
         salida+="CERO";
     }
     if (centenas==1){
         salida+=Centenas(centenas);
     }
    if (centenas==0){
     if (decenas >2 && unidades==0){
         salida += Decenas(decenas);
     }
     if (decenas ==0 && unidades > 0){
        salida+=Unidades(unidades);
     }

     if (decenas==1 &&  unidades==0){
        salida+="DIEZ";   
     }
          if (decenas==1 && (unidades>=1 && unidades<=5)){
          switch(unidades){
              case 1:salida+="ONCE"; break;
              case 2:salida+="DOCE"; break;
              case 3:salida+="TRECE"; break;
              case 4:salida+="CATORCE"; break;
              case 5:salida+="QUINCE"; break;
          }
          }
     if (decenas==1 && unidades>=6){
         salida+=Decenas(decenas)+Unidades(unidades);
     }
     
     if (decenas==2 && unidades==0){
         salida+="VEINTE";
     }
     
     if (decenas==2 && unidades>0){
     salida+=Decenas(decenas)+Unidades(unidades);
     }
     
     if (decenas>2 && unidades>0){
     salida+=Decenas(decenas)+"Y "+Unidades(unidades);
     }
    }}
 else{
 salida="Numero no valido.\n Intente con otro numero del 0 al 100...";
 }
 return salida;
     }


//TOTAL A PAGAR
public static String TotalPagar(int computadoras,int impresoras, int discos){ 

int totalArticulos=0, pagoComputadora=0,pagoImpresora=0, pagoDisco=0;
int totalPagar=0;
String salida="Costo de los articulos comprados:\n\n";

totalArticulos= computadoras+ impresoras+ discos;

if (totalArticulos>0){
pagoComputadora= computadoras*10000;
pagoImpresora= impresoras*3000;
pagoDisco= discos*1500;
totalPagar=pagoComputadora+pagoImpresora+pagoDisco;

salida+="Computadoras:"+pagoComputadora+"\nImpresoras:"+pagoImpresora+"\nDiscos:"+
        pagoDisco+"\n\n";
salida+="TOTAL A PAGAR:"+totalPagar;
}
 if (totalArticulos==0){
      salida+="No compro ningun articulo."; 
 }
 return salida;
}



//Billetes y Monedas
public static String BilletesMonedas(int cantidad){ 

int B1000=0,B500=0,B200=0,B100=0,B50=0,M20=0,M10=0,M5=0,M2=0,M1=0;

String salida="Representación de: "+cantidad+"\n";

B1000=cantidad/1000;
cantidad=cantidad%1000;

B500=cantidad/500;
cantidad=cantidad%500;

B200=cantidad/200;
cantidad=cantidad%200;

B100=cantidad/100;
cantidad=cantidad%100;

B50=cantidad/50;
cantidad=cantidad%50;

M20=cantidad/20;
cantidad=cantidad%20;

M10=cantidad/10;
cantidad=cantidad%10;

M5=cantidad/5;
cantidad=cantidad%5;

M2=cantidad/2;
cantidad=cantidad%2;

M1=cantidad;

salida+=("B1000="+B1000+"\nB500="+B500+"\nB200="+B200+"\nB100="+B100+"\nB50="+B50+
        "\nM20="+M20+"\nM10="+M10+"\nM5="+M5+"\nM2="+M2+"\nM1="+M1);

salida +="\n Esta seria la cantidad ingresada en billetes y monedas.";

return salida;
}
}

