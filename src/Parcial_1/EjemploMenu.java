package Parcial_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EjemploMenu {

    public EjemploMenu() {}

    public int executeMainMenu() {
        int entrada;
        Scanner opcion = new Scanner(System.in);   

        do{ 

           System.out.println("Ingresa el numero de la accion que quieres relizar");
           System.out.println("1. Crear lista");
           System.out.println("2. Insertar antes del nodo especifico");
           System.out.println("3. Vizualizar");
           System.out.println("4. Eliminar antes del nodo especifico");
           System.out.println("5. Salir del programa");
           entrada =opcion.nextInt();
        }while(entrada>5 || entrada <1 );


        return entrada;
    }

    public List<String> executeCase1Menu() {

        int s2;
        List<String> ejemploLista = new ArrayList<String>();
        Scanner crear= new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        do{

           System.out.println("Ingresa el primer nodo que se agregara: ");

           String nodorecibido = crear.nextLine();
           ejemploLista.add(nodorecibido);
           System.out.println("¿Deseas ingresar otro nodo? S/N ");
           System.out.println("Digita 1 =  Si Digita 2 = No ");
           s2=s.nextInt();

        }while (s2 == 1);

        return ejemploLista;
    }


    public static void main(String[] args) {
           int entrada;
           EjemploMenu ejemploMenu = new EjemploMenu();

           entrada = ejemploMenu.executeMainMenu();
           List<String> ejemploLista = new ArrayList<String>();

           while(entrada!=5) {
                switch (entrada){
                    case 1:  
                      ejemploLista = ejemploMenu.executeCase1Menu();
                      entrada = ejemploMenu.executeMainMenu();
                      break;

                   case 2:  
                      System.out.println("el numero ingresado es 2");
                      //Do something for case 2
                      entrada = ejemploMenu.executeMainMenu();
                      break;

                  case 3:  
                      System.out.println(ejemploLista);
                      entrada = ejemploMenu.executeMainMenu();
                      break;  

                  case 4:  
                      System.out.println("el numero ingresado es 4");
                      //Do something for case 4
                      entrada = ejemploMenu.executeMainMenu();
                      break; 
                }
           }

    }
}