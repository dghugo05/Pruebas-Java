import java.util.Scanner;

public class Km {
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String RESET = "\033[0m";
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);


        System.out.printf("Ingrese la cantidad de kilómetros: ");
        double km = s.nextDouble();


        System.out.println("------------------------------------------");
        
        
        System.out.println("Cantidad de kilómetros: " + 10 + " km");
        double millas = km * 0.621371;


        System.out.println("Equivalente en millas: " + YELLOW_BACKGROUND + millas + " mi" + RESET);
        System.out.println("------------------------------------------");
        System.out.println("La conversión se realizó utilizando la fórmula:");

        
        System.out.println(RED_BACKGROUND + "1 km" + RESET + " = " + GREEN_BACKGROUND + "0.627371 mi" + RESET);

        
        s.close();
    }
}
