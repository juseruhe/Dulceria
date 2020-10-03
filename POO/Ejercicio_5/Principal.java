package POO.Ejercicio_5;

import java.util.Scanner;

public class Principal {
    
public static double mayorArea(Triángulo_iso triangulo[]){

double Area;

Area = triangulo[0].obtenerArea();


for (int i=1;i<triangulo.length;i++){

if(triangulo[i].obtenerArea()> Area){

Area = triangulo[i].obtenerArea();

}



}

return Area;
}



public static void main(String[] args) {
    
    Scanner Entrada = new Scanner(System.in);

     double Base,Lado;

     int Cantidad_Triangulos;


     System.out.println("Digite la cantidad de triángulos que desea ingresar: ");
     Cantidad_Triangulos = Entrada.nextInt();

    Triángulo_iso triangulo[] = new Triángulo_iso[Cantidad_Triangulos];


    for(int i=0;i<triangulo.length;i++){

     System.out.println("Digite los valores del Triángulo "+(i+1)+":");
     
     System.out.print("Introduzca la Base: ");
     Base = Entrada.nextDouble();

     System.out.print("Introduzca el Lado: ");
     Lado = Entrada.nextDouble();
     
     triangulo[i] = new Triángulo_iso(Base, Lado);


    System.out.println(" El Perímetro del Triángulo Isoscéles es: "+triangulo[i].obtenerPerimetro());
    System.out.println(" El Área del Triángulo Isoscéles es: "+triangulo[i].obtenerArea());

    }


    System.out.println(" El Área de Mayor Superficie es: "+mayorArea(triangulo));


}




}