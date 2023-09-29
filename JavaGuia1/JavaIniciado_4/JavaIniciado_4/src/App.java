import java.util.Scanner;

public class App {
    //Calculo de divisibilidad: Se le solicita que guarden dos números enteros y los
    //sumen. Determinar si el primer numero es divisible por el segundo numero y
    //muestre el resultado

    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        float numero1, numero2, resultado;
        float cosiente;
        System.out.println("Digite primer número y segundo número :");
        numero1 = sn.nextInt();
        numero2 = sn.nextInt();
        System.out.println("El primer número Ingresado es :"+numero1);
        System.out.println("El segundo numero Ingresado es :"+numero2);
        resultado=numero1+numero2;
        if(numero2==0){
            System.out.println("El Cosiente no se puede calcular pues introdujo un CERO");
            }
            cosiente = numero1/numero2;

      

        System.out.println("Los números ingresados suman  :"+resultado);


        System.out.println("El resultado del cosiente del primer numero y el segundo numero es  : "+cosiente);
        
        if (cosiente%2==0) {
            System.out.println("Y ES DIVISIBLE");
            
        }else {System.out.println("Y NO ES DIVISIBLE");}
        sn.close();



    }
}


