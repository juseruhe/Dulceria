public class Cuadrilatero {
    
private float lado1;
private float lado2;

Cuadrilatero(float lado1,float lado2){

this.lado1 = lado1;
this.lado2 = lado2;

}

Cuadrilatero(float lado1){

    this.lado1 = this.lado2 = lado1;
    
    
    }


public float getPerimetro(){

float Perimetro = 2 *(lado1+ lado2);

return Perimetro;

}

public float getArea(){

    float Area = (lado1 * lado2);
    
    return Area;
    
    }
    







}