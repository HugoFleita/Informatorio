import java.util.Scanner;
/*Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double ladoA;
        double ladoB;
        double hipot;
        System.out.println("Ingrese valor de Lado A :");
        ladoA = entrada.nextFloat();
        System.out.println("Ingrese Valor de Lado B ;");
        ladoB = entrada.nextFloat();
        hipot =(ladoA*ladoA)+(ladoB*ladoB);
        System.out.println("Cateto A :"+ladoA);
        System.out.println("Cateto B  :"+ladoB);
        System.out.println("Resultado el valor de la Hipotenuza es : "+hipot);
        System.out.println("Ejercicio, Terminado");
        entrada.close();
    }
}
