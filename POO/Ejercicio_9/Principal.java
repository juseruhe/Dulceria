package POO.Ejercicio_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {


    
    static ArrayList<Poligono>poligono = new ArrayList<Poligono>();

    static Scanner Entrada = new Scanner(System.in);


public static void main(String[] args) {
    
llenarPoligono();

mostrarpoligonos();



}


public static void llenarPoligono(){

  int opcion;
  char Respuesta;
   
  do{
  do {
        System.out.println("Digite que Polígono desea: ");
        System.out.println("1. Triángulo: ");
        System.out.println("2. Rectángulo: ");
        System.out.println(" Opción ");
        opcion = Entrada.nextInt();
    }


    while(opcion<1 || opcion>2);

    switch(opcion){

    case 1: llenartriangulo();
    break;
    case 2: llenarectangulo();
    break;



    }

    System.out.println("Desea introducir otro polígono: s/n");
    Respuesta = Entrada.next().charAt(0);
    System.out.println("");

}while(Respuesta=='s' ||Respuesta=='S' );


}


public static void llenartriangulo(){

double lado1,lado2,lado3;

System.out.println("\n Digite el Lado 1 del Triángulo: ");
lado1 = Entrada.nextDouble();
System.out.println("\n Digite el Lado 2 del Triángulo: ");
lado2 = Entrada.nextDouble();
System.out.println("\n Digite el Lado 3 del Triángulo: ");
lado3 = Entrada.nextDouble();

Triangulo tri = new Triangulo(lado1,lado2,lado3);

poligono.add(tri);

}

public static void llenarectangulo(){

    double lado1,lado2;
    
    System.out.println("\n Digite el Lado 1 del Rectángulo: ");
    lado1 = Entrada.nextDouble();
    System.out.println("\n Digite el Lado 2 del Rectángulo: ");
    lado2 = Entrada.nextDouble();
    
    
    Rectangulo Recta = new Rectangulo(lado1,lado2);
    
    poligono.add(Recta);
}


    public static void mostrarpoligonos(){

      for(Poligono poli:poligono){

        System.out.println(poli.mostrarLados());

        System.out.println("Área"+poli.area());

        System.out.println("");

      }

    }





}