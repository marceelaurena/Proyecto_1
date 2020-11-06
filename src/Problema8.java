
import java.util.Scanner;


public class Problema8 {
    public static void main(String[] args) {
    Scanner calculadora = new Scanner (System.in);
    // Problema 8
int monto, m1;
monto = calculadora.nextInt();
m1 = monto;
if (m1 > 1000){
    int miles;
    miles = m1/1000;
    m1 = m1 - (miles * 1000);
    System.out.println("Se necesitan " + miles + "monedas de 1000");
}

if (m1 > 500){
    int quins;
    quins = m1 / 500;
    m1 = m1 - (quins * 500);
    System.out.println("Se necesitan " + quins + " moneadas de 500");
}
if (m1 > 100){
    int cienes;
    cienes = m1 / 100;
    m1 = m1 - (cienes * 100);
    System.out.println("Se necesitan " + cienes + " monedas de 100");
}
if (m1 > 10){
    int dieces;
    dieces = m1 / 10;
    m1 = m1 - (dieces * 10);
    System.out.println("Se necesitan " + dieces + " monedas de 10");
}
if (m1 > 5){
    int cincos;
    cincos = m1 / 5;
    m1 = m1 - (cincos * 5);
    System.out.println("Se necesitan " + cincos + " monedas de 5");
}
if (m1 > 1){
    int unos;
    unos = m1 / 1;
    m1 = m1 - (unos *1);
    System.out.println("Se necesitan " + unos + " monedas de 1");
    }
}}
