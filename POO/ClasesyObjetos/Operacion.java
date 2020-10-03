package POO.ClasesyObjetos;

import javax.swing.JOptionPane;

public class Operacion {
   /*  Leer Numeros
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;*/

/*   Leer Numeros
public void LeerNumeros(){

    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un Número: "));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite otro Número: "));
}

*/
public int Sumar(int numero1,int numero2){

int suma = numero1 + numero2;

return suma;

}

public int Restar(int numero1,int numero2){

    int resta = numero1 - numero2;
    return resta;
    }


    public int Multiplicar(int numero1,int numero2){

      int  multiplicacion = numero1 * numero2;

      return multiplicacion;
        
        }

public int Dividir(int numero1,int numero2){

          int  division = numero1 / numero2;
     return division;

            
            }












}