import java.util.Scanner;

import javax.crypto.KEMSpi.EncapsulatorSpi;

public class GestionEstudiantes {
    Scanner s = new Scanner(System.in);

    private Estudiante estudiante;

    public GestionEstudiantes(Estudiante estudiante){
        this.estudiante = estudiante;
    }

    private String pedirCadena(){
        boolean bandera = false;
        String cadena = "";
        while (!bandera) {
            try{
                cadena = s.nextLine();
                bandera = true;
            } catch (Exception e){
                System.out.println("Introduzca datos válidos.");
            }
        }
        return cadena;
    }

    private int pedirEntero(){
        boolean bandera = false;
        int numero= 0;
        while (!bandera) {
            try{
                numero = s.nextInt();
                bandera = true;
            }catch (Exception e){
                System.out.println("Introduzca valores válidos.");
                s.next();
            }
        }
        return numero;
    }
    

    private double pedirReal(){
        boolean bandera = false;
        double numero = 0;
        while (!bandera) {
            try{
                numero = s.nextDouble();
                bandera = true;
            }catch (Exception e){
                System.out.println("Introduzca valores válidos.");
                s.next();
            }
        }
        return numero;
    }

    public Estudiante registrarEstudiante(){
        boolean bandera = false;
        while (!bandera) {
            estudiante = new Estudiante();

            System.out.printf("Introduzca la matrícula: ");
            estudiante.setMatricula(pedirCadena());

            System.out.printf("Introduzca el nombre: ");
            estudiante.setNombre(pedirCadena());

            System.out.printf("Introduzca la edad: ");
            estudiante.setEdad(pedirEntero());

            System.out.printf("Introduzca el promedio: ");
            estudiante.setPromedio(pedirReal());
            
            System.out.println("\n");
        }
        return this.estudiante;
    }

    public String mostrarEstudiante(Estudiante estudiante1, Estudiante estudiante2){
        return estudiante1 + "\n" + estudiante2;
    }
}
