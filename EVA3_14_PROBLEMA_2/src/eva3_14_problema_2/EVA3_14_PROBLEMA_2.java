/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_problema_2;

/**
 *
 * @author bisonte
 */
public class EVA3_14_PROBLEMA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] valores = new int[10];
   
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 50);
        }
       int mayor = valores[0];
       int menor = valores[0];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("[" + valores[i] + "]");
        }
        System.out.println("");
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
            
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }
        System.out.println("El valor mas grande es: " + mayor);
        System.out.println("El valor mas pequeño es: " + menor);
    }
}