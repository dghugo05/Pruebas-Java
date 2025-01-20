import Funciones.src.utilidades.CalcularPuntuacion;
import Funciones.src.utilidades.GeneradorAtleatorio;
import Funciones.src.utilidades.ImpresoraResultados;
import java.util.Scanner;
/**
 * @author Hugo de Cristóbal Gómez
 */
public class CompeticionMagos {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("¡Bienvenido a la competición de magos! \n¿Desea participar? (s/n) ");
        int dadoMago1, dadoMago2, cartaMago1, cartaMago2;
        double puntuacionMago1, puntuacionMago2;
        double puntuacionTotalMago1 = 0;
        double puntuacionTotalMago2 = 0;

        //El if principal en donde si el usuario introduce s se continua entrando al bucle y sino se sale.
        if(s.nextLine().equals("s")){
            for(int ronda = 1; ronda <= 5; ronda++){
                dadoMago1 = GeneradorAtleatorio.generarDado();
                cartaMago1 = GeneradorAtleatorio.generarCarta();
                puntuacionMago1 = CalcularPuntuacion.calcularPuntuación(cartaMago1, dadoMago1);
                puntuacionTotalMago1 += puntuacionMago1;

                dadoMago2 = GeneradorAtleatorio.generarDado();
                cartaMago2 = GeneradorAtleatorio.generarCarta();
                puntuacionMago2 = CalcularPuntuacion.calcularPuntuación(cartaMago2, dadoMago2);
                puntuacionTotalMago2 += puntuacionMago2;

                System.out.printf(GREEN_BRIGHT + "\n-----Ronda %d-----\n" + RESET, ronda);
                System.out.printf("Mago 1: dado = %d  carta = %d  %s = %.2f\n", dadoMago1, cartaMago1, ImpresoraResultados.puntoOPuntos(puntuacionMago1), puntuacionMago1);
                System.out.printf("Mago 2: dado = %d  carta = %d  %s = %.2f\n", dadoMago2, cartaMago2, ImpresoraResultados.puntoOPuntos(puntuacionMago2), puntuacionMago2);
                System.out.printf(GREEN_BRIGHT + "\nPuntuación total:\n" + YELLOW_BRIGHT + "Mago 1 = %.2f %s \nMago 2 = %.2f %s" + RESET, puntuacionTotalMago1, ImpresoraResultados.puntoOPuntos(puntuacionTotalMago1), puntuacionTotalMago2, ImpresoraResultados.puntoOPuntos(puntuacionTotalMago2));

                System.out.println("\nPara continuar presion INTRO");
                s.nextLine();
            }

            //Se llama a la funcion Imprimir resultados psandole las variables casteadas a INT pra que coincida con los parámetros esperados.
            ImpresoraResultados.imprimirResultados(puntuacionTotalMago1, puntuacionTotalMago2);


        }else{
            System.out.println("Muchas gracias por haberse pasado.\nLe deseo un buen día.");
        }

        s.close();
    }
}
