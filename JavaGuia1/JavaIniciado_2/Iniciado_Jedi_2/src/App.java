import java.util.Scanner;

public class App {
    //Suma de dos números: Se le solicita que guarden dos números enteros y los
    //sumen. El resultado mostrarlo por pantalla.
    //y un mensaje que diga si es par o impar

    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Digite primer número y segundo número :");
        numero1 = sn.nextInt();
        numero2 = sn.nextInt();
        System.out.println("El primer número Ingresado es :"+numero1);
        System.out.println("El segundo numero Ingresado es :"+numero2);
        resultado=numero1+numero2;
        System.out.println("El resultado de la suma del primer numero + segundo numero es  : "+resultado);
        if (resultado%2==0) {
            System.out.println("Y ES ------ PAR");
            
        }else {System.out.println("Y ES -------IMPAR");}
        sn.close();



    }
}

