
import java.util.Scanner;


public class Problema6 {
    public static void main(String[] args) {
    Scanner calculadora = new Scanner (System.in);
    //Problema 6 area de cuadrado, rectangulo y circulo
boolean sigue = true;
int cuadrado, rectangulo;
double circulo;
int opcion;
System.out.println("Que opcion desea?");
opcion = calculadora.nextInt();
do {
switch(opcion){
case 1: 
    int lado;
    lado = calculadora.nextInt();
    cuadrado = lado * lado;
    System.out.println("Sacar el area de un cuadrado: " + cuadrado);
    break;
case 2:
    int largo;
    int ancho;
    largo = calculadora.nextInt();
    ancho = calculadora.nextInt();
    rectangulo = largo * ancho;
    System.out.println("Sacar el area de un rectangulo: " + rectangulo);
    break;
case 3:
    int radio;
    double pii = 3.14;
    radio = calculadora.nextInt();
    circulo = 2*radio*pii;
    break;    
}
}
while (sigue);
    }
}
