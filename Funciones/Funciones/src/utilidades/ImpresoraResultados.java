package Funciones.src.utilidades;
/**
 * @author Hugo de Cristóbal Gómez
 */
public class ImpresoraResultados {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset


/**
 * 
 * @param puntuacionMago1 Se introduce la puntuación que ha ido acumulando el mago número 1
 * @param puntuacionMago2 Se introduce la puntuación que ha ido acumulando el mago número 2
 */
    public static void imprimirResultados(double puntuacionMago1, double puntuacionMago2){
        if(puntuacionMago1 > puntuacionMago2){
            System.out.printf("Las puntuaciones son:\n Mago 1 = %.2f %s.  Mago 2 = %.2f %s. \nEl ganador es el " + YELLOW_BRIGHT + "Mago 1", puntuacionMago1, puntoOPuntos(puntuacionMago1), puntuacionMago2, puntoOPuntos(puntuacionMago2));
        }else if(puntuacionMago2 > puntuacionMago1){
            System.out.printf("Las puntuaciones son:\n Mago 1 = %.2f %s.  Mago 2 = %.2f %s. \nEl ganador es el " + YELLOW_BRIGHT + "Mago 2" + RESET, puntuacionMago1, puntoOPuntos(puntuacionMago1), puntuacionMago2, puntoOPuntos(puntuacionMago2));
        }else{
            System.out.printf("Las puntuaciones son:\n Mago 1 = %.2f %s.  Mago 2 = %.2f %s. \n" + RED_BRIGHT + "Se ha producido un empate", puntuacionMago1, puntoOPuntos(puntuacionMago1), puntuacionMago2, puntoOPuntos(puntuacionMago2));        }
    }

    public static String puntoOPuntos(double puntuacionMago1){        
        if(puntuacionMago1 == 1)
            return "punto";
        
        return "puntos";
    }
}
