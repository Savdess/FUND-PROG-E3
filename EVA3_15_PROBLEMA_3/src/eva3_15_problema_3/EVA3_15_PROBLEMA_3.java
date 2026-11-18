/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_problema_3;

/**
 *
 * @author bisonte
 */
public class EVA3_15_PROBLEMA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cubo[][] = new int[5][5];//24 ENTEROS
        
        for (int i = 0; i < cubo.length; i++) { //1ER DIMENSIÓN
            for (int j = 0; j < cubo[i].length; j++) { //2DA DIMENSIÓN
                    cubo[i][j] = (int)(Math.random() * 10);
                     System.out.print("[" + cubo[i][j] + "]");
                }
            System.out.println("");
            }      
        System.out.println("--VALORES EN INVERSO--");
        //COMO MOSTRAMOS LOS VALORES
        for (int i = 4; i >= 0; i--) {
                  for (int j = 4; j >= 0; j--) { //2DA DIMENSIÓN
                    System.out.print("[" + cubo[i][j] + "]");
                }
                      System.out.println("");
            }        
    }
}