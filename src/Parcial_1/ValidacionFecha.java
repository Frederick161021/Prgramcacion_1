//Programa para validar una Fecha (Año,Mes,Dia)
//condiciones
//El ano es Vaslido si es mayor a 2000
//El mes es Valido si esta entre 1 y 12 
//El  dia es Valido si corresponde a los dias del mes 
//mes de 31 dias (1,3,5,7,8,10,12)
//mes de 30 dias (4,6,9,11)
//mes de 28 dias(2)
//Todo en un moemento de calculo que regrese el resultado 
//Fecha valida o fecha invalida

package Parcial_1;
import java.util.Scanner;
public class ValidacionFecha{
static Scanner s = new Scanner(System.in);

public static int diasMes(int mes){
int dias=0;
if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)
dias = 31;
if (mes==4||mes==6||mes==9||mes==11)
dias=30;
if(mes==2)dias=28;

return dias;
}

public static String calculo(){
String resultado="Fecha Invalida";

int año=0, mes=0,dia=0;
System.out.println("Enter Dia=");
 dia=s.nextInt();
System.out.println("Enter Mes=");
 mes=s.nextInt();
 System.out.println("Enter Año=");
 año=s.nextInt(); 
 if (año>=2000){
 if (mes>=1 && mes<=12){
 if (dia>=1 && dia<=diasMes(mes)){
resultado="Fecha Valida";
 }}}
       return resultado;
}
    public static void main(String[] args) {
      System.out.println("Resultado ="+calculo());
    } 
}
