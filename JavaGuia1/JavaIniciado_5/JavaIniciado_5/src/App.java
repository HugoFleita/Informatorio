import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            /*Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. */
     
        int i,j,filas;
        Scanner renglones = new Scanner(System.in);
        System.out.println("Elija un numero de Filas ");
        filas =renglones.nextInt();
        for(i=1;i<=filas;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }

        System.out.println("un triangulo rectangulo izquierdo");
    }
}
