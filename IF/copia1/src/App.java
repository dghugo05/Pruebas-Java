import java.util.Scanner;

public class App {
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String YELLOW_BACKGROUND = "\033[43m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        // Aquí dejo indicada el tipo de todas mis variables.
        int edad, precio, select, descuento;
        double total;
        String nombre, mensaje_1, mensaje_2, mensaje_3, mensaje_4, mensaje_final, paquete;
        Boolean bandera;

        System.out.println(GREEN_BACKGROUND + "¡Bienvenido/a a la plataforma digital!" + RESET);

        System.out.printf("Por favor, dinos tu nombre: ");
        nombre = s.nextLine();
        System.out.printf("Por favor, dinos tu edad: ");
        edad = s.nextInt();

        bandera = true;
        paquete = "";
        precio = 0;
        descuento = 0;
        mensaje_final = "";
        mensaje_1 = "¡Felicidades, estás aprovechando al máximo nuestra plataforma!";
        mensaje_2 = "Buena elección para disfrutar de contenido de calidad a buen precio.";
        mensaje_3 = "¡Gracias por unirte! Esperamos que disfrutes del contenido básico!";
        mensaje_4 = "Gracias por registrarte en nuestra plataforma.";

        // Creao un switch anidado dentro de un if para poder filtrar por mayor de edad
        // o no
        if (edad < 18) {
            System.out.println("Disculpe, pero no es elegible para registrarse.");
            bandera = false;
        } else {
            System.out.printf("!Gracias por registrarte %s! \n", nombre);
            System.out.println("Selecciona el tipo de suscripción que deseas: ");
            System.out.println("1. Básica-10\u20ac");
            System.out.println("2. Estandar-15\u20ac");
            System.out.println("3. Premium-20\u20ac");
            select = s.nextInt();
            bandera = true;

            // Cada caso tiene su propio precio de descuento y condiciones de edad para cada
            // descuento de las versione.
            switch (select) {

                case 1:
                    paquete = "Básica";
                    precio = 10;
                    if (edad <= 25) {
                        descuento = 20;
                        mensaje_final = mensaje_4;
                    } else if (edad > 25 && edad <= 40) {
                        descuento = 10;
                        mensaje_final = mensaje_4;
                    } else {
                        descuento = 0;
                        mensaje_final = mensaje_3;
                    }
                    break;

                case 2:
                    paquete = "Estanadar";
                    precio = 15;
                    if (edad <= 25) {
                        descuento = 10;
                        mensaje_final = mensaje_4;
                    } else if (edad > 25 && edad <= 40) {
                        descuento = 10;
                        mensaje_final = mensaje_2;
                    } else {
                        descuento = 0;
                        mensaje_final = mensaje_4;
                    }
                    break;

                case 3:
                    paquete = "Premium";
                    precio = 20;
                    if (edad <= 25) {
                        descuento = 0;
                        mensaje_final = mensaje_1;
                    } else if (edad > 25 && edad <= 40) {
                        descuento = 10;
                        mensaje_final = mensaje_4;
                    } else {
                        descuento = 0;
                        mensaje_final = mensaje_4;
                    }
                default:
                    System.out.println("¡ERROR!: Por favor introduzca un valor válido.");
                    bandera = false;
                    break;
            }

            if (bandera = true) {
                total = precio - ((precio * descuento) / 100);
                System.out.println("Resumen de tu registro: ");
                System.out.printf("Nombre: %s \n", nombre);
                System.out.printf("Tipo de suscripción: %s \n", paquete);
                System.out.printf("Precio original: %d\u20ac \n", precio);
                System.out.printf("Descuento aplicado: %d%% \n", descuento);
                System.out.printf("Precio final: " + RED_BOLD + "%.2f\u20ac \n" + RESET, total);
                System.out.println(YELLOW_BACKGROUND + mensaje_final + RESET);
            }
        }
        s.close();
    }
}
