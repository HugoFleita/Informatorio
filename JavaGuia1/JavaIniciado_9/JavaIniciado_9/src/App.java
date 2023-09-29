import java.util.Scanner;

public class App {
    /* Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
luego haga la potencia de ese número al cuadrado y al cubo.
*/
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número :");
        int numero;
        numero=teclado.nextInt();
        System.out.print("El numero ingresado es :"+numero);
        System.out.println();
        System.out.print("El cuadrado del Numero es :"+numero*numero);
        System.out.println();
        System.out.print("El  cubo del Numero   es  :"+numero*numero*numero);
        teclado.close();
    }
}
