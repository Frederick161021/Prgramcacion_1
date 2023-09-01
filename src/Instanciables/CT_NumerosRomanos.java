package Instanciables;
import javax.swing.*;
public class CT_NumerosRomanos {


    public static void main(String[] args) { 
        int cantidad=0;
        String salida="";
        
         salida = JOptionPane.showInputDialog("Digite una cantidad:");
         cantidad= Integer.parseInt(salida);
         
        CB_NumerosRomanos NR = new CB_NumerosRomanos(cantidad);
        salida = NR.Calculo();
        JOptionPane.showMessageDialog(null, salida);
    }
    
}
