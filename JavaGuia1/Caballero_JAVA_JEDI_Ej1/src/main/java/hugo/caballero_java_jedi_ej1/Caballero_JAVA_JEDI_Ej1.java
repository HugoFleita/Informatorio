/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hugo.caballero_java_jedi_ej1;

import java.util.Scanner;

/**
 *
 * @author Hugo
 * Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
 *porcentaje que indique el segundo número del primer número
 * 
 */
public class Caballero_JAVA_JEDI_Ej1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        float tax;
        float resultado;
        System.out.println("Obtener un porcentaje dado dos datos ");
        System.out.print("Ingrese un numero Real : ");        
        numero = entrada.nextInt();
        System.out.print("Ahora un numero entero para la Tax : ");
        tax = entrada.nextInt();
        resultado =numero*tax/100;
        System.out.println("Resultado  "+(resultado));
        System.out.println("Comprobacion del resultado ..."+numero);
        System.out.println("valor del porcentaje    ...   "+resultado);
        System.out.println("=======================================");
        System.out.println("Total numero menos porcentaje :"+(+numero-resultado));
        System.out.println("=======================================");
        
        entrada.close();
    }
}
