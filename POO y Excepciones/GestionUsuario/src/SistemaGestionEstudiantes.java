public class SistemaGestionEstudiantes {
    public static void main(String[] args) throws Exception {
        GestionEstudiantes estudiante = new GestionEstudiantes(null);

        Estudiante estudiante1 = estudiante.registrarEstudiante();
        Estudiante estudiante2 = estudiante.registrarEstudiante();

        estudiante.mostrarEstudiante(estudiante1, estudiante2);

        if(estudiante1.getPromedio() > estudiante2.getPromedio()){
            System.out.printf("El mayor promedio lo tiene el estudiante 1 con: %.2f", estudiante1.getPromedio());
        }else if(estudiante1.getPromedio() < estudiante2.getPromedio()){
            System.out.printf("El mayor promedio lo tiene el estudiante 2 con: %.2f", estudiante2.getPromedio());
        }else{
            System.out.printf("Tienen el mismo promedio\n Estudiante 1 = %.2f\n Estudiante 2 = %.2f", estudiante1.getPromedio(), estudiante2.getPromedio());
        }
    }
}
