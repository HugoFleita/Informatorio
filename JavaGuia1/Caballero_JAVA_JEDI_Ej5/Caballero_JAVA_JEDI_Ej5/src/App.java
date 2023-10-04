import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float numero;
        double tax = 20;
        System.out.println("  Conversion de Pesos a Euros  " );
        System.out.print("Ingrese un monto en Pesos ");
        numero = entrada.nextFloat();
        System.out.println("Resultado en Euros    : "+(numero/tax));
        System.out.println("");
        System.out.print("Ejercicio Terminado ");
        entrada.close();
    }
}
