/*Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
y apellido, luego guarde su edad e imprimalos por pantalla. */
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String miNombre;
          int edad;
        System.out.print("Escriba su Nombre :");
        miNombre = entrada.nextLine();
        System.out.print("Edad ");
        edad= entrada.nextInt();


        System.out.println("Usted es :"+miNombre+" Tiene la edad de "+edad+" ¡Bastante grande che!"); 
        entrada.close();
    
    }
    
}
