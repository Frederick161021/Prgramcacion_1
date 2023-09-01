package Parcial_1;
import java.util.Scanner;
public class ExamenProblema2 {
    static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
    int Segundos=0, Dia=0, Horas=0, Minutos=0;
    
        System.out.println("Enter Segundos:");
        Segundos=s.nextInt();
        
        Dia=Segundos/86400;
        Segundos=Segundos % 86400;
        
        Horas=Segundos/3600;
        Segundos=Segundos % 3600;
        
        Minutos=Segundos/60;
                Segundos=Segundos %60;
                
                System.out.println("Dias="+Dia+"\n"+"Horas="+Horas+"\n"+"Minutos="+Minutos+"\n"+"Segundos="+Segundos);
    }
    
}
