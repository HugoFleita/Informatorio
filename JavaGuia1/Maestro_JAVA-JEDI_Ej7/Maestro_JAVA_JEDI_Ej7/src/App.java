/*Cálculo de la fuerza centrípeta:
 *Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
 *mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
 *y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
 *fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
 *de la trayectoria 
 
 
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        double dato_m;
        double dato_V;
        double dato_r;
        double F_C;
        System.out.print("Ingrese valor de la masa en Kg  :");
        dato_m=leer.nextDouble();
        System.out.println("Ingrese valor de la Velocidad en segundos :");
        dato_V=leer.nextDouble();
        System.out.print("Ingrese valor del Radio de la Circunferencia  :");
        dato_r = leer.nextFloat();
        F_C = dato_m*(dato_V)*(dato_V/dato_r);
        System.out.println("La Fuerza Centrípeta es :"+F_C+"  Jules");
        leer.close();
        System.out.println("Ejercicio Completado");
    }
}
