/* Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
 *de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
 *resuelve.
 */
import java.util.Scanner;
 public class App {
   


public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double radio;
        double pi=3.141516;
        System.out.println("Calcular el Area de un Círculo  ");
        System.out.print("Ingrese valor del radio ... ");
        radio = entrada.nextFloat();
        System.out.println("Resultado Area de Circunferencia "+(pi*(radio)*(radio)));
        System.out.println("Ejercicio terminado ");

        
    }
}
