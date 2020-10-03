package POO.Poli;

public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;



public Vehiculo(String matricula, String marca,String modelo){

    this.matricula = matricula;
    this.marca = marca;
    this.modelo= modelo;
}


public String getmatricula(){

    return matricula;
}


public String getmarca(){

    return marca;
}


public String getmodelo(){

    return modelo;
}


public String mostrarDatos(){

    return "La Matricula: "+matricula+"\nLa Marca: "+marca+"\n El Modelo: "+modelo;

}

}