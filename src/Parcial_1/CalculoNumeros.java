package Parcial_1; 
import java.util.Scanner;
public class CalculoNumeros {
    
static Scanner s = new Scanner(System.in);

public static void calculo1(){
int numero1=0,numero2=0,suma=0;
        
System.out.println("enter Numero 1=");
numero1= s.nextInt(); 

System.out.println("enter Numero 2=");
numero2= s.nextInt();

suma= numero1+numero2;
System.out.println("Resultado = "+suma);
}

    public static void calculo2(int n1, int n2){ 
int suma=0;
     
suma= n1+n2;
System.out.println("Resultado = "+suma);
 }
 public static int calculo3(int num1, int num2){
 int suma=0;
 
suma= num1+num2;

System.out.println("Resultado = "+suma);
    return suma;
 
 }
 
    public static void main(String[] args) {
        int numero1=0,numero2=0;
        int resultado=0;
        System.out.println("enter Numero 1=");
numero1= s.nextInt(); 

System.out.println("enter Numero 2=");
numero2= s.nextInt();

    //calculo1();    
    //calculo2(numero1,numero2);
    resultado=calculo3(numero1,numero2);
    System.out.println("Suma = "+resultado);
    }
    
    
}
