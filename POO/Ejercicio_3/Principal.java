package POO.Ejercicio_3;

import java.util.Scanner;






public class Principal {

    public static int IndiceCocheMasBarato(Vehiculo coches[]){

        int Precio;
        
        int Indice=0;
        
        Precio = coches[0].getPrecio();
        
        for (int i=1; i<coches.length;i++){
        
        if(coches[i].getPrecio() < Precio){

           Precio = coches[i].getPrecio();

           Indice = i;

        }

         
        }
        return Indice;
    }





    
  public static void main(String[] args) {
      
     Scanner Entrada = new Scanner(System.in);

     String Marca,Modelo;
     int Precio;
     int Numero_Vehiculos;
     int IndiceBarato;

    System.out.println("Digite la Cantidad de Vehículos: ");
    Numero_Vehiculos= Entrada.nextInt();

    Vehiculo coches[] = new Vehiculo[Numero_Vehiculos];

    for(int i=0;i<coches.length;i++){
    Entrada.nextLine();
    System.out.println(" Digite las Características del Coche "+(i+1)+" :");

    System.out.println("Digite la Marca del Coche :");
    Marca = Entrada.nextLine();

    System.out.println("Digite el Modelo del Coche :");
    Modelo = Entrada.nextLine();
   

    System.out.println("Digite El Precio del Coche :");
    Precio = Entrada.nextInt();

    coches[i] = new Vehiculo(Marca, Modelo, Precio);



    }

  IndiceBarato = IndiceCocheMasBarato(coches);


  System.out.println("El Coche más barato es " + coches[IndiceBarato].mostrarDatos());

  }



}