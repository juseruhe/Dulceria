package POO.Herencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;


    Persona(String nombre,String apellido,int edad){
this.nombre = nombre;
this.apellido = apellido;
this.edad = edad;
}

public String getnombre(){

    return nombre;
}


public String getapellido(){

    return apellido;
}


public int getedad(){

    return edad;
}



}