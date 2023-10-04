import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner entrada = new Scanner(System.in);
        float numero;
        double tax=1.20d;
        System.out.println("Equivalencia de Euros a Dólares   ");
        System.out.print("Ingrese un monto en Euros con (,) decimal : ");        
        numero = entrada.nextFloat();
        System.out.println("Resultado Dolares U$S "+(numero*tax));
        System.out.println("  Ejercicio terminado  ");
        entrada.close();

        
    }
}
