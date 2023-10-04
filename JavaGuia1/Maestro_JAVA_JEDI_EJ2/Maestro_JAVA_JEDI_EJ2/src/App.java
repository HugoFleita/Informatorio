import java.util.Scanner;
/*. Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
 * Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
 * la fórmula con la que se resuelve. */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double tempC;
        double conv=33.8;
        System.out.println("Convertir temperatura Celsius a grados Farhenheit  ");
        System.out.println("Ingrese valor  en Celssius ");
        tempC = entrada.nextFloat();
        System.out.println("Resultado Temperatura en Gr. Fharenheith "+(tempC*conv));
        System.out.println("Ejercicio Terminado");
        entrada.close();
    }
}
