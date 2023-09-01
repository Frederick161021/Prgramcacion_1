package Instanciables;

public class CT_BilletesMonedas {

    public static void main(String[] args) {
        CB_BilletesMonedas BM1 =new CB_BilletesMonedas(1753);
        CB_BilletesMonedas BM2 =new CB_BilletesMonedas(2458);
        System.out.println("BM1: "+BM1.getCantidad()+"\n\n");
        System.out.println(BM1.Calculo());
        
        BM1.setCantidad(5678);
        
        System.out.println("BM1: "+BM1.getCantidad()+"\n\n");
        System.out.println(BM1.Calculo()+"\n\n\n");
        System.out.println(BM2.Calculo());
    }
    
}
