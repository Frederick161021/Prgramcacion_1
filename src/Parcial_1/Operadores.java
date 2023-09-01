///Hacer un Programa usando metodos
///para las operaciones de Suma, Resta, Multiplicacion, Division, Modulo
package Parcial_1;
import java.util.Scanner;
public class Operadores {

//Referencia a Scanner
static Scanner s = new Scanner(System.in);

//Metodo de Suma
public static void Suma(){
 int num1=0,num2=0,resultado=0;

 System.out.println("Enter Numero 1=");
 num1=s.nextInt();
 
 System.out.println("Enter Numero 2=");
 num2=s.nextInt();
 
  resultado= num2 + num1;
  
 System.out.println("Resultado ="+resultado);
}

//Metodo de Resta
public static void Resta(){  
  int num1=0,num2=0,resultado=0;
 
 System.out.println("Enter Numero 1=");
 num1=s.nextInt();
 
 System.out.println("Enter Numero 2=");
 num2=s.nextInt();
 
  resultado= num1 - num2;
  
 System.out.println("Resultado ="+resultado);
}

//Metodo de Multiplicacion
public static void Multiplicacion(){
    int num1=0,num2=0,resultado=0;
 
 System.out.println("Enter Numero 1=");
 num1=s.nextInt();
 
 System.out.println("Enter Numero 2=");
 num2=s.nextInt();
 
  resultado= num2 * num1;
  
 System.out.println("Resultado ="+resultado);
}

//Metodo de Division
public static void Division(){
     double num1=0,num2=0,resultado=0;
 
 System.out.println("Enter Numero 1=");
 num1=s.nextInt();
 
 System.out.println("Enter Numero 2=");
 num2=s.nextInt();
 
  resultado= num1/num2;
  
 System.out.println("Resultado ="+resultado);
}

//Metodo de Modulo
public  static void Modulo(){
      int num1=0,num2=0,resultado=0;
 
 System.out.println("Enter Numero 1=");
 num1=s.nextInt();
 
 System.out.println("Enter Numero 2=");
 num2=s.nextInt();
 
  resultado= num1%num2;
  
 System.out.println("Resultado ="+resultado);     
}

public static void main(String[] args) {
    int opcion=0;
    System.out.println("Seleccione el tipo de operacion a realizar:\n"
            +"\n"
            +"1.-Suma\n"
            +"2.-Resta\n"
            +"3.-Multiplicacion\n"
            +"4.-Division\n"
            +"5.-Modulo\n"
            +"6.-Ninguna");
    
    opcion=s.nextInt();
    
    if (opcion==1) Suma();
    if (opcion==2) Resta();
    if (opcion==3) Multiplicacion();
    if (opcion==4) Division();
    if (opcion==5) Modulo();   
    if (opcion==6) System.out.println("Fin del Programa");
    }    
}