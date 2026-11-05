/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_menu2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_5_MENU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] opciones = {"1-Ventas", "2-Clientes", "3-Proveedores", "4-Salir",};
        System.out.println("--------------Menu Del Sistema------------");
        for(int i = 0; i < opciones.length; i++ ){
        System.out.println(opciones[i]);
    }
        Scanner cap = new Scanner(System.in);
        System.out.println("Selecciona una opcion");
        int sel = cap.nextInt();
        switch(sel){
            case 0:
                System.out.println("Modulio de ventas");
                break;
                 case 1:
                System.out.println("Modulio de Clientes");
                break;
                 case 2:
                System.out.println("Modulo de Proveedores");
                break;
                 case 3:
                System.out.println("Saliendo del sistema");
                break;
                default:
                System.out.println("Opcion incorrecta");
        }
   } 
}
