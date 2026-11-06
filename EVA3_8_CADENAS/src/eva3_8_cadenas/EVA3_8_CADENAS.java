/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_cadenas;

/**
 *
 * @author bisonte
 */
public class EVA3_8_CADENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade = "Hola mundo";
        //LAS CADENAS SON BASICAMENTE ARREGLOS DE CARACTERES
        for (int i = 0; i < cade.length(); i++) {
            System.out.print("{" + cade.charAt(i) + "}");
        }
        
    }
    
}
