
import java.util.Scanner;


public class Problema2 {
  public static void main(String[] args) {
  Scanner calculadora = new Scanner (System.in);
  //Problema 2 Parte 1
int num3, num4, num5, promedio;

num3 = calculadora.nextInt();
num4 = calculadora.nextInt();
num5 = calculadora.nextInt();

//Calcular promedio
promedio = (num3+num4+num5)/3;
System.out.println("Los numeros que el usuario digito son: " + num3 + ", "+ num4 + ", "+ num5);
System.out.println("El resultado del promedio es: " + promedio);

//Problema 2 Parte 2

//Calcular promedio con arreglos
int num7, prom = 0, m =5;
for (int i=2; i<=6; i++){
num7 = calculadora.nextInt();
prom = prom + num7; 


    }
System.out.println(" El promedio es: " + prom / m);

//Factorial Iterativamente
int n=3;
int factorial = 1;
for (int i=1; i<=n; i++){
    factorial = factorial * i;
    System.out.print(factorial);
    }

//Numero mayor entre varios
int num10, num11, num12, mayor;
num10 = calculadora.nextInt();
num11 = calculadora.nextInt();
num12 = calculadora.nextInt();

if (num10 > num11 && num10 > num12){
    System.out.println("El numero mayor es: " + num10);
    if (num11 > num10 && num11 > num12){
        System.out.println("El numero mayor es: " + num11);
    }
}
else {
    System.out.println("El numero mayor es: " + num12);
}

//invertir numeros de una lista
int numeros [ ]= new int [5]; 
numeros [0] = 1;
numeros [1] = 2;
numeros [2] = 3;
numeros [3] = 4;
numeros [4] = 5;

for (int i = 0; i < numeros.length; i++){
    numeros [i] = i + 1;
 System.out.println(numeros);
}
for (int i = 4; i<numeros.length; i++){
    numeros [i] = i + 1;
    System.out.println(numeros);
}

}  
}

