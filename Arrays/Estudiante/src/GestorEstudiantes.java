public class GestorEstudiantes{
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public GestorEstudiantes(){
        estudiantes = new Estudiante[20];
        cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(String nombre){
        if(cantidadEstudiantes < estudiantes.length){
            estudiantes[cantidadEstudiantes] = new Estudiante(nombre);
            System.out.println("Se añadio el estudiante con éxito");
            cantidadEstudiantes++;
        }else{
            System.out.println("Se ha sobrepasado la capacidad de almacenaje de estudiantes");;
        }
    }

    public Estudiante buscarEstudiante(String nombre){
        for(int paso = 0; paso < cantidadEstudiantes; paso++){
            if(estudiantes[paso].getNombre().equalsIgnoreCase(nombre)){
                return estudiantes[paso];
            }
        }
        return null;
    }

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