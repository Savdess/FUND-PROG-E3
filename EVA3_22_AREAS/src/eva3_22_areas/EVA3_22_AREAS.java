/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_areas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_22_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area;
        double base;
        double altura;
        int Figura = ElegirFigura("De que figura quieres calcular su Area?(1-Circulo, 2-Rectangulo, 3-Triangulo) ");
        if(Figura == 1){
           double valor = capturarDato("Ingresa el radio del circulo");
           area = calcularCir(valor);
            System.out.println("Tu area es " + area);
            }else if(Figura == 2){
                base = capturarDato("Ingresa la base del Rectangulo");
                altura = capturarDato("Ingresa la base del Rectangulo");
                area = calcularRectangulo(base,altura);
                System.out.println("Tu area es: " + area);
            }else if(Figura == 3){
                base = capturarDato("Ingresa la base del Triangulo");
                altura = capturarDato("Ingresa la altura del Triangulo");
                area = calcularTriangulo(base,altura);
                System.out.println("Tu area es: " + area);
            }else{
                System.out.println("ELIGE ALGO VALIDO :u");
            }
    }
    public static double calcularCir(double radio) {
        double resu = Math.PI * Math.pow(radio, 2);
        return resu;
    }
    public static double calcularRectangulo(double base,double altura) {
        double resuf = base * altura;
        return resuf;
    }
    public static double calcularTriangulo(double base,double altura) {
        double resuk = base * altura /2;
        return resuk;      
    }
    public static int ElegirFigura(String mensaje) {
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        int Figura = cap.nextInt();
        return Figura;
    }
    public static double capturarDato(String mensaje) {
        Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        double valor = cap.nextDouble();
        return valor;
    }
       
}

