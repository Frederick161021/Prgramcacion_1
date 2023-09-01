package Parcial_2;
import Parcial_1.*;
import java.util.Scanner;
public class BilletesMonedasCiclos {
    
    //referencia a Scanner 
    static Scanner s = new Scanner(System.in);
    
public static void Calculo(int... numeros){//void(no regresa a nada) String (regresa un dato) 
//Tipo de Datos Variables
int B1000=0,B500=0,B200=0,B100=0,B50=0,M20=0,M10=0,M5=0,M2=0,M1=0;

String salida="billetes y monetas\n";
//salida+="B100/B500/B200/B100/B50/M20/M10/M5/M2/M1\n";

for (int cantidad:numeros){
    
    salida+= cantidad +"\t";
B1000=cantidad/1000;
cantidad=cantidad%1000;
//System.out.println("B100="+B1000);
//System.out.println("cantidad="+cantidad);

B500=cantidad/500;
cantidad=cantidad%500;

B200=cantidad/200;
cantidad=cantidad%10;

M5=cantidad/5;
cantidad=cantidad%5;

M2=cantidad/2;
cantidad=cantidad%2;

M1=cantidad;
}

salida+="B100\t B500\t B200\t B100\t B50\t M20\t M10\t M5\t M2\t M1\n";
//System.out.println("B1000="+B1000+"\n"+"B500="+B500);

//salida+=(B1000+B500+B200+B100+B50+
//       M20+M10+M5+M2+M1);//salida+

salida +="\n ";

System.out.println(salida);


}    

    public static void main(String[] args) {
     Calculo( 1000,200,1531);
    }
    
}
