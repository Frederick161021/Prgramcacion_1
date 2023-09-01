package Parcial_2;
import Parcial_1.*;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class CalculoTotalPagarCiclo {
 
//referencia a Scanner
    static Scanner s = new Scanner(System.in);//static es para que la identifique todo el programa
//Metodo de calculo 
public static String Calculo(int cliente, int computadoraCompro,int impresoraCompro, int discoCompro  ){ 
//1.- Definicion de Variables
String salida="";   
int totalArticulos=0, pagoComputadora=0,pagoImpresora=0, pagoDisco=0;
int totalPagar=0;

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
 else 
//4.-Salida
salida += ("El cliente  #"+cliente + "pago="+totalPagar);
 return salida;
 
// entrada= JOptionPane.showInputDialog("Opciones\n 1.- Ciclo For\n 2.- Ciclo While\n 3.-Ciclo Do While");
// optinon 
}    
  

    public static void main(String[] args) {
        String resultado="";
        for (int F = 1; F < 10; F++) {
            
//    MenuOpciones();
    
        }
JTextArea jta = new JTextArea(resultado);
jta.setBackground(Color.white);
jta.setForeground(Color.blue);
JOptionPane.showMessageDialog(null, jta); 
    }
    
}
