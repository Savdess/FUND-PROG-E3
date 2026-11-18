/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

/**
 *
 * @author bisonte
 */
public class EVA3_18_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //LLAMAR O INVOCAR EL METODO
        mostrarmensaje("Hola mundo!");
        mostrarmensaje("Eick Rios");
        mostrarmensaje("Fundamentos de Programacion");
        mostrarmensaje("Sistemas Computacionales");
        //QUE HACER CON METODOS QUE REGRESAN VALORES
        //1. RECUPERAR EL VALOR PARA USARLO DESPUES
        int resultado = sumar(10,20);
        System.out.println("Suma de 10 + 20 = " + resultado);
        //2.USARLO DIRECTAMENTE
        System.out.println("Suma de 10+ 20 = " + sumar(10,20));
        //3.NO IMPORTA EL VALOR DE RETORNO
        sumar(10,20);
    }   
    //modificadores valore de retorno
    //DEBE DE SER UN VERBO INFINITIVO
    //VARIAS PALABRAS:INICIAR EN MINUSCULAS,DEMAS INICIAR EN MAYUSCULAS
    public static void mostrarmensaje(String mensaje) { //CABECERA
       //CUERPO DEL METODO O IMPLEMENTACION
       System.out.println(mensaje);
  }
    public static int sumar(int val1, int val2) {
        int resu = val1 + val2;
        return resu;
    }
}
