import java.util.Scanner;


/**  Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
 * usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
 * tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
 * dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.
 * 
 *  */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double numero;
        double tax = 50000;
        System.out.println("Conversion de Bitcoin a Dolares");
        System.out.print("Ingrese un Monto de Bitcoins ");
        numero = entrada.nextFloat();
        System.out.println("Resuelto equivale a Dólares  U$s "+(numero*tax));
        System.out.println("Ejercicio Terminado  ");
        entrada.close();
    }
}
