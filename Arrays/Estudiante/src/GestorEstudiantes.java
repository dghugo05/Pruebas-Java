/**
 * A class named "GestorEstudiantes" that manage the students.
 */
public class GestorEstudiantes{
    /**
     * Estudiante[] is an array of students.
     * 
     * int cantidadEstudiantes is the number of students.
     */
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    /**
     * The construct of the class "GestorEstudiantes" that initialize the array of students at 20 
     * and the number of students as 0.
     */
    public GestorEstudiantes(){
        estudiantes = new Estudiante[20];
        cantidadEstudiantes = 0;
    }

    /**
     * This method add a new student to the array of students.
     * 
     * @param nombre the name of the student.
     */
    public void agregarEstudiante(String nombre){
        if(cantidadEstudiantes < estudiantes.length){
            estudiantes[cantidadEstudiantes] = new Estudiante(nombre);
            System.out.println("Se añadio el estudiante con éxito");
            cantidadEstudiantes++;
        }else{
            System.out.println("Se ha sobrepasado la capacidad de almacenaje de estudiantes");;
        }
    }

    /**
     * This method print the information of the student with the same name as introduced.
     * 
     * @param nombre the name of the student.
     * @return a obejct of type "Estudiante" if the student is found, otherwise null.
     */
    public Estudiante buscarEstudiante(String nombre){
        for(int paso = 0; paso < cantidadEstudiantes; paso++){
            if(estudiantes[paso].getNombre().equalsIgnoreCase(nombre)){
                return estudiantes[paso];
            }
        }
        return null;
    }

    /**
     * This method adds a mark to a student.
     * 
     * @param nomrbe the name of the student.
     * @param nota the mark of the student.
     */
    public void agregarNotaAEstudiante(String nomrbe, double nota){
        for(Estudiante estudiante:estudiantes){
            if (estudiante != null){
                if(estudiante.getNombre().equalsIgnoreCase(nomrbe)){
                    estudiante.agregarNotas(nota);
                    System.out.println("Se añadio la nota con éxito.");
                }else{
                    System.out.println("No se pudo encontrar al estudiante.");
                }
            }
        }
    }

    /**
     * This method print the information of all the students.
     */
    public void mostrarEstudiantes(){
        if(cantidadEstudiantes > 0){
            for(Estudiante estudiante:estudiantes){
                if(estudiante != null){
                    System.out.println(estudiante);
                }
            }
        }else{
            System.out.println("No existen estudiantes todavía.");
        }
    }

    /**
     * This method print the information of all the students with an average greater than introduced.
     * 
     * @param promedio the average that the students have.
     */
    public void mostrarEstudiantesConPromedioMayorA(double promedio){
        int contador = 0;
        for(int paso = 0; paso < cantidadEstudiantes; paso++){
            if(estudiantes[paso].calcularPromedio() > promedio)
                System.out.println(estudiantes[paso]);
                contador++;
        }
        if(contador == 0){            
            System.out.println("No existen alumnos con promedio mayor al introducido.");
        }
    }
}