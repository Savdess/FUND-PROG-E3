/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_problema_4;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_16_PROBLEMA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String dias [] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
         int Asistencias = 0;
         int RpAsistencia;
         int Inasistencias = 0;
          for (int i = 0; i < 3; i++) {
              Asistencias = 0;
              Inasistencias = 0;
              System.out.println("El Alumno " + (i+1) + "--");
              for (int j = 0; j < dias.length; j++) {
                  Scanner cap = new Scanner(System.in);
                   System.out.println("El alumno asistio el dia: " + dias[j] + "?,[Si = 1, No = 0");
                    RpAsistencia = cap.nextInt();
            if(RpAsistencia == 1){
            Asistencias ++;
            }else if (RpAsistencia == 0){
             Inasistencias ++;
         }
       }
              System.out.println("El alumno tuvo un total de: ");
               System.out.println("Asistencias"  + Asistencias);
               System.out.println("Inasistencias"  + Inasistencias);
      }
    }
}