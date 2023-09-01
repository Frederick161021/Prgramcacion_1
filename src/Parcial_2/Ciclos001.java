package Parcial_2;
import javax.swing.*;
import java.awt.*;

public class Ciclos001 {
    

public static String Tabla(int tabla){
    String salida="";
    
    for (int T = 1; T <= 10; T++) {
        salida+=((tabla*T)+"\t");
    }
    salida+=("\n");
    return salida;
}

public static void cicloFOR(int inicio, int fin){
 String salida= "Ciclo FOR\n";
 for(int F = inicio; F<=fin; F++){
    salida+=(F + "\t");
     salida+=Tabla(F);    
}
JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.white);
jta.setForeground(Color.blue);
JOptionPane.showMessageDialog(null, jta); 
}  

public static void cicloWHILE(int inicio, int fin){
    String salida="Ciclo WHILE\n";

int W=inicio;   
while(W<=fin){ 
    salida+=(W + "\t");
    salida+=Tabla(W);
  W++;    
}   
JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.white);
jta.setForeground(Color.green);
JOptionPane.showMessageDialog(null, jta); 
}

public static void cicloDOWHILE(int inicio, int fin){
   String salida="\nCiclo DOWHILE\n";
   
int D=inicio;  
do{
     salida+=(D+"\t"); 
    salida+=Tabla(D);
  D++;    
}while(D<=fin);  

JTextArea jta = new JTextArea(salida);
jta.setBackground(Color.white);
jta.setForeground(Color.red);
JOptionPane.showMessageDialog(null, jta); 

}

public static void Menu(){
    int opcion=0;
    String entrada="";
    
    do{
entrada = JOptionPane.showInputDialog("Menu de Opciones \n1.- Ciclo FOR\n 2.- Ciclo WHILE \n3.- Ciclo DOWHILE \n4.- Fin de Programa\n Enter Opcion");
opcion = Integer.parseInt(entrada);

    
    switch(opcion){
        case 1: cicloFOR(1,10); break;
        case 2: cicloWHILE(21,30); break;
        case 3: cicloDOWHILE(31,40); break;
        case 4: System.out.println("Fin de Programa"); break;
        default: System.out.println("Opcion Invalida...");
    }
    }while(opcion  != 4);
    
}

    public static void main(String[] args) {
       Menu();
    }    
}
