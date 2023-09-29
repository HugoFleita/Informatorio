import java.util.Scanner;

public class App {
    /*Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla */
    public static void main(String[] args) throws Exception {
        float constante = 0.453592f;
        float libras =0;
        System.out.println("Convertir Libras a Kilogramos");
        System.out.print("ingresar dato de libras  :");
        Scanner teclado = new Scanner(System.in);
        libras = teclado.nextFloat();
        System.out.println("El valor en kilogramos es :  "+(libras*constante)+" Kg");
        teclado.close();

    }
}
