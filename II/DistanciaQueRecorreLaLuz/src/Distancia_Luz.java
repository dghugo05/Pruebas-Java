import java.util.Scanner;
public class Distancia_Luz {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("DISTANCIA QUE RECORRE LA LUZ");
        System.out.println("============================");
        System.out.printf("Ingrese el número de años: ");
        //Esta sección lee los años introducidos por el ususairo y los calcula en segunddos.
        int años = s.nextInt();
        double segundos = (años*365)*(24*3600);
        double kilometros = segundos * 299.792;

        System.out.printf("La luz recorre aproximadamente %1.2f kilómetros en %1d años.", kilometros, años);
        
        s.close();
    }
}
