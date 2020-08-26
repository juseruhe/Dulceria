package POO.Herencia;

public class Estudiante extends Persona {
    
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre,String apellido,int edad,int codigoEstudiante,float notaFinal)
   {
    super(nombre,apellido,edad);
    this.codigoEstudiante = codigoEstudiante;
    this.notaFinal = notaFinal;


    }

public void mostrarDatos(){

    System.out.println("Nombre: "+getnombre()+"\n Apellido: "+getapellido()+"\n Edad: "+getedad()+
    "\nCódigo del Estudiante: "+codigoEstudiante+"\n Nota Final: "+notaFinal);
    
   
}



}