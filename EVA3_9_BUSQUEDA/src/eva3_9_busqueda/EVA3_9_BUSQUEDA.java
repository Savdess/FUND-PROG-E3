/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_9_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int valor;
        int[] valores = new int[10];
        boolean valorEncontrado = false;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.print("[" + valores[i] + "]");
        }
        boolean Encontra = false;
        do{
          //pedir el valor
            System.out.println("-Ingresa el valor a buscar en el arreglo");
            valor = cap.nextInt();
            cap.nextLine();
          //buscar
          //Recorrer todos los valores del arreglo
            for (int i = 0; i < valores.length; i++) {
                if(valor == valores[i]){ //EL VALOR ESTA EN EL ARREGLO
                    System.out.println("Encontraste el valor esta en la posicion: " + i);
                    valorEncontrado = true;
                    break;
                }
        
            }
          //si esta en el arreglo salimos del ciclo
          if(valorEncontrado)
          break;
        }while(!Encontra);
     
      }
    }
    

