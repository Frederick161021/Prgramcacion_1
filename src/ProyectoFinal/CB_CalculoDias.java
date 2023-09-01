package ProyectoFinal;

public class CB_CalculoDias {
private int difAños,difMes,difDias,dias;

public void CB_CalculoDias(int difAños, int difMes, int difDias, int dias){
    
    this.difAños = difAños;
    this.difMes = difMes;
    this.difDias = difDias;
    this.dias = dias;
}

public String calculoDias(int diaNacio,int mesNacio,int añoNacio, int diaActual, int mesActual,int añoActual){
 
 String salida="";   
 if(diaActual<diaNacio){
    mesActual = mesActual-1;//Restar 1 al mes actual(mesActual--; o mesActual-=1;)
    diaActual = diaActual+30;}

 if(mesActual<mesNacio){
 añoActual= añoActual-1;
 mesActual= mesActual+12;}   

    difAños= añoActual- añoNacio;
    difMes= mesActual- mesNacio;
    difDias= diaActual- diaNacio;
    dias =(difAños*365)+(difMes*30)+difDias;
  
    salida+= dias;
    return salida;
    }    
}
