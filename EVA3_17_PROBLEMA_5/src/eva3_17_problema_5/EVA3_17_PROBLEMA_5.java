/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_problema_5;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_17_PROBLEMA_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        String[]Ciudades = {"Madrid","Ciudad De Mexico","Chihuahua","Paris","Barcelona"};
        for (int i = 0; i < Ciudades.length; i++) {
            String Ciudad = Ciudades[i];
               System.out.println("Explorando Ciudades...." + Ciudad + ".....");
               double STemperaturas = 0;
               for (int dia = 1; dia <= 7; dia++) {
                   System.out.println("Cual es la temperatura del dia " + dia + " en " + Ciudad + "?");
                   double Temperatura = cap.nextDouble();
                   STemperaturas = STemperaturas + Temperatura;
                   
            }
              double PromedioTemp = STemperaturas / 7;
              System.out.println("El promedio de temperatura en " + Ciudad + " es " + PromedioTemp + "\n");
        }
           }
    }
