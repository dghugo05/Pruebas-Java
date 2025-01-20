package Funciones.src.utilidades;
/**
 * @author Hugo de Cristóbal Gómez
 */
public class CalcularPuntuacion {
    

    /**
     * 
     * @param carta Se introduce el valor de la carta generada por la función generarCarta en el paquete GeneradorAtleatorio
     * @param dado Se introduce el valor del dado generado por la función generarDado en el paquete GeneradorAtleatorio
     * @return Devuelve el valor de la puntuacion sumandole el bono o restandole la penalizacion en funcion de si la carta es par o impar
     */
    public static double calcularPuntuación(int carta, int dado){
        if(carta % 2 == 0)
        return (((double)dado + (double)carta + (((double)carta * 10) / 100)));
        
        return (((double)dado + (double)carta - (((double)carta*5) / 100)));
    }
}
