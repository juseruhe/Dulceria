package POO.Ejercicio_9;

public abstract class Poligono {
    
protected int nlados;

public Poligono(int nlados){

    this.nlados = nlados;
}

public int getnlados(){

    return nlados;
}

public String mostrarLados(){

    return "Numero de Lados:"+nlados;

}

public abstract double area();


}