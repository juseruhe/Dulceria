public class Persona {
    
private int edad;
private final String nombre;


Persona(int edad,String nombre ){

this.edad = edad;
this.nombre = nombre;

}



public void mostrarDatos(){

System.out.println("La edad es: "+edad);
System.out.println("El nombre es: "+nombre);



}

public int getedad(){

    return edad;
}

public void setedad(int edad){

this.edad = edad;

}





}