import java.util.Scanner;

public class Chicago {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf(YELLOW_BRIGHT + "CHICAGO\n" + RESET);
        int dado1,dado2, suma_dados;
        int puntuacion_j1 = 0;
        int puntuacion_j2 = 0; 
        int puntuacion_j3 = 0;

        for(int ronda = 1; ronda <= 11; ronda++){
            int puntuacionObjetivo = ronda + 1;
            System.out.printf(RED_BRIGHT + "Ronda %d ; Puntuación objetivo: %d\n" + RESET, ronda, puntuacionObjetivo);
            for(int paso = 0; paso < 3; paso++){
                dado1 = dado1();
                dado2 = dado2();
                suma_dados = dado1 + dado2;

                if(jugadorTirada(paso) == "jugador 1"){
                    puntuacion_j1 += comprobacion(suma_dados, puntuacionObjetivo);
                }else if(jugadorTirada(paso) == "jugador 2"){
                    puntuacion_j2 += comprobacion(suma_dados, puntuacionObjetivo);
                }else{
                    puntuacion_j3 += comprobacion(suma_dados, puntuacionObjetivo);
                }
                
                System.out.printf("Tirada del %s: %d-%d ; %s %s\n", jugadorTirada(paso), dado1, dado2, comprobacion(suma_dados, puntuacionObjetivo), mensajePuntoTirada(suma_dados, puntuacionObjetivo));
            }
            System.out.printf("Puntuaciones generales: Jugador 1 - %d %s ; Jugador 2 - %d %s ; Jugador 3 - %d %s\n", puntuacion_j1, mensajePuntosGeneral(puntuacion_j1, puntuacion_j2, puntuacion_j3), puntuacion_j2, mensajePuntosGeneral(puntuacion_j1, puntuacion_j2, puntuacion_j3), puntuacion_j3, mensajePuntosGeneral(puntuacion_j1, puntuacion_j2, puntuacion_j3));
            if (comprobacionFin(ronda)) {
                System.out.println("Pulse INTRO para la siguiente ronda");
                s.nextLine();
            }

        }
        s.close();
    }

    public static int dado1(){
        return (int)(Math.random()*6+1);
    }

    public static int dado2(){
        return (int)(Math.random()*6+1);
    }

    public static int comprobacion(int suma_dados, int puntuacionObjetivo){
        int puntuacion = 0;
        if ((suma_dados) == puntuacionObjetivo) {
            return puntuacion+=1;
        }else{
            return puntuacion;
        }
    }

    public static String jugadorTirada(int paso){
        String jugador_1 = "jugador 1";
        String jugador_2 = "jugador 2";
        String jugador_3 = "jugador 3";
        switch (paso) {
            case 0:
                return jugador_1;
            case 1:
                return jugador_2;
            default:
                return jugador_3;
        }
    }

    public static String mensajePuntoTirada(int suma_dados, int puntuacionObjetivo){
        if(comprobacion(suma_dados, puntuacionObjetivo) == 1){
            return "punto";
        }else{
            return "puntos";
        }
    }

    public static String mensajePuntosGeneral(int puntuacion_j1, int puntuacion_j2, int puntuacion_j3){
        if(puntuacion_j1 == 1){
            return "punto";
        }else if(puntuacion_j2 == 1){
            return "punto";
        }else if(puntuacion_j3 == 1){
            return "punto";
        }else{
            return "puntos";
        }
    }

    public static boolean comprobacionFin(int ronda){
        if(ronda != 11){
            return true;
        }else{
            return false;
        }
    }
}
