/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_21_temperaturas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_21_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double centi = capturarTemp("Captura los grados centigrados: ");
        System.out.println(centi + "C = " + convertirCaF(centi) + "F" );
        double fahrenheit = capturarTemp("Captura los grados fahrenheit");
        System.out.println(fahrenheit + "F = " + convertirFaC(fahrenheit) + "C" );
        double Kelvin = capturarTemp("Captura los grados Kelvin");
        System.out.println(Kelvin + "C = " + convertirCak(Kelvin) + "K" );
    }
    public static double convertirCaF(double centi) {
        double resu = centi * 1.8 + 32;
        return resu;
    }
    public static double convertirFaC(double fahrenheit) {
        double resuf = (fahrenheit-32) * 5/9;
        return resuf;
    }
    public static double convertirCak(double Kelvin) {
        double resuk = Kelvin+273.15;
        return resuk;      
    }
    public static double capturarTemp(String mensaje) {
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        double valor = cap.nextDouble();
        return valor;
    }
       
}

