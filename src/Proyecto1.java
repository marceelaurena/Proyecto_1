import java.util.Scanner;

//Proyecto 1 de Programacion 1.
public class Proyecto1 {
    

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    // Problema 1: realice una calculadora con un escaner     
    
    int num1, num2, operaciones;
    
    Scanner calculadora = new Scanner (System.in);
    
    System.out.println("Cual es el primer numero?");
    num1 = calculadora.nextInt();
    System.out.println("Cual es el segundo numero?");
    num2 = calculadora.nextInt();
    
    int resultado1, resultado2, resultado3, resultado4;
    
    resultado1 = num1 + num2;
    System.out.println("Realice la suma de los numeros: " + resultado1 );
    
    resultado2 = num1 - num2;
    System.out.println("Realice la resta de los numeros: " + resultado2 );
  
    resultado3 = num1 * num2;
    System.out.println("Realice una multiplicacion de los numeros: " + resultado3 );
    
    resultado4 = num1 / num2;
    System.out.println("Realice una division de los numeros: " + resultado4 );

}
}





