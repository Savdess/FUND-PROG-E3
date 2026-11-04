/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author bisonte
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //UN ARREGLO ES UNA ESTRUCTURA DE DATOS
        //EN UNA SECUENCIA DE VALORES
        //TODOS LOS DATOS SON EL MISMO TIPO
        //NO CAMBIA DE TAMAÑO (INMUTABLE)
        //EL ACCESO ES POR INDICES(ACCESOS ALEATORIOS)
        int [] arreglo; //SOLO DECLARO EL ARREGLO,NO EXISTE
        //ESPECIFICAR EL TAMAÑO
        arreglo = new int[10000000];//A PARTIR DE AQUIMIMPORTA ENTENDER EL TAMAÑO DE LOS DATOS
        // int [] arreglo = new int[10];
        //EN JAVA EL PRIMER ELEMENTO ESTA EN LA POSICION CERO 
        //EL ULTIMO ES LA POSICIOON N -1,DONDE N ES LA CANTIDAD DE ELEMENTOS
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        arreglo [0] = 100;
        arreglo [1] = 200;
        arreglo [2] = 300;
        arreglo [3] = 400;
        arreglo [4] = 500;
        arreglo [5] = 600;
        arreglo [6] = 700;
        arreglo [7] = 800;
        arreglo [8] = 900;
        arreglo [9] = 1000;
        System.out.println("Arreglo[0] = " + arreglo[0]);
        System.out.println("Arreglo[1] = " + arreglo[1]);
        System.out.println("Arreglo[2] = " + arreglo[2]);
        System.out.println("Arreglo[3] = " + arreglo[3]);
        System.out.println("Arreglo[4] = " + arreglo[4]);
        System.out.println("Arreglo[5] = " + arreglo[5]);
        System.out.println("Arreglo[6] = " + arreglo[6]);
        System.out.println("Arreglo[7] = " + arreglo[7]);
        System.out.println("Arreglo[8] = " + arreglo[8]);
        System.out.println("Arreglo[9] = " + arreglo[9]);
    }
    
}
