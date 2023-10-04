/* * @author Hugo
 * Cálculo de la media aritmética:
 *Escribir un programa en Java que calcule la media aritmética de un conjunto de
 *números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
 *los números y k es el número total de elementos. Utilicen variables y constantes
 *según corresponda */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int numeros;
        System.out.print("Ingrese cantidad de numeros que va promediar :");
        numeros = leer.nextInt();
        int suma =0;
        double prom = 0;
        int dato =0;
        for (int i=1;i<= numeros; i++){
            System.out.print("ingrese numero "+" "+i+" "+"de"+""+numeros+":");
            dato = leer.nextInt();
            suma = suma + dato;}
            prom = suma / numeros;
            System.out.println("Promedio de los números  :"+prom);
            System.out.println("Ejercicio Terminado  ");
            leer.close();
            

        }
        
        
    }

