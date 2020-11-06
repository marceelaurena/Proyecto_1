
import java.util.Scanner;


public class Problema3 {
public static void main(String[] args) {
    Scanner calculadora = new Scanner (System.in);
    // Problema 3
double salario;
int dependientes, porcentajeSal, porcentajeDep;

salario = calculadora.nextInt();
dependientes = calculadora.nextInt();

if (salario < 200000){
    porcentajeSal = 0;
    if (salario <= 200000 && salario < 400000){
        porcentajeSal = 10;
    if (salario <= 400000 && salario < 600000){
        porcentajeSal = 15;
    if (salario <= 600000 && salario < 800000){
        porcentajeSal = 20;
    }
    }
    }
}
else {
    porcentajeSal = 30;
}
if (dependientes == 1){
    porcentajeDep = 100;
if (dependientes == 2){
    porcentajeDep = 90;
if (dependientes == 3){
    porcentajeDep = 70;
if (dependientes == 4){
    porcentajeDep = 60;
}}}}
else {
    porcentajeDep = 40;
}
double pago = (((salario * porcentajeSal) / 100) * porcentajeDep / 100);

System.out.println("El salario del empleado es: " + salario + ", tiene " + dependientes + " dependientes, por lo que paga: " + pago);
}}

