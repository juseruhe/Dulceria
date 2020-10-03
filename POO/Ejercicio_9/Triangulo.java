package POO.Ejercicio_9;

public class Triangulo extends Poligono {
    private double lado1;
    private double lado2;
    private double lado3;

public Triangulo(double lado1, double lado2,double lado3){

super(3);
this.lado1 = lado1;
this.lado2 = lado2;
this.lado3 = lado3;

}


public Double  getlado1(){

    return lado1;

   }


   public Double  getlado2(){

    return lado2;

   }


   public Double  getlado3(){

    return lado3;

   }


   @Override
   public String mostrarLados(){

    return "Triángulo: \n"+"el número de lados es: "+super.mostrarLados()+
    "\n Lado 1: "+lado1+"\n Lado 2: "+lado2+"\n Lado 3: "+lado3;

}


@Override
public double area(){

double Area= (lado1+lado2+lado3)/2;

return Math.sqrt((Area*(Area-lado1)*(Area*lado2)*(Area-lado3)));

}
   


}