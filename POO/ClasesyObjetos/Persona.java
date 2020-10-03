package POO.ClasesyObjetos;

public class Persona {
    String Nombre;
    int Edad;
    int Dni;


    public Persona(String Nombre,int Edad){

     this.Nombre = Nombre;
     this.Edad = Edad;

    }
 
    public Persona(int Dni){

    this.Dni = Dni;

    }

   public void Correr(){

    System.out.println("Soy "+Nombre+" tengo "+Edad+" años y estoy corriendo una maratón");
   }


   public void Correr(int Km){

    System.out.println("He recorrido "+Km+" Kilometros. ");

   }



}