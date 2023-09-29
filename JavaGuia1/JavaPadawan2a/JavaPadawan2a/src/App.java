public class App {
    /* Descontador: Se le solicita que guarde un número en un espacio de memoria y
discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
usar para hacerlo?*/
    public static void main(String[] args) throws Exception {
        int descontador = 21;
        while(descontador>0){
            descontador = descontador-1;
            
            System.out.println("El contador es ahora "+descontador);
        }
        System.out.println("Descontador utilizando instruccion WHILE");
    }
}
