package Parcial_1;
public class TablaMultiplicar {

    public static int calculoTablaMultiplicar(int tabla, int numero){
    int contador=1; 
    
//   if (contador<=numero) System.out.println (tabla+"*"+contador+"="+(tabla*contador++));
//   if (contador<=numero) System.out.println (tabla+"*"+contador+"="+(tabla*contador++));
//   if (contador<=numero)System.out.println(tabla+"*"+contador+"="+(tabla*contador++));
//   if (contador<=numero)System.out.println(tabla+"*"+contador+"="+(tabla*contador++));
//   if (contador<=numero)System.out.println(tabla+"*"+contador+"="+(tabla*contador++));
//   if (contador<=numero)System.out.println(tabla+"*"+contador+"="+(tabla*contador++));
//   if (contador<=numero)System.out.println(tabla+"*"+contador+"="+(tabla*contador++));
//   if (contador<=numero)System.out.println(tabla+"*"+contador+"="+(tabla*contador++));
//   if (contador<=numero)System.out.println(tabla+"*"+contador+"="+(tabla*contador++));
//   if (contador<=numero)System.out.println(tabla+"*"+contador+"="+(tabla*contador++));
   
int resultado=0; 
   
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador++)+"\t");}//1
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador++)+"\t");}//2
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador++)+"\t");}//3
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador++)+"\t");}//4
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador++)+"\t");}//5
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador++)+"\t");}//6
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador++)+"\t");}//7
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador++)+"\t");}//8
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador++)+"\t");}//9
            if (contador<=numero){resultado+=(tabla*contador);System.out.print((tabla*contador)+"\t");}//10
           
            System.out.print(resultado);
            
            return resultado;
    }

    public static void main(String[] args) {
     
        int sumaResultado=0;
        
     sumaResultado+=calculoTablaMultiplicar(1,10);
      System.out.println("");
     sumaResultado+=calculoTablaMultiplicar(2,10);
      System.out.println("");
     sumaResultado+=calculoTablaMultiplicar(3,10);
      System.out.println("");
     sumaResultado+=calculoTablaMultiplicar(4,10);
      System.out.println("");
     sumaResultado+=calculoTablaMultiplicar(5,10);
      System.out.println("");
       sumaResultado+=calculoTablaMultiplicar(6,10);
      System.out.println("");
       sumaResultado+=calculoTablaMultiplicar(7,10);
      System.out.println("");
       sumaResultado+=calculoTablaMultiplicar(8,10);
      System.out.println("");
       sumaResultado+=calculoTablaMultiplicar(9,10);
      System.out.println("");
       sumaResultado+=calculoTablaMultiplicar(10,10);
      System.out.println("");
             
           System.out.println("\t\t\t\t\t\t\t\t\t\t"+sumaResultado);
//     calculoTablaMultiplicar(2,10);
//           System.out.println("");
//     calculoTablaMultiplicar(3,10);
//          System.out.println("");
//     calculoTablaMultiplicar(4,10);
//          System.out.println("");
//     calculoTablaMultiplicar(5,10);
//          System.out.println("");
//     calculoTablaMultiplicar(6,10);
//          System.out.println("");
//     calculoTablaMultiplicar(7,10);
//          System.out.println("");
//     calculoTablaMultiplicar(8,10);
//          System.out.println("");
//     calculoTablaMultiplicar(9,10);
//          System.out.println("");
    }
//     calculoTablaMultiplicar(10,10);
//          System.out.println("");
    
    }
    