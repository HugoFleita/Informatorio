import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int contador = 21;
        int acumulador = 20;
        while (contador >0){
            contador = contador -1;
            acumulador = acumulador -contador;
            System.out.println("El contador va restando ..."+ contador);    
        }
        JOptionPane.showMessageDialog(null,  "Acumulador ya es :"+contador);
    }
}
