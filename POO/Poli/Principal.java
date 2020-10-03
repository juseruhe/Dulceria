package POO.Poli;

public class Principal {


    public static void main(String[] args) {
        
        Vehiculo misVehiculos[] = new Vehiculo[4];
      

        misVehiculos[0] = new Vehiculo("ABC20","Ferrari","FER2020");
        misVehiculos[1] = new VehiculoTurismo("JKF58","Mazda","MZ2006",10);
        misVehiculos[2] = new VehiculoDeportivo("xyz84", "Toyota", "TY2015",700);
        misVehiculos[3] = new VehiculoFurgoneta("dfr56", "Nissan", "NS2010",1500);


      for(Vehiculo vehiculo:misVehiculos){

       System.out.println(vehiculo.mostrarDatos());
       System.out.println("");

      }

    }
    
}