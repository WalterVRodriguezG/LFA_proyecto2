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
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        String recibeCadena = entrada.nextLine();
        
        Palindromo metodos = new Palindromo();
        metodos.tomarCadena(recibeCadena+" ");
        System.out.println("\nFin lectura...");
    }
    
}
