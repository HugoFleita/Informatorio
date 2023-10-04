import java.util.Scanner;

/**
 *
 * @author Hugo 
 * Conversión de libras esterlinas a dólares: Escribir un programa en Java que
 * solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
 *  dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
 *libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
 *deberá mostrar 70 dólares.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada =new Scanner(System.in);
        float numero=0;
        double tax=1.4;
        System.out.println("Conversion de Libras esterlinas Dólares ");
        System.out.println("Ingrese un monto en Libras esterlinas  ");
        numero=entrada.nextInt();
        System.out.println("Resultado equivalente en dólares "+(numero*tax));
        System.out.println("Ejercicio terminado");
        entrada.close();
    }
}
