package Funciones.src.utilidades;
/**
 * @author Hugo de Cristóbal Gómez
 */
public class GeneradorAtleatorio {
    
    /**
     * 
     * @return Devuelve un valor atleatorio para la carta
     */
    public static int generarCarta(){
        return ((int)(Math.random()*40+1));
    }

    /**
     * 
     * @return Devuelve el valor de la tirada de un dado
     */
    public static int generarDado(){
        return ((int)(Math.random()*6+1));
    }
}
