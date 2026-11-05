/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_6_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        String nombres[];
        int edad[];
        int cant;
        
        System.out.println("Cantidad de clientes a capturar");
        cant = cap.nextInt();
        cap.nextLine();
        nombres = new String[cant];
        edad = new int[cant];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nombre de los clientes");
            nombres[i] = cap.nextLine();
            System.out.println("Introduce la edad del clientes");
            edad[i] = cap.nextInt();
            cap.nextLine();
        }
        System.out.println("Datos Capturados:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombres: " + nombres[i] + ", Edad: " + edad[i]);
    }
  }
}
