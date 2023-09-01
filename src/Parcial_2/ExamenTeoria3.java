package Parcial_2;

public class ExamenTeoria3 {
    
    public static void CicloConjunto(int... numeros){
        System.out.println("Numeros:");
        for (int numero:numeros ) {
        System.out.print(numero+"\t");    
        }
        
        }
    

    public static void main(String[] args) {
        CicloConjunto(10,20,40,60,80,90);
    }
    
}
