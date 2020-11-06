
import java.util.Scanner;


public class Problema7 {
    public static void main(String[] args) {
    Scanner calculadora = new Scanner (System.in);
    //Problema 7
int x, y, resultado5, cantidad;
x = calculadora.nextInt();
y = calculadora.nextInt();
resultado5 = x;
cantidad = 0;
do {
    resultado5 = resultado5 * x;
    cantidad = cantidad + 1;
}
while (cantidad< (y-1));
System.out.println(resultado5);
    }
}
