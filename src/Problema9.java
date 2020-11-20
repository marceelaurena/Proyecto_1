
import java.util.Scanner;


public class Problema9 {

public static void main(String[] args){

Scanner opciones = new Scanner (System.in);

int opcion = 0, carnet = 0, nota=0;

switch (opcion) {
case 1:
carnet = opciones.nextInt();
nota = opciones.nextInt();
System.out.println("La nota del estudiante de carnet " + carnet + " es: " + nota);
break;

case 2:
carnet = opciones.nextInt();
break;
}

int carnets[] = new int [2];
carnets [0] = carnet;
carnets [1] = carnet;

int notas[] = new int[2];
notas [0] = nota;
notas[1] = nota;

System.out.println(carnets + " " + notas);

}
}
