/*Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué? */
public class App {
    public static void main(String[] args) throws Exception {
        float r1=-20.5f; 
        float r2=33.33f;
        int ent1=2;
        int ent2=5;
         //dos numeros reales
         float resA =r1*r2;
         float resB =ent1*ent2;
        System.out.println("Numeros Reales 1.. "+r1);
        System.out.println("Numeros Reales 2.. "+ r2);
        System.out.println("Resultado Producto :"+resA);
        System.out.println("============================");
        System.out.println("Numero Entero 1..es " +ent1);
        System.out.println("Numero Entero 2..es " +ent2);
        System.out.println("Resultado Producto  :"+resB);
    }
}
