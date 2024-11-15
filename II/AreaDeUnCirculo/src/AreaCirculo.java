
//Importo el módulo Scanner
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) throws Exception {
        //Creo el Scanner y le indico que va a ser para introducciones de ordenes por teclado
        Scanner s = new Scanner(System.in);
        //Creo la primera parte de lo visible usando println y printf. Siendo que este último lo uso paraq poder introducir los datos en la misma línea.
        System.out.println("\033[1;30m ÁREA DE UN CÍRCULO");
        System.out.println(" ==================");
        System.out.printf("\033[0m Introduzca el radio (cm): ");

        double cm = s.nextDouble();
        //Uso los modulos math para facilitar el calculo del area
        double area = Math.PI * Math.pow(cm, 2);
        // uso una mezcal de comandos de color para ir alternandolos y al final los restablezco al original
        System.out.printf("\033[1;30m El área del círculo es: \033[1;31m %1.6f \033[1;30m cm\u00B2 \033[0m", area);

        s.close();
    }
}
