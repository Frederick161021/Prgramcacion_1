package Parcial_1;
import java.util.Scanner;
public class NumerosRomanos1al100 {
//Referencia a Scanner
 static Scanner s=new Scanner(System.in);

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
 
 
 
 
public static void main(String[] args) {
int cantidad=0;
int centena=0, decena=0, unidad=0;

System.out.println("Enter Cantidad (1 al 100) = ");  // 85
cantidad = s.nextInt();

if(cantidad >= 1 && cantidad <= 100){ 

centena = cantidad / 100;
cantidad = cantidad % 100;
decena = cantidad / 10; //8
cantidad = cantidad % 10; //5
unidad  =cantidad;  //5


    System.out.println(centenas(centena)+decenas(decena)+unidades(unidad));

      
}
else
    System.out.println("Fin de Programa");   

    
    }
    
}