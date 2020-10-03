package POO.ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){
/*   Ejercicio de Retorno y uso de Constructores

       int n1 =Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
       int n2 =Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));

       Operacion operar = new Operacion();

      System.out.println("La Suma es:" + operar.Sumar(n1, n2));
      System.out.println("La Resta es:" + operar.Restar(n1, n2));
      System.out.println("La Multiplicación es:" + operar.Multiplicar(n1, n2));
      System.out.println("La División es:" + operar.Dividir(n1, n2));
*/


// Clase  Persona Sobrecarga de Constructores


Persona persona1 = new Persona("Juan",23);

persona1.Correr();

Persona persona2 = new Persona(97052407);

persona2.Correr(16);





    }
    
}