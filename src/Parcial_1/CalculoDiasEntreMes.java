package Parcial_1;
import java.util.Scanner;
public class CalculoDiasEntreMes {
//Referencia a Scanner    
static Scanner s=new Scanner(System.in);

public static int diasMes(int mes){
 int dias=0;

switch(mes){
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12: dias=31;break;
    case 4:
    case 6:
    case 9:
    case 11: dias=30; break;
    case 2: dias=28; break;
    default: dias = 0;
}
    
    return dias;    
}

public static void Calculo(){
 //Datos   
 int mesInicial =0, mesFinal = 0;
 int totalDias=0;
 
 //Entrada de Datos
    System.out.println("Enter Mes Inicial = ");  ///1
    mesInicial = s.nextInt();
    
    System.out.println("Enter Mes Final = ");  ///6
    mesFinal = s.nextInt();
    
    //Proceso 
    ///Contar los dias de enero,febrero,marzo,abril,mayo,junio
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial +1;
    }
    
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
    }
     
    if(mesInicial <= mesFinal){
        totalDias += diasMes(mesInicial);
        mesInicial = mesInicial + 1;
  
    }
        System.out.println("Total Dias = " + totalDias);
}

 
    public static void main(String[] args) {
    Calculo();
        
    }    
}                                                                     