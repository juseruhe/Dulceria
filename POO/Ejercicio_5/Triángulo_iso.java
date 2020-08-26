package POO.Ejercicio_5;



public class Triángulo_iso {
    
    private double base;
    private double lado;

Triángulo_iso(double base,double lado){

this.base = base;
this.lado= lado;

}


public double obtenerPerimetro(){

double Perimetro =  (2*lado) + base;
return Perimetro;


}


public double obtenerArea(){

double Area = base*(Math.sqrt(Math.pow(lado,2) - (Math.pow(base, 2)/4)))  / 2;
return Area;

}


public String mostrarDatos(){

return " Base : "+base+"\n Lado: "+lado+" \n Perímetro : "+obtenerPerimetro()+"\n Área : "+obtenerArea();


}



}