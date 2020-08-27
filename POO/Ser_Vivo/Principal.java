package POO.Ser_Vivo;

public class Principal {

    public static void main(String[] args) {
        
      Planta planta = new Planta();

      planta.alimentarse();

     AnimalCarnivoro animalc = new  AnimalCarnivoro();

     animalc.alimentarse();

     AnimalHerviboro animalh = new AnimalHerviboro();

     animalh.alimentarse();

    }
    
}