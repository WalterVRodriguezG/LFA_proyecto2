/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Scanner;

/**
 *
 * @author walterrodriguez
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner menu = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\n Seleccione una Maquina de Turing: \n 1. Palindromo \n 2. CopyPaste \n 3.Salir \n");
            opcion = menu.nextInt();
             
            switch(opcion){
                case 1:
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Ingrese una cadena:");
                    String recibeCadena = entrada.nextLine();
        
                    Palindromo metodos = new Palindromo();
                    metodos.tomarCadena(recibeCadena+" ");
                    System.out.println("\n Fin Palindromo. \n");
                    break;
                    
                case 2:
                    Scanner entrada2 = new Scanner(System.in);
                    System.out.println("Ingrese una cadena:");
                    String recibeCadena2 = entrada2.nextLine();
        
                    CopyPaste metodo2 = new CopyPaste();
                    metodo2.tomarCadena(recibeCadena2);
                    System.out.println("\n Fin Copiar Patrón. \n");
                break;
                default:
                    System.out.println("<<< Valor no valido >>>");
                    break;
            }
       
        }while(opcion != 0);
        
        System.out.println("\nFin lectura...");
    }
    
}
