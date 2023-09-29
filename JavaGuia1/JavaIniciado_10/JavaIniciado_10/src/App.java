import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float acumulador=0; 
        float suma=0;
        System.out.println("Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación\r\n" + //
                "de quince multiplicaciones entre dos números enteros divididos por el número de la\r\n" + //
                "multiplicación");
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Ingresar primer  número :");
        numero1 = teclado.nextInt();
        System.out.print("Ingresar segundo número :");
        numero2 = teclado.nextInt();
        System.out.println("Ingresó para calcular :"+numero1+" y "+numero2);       
            for (int i=1; i<=15 ; i++){
                suma=((numero1*numero2)/i);
                //suma += suma;
                acumulador = acumulador +suma;
                //suma=0;
                System.out.println(i);
                System.out.println(suma);
                
                //acumulador = suma;
                
            }
            System.out.println(acumulador);
        teclado.close();
    }
}
