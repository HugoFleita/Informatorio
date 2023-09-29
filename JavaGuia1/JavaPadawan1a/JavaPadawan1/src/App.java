public class App {
    /*Contador: Se le solicita que guarde un número en un espacio de memoria e
incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
para hacerlo?
 */
    public static void main(String[] args) throws Exception {
        int contador = 0;
        while(contador<20){
            contador = contador+1;
            
            System.out.println("El contador es ahora "+contador);
        }
        System.out.println("Contador utilizando instruccion WHILE");
    }
}
