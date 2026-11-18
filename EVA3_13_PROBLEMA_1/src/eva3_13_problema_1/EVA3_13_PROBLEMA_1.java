/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_1;

import java.util.Scanner;

/** 
 *
 * @author bisonte
 */
public class EVA3_13_PROBLEMA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int valor;
        int contador = 0;
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 9);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.print("[" + valores[i] + "]");
        }
         //pedir el valor 
         System.out.println("-Ingresa el valor que gustes[0-9]");
            valor = cap.nextInt();
            cap.nextLine();
            for (int i = 0; i < valores.length; i++) {
                if(valor == valores[i]){
                    contador++;
                }
            }
                 System.out.println("El valor se repite: " + contador + " Veces"); 
         }
     }
   
 
    