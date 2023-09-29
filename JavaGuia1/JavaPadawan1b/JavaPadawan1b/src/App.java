import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int contador = 0;
        int acumulador = 0;
        while (contador <20){
            contador = contador +1;
            acumulador = acumulador +contador;
            System.out.println("El contaor va sumando ..."+ contador);    
        }
        JOptionPane.showMessageDialog(null,  "Acumulado es :"+acumulador);
    }
}
