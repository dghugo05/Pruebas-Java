public class Estudiante {
    private String matricula;
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante() {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        boolean bandera = false;
        while (!bandera) {
            if(edad >= 0 && edad <= 120){
                this.edad = edad;
                bandera = true;
            }else{
                System.out.println("Debe introducir un valor válido.");
            }
        }        
    }

    public double getPromedio(){
        return this.promedio;
    }

    public void setPromedio(double promedio){
        boolean bandera = false;
        while (!bandera) {
            if(promedio >= 0 && promedio <=10){
                this.promedio = promedio;
                bandera = true;
            }else{
                this.promedio = 0.00;
            }
        }
    }

    public String toString(){
        return "Estudiante[matrícula = " + matricula + ", nombre = " + nombre + ", edad =" + edad + ", promedio =" + promedio + "]";
    }
}
