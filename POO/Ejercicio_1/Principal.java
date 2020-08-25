import javax.swing.JOptionPane;

public class Principal {
    
public static void main(String[] args) {
    
Cuadrilatero C1;

float lado1,lado2;


lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el Lado 1 del Cuadrilatero: "));
lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el Lado 2 del Cuadrilatero: "));

if(lado1 == lado2) {

C1 = new Cuadrilatero(lado1);


}


else {

C1 = new Cuadrilatero(lado1,lado2);

}


System.out.println("El Perímetro es: "+C1.getPerimetro());
System.out.println("El Área es: "+C1.getArea());



}



}