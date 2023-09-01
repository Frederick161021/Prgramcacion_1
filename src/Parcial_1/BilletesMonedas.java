package Parcial_1;
import java.util.Scanner;
public class BilletesMonedas {
    
    //referencia a Scanner 
    static Scanner s = new Scanner(System.in);
    
public static String calculo(int cantidad){//void(no regresa a nada) String (regresa un dato) 
//Tipo de Datos Variables
int B1000=0,B500=0,B200=0,B100=0,B50=0,M20=0,M10=0,M5=0,M2=0,M1=0;

String salida="billetes y monetas\n";

B1000=cantidad/1000;
cantidad=cantidad%1000;
//System.out.println("B100="+B1000);
//System.out.println("cantidad="+cantidad);

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



//System.out.println("B1000="+B1000+"\n"+"B500="+B500);

salida+=("B1000="+B1000+"B500="+B500+"B200="+B200+"B100="+B100+"B50="+B50+
        "M20="+M20+"M10="+M10+"M5="+M5+"M2="+M2+"M1="+M1);//salida+

salida +="\n Fin de calculo";
//System.out.println("Cantidad="+salida);
System.out.println(salida);
return salida;
}
    
    public static void main(String[] args) {
        //Tipo de Datos 
        int numero=0;
        String resultado="";
        //Entreda de Datos 
        System.out.println("Enter Numero=");
        numero=s.nextInt();
      
      resultado= calculo(numero);
      resultado+="\n fin del programa";
      System.out.println(resultado);
    }
    
}
