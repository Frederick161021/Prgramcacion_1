package ProyectoFinal;

public class CB_Calificaciones {

   private int Suma=0,Calificacion=0;
   private double Promedio=0;

public void CB_BilletesMonedas(int Suma, int Calificacion, double Promedio){
        this.Suma=Suma;
        this.Calificacion=Calificacion;
        this.Promedio=Promedio;
    }

 public  String calificaciones(int Calificacion1, int Calificacion2, int Calificacion3, int Calificacion4, int Calificacion5){

   String salida="Calculo:\n\n";
     
   Suma=Calificacion1+Calificacion2+Calificacion3+Calificacion4+Calificacion5;
   Promedio= Suma/5;
        
        if(Promedio<70){
          Calificacion=60;
          salida+="Calificación Final="+Calificacion;        
        }
        
        if(Promedio>=70 && Promedio<=75){
          Calificacion=70;
          salida+="Calificación Final="+Calificacion; 
            }     
        
        if(Promedio>75 && Promedio<=85){
          Calificacion=80;
          salida+="Calificacion Final="+Calificacion;  
            }   
        
        if(Promedio>85 && Promedio<=95){
           Calificacion=90;
           salida+="Calificación Final="+Calificacion;
            }
        
        if(Promedio>95){
           Calificacion=100;
           salida+="Calificación Final="+Calificacion;       
        }
        return salida;
        }   
}
