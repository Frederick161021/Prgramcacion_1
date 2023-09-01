package Parcial_1;

public class P1Proyecto {
 
 //Calculo de Dias entre Meses
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
 

public static String DiasMeses(int mesInicial, int mesFinal){

 int totalDias=0;
 String salida="";

   do{
       totalDias += diasMes(mesInicial);
       mesInicial = mesInicial+1;
   }while(mesInicial <= mesFinal);
 
  salida+=totalDias+" Días";
  return salida;
}  


//Calculo de Días
public static String calculoDias(int diaNacio,int mesNacio,int añoNacio, int diaActual, int mesActual,int añoActual){
 int difAños,difMes,difDias,dias;
 String salida="";   
 if(diaActual<diaNacio){
    mesActual = mesActual-1;//Restar 1 al mes actual(mesActual--; o mesActual-=1;)
    diaActual = diaActual+30;}

 if(mesActual<mesNacio){
 añoActual= añoActual-1;
 mesActual= mesActual+12;}   

    difAños= añoActual- añoNacio;
    difMes= mesActual- mesNacio;
    difDias= diaActual- diaNacio;
    dias =(difAños*365)+(difMes*30)+difDias;
  
    salida+= dias;
    return salida;
    }



//Numeros Romanos del 1 al 100
public static String centenas(int numero){
  String  resultado="";
  
  switch(numero){
      case 1: resultado = "C"; break;
      default: resultado = "";
  }
  return resultado;
 }
 
 
 public static String decenas(int numero){
  String  resultado="";
  
  switch(numero){
      case 1: resultado = "X"; break;
      case 2: resultado = "XX"; break;
      case 3: resultado = "XXX"; break;
      case 4: resultado = "XL"; break;
      case 5: resultado = "L"; break;
      case 6: resultado = "LX"; break;
      case 7: resultado = "LXX"; break;
      case 8: resultado = "LXXX"; break;
      case 9: resultado = "XC"; break;
      
      default: resultado = "";
  }
  return resultado;
 }
 
 
 public static String unidades(int numero){
  String  resultado="";
  
  switch(numero){
      case 1: resultado = "I"; break;
      case 2: resultado = "II"; break;
      case 3: resultado = "III"; break;
      case 4: resultado = "IV"; break;
      case 5: resultado = "V"; break;
      case 6: resultado = "VI"; break;
      case 7: resultado = "VII"; break;
      case 8: resultado = "VIII"; break;
      case 9: resultado = "IX"; break;
      
      default: resultado = "";
  }
  return resultado;
 }
 
 
 
 
public static String NumerosRomanos(int cantidad) {
int centena=0, decena=0, unidad=0,numero=0;
String salida="Conversión a numeros romanos: \n\n";

numero=cantidad;

if(cantidad >= 1 && cantidad <= 100){ 

centena = cantidad / 100;
cantidad = cantidad % 100;
decena = cantidad / 10; //8
cantidad = cantidad % 10; //5
unidad  =cantidad;  //5

    salida +="El numero "+numero+" en numeros romanos es: "+centenas(centena)+decenas(decena)+unidades(unidad);

}
else{
    salida+="Fin de Programa\n Vuelva a escribir un numero del 1 al 100";
}
return salida;
    }





//Operadores
public static String Operadores(int opcion, int num1,int num2) {
String salida="Calculo:\n\n";
   
if(opcion==1){
  int resultado=0;
 
  resultado= num1 + num2;
  salida+= "La suma del numero "+num1+" mas el numero "+num2+" da como resultado: "+resultado;
}

if(opcion==2){
  int resultado=0;
 
  resultado= num1 - num2;
  
 salida+= "La resta del numero "+num1+" menos el numero "+num2+" da como resultado: "+resultado;
}

if(opcion==3){
  int resultado=0;
 
  resultado= num1 * num2;
  
salida+= "El producto del numero "+num1+" por el numero "+num2+" da como resultado:"+resultado;   
}

if(opcion==4){
   double resultado=0, numero1=0,numero2=0;
   numero1=num1*1.0;
   numero2=num2*1.0;
   
  resultado= numero1/numero2;
  
 salida+= "La división del numero "+num1+" entre el numero "+num2+" da como resultado:"+resultado;  
}

if(opcion==5){
  int resultado=0;
 
  resultado= num1%num2;
  
salida+= "El residuo del numero "+num1+" con del numero "+num2+" da como resultado:"+resultado;  
}
     
 return salida;
}




//Calificaciones
public static String calificaciones(int Calificacion1, int Calificacion2, int Calificacion3, int Calificacion4, int Calificacion5){
   int Suma=0,Calificacion=0;
   double Promedio=0;
   String salida="Calculo:\n\n";
     
   Suma=Calificacion1+Calificacion2+Calificacion3+Calificacion4+Calificacion5;
   Promedio= Suma/5;
        
        if(Promedio<70){
          Calificacion=60;
          salida+="Calificación Final="+Calificacion;        
        }
        
        if(Promedio>=70 && Promedio<=75){
          Calificacion=70;
          salida+="Calificación Final="+Calificacion; 
            }     
        
        if(Promedio>75 && Promedio<=85){
          Calificacion=80;
          salida+="Calificacion Final="+Calificacion;  
            }   
        
        if(Promedio>85 && Promedio<=95){
           Calificacion=90;
           salida+="Calificación Final="+Calificacion;
            }
        
        if(Promedio>95){
           Calificacion=100;
           salida+="Calificación Final="+Calificacion;       
        }
        return salida;
        }




//Validacion de Fecha
public static int DiasMes(int mes){
int dias=0;
if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)
dias = 31;
if (mes==4||mes==6||mes==9||mes==11)
dias=30;
if(mes==2)dias=28;

return dias;
}

public static String validacionFecha(int dia, int mes, int año){
String salida="Calculo:\n\n";
int Mes=mes;
 if (año>=2000){
 if (mes>=1 && mes<=12){
 if (dia>=1 && dia<=DiasMes(Mes)){
 salida+="Fecha Valida";
 }else {salida+="Fecha Invalida\n Intente otra Fecha.";}
 }else {salida+="Fecha Invalida\n Intente otra Fecha.";}
 }else {salida+="Fecha Invalida\n Intente otra Fecha.";}
 return salida; 
}
}
