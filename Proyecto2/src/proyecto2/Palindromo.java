/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author walterrodriguez
 */
public class Palindromo {
    
    char [] arregloTemporal;
    int estado;
    int indice;
    int contadorMov;
  
    
    private void iniciar(){
        estado = 0;
        indice = 0;
        contadorMov = 0;
        arregloTemporal = null;
    }
    
    public void tomarCadena(String cadena){
        iniciar();
        char [] arregloPalindromo = cadena.toCharArray();
        
        System.out.println("Tamanio arreglo: "+ arregloPalindromo.length);
        
        for (int i = 0; i < arregloPalindromo.length; i++) {
          switch(arregloPalindromo[i]){
              case 'a':
                    contadorMov++;
                    //Cambio de Estado del 0 al 1:
                    System.out.println(" q0 ---> q1 \n" + "q1, posicion: "+i + "\n");
                    arregloPalindromo[i]= ' ';
                    i++;
                    //arregloTemporal = arregloPalindromo;
                    //Omite los caracteres hasta encontrar un espacio hacia la derecha:
                    while(arregloPalindromo[i] != ' '){
                        System.out.println("q1, posicion: "+ i + "\n");
                        contadorMov++;
                        i++;
                    }
                    //Cuando encuentra el espacio, evalua la ultima posición:
                    System.out.println(" q1 ---> q2 \n" + "q2, posicion: " + i + "\n");
                    i--;
                    contadorMov++;
                    //Compara que la ultima posicion sea igual a la primera:
                    if (arregloPalindromo[i] == 'a') {
                        System.out.println(" q2 ---> q3 \n" + "q3, posicion: "+i + "\n"); 
                        arregloPalindromo[i] = ' ';
                        contadorMov++;
                        i--;
                        //Omite los caracteres hasta encontrar un espacio hacia la izquierda:
                        while(arregloPalindromo[i] != ' '){
                            System.out.println("q3, posicion: "+ i + "\n");
                            contadorMov++;
                            i--;
                        }
                        //Cuando lo encuentra evalua la siguiente posicion, saliendo del case, regresando al FOR
                        System.out.println(" q3 ---> q0 \n" + "q2, posicion: "+i + "\n");
                        contadorMov++;
                    }else if (arregloPalindromo [i] == ' ') {
                        System.out.println("q2 --> q8 \n" + "q8, posicion: "+i + "\n ¡¡¡ Es Palindromo!!! ");
                    }
                    else{
                        System.out.println("No es palindromo.");
                        i = arregloPalindromo.length;
                    }
                  break;
              case 'b':
                  System.out.println(" q0 ---> q4\n");
                  contadorMov++;
                    //Cambio de Estado del 0 al 1:
                    //System.out.println(" q0 ---> q1 \n" + "q1, posicion: "+i + "\n");
                    arregloPalindromo[i]= ' ';
                    i++;
                    //arregloTemporal = arregloPalindromo;
                    //Omite los caracteres hasta encontrar un espacio hacia la derecha:
                    while(arregloPalindromo[i] != ' '){
                        System.out.println("q4, posicion: "+ i + "\n");
                        contadorMov++;
                        i++;
                    }
                    //Cuando encuentra el espacio, evalua la ultima posición:
                    System.out.println(" q4 ---> q5 \n" + "q5, posicion: " + i + "\n");
                    i--;
                    contadorMov++;
                    //Compara que la ultima posicion sea igual a la primera:
                    if (arregloPalindromo[i] == 'b') {
                        System.out.println(" q5 ---> q3 \n" + "q3, posicion: "+i + "\n"); 
                        arregloPalindromo[i] = ' ';
                        contadorMov++;
                        i--;
                        //Omite los caracteres hasta encontrar un espacio hacia la izquierda:
                        while(arregloPalindromo[i] != ' '){
                            System.out.println("q3, posicion: "+ i + "\n");
                            contadorMov++;
                            i--;
                        }
                        //Cuando lo encuentra evalua la siguiente posicion, saliendo del case, regresando al FOR
                        System.out.println(" q3 ---> q0 \n" + "q2, posicion: "+i + "\n");
                        contadorMov++;
                    }else if (arregloPalindromo [i] == ' ') {
                        System.out.println("q5 ---> q8 \n" + "q8, posicion: "+i + "\n ¡¡¡ Es Palindromo!!! ");
                    }
                    else{
                        System.out.println("No es palindromo.");
                        i = arregloPalindromo.length;
                    }
                  break;
              case 'c':
                  System.out.println(" q0 ---> q6 \n");
                  contadorMov++;
                    //Cambio de Estado del 0 al 1:
                    //System.out.println(" q0 ---> q1 \n" + "q1, posicion: "+i + "\n");
                    arregloPalindromo[i]= ' ';
                    i++;
                    //arregloTemporal = arregloPalindromo;
                    //Omite los caracteres hasta encontrar un espacio hacia la derecha:
                    while(arregloPalindromo[i] != ' '){
                        System.out.println("q6, posicion: "+ i + "\n");
                        contadorMov++;
                        i++;
                    }
                    //Cuando encuentra el espacio, evalua la ultima posición:
                    System.out.println(" q6 ---> q7 \n" + "q5, posicion: " + i + "\n");
                    i--;
                    contadorMov++;
                    //Compara que la ultima posicion sea igual a la primera:
                    if (arregloPalindromo[i] == 'c') {
                        System.out.println(" q7 ---> q3 \n" + "q3, posicion: "+i + "\n"); 
                        arregloPalindromo[i] = ' ';
                        contadorMov++;
                        i--;
                        //Omite los caracteres hasta encontrar un espacio hacia la izquierda:
                        while(arregloPalindromo[i] != ' '){
                            System.out.println("q3, posicion: "+ i + "\n");
                            contadorMov++;
                            i--;
                        }
                        //Cuando lo encuentra evalua la siguiente posicion, saliendo del case, regresando al FOR
                        System.out.println(" q3 ---> q0 \n" + "q2, posicion: "+i + "\n");
                        contadorMov++;
                    }else if (arregloPalindromo [i] == ' ') {
                        System.out.println("q7 --> q8 \n" + "q8, posicion: "+i + "\n ¡Es Palindromo! ");
                    }
                    else{
                        System.out.println("No es palindromo");
                        i = arregloPalindromo.length;
                    }
                  break;
              case ' ':
                  System.out.println(" q0 ---> q8\n");
                  System.out.println("¡¡¡ Es Palindromo!!!");
                   i = arregloPalindromo.length;
                  break;
              default:
                  System.out.println(" --- letra no valida : " + arregloPalindromo[i] + " --- \n Debe ingresar unicamente a,b o c.");
                  i = arregloPalindromo.length;
                  break;
          }
        } 
        System.out.println("\nContador de Movimientos: "+ contadorMov);
    }    
}
