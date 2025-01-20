/**
 * I create a classs named "Estudiante" to manage the atributtes of the students.
 */
public class Estudiante{
    /**
     * I declared three variables that are the atributes of the class
     * 
     * nombre A string instance named "nombre" where it stores the name of the student
     * 
     * cantidadNotas An int instance named "cantidadNotas" where it stores the quantity of grades that have been assigned to a student
     * 
     * arrayNotas An array of int instance named "arrayNotas" where it stores the grades of the student
     */
    private String nombre;
    private int cantidadNotas;
    private double[] arrayNotas;

    /**
     * The constructor of the class Estudiante, where it inicialized "cantidadNotas" with 0 
     * and "arrayNotas" with a size of 10
     * 
     * @param nombre The name of the student
     */
    public Estudiante(String nombre){
        this.nombre = nombre;
        cantidadNotas = 0;
        arrayNotas = new double[10];
    }

    /**
     * THis is a method that get the name of the student
     * 
     * @return The name of the student
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * This method inserts a mark in the array of marks taking as position on the array the quantity 
     * of marks that the student has
     * 
     * @param nota The mark that the student has
     */
    public void agregarNotas(double nota){
        try{
            arrayNotas[cantidadNotas] = nota;
            cantidadNotas++;
        }catch (Exception e){
            System.out.println("Se ha sobrepasado la cantidad de almacenaje del programa.");
        }
    }

    /**
     * This method calculate the average mark of the student
     * 
     * @return The average mark of the student
     */
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

    /**
     * This method makes a String preformated for the object "Estudiante"
     */
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