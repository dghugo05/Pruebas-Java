import java.util.Scanner;

public class SistemaGestorEstudiante{
    public static void main(String[] args) throws Exception {
        /**
         * gestion a "GestorEstudiantes" type object initialized
         * 
         * s a "Scanner" type object initialized
         * 
         * Main method that calls other methods for the program to run.
         * 
         * s.close closer the scanner
         */
        GestorEstudiantes gestion = new GestorEstudiantes();
        Scanner s = new Scanner(System.in);
        menu(gestion);
        s.close();
    }

    private static void menu(GestorEstudiantes gestor){
        int seleccion;
        System.out.println("Seleccione la acción que desee realizar:");
        System.out.println("---------------------------------------");
        System.out.println("1. Agregar un estudiante");
        System.out.println("2. Agregar una nota a un estudiante");
        System.out.println("3. Mostrar información de todos los estudiantes");
        System.out.println("4. Mostrar estudiantes con promedio mayor a un valor");
        System.out.println("5. Buscar un estudiante por su nombre");
        System.out.println("6. Salir");
        seleccion = pedirEntero();
        select(seleccion, gestor);
    }

    private static int pedirEntero(){
        Scanner s = new Scanner(System.in);
        int num = 0;
        boolean bandera = true;
        while(bandera){
            try{
                num = s.nextInt();
                bandera = false;
            }catch (Exception e){
                System.out.println("Introduzca un valor válido.");
            }
        }
        return num;
    }

    private static double pedirReal(){
        Scanner s = new Scanner(System.in);
        double num = 0;
        boolean bandera = true;
        while (bandera) {
            try{
                num = s.nextDouble();
                bandera = false;
            }catch (Exception e){
                System.out.println("Introduzca un valor válido.");
            }
        }
        return num;
    }

    private static void select(int seleccion, GestorEstudiantes gestor){
        Scanner s = new Scanner(System.in);
        Estudiante estudiante;
        String nombre;
        double nota;
        double promedio;
        switch (seleccion) {
            case 1:
                System.out.printf("Introduzca el nombre del estudiante que desea agregar: ");
                nombre = s.nextLine();
                gestor.agregarEstudiante(nombre);
                menu(gestor);
                break;
            case 2:
                System.out.printf("Introduzca el nombre del estudiante: ");
                nombre = s.nextLine();
                System.out.printf("\nIntroduzca la nota que desea agregar al historial del estudiante: ");
                nota = pedirReal();
                gestor.agregarNotaAEstudiante(nombre, nota);
                menu(gestor);
            case 3:
                gestor.mostrarEstudiantes();
                menu(gestor);
            case 4:
                System.out.printf("Introduzca el promedio del cual quiere saber los estudiantes cuyo promedio sea mayor: ");
                promedio = pedirReal();
                gestor.mostrarEstudiantesConPromedioMayorA(promedio);
                menu(gestor);
            case 5:
                System.out.printf("Introduzca el nombre del estudiante que desee encontrar: ");
                nombre = s.nextLine();
                estudiante = gestor.buscarEstudiante(nombre);
                if(estudiante == null)
                    System.out.println("No se encuentra un estudiante por ese nombre");
                System.out.println(estudiante);
                menu(gestor);
            case 6:
                break;
            default:
                System.out.println("Ha surgido algun error");
                break;
        }
        s.close();
    }
}
