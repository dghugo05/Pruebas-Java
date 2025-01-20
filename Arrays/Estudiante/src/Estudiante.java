/**
 * I create a classs named "Estudiante" to manage the atributtes of the students.
 */
public class Estudiante{
    /**
     * I declared three variables that are the atributes of the class
     * 
     * A string instance named "nombre" where it stores the name of the student
     * 
     * An int instance named "cantidadNotas" where it stores the quantity of grades that have been assigned to a student
     */
    private String nombre;
    private int cantidadNotas;
    private double[] arrayNotas;

    public Estudiante(String nombre){
        this.nombre = nombre;
        cantidadNotas = 0;
        arrayNotas = new double[10];
    }

    public String getNombre(){
        return this.nombre;
    }

    public void agregarNotas(double nota){
        try{
            arrayNotas[cantidadNotas] = nota;
            cantidadNotas++;
        }catch (Exception e){
            System.out.println("Se ha sobrepasado la cantidad de almacenaje del programa.");
        }
    }

    public double calcularPromedio(){
        double promedio = 0;
        try{
            for(double notas:arrayNotas){
                promedio += notas;
            }
            return promedio;
        }catch (Exception e){
            return 0.0;
        }
    }

    public String toString(){
        String cadenaRetorno = "";
        cadenaRetorno += "Estudiante[nombre=" + nombre + ";notas=";
        for(int paso = 0; paso < cantidadNotas; paso++){
            if(paso == cantidadNotas)
                cadenaRetorno += arrayNotas[paso] + ";";
            cadenaRetorno += arrayNotas[paso] + ",";
        }
        cadenaRetorno += "promedio=" + calcularPromedio() + "]";
        return cadenaRetorno;
    }
}