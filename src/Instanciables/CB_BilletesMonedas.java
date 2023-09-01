package Instanciables;

public class CB_BilletesMonedas {
    private int cantidad=0;
    
    public CB_BilletesMonedas(int cantidad){
        this.cantidad=cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public String Calculo(){
       int B1000=0,B500=0,B200=0,B100=0,B50=0,M20=0,M10=0,M5=0,M2=0,M1=0;

String salida="\t\t"+"Billetes y Monetas\n";

B1000=cantidad/1000;
cantidad=cantidad%1000;

B500=cantidad/500;
cantidad=cantidad%500;

B200=cantidad/200;
cantidad=cantidad%200;

B100=cantidad/100;
cantidad=cantidad%100;

B50=cantidad/50;
cantidad=cantidad%50;

M20=cantidad/20;
cantidad=cantidad%20;

M10=cantidad/10;
cantidad=cantidad%10;

M5=cantidad/5;
cantidad=cantidad%5;

M2=cantidad/2;
cantidad=cantidad%2;

M1=cantidad;



//System.out.println("B1000="+B1000+"\n"+"B500="+B500);

salida+=("B1000="+B1000+"\n"+"B500="+B500+"\n"+"B200="+B200+"\n"+"B100="+B100+"\n"+"B50="+B50+"\n"+
        "M20="+M20+"\n"+"M10="+M10+"\n"+"M5="+M5+"\n"+"M2="+M2+"\n"+"M1="+M1);//salida+

salida +="\n Fin de calculo";
//System.out.println("Cantidad="+salida);
System.out.println(salida);
salida="";
return salida; 
    }
}
