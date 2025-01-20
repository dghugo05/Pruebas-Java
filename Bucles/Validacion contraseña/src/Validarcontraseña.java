import java.util.Scanner;

public class Validarcontraseña {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Ingrese una contraseña: ");
        String password = s.nextLine();
        int contador = 3;

//Primero evaluo nsi la contraseña esta vacia y sino salto a la funcion que comprueba cada condicion de la cotraseña.
            do{
                if (password.length() == 0)
                    System.out.println(RED_BRIGHT + "La contraseña introducida no debe estar vacía." + RESET);
                contador--;
                password = s.nextLine();
            }while (comprobacion(password, contador));
            if (contador == 0) {
                System.out.println(YELLOW_BRIGHT + "Número maximo de intentos alcanzados." + RESET);
            } else {
                System.out.println(GREEN_BRIGHT + "Contraseña segura" + RESET);
            }
        s.close();
    }

//Creo una funcion para cada comprobacion por separado.
    public static boolean comprobar_Length(String password) {
        if (password.length() < 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean no_Minuscula(String password) {
        int paso = 0;
        while (paso < password.length()) {
            for (int caracter = password.length(); caracter >= 0; caracter--) {
                if (Character.isLowerCase(password.charAt(paso))) {
                    return false;
                }
            }
            paso++;
        }
        return true;
    }

    public static boolean no_Mayuscula(String password) {
        int paso = 0;
        while (paso < password.length()) {
            for (int caracter = password.length(); caracter >= 0; caracter--) {
                if (Character.isUpperCase(password.charAt(paso))) {
                    return false;
                }
            }
            paso++;
        }
        return true;
    }

    public static boolean nocontiene_Numero(String password) {
        int paso = 0;
        while (paso < password.length()) {
            for (int caracter = password.length(); caracter >= 0; caracter--) {
                if (Character.isDigit(password.charAt(paso))) {
                    return false;
                }
            }
            paso++;
        }
        return true;
    }

    public static boolean nocontiene_Especial(String password) {
        int paso = 0;
        String caracteresEspeciales = "!@#$%^&*()-_+=<>?/.,;:";
        while (paso < password.length()) {
            for (int caracter = password.length(); caracter >= 0; caracter--) {
                if (password.charAt(paso) == caracteresEspeciales.charAt(caracter)) {
                    return false;
                }
            }
            paso++;
        }
        return true;
    }

    public static boolean Contiene_Espacios(String password) {
        int paso = 0;
        while (paso < password.length()) {
            for (int caracter = password.length(); caracter >= 0; caracter--) {
                if (password.charAt(paso) == ' ') {
                    return true;
                }
            }
            paso++;
        }
        return false;
    }

//Por ultimo cre una funcion para comprobar cada condicion, empezando por la de si contiene espacios.
    public static boolean comprobacion(String password, int contador) {
        boolean bandera = false;
        if (contador > 0) {
            if (Contiene_Espacios(password)) {
                System.out.println(RED_BRIGHT + "Error: La contraseña no debe contener espacios en blanco." + RESET);
                bandera = true;
            } else if (comprobar_Length(password)) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe tener al menos 8 carácteres." + RESET);
                bandera = true;
            } else if (no_Minuscula(password)) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos una minúscula." + RESET);
                bandera = true;
            } else if (no_Mayuscula(password))  {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos una mayuscula." + RESET);
                bandera = true;
            } else if (nocontiene_Numero(password)) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos un número." + RESET);
                bandera = true;
            } else if (nocontiene_Especial(password)) {
                System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos un carácter especial." + RESET);
                bandera = true;
            }
        }
        return bandera;
    }
}
