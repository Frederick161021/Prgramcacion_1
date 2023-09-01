//1.-Entreda
package Parcial_1;
import java.util.Scanner;//Para la entreda de valores por el teclado 
public class CalculoDias {
static Scanner s = new Scanner (System.in);//creando objeto (referencia) Scanner static usar uno objeto en todo el programa 
  
//2.-Entrada de Datos
public static void calculo(){
 
        //Definicion de Variable
     int añoActual=2021,mesActual=4,diaActual=23,
             añoNacio=0,mesNacio=0,diaNacio=0,dias=0;
     int difAños,difMes,difDias;
//     System.out.println("Enter AñoActual=");//mensaje de salida
//     añoActual=s.nextInt();
//     
//       System.out.println("Enter MesActual=");
//     mesActual=s.nextInt();
//     
//       System.out.println("Enter DiaActual=");
//     diaActual=s.nextInt();
     
       System.out.println("Enter AñoNacio=");
     añoNacio=s.nextInt();
     
     System.out.println("Enter MesNacio=");
     mesNacio=s.nextInt();
     
     System.out.println("Enter DiaNacio=");
     diaNacio=s.nextInt();
     
//     //Mostrar Valores
//     System.out.println("Fecha Actual="+"\t"+añoActual+"\t"+mesActual+"\t"+diaActual);
//     System.out.println("Fecha Nacio="+"\t"+añoNacio+"\t"+mesNacio+"\t"+diaNacio);
     

//3.-Proseso 
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
    //4.-salida 
    System.out.println("Dias Calculados="+ dias);
    }
    public static void main(String[] args) {
    calculo();
    }
}    