/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_7_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String[] opciones = {"0-Tacos", "1-Tamales", "2-Arroz con leche", "3-Trozo de Pizza", "4-Flautas", "5-Pescado a la Plancha con Ensalada Fresca", "6-Pasta a la Bolonesa", "7-Milanesa con Papas Fritas", "8-Tacos al Pastor", "9-Hamburguesa Artesanal con Queso", "10-Salir del menu"};
   double[] precio = {25.0,20.0,30.0,35.0,28.0,95.0,85.0,90.0,30.0,110.0,0.0};
        System.out.println("--------------Menu Del Sistema------------");
        for(int i = 0; i < opciones.length; i++ ){
        System.out.println(opciones[i] + " " + precio[i]);
    }
        Scanner cap = new Scanner(System.in);
        System.out.println("Selecciona una opcion");
        int sel = cap.nextInt();
        switch(sel){
            case 0:
                System.out.println(opciones[0] + " " + precio[0]);
                break;
                 case 1:
                System.out.println(opciones[1] + " " + precio[1]);;
                break;
                 case 2:
                System.out.println(opciones[2] + " " + precio[2]);
                break;
                 case 3:
                System.out.println(opciones[3] + " " + precio[3]);
                break;
                case 4:
                System.out.println(opciones[4] + " " + precio[4]);
                break;
                case 5:
                System.out.println(opciones[5] + " " + precio[5]);
                break;
                case 6:
                System.out.println(opciones[6] + " " + precio[6]);
                break;
                case 7:
                System.out.println(opciones[7] + " " + precio[7]);
                break;
                case 8:
                System.out.println(opciones[8] + " " + precio[8]);
                break;
                case 9:
                System.out.println(opciones[9] + " " + precio[9]);
                break;
                case 10:
                System.out.println(opciones[10] + " " + precio[10]);
                break;
                default:
                System.out.println("Opcion incorrecta");
        }
   } 
}
