package POO.Ejercicio_9;

public class Rectangulo extends Poligono {
    private Double lado1;
    private Double lado2;

    public Rectangulo(Double lado1,Double lado2){
     super(2);
     this.lado1 = lado1;
     this.lado2 = lado2;

    }

   public Double  getlado1(){

    return lado1;

   }


   public Double  getlado2(){

    return lado2;

   }

   @Override
   public String mostrarLados(){

    return "Rectángulo: \n"+"el número de lados es: "+super.mostrarLados()+
    "\n Lado 1: "+lado1+"\n Lado 2: "+lado2;

}

@Override
public double area(){

double Area= lado1 * lado2;

return Area;

}




}