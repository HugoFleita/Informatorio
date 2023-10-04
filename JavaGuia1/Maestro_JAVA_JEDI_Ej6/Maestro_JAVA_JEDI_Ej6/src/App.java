/*  * @author Hugo
 *  Cálculo de la velocidad final:
 *Escribir un programa en Java que calcule la velocidad final de un objeto en caída
 *libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
 * transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
 * es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
 *transcurrido
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        double dato_t;
        double datoV_i;
        double dato_g = 9.8;
        double V_F;
        System.out.print("Ingrese valor de  la Velociadd Inicial en Metros por segundo :");
        datoV_i = leer.nextDouble();
        System.out.print("Ingrese el valor del tiempo transcurrido en segundos :");
        dato_t=leer.nextDouble();
        V_F= (datoV_i*dato_g)*dato_t;
        System.out.println("La Velocidad Final calculada es "+V_F+" vel/seg");
        System.out.println("Ejercicio completado");
        leer.close();
    }
}
