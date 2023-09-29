
public class App {
    /*  Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades.
*/
    public static void main(String[] args) throws Exception {
        System.out.println(" NOMBRES Y EDADES-> DEVOLVERA LISTA Y PROMEDIO EDAD");
        
        String data ="Abel";
        int edad1 = 17;
        String data2 ="Maria";
        int edad2 = 19;
        String data3 = "Gonzalo";
        int edad3 = 25;
        String data4 = "Luisa";
        int edad4 = 18;
        String data5 = "Toto";
        int edad5 = 23;
        float prom = (edad1+edad2+edad3+edad4+edad5)/5;

        System.out.println(data+" "+edad1);
        System.out.println(data2+" "+edad2);
        System.out.println(data3+" "+edad3);
        System.out.println(data4+" "+edad4);
        System.out.println(data5+" "+edad5);
        System.out.println("====================");
        System.out.println("El promedio de edades es :"+prom);


       
        
        
        
       
        

        System.out.println("Fin ejercicio 4 ");
    }
}
