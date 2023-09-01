package Instanciables;

public class CB_NumerosRomanos {
    private int cantidad;
    
   public CB_NumerosRomanos(int cantidad){
       this.cantidad = cantidad;
   } 
   
   
   //Calculo
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
 
 
 
 
public  String Calculo() {
int centena=0, decena=0, unidad=0;
String salida="";

if(cantidad >= 1 && cantidad <= 100){ 
int numero=cantidad; 
    
centena = cantidad / 100;
cantidad = cantidad % 100;
decena = cantidad / 10; 
cantidad = cantidad % 10; 
unidad  =cantidad;  


    salida = "El numero "+numero+" en numeros romanos el numero:\n"+
            centenas(centena)+decenas(decena)+unidades(unidad);

}
else{
    salida = "Fin de Programa";
}
return salida;
    }
    
}

