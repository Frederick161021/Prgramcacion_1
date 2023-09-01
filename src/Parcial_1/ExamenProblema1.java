package Parcial_1;
import java.util.Scanner;

public class ExamenProblema1 {
 static Scanner s=new Scanner(System.in);
   
    public static void main(String[] args) {
  int Enero=0, Febrero=0, Marzo=0,Calificacion=0, Venta=0;
  
        System.out.println("Enter Ventas de Enero:");
        Enero= s.nextInt();
        
           System.out.println("Enter Ventas de Febrero:");
        Febrero= s.nextInt();
        
           System.out.println("Enter Ventas de Marzo:");
        Marzo= s.nextInt();
        
        Venta=(Enero+Febrero+Marzo);
        System.out.println("Total de Ventas="+Venta);
        
        if(Venta>=100000){
        Calificacion=10;
        System.out.println("Calificación="+Calificacion);
        }
        
        if(Venta>=50000 && Venta<100000){
        Calificacion=9;
        System.out.println("Calificación="+Calificacion);
        }
        
        if(Venta>=20000 && Venta<50000){
        Calificacion=8;
        System.out.println("Calificación="+Calificacion);
        }
       
        if(Venta<20000){
        Calificacion=10;
        System.out.println("Calificación="+Calificacion);
        }
        
        }
        
    }

