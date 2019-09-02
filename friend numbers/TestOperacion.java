import myclass.scanner;

import java.util.Scanner;

/**
 * Created by Administrador on 16/02/2017.
 */
public class TestOperacion {

    public static void main(String[] args) {

        numeroPerfecto operacion = new numeroPerfecto();
        Scanner lector = new Scanner(System.in);
        int num1, num2, goku;
        do {
            System.out.println("Menu");
            System.out.println("1.- NUMEROS AMIGOS");
            System.out.println("2.- NUMEROS PERFECTOS");
            System.out.println("3.- SUMA");
            System.out.println("4.- DIVISION");
            System.out.println("5.- FACTORIAL");
            System.out.println("6.- MODULO");
            System.out.println("7.- SALIR");
            goku = lector.nextInt();

            switch (goku) {
                case 1:
                    System.out.println("Numeros Amigos");
                    System.out.println("Numero 1: ");
                    num1 = lector.nextInt();
                    System.out.println("Numero 2: ");
                    num2 = lector.nextInt();
                    if (operacion.calcularAmigos(num1, num2)) {
                        System.out.println("Son Numeros Amigos");
                    } else {
                        System.out.println("No son Compas");
                    }
                    break;

                case 2:
                    System.out.println("Numeros Perfectos");
                    System.out.println("Numero");
                    num1 = lector.nextInt();
                    if (operacion.calcularPerfecto(num1)) {
                        System.out.println("Es el elegido perfeto, es todo un galan *-*");
                    } else {
                        System.out.println("Es otro Puto");
                    }
                    break;
                case 3:
                    System.out.println("suma");
                    System.out.println("Numero");
                    num1 = lector.nextInt();
                    if (operacion.calcularPerfecto(num1)) {
                        System.out.println("Es el elegido perfeto, es todo un galan *-*");
                    } else {
                        System.out.println("Es otro Puto");
                    }
                    break;
            }
            System.out.println();
        }
        while (goku != 3);
    }
}
