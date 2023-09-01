package Instanciables;

public class CB_TotalPagar {
    private int impresoraCompro, computadoraCompro, discoCompro;
    
    public CB_TotalPagar(int computadoraCompro, int impresoraCompro, int discoCompro){
        this.computadoraCompro = computadoraCompro;
        this.impresoraCompro = impresoraCompro;
        this.discoCompro = discoCompro;
    }
    
    public String Calculo(){ 

int totalArticulos=0, pagoComputadora=0,pagoImpresora=0, pagoDisco=0;
int totalPagar=0;
String salida="";

totalArticulos= computadoraCompro+ impresoraCompro+ discoCompro;

if (totalArticulos>0){
pagoComputadora= computadoraCompro*10000;
pagoImpresora= impresoraCompro*3000;
pagoDisco= discoCompro*1500;
totalPagar=pagoComputadora+pagoImpresora+pagoDisco;
salida= "Total a pagar="+totalPagar;
}
 if (totalArticulos==0){
     salida="Fin del Progrma...";
 }

return salida;
}    
}
 