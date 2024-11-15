import java.util.Scanner;

public class Factura {
    public static final String CYAN_BACKGROUND = "\033[46m";
    public static final String RESET = "\033[0m";
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);


    System.out.println("LIBRERÍA DE SUEÑOS");
    System.out.println("==================");


    System.out.printf("Introduce código de libro:");
    int cod = s.nextInt();


    System.out.printf("Introduce precio:");
    double precio_ud = s.nextDouble();


    System.out.printf("Introduce unidades vendidas:");
    int unidades = s.nextInt();


    System.out.printf("Introduce descuento (%%):");
    int desc = s.nextInt();
    

    double precio = precio_ud * unidades;
    double desc_total = (desc * precio)/100;
    double precio_total = precio - desc_total;    
    double iva = (precio_total * 16)/100;
    double total = precio - desc + iva;


    System.out.println("Su ticket:");
    System.out.println("┌─────────────────────────────┐");
    System.out.println("│ LIBRERÍA DE SUEÑOS          │");
    System.out.println("├─────────────────────────────┤");
    System.out.printf("│ Cód. %6d %14.2f\u20ac │ \n", cod, precio_ud); 
    System.out.printf("│ %1d uds. %19.2f\u20ac │ \n", unidades, precio);
    System.out.printf("│ %3d%% %21.2f\u20ac │ \n", -desc, -desc_total);
    System.out.printf("│ 16%% IVA %18.2f\u20ac │ \n", +iva);
    System.out.printf("│" + CYAN_BACKGROUND +" TOTAL %20.2f\u20ac " + RESET + "│ \n", total);
    System.out.println("└─────────────────────────────┘");

    
    s.close();
    }
}
