import java.util.Scanner;

public class App {
    //Suma de dos números: Se le solicita que guarden dos números enteros y los
    //sumen. El resultado mostrarlo por pantalla.

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Digite un número  :");
        numero1 = entrada.nextInt();
        System.out.println("El primer numero Ingresado es :"+numero1);
        System.out.println("Digite otro número   :");
        numero2 = entrada.nextInt();
        System.out.println("El segundo numero Ingresado es :"+numero2);
        resultado=numero1+numero2;
        System.out.println("El resultado de la suma del primer numero + segundo numero es  : "+resultado);
        entrada.close();



    }
}
