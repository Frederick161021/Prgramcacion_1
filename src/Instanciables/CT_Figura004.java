package Instanciables;
import javax.swing.*;
import java.awt.*;

public class CT_Figura004 {

    public static void main(String[] args) {

      CB_Figura004 F4 = new CB_Figura004();
      String entrada="";
      int opcion = 0;
    
      do{
     entrada=JOptionPane.showInputDialog("1-. Ciclo FOR\n2.-Ciclo WHILE\n3.-Ciclo DOWHILE\n4.-Fin Programa");
     opcion=Integer.parseInt(entrada);
     
     switch(opcion){
         case 1:F4.FiguraFOR(); break;
         case 2:F4.FiguraWHILE(); break;
         case 3:F4.FiguraDOWHILE(); break;
         case 4: JOptionPane.showMessageDialog(null, "Fin del Programa"); break;
         default:JOptionPane.showMessageDialog(null, "Opcion Invalida");
     }
        
    }while (opcion!=4);  
}    
}   


