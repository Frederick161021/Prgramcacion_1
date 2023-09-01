import java.util.Scanner;
public class CalculoTotalPagar {
    //referencia a Scanner
    static Scanner s = new Scanner(System.in);//static es para que la identifique todo el programa
//Metodo de calculo
public static void Calculo(){
//1.- Definicion de Variables
int computadoraCompro=0, impresoraCompro=0, discoCompro=0;
int totalArticulos=0, pagoComputadora=0,pagoImpresora=0, pagoDisco=0;
int totalPagar=0;
//2.- entreda de Datos
System.out.println("Enter numero Computadoras=");
computadoraCompro=s.nextInt();

System.out.println("Enter numero Impresoras=");
impresoraCompro=s.nextInt();

System.out.println("Enter numero Discos=");
discoCompro=s.nextInt();

//3.-Proceso
totalArticulos= computadoraCompro+ impresoraCompro+ discoCompro;

if (totalArticulos>0){
pagoComputadora= computadoraCompro*10000;
pagoImpresora= impresoraCompro*3000;
pagoDisco= discoCompro*1500;
totalPagar=pagoComputadora+pagoImpresora+pagoDisco;
}
 if (totalArticulos==0){
     System.out.println("Fin del Progrma...");
 }

//4.-Salida
System.out.println("Total a pagar="+totalPagar);
}

    public static void main(String[] args) {
    Calculo();
    }

}
