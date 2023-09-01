package Parcial_1;
import java.util.Scanner;

public class CalculoPromedios {
static Scanner s = new Scanner(System.in); 

public static void calculo(){
 
    int Calificacion1=0,Calificacion2=0,Calificacion3=0,Calificacion4=0,Calificacion5=0,
            Suma=0,Calificacion=0;
           double Promedio=0;
    
        System.out.println("Enter Calificacion 1=");
        Calificacion1=s.nextInt();
         System.out.println("Enter Calificacion 2=");
        Calificacion2=s.nextInt();
         System.out.println("Enter Calificacion 3=");
        Calificacion3=s.nextInt();
         System.out.println("Enter Calificacion 4=");
        Calificacion4=s.nextInt();
         System.out.println("Enter Calificacion 5=");
        Calificacion5=s.nextInt();
        
        Suma=Calificacion1+Calificacion2+Calificacion3+Calificacion4+Calificacion5;
        Promedio= Suma/5;
        
        if(Promedio<70){
        Calificacion=60;
        System.out.println("Calificacion Final="+Calificacion);        
        }
        
        if(Promedio>=70 && Promedio<=75){
            Calificacion=70;
        System.out.println("Calificacion Final="+Calificacion);  
            }     
        
        if(Promedio>75 && Promedio<=85){
            Calificacion=80;
        System.out.println("Calificacion Final="+Calificacion);  
            }   
        
        if(Promedio>85 && Promedio<=95){
            Calificacion=90;
        System.out.println("Calificacion Final="+Calificacion);  
            }
        
        if(Promedio>95){
        Calificacion=100;
        System.out.println("Calificacion Final="+Calificacion);        
        }
                }
    
    public static void main(String[] args) {
        calculo();
    }
}