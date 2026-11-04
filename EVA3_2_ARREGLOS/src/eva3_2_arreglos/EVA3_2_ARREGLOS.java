/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author bisonte
 */
public class EVA3_2_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo, x, y;
        arreglo = new int[10];
        //int[] arreglo, x, y; // tODOS SON ARREGLOS AQUI
        //arreglo[10] = 100;  el indice es incorrecto,10 no es una posicion valida(llega hasta el 9)
        
        //EL USO DE ARREGLO VA LIGADO AL USO DE CICLOS.
        //EN PARTICULAR EEL CLICLO FOR
        for(int i = 0; i < 10; i++ ){
        arreglo[i] = (int)(Math.random() * 100); //CASTING --->,COMPATIBLES
        System.out.println("Calificacion es: " + arreglo[i]);
    }
  }
}
