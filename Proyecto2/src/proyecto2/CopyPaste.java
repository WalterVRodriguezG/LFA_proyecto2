/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author walterrodriguez
 */
public class CopyPaste {
    int noMovs;
    int cadenaDuplicada;
    List <String> temporal;
    List <String> temporal2;
    String patronSalida;
    
    private void iniciar(){
        noMovs = 0;
        temporal = new ArrayList<String>();
        temporal2 = new ArrayList<String>();
        patronSalida = "";
        cadenaDuplicada = 0;
    }
    
    private void finalizar(){
        System.exit(0);
       
    }
    
    public void tomarCadena(String patron){
        iniciar();
        int tamanoOriginal = 0;
        System.out.println("tamanio Patron: "+patron.length());
        for (int i = 0; i < patron.length(); i++) {
            temporal.add((String) patron.subSequence(i, i+1));
        }
       
        tamanoOriginal = temporal.size();
        
        System.out.println("\nTamaño del arreglo: " + temporal.size() + "\n");
        cadenaDuplicada = 2*tamanoOriginal;
        System.out.println("Cadena ingresada: " + temporal + "\n");
        noMovs++;
       
       switch(temporal.get(0)){
           case "a":
               System.out.println("q0 ---> q1 \n");
               temporal.set(0, "X");
               System.out.println("Nueva Cadena: " + temporal);
               Q1();
               break;
           case "b":
               System.out.println("q0 ---> q4 \n");
               temporal.set(0, "Y");
               
               System.out.println("Nueva Cadena: " + temporal);
               Q4();
               break;
           case "c":
               System.out.println("q0 ---> q5 \n");
               temporal.set(0, "Z");
               
               System.out.println("Nueva Cadena: " + temporal);
               Q5();
               break;
           default:
               System.out.println(" --- letra no valida : " + temporal.get(0) + " --- \n Debe ingresar unicamente a,b o c.");                               
               break;
       } 
        
    }
    
    public void Q1(){
        //int i = 0;
        for (int i = 0; i < temporal.size(); i++) {
            //while(temporal.get(i) != null){
            System.out.println("Nuevo Tamanio: "+ temporal.size());
            //if (temporal.get(i) != null) {
                System.out.println("q1, posicion: "+ i + "\n");
                noMovs++;
                //i++;
            //}else{
                System.out.println("q1 ---> q2");
                noMovs++;
            ///if (temporal.get(i) == null) {
                
                //temporal.add("X") = ' ';
            //}
        }
        temporal.add("X");
        Q2();
    }
    
    public void Q2(){
        System.out.println("Cadena en Q2: "+ temporal);
        System.out.println("Nuevo tamanio en Q2: "+ temporal.size());
        if (temporal.size() <= cadenaDuplicada) {
            
            for (int i = temporal.size()-1; i >= 0; i--) {
            
            
                System.out.println("q2, posicion: " + i + "\n");
                noMovs++;
                System.out.println("q2 ---> q3");
                noMovs++;
        //temporal2.addAll(temporal);
                System.out.println("Cadena en Q3" + temporal);
                System.out.println("Nuevo tamanio en q3: "+temporal.size());
                Q3();
            
            }
        }else{
            Q6();
        }
    }
    
    public void Q3(){
        
        for (int i = 0; i <= temporal.size()-1; i++) {
            //i++;
            switch(temporal.get(i)){
                case "X":
                    System.out.println("q3, posicion: " + i + "\n");
                    noMovs++;
                    break;
                case "Y":
                    System.out.println("q3, posicion: " + i + "\n");
                    noMovs++;
                    break;
                case "Z":
                    System.out.println("q3, posicion: " + i + "\n");
                    noMovs++;
                    break;
                case "a":
                    System.out.println("q3 ---> q1");
                    temporal.set(i, "X");
                    noMovs++;
                    Q1();
                    break;
                case "b":
                    System.out.println("q3 ---> q4");
                    temporal.set(i, "Y");
                    noMovs++;
                    Q4();
                    break;
                case "c":
                    System.out.println("q3 ---> q5");
                    temporal.set(i, "Z");
                    noMovs++;
                    Q5();
                    break;
//                case " ":
//                    System.out.println("q3 ---> q6");
//                    noMovs++;
//                    Q6();
//                    break;
                default:
                    System.out.println("Caracter no valido: "+ temporal.get(i)+ "\n");
                    break;
            }
            
        }
        System.out.println("Cadena a Q6: "+ temporal);
        Q6();
    }
    
     public void Q4(){
        for (int i = temporal.size()-1; i >= 0; i--) {
            
            if (temporal.get(i) != " ") {
                System.out.println("q4, posicion: " + i + "\n");
                noMovs++;
               // i--;
            }
        }
          System.out.println("q4 ---> q2");
            noMovs++;
            temporal.add("Y");
           // temporal.clear();
            //temporal.addAll(temporal2);
                Q2();
    
    }
     
      public void Q5(){
        for (int i = 0; i < temporal.size()-1; i++) {
            if (temporal.get(i) != " ") {
                System.out.println("q5, posicion: "+ i + "\n");
                noMovs++;
            }
        }
            System.out.println("q5 ---> q2");
            noMovs++;
            
            temporal.add("Z");
            Q2();
            
    }
      
      public void Q6(){
          
          for (int i = temporal.size()-1; i >= 0; i--) {
              //i--;
              switch(temporal.get(i)){
                  case "X":
                      temporal.set(i, "a");
                      noMovs++;
                      System.out.println("q6, posicion: " + i + "\n");
                    break;
                  case "Y":
                      temporal.set(i, "b");
                      noMovs++;
                      System.out.println("q6, posicion: " + i + "\n");
                      break;
                  case "Z":
                      temporal.set(i, "c");
                      noMovs++;
                      System.out.println("q6, posicion: " + i + "\n");
                    break;
                  case " ":
                      noMovs++;
                      System.out.println("q6  ---> q7 \n");
                      Q7();
                      break;
                  default:
                      System.out.println("Caracter no valido: "+ temporal.get(i)+ "\n");
                      break;
              }
          }
          Q7();
      
      }
      
      public void Q7(){
          System.out.println("\n Estado de Aceptación \n Nueva cadena: "+ temporal.toString() + "\n Cantidad de movimientos: "+ noMovs);
          finalizar();
          
      }
}