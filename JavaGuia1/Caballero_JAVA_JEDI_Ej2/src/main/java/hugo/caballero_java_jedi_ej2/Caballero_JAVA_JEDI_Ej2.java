/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hugo.caballero_java_jedi_ej2;

import java.util.Scanner;

/**
 *
 * @author Hugo
 * Conversión de dólares a pesos: Escribir un programa en Java que solicite al
 * usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
 * tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
 * usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos
 * 
 */
public class Caballero_JAVA_JEDI_Ej2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero;
        float tax=20;
        System.out.println("Equivalencia de U$S Dólares a $ Pesos  ");
        System.out.print("Ingrese un monto en Dólares ");        
        numero = entrada.nextInt();
        // System.out.println("Ahora un numero entero para la Tax");
        //tax = entrada.nextInt();
        System.out.println("Resultado Pesos :"+(numero*tax));
        entrada.close();
    }
}
